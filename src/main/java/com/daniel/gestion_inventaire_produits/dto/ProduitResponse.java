package com.daniel.gestion_inventaire_produits.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProduitResponse {

    private Long id;
    private String nom;
    private Double prix;
    private Integer quantiteEnStock;

}