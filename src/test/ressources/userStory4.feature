Feature: Navigation par catégorie de produits
  En tant qu'utilisateur, je veux naviguer par catégorie de produits pour découvrir ce qui est disponible.
  Scenario: L'utilisateur navigue par catégorie
    Given l'utilisateur est sur la page d'accueil pour rechercher une catégorie
    When l'utilisateur clique sur une catégorie spécifique "fruits"
    Then l'utilisateur voit une liste de produits dans cette catégorie