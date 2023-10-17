/**
 * @author KH.Khoza
 */
package com.example.SpringbootMomentum;

import java.util.List; 
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InvestorService {
    @Autowired
    private InvestorRepository investorRepository;

    public List<Investor> getAllInvestors() {
        return investorRepository.findAll();
    }

    public Optional<Investor> getInvestorById(Long id) {
        return investorRepository.findById(id);
    }

    // //
}


