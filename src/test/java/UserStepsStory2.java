import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.User;
import org.junit.Assert;

public class UserStepsStory2 {

    private User user;
    private String userName;
    private String password;
    private boolean userExist;
    private boolean loginSuccess;

    @Given("l'utilisateur est sur la page de connexion")
    public void lUtilisateurEstSurLaPageDeConnexion() {
        System.out.println("l'utilisateur est sur la page de connexion");
    }

    @When("l{string}utilisateur et son mot de passe")
    public void lUtilisateurEntreSonNomDUtilisateurEtSonMotDePasse() {
        this.userName = "user123";
        this.password = "password";
    }

    @And("l'utilisateur soumet le formulaire de connexion")
    public void lUtilisateurSoumetLeFormulaireDeConnexion() {
        if(userExist) {
            loginSuccess = true;
        } else {
            loginSuccess = false;
        }
    }

    @Then("l{string}accueil")
    public void lUtilisateurEstRedirigéVersLaPageDAccueil() {
        Assert.assertTrue(loginSuccess);
        System.out.println("L'utilissateur est redirigé vers la page d'accueil");
    }

    @Then("un message d{string}utilisateur pour connexion échoué")
    public void unMessageDErreurEstRenvoyéÀLUtilisateurPourConnexionÉchoué() {
        Assert.assertFalse(loginSuccess);
        System.out.println("L'utilisateur reçoit un message d'erreur de connexion échoué");
    }
}
