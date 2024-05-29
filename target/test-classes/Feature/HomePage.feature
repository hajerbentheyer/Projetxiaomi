#Author:Hajer
Feature: Consultation de submenu de homepage

  Scenario: choisir la page de submenu
    Given utilisateur est sur le homepage
    When utilisateur survol la souris sur le menu "Smart Home " 
    And utilisateur clique sur le submenu "Maison connectée"
    Then utilisateur est dirige vers la page de submenu "Maison connectée"
