Feature: Recherche de produit
  En tant qu'utilisateur, je veux rechercher des produits pour trouver ce dont j'ai besoin rapidement.
  Scenario: L'utilisateur peut rechercher des produits rapidement
    Given l'utilisateur connecté est sur la page d'accueil
    When l'utilisateur entre un mot dans la barre de recherche
    And l'utilisateur soumet la recherche
    Then l'utilisateur voit une liste de produits contenant le mot saisi