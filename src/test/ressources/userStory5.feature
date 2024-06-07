Feature: Ajouter des produits à la commande
  En tant qu'utilisateur, je veux ajouter des produits a la commande.
  Scenario: L'utilisateur ajoute un produit à la commande
    Given l'utilisateur est sur la page produit du produit
    When l'utilisateur clique sur le bouton "Ajouter à la commande"
    Then l'utilisateur voit une confirmation que le produit a été ajouté à la commande