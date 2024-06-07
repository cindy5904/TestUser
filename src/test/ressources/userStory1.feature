Feature: Création de compte(User Story 1)
  En tant qu'utilisateur, je veux créer un compte pour pouvoir passer des commandes.
  @UserDoesNotExist
  Scenario: L'utilisateur crée un compte avec succès
    Given l'utilisateur est sur la page d'inscription
    And l'utilisateur n'existe pas
    When l'utilisateur entre un email, un nom d'utilisateur et un mot de passe
    And l'utilisateur soumet le formulaire d'inscription
    Then l'utilisateur voit une confirmation de son inscription
  @UserExists
  Scenario: la création de compte échoue
    Given l'utilisateur est sur la page d'inscription
    And l'utilisateur existe déjà
    When l'utilisateur entre un email, un nom d'utilisateur et un mot de passe
    And l'utilisateur soumet le formulaire d'inscription
    Then l'utilisateur reçoit un message d'erreur que l'identifiant existe déjà

