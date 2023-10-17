package com.example.SpringbootMomentum;
import java.math.BigDecimal; 
import java.util.Optional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Optional<Product> getProductById(Long id) {
        return productRepository.findById(id);
    }

    public Product createWithdrawal(Long productId, BigDecimal withdrawalAmount) {
        Optional<Product> optionalProduct = productRepository.findById(productId);

        if (optionalProduct.isPresent()) {
            Product product = optionalProduct.get();

            // logic to create a withdrawal for the given product
            // Update the product balance, create a withdrawal record, etc.

            BigDecimal currentBalance = product.getCurrentBalance();
            if (currentBalance.compareTo(withdrawalAmount) >= 0) {
                BigDecimal newBalance = currentBalance.subtract(withdrawalAmount);
                product.setCurrentBalance(newBalance);
                // Save the updated product entity
                productRepository.save(product);
            } else {
                // Handle insufficient balance error or throw an exception
            }

            return product; // Return the updated product
        } else {
            // Handle product not found error or throw an exception
            return null;
        }
    }

}
