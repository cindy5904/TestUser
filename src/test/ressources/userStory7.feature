Feature: Passation de commande
  En tant qu'utilisateur, je veux passer une commande.
  Scenario: L'utilisateur passe une commande avec succès
    Given l'utilisateur a ajouté des produits à la commande
    And l'utilisateur est sur la page de commande
    When l'utilisateur remplit le formulaire de commande avec les informations nécessaires
    And l'utilisateur soumet la commande
    Then l'utilisateur reçoit une confirmation de commande

    Scenario : Erreur lors de la commande de l'utilisateur
      Given L'utilisateur a ajouter des produits à la commande
      And l'utilisateur est sur la page de commande
      When l'utilisateur remplit le formulaire de commande avec les informations nécessaires
      And l'utilisateur soumet la commande
      Then Une erreur est renvoyée si la commande n'existe pas