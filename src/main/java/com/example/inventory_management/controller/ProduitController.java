package com.example.inventory_management.controller;

import com.example.inventory_management.controller.api.ProduitApi;
import com.example.inventory_management.model.Produit;
import com.example.inventory_management.services.ProduitService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
@Slf4j
public class ProduitController implements ProduitApi {
    @Autowired
    ProduitService produitService;
    @Override
    public Produit ajouterProduit(Produit produit) {
        return produitService.saveProduit(produit);
    }

    @Override
    public List<Produit> getAllProduct() {
        return produitService.getAllProduct();
    }


    @Override
    public void deleteProduit(Integer idProduit) {
         produitService.deleteProduit(idProduit);
    }

    @Override
    public Produit updateProduit(Produit produit) {
        return produitService.updateProduit(produit);
    }
}
