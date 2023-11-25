package com.example.inventory_management.controller.api;

import com.example.inventory_management.model.Produit;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequestMapping("/api/v1")
public interface ProduitApi {


        @PostMapping("/add")
        @ResponseBody
        Produit ajouterProduit(@RequestBody Produit produit);
        @GetMapping("/get")
        @ResponseBody
        List<Produit> getAllProduct();

        @DeleteMapping("/delete/{idProduit}")
        @ResponseBody
        void deleteProduit(@PathVariable("idProduit") Integer idProduit );

        @PutMapping("update")
        @ResponseBody
        Produit updateProduit(@RequestBody Produit produit);




}
