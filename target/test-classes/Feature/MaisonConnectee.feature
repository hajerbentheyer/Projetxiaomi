#Author:Hajer
Feature: Affichage du produit

  Scenario: Obtention de la page de produit
    Given utilisateur est sur la page de maison connectee
    When utilisateur fait le "Tri par tarif croissant"
    And utilisateur clique sur le produit "Mi Compact Bluetooth Speaker 2"
    Then utilisateur est dirige vers la page du produit "Mi Compact Bluetooth Speaker 2"