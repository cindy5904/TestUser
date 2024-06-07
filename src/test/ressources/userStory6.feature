Feature: Supprimer des produits de la commande
  En tant qu'utilisateur, je veux supprimer des produits de la commande.
  Scenario: L'utilisateur supprime un produit de la commande
    Given l'utilisateur a ajouté un produit à la commande
    And l'utilisateur est sur la page de commande
    When l'utilisateur clique sur le bouton "Supprimer" à côté du produit
    Then le produit est retiré de la commande ou diminué de 1
    And le prix total est mis à jour