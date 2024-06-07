import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Product;
import org.junit.Assert;

import java.util.List;
import java.util.stream.Collectors;

public class UserStepsStory3 {

    private Product product;
    private String searchQuery;
    private List<Product> searchResults;

    @Given("l'utilisateur connecté est sur la page d'accueil")
    public void lUtilisateurEstSurLaPageDAccueil() {

        System.out.println("L'utilisateur est sur la page d'accueil");
        Product apple = new Product("Apple", 100, 1.0);
        Product banana = new Product("Banana", 150, 0.5);
        Product orange = new Product("Orange", 200, 0.75);

        apple.addProduct(apple);
        banana.addProduct(banana);
        orange.addProduct(orange);
    }
    @When("l'utilisateur entre un mot dans la barre de recherche")
    public void lUtilisateurEntreUnMotDansLaBarreDeRecherche(String query){
        searchQuery= query;
    }

    @And("l'utilisateur soumet la recherche")
    public void lUtilisateurSoumetLaRecherche() {
        searchResults = Product.searchProducts(searchQuery);
    }

    @Then("l'utilisateur voit une liste de produits contenant le mot saisi")
    public void lUtilisateurVoitUneListeDeProduitsContenantLeMotSaisi() {
        Assert.assertFalse("La liste des produits ne doit pas être vide", searchResults.isEmpty());
        for (Product product : searchResults) {
            System.out.println("Produit trouvé: " + product.getName());
            Assert.assertTrue("Le produit " + product.getName() + " ne contient pas le mot recherché",
                    product.getName().toLowerCase().contains(searchQuery.toLowerCase()));
        }
    }
}

