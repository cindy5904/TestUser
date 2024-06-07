Feature: Connexion à un compte (User Story 2)
  En tant qu'utilisateur, je veux me connecter à mon compte pour accéder et passer des commandes.
  Scenario: L'utilisateur se connecte à son compte avec succès
    Given l'utilisateur est sur la page de connexion
    When l'utilisateur entre son nom d'utilisateur et son mot de passe
    And l'utilisateur soumet le formulaire de connexion
    Then  l'utilisateur est redirigé vers la page d'accueil

    Scenario : La connexion de l'utilisateur a échoué
     Given l'utilisateur est sur la page de connexion
      When l'utilisateur entre son nom d'utilisateur et son mot de passe
      And l'utilisateur soumet le formulaire de connexion
      Then un message d'erreur est renvoyé à l'utilisateur pour connexion échoué