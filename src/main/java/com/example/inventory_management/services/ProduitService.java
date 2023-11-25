package com.example.inventory_management.services;

import com.example.inventory_management.model.Produit;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

public interface ProduitService {
    Produit saveProduit (Produit p);
    List<Produit> getAllProduct();
    void deleteProduit (Integer idProduit);
    Produit updateProduit (Produit produit );
}
