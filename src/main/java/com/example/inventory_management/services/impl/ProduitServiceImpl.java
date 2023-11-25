package com.example.inventory_management.services.impl;

import com.example.inventory_management.model.Produit;
import com.example.inventory_management.repository.ProduitRepository;
import com.example.inventory_management.services.ProduitService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class ProduitServiceImpl implements ProduitService {
    @Autowired
    private ProduitRepository produitRepository;
    @Override
    public Produit saveProduit(Produit p) {
        return produitRepository.save(p);
    }

    @Override
    public List<Produit> getAllProduct() {
        return produitRepository.findAll();
    }

    @Override
    public void deleteProduit(Integer idProduit) {
         produitRepository.deleteById(idProduit);

    }

    @Override
    public Produit updateProduit(Produit produit) {

         produit.setCodeProduit( produit.getCodeProduit() );
         return produitRepository.save(produit);
    }
}
