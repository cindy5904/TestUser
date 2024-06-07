import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.User;
import org.junit.Assert;

public class UserStepsStory1 {
    private User user;
    private boolean userExist;
    private boolean accountCreated;



    @Given("l'utilisateur est sur la page d'inscription")
    public void lUtilisateurEstSurlaPageDInscription() {
        System.out.println("L'utilisateur est sur la page d'inscription");
    }

    @And("l'utilisateur n'existe pas")
    public void lUtilisateurNExistePas() {
        userExist = false;
    }
    @And("l'utilisateur existe déjà")
    public void lUtilisateurExisteDéjà() {
        userExist = true;
    }

    @When("l'utilisateur entre un email, un nom d'utilisateur et un mot de passe")
    public void lUtilisateurEntreUnEmailUnNomDUtilisateurEtUnMotDePasse() {
        user = new User();
        user.setEmail("user@example.com");
        user.setUserName("user");
        user.setPassword("password");
    }

    @And("l'utilisateur soumet le formulaire d'inscription")
    public void lUtilisateurSoumetLeFormulaireDInscription() {
        if(userExist) {
            accountCreated = false;
        } else {
            accountCreated = true;
        }
    }

    @Then("l'utilisateur voit une confirmation de son inscription")
    public void lUtilisateurVoitUneConfirmation(){
        Assert.assertTrue(accountCreated);
        System.out.println("Confirmation inscription");
    }

    @Then("l'utilisateur reçoit un message d'erreur que l'identifiant existe déjà")
    public void lUtilisateurReçoitUnMessageDErreurQueLIdentifiantExisteDéjà() {
        userExist = true;
        Assert.assertFalse(accountCreated);
        System.out.println("Erreur inscription");
    }

}




