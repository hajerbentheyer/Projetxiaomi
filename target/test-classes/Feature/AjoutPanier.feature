#Author:Hajer
Feature: Ajout panier 

  Scenario: Obtention de la page de produit
    Given utilisateur sur la page de produit
    When utilisateur clique sur Ajouter Au Panier
    When utilisateur accede a la page panier
    Then utilisateur verifie le produit ajoute a la liste "Mi Temperature and Humidity Monitor Pro"