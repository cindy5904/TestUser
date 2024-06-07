import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Product;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;

public class UserStepsStory4 {

    private List<Product> categoryResults;
    private String selectedCategory;


    @Given("l'utilisateur est sur la page d'accueil pour rechercher une catégorie")
    public void lUtilisateurEstSurLaPageDAccueilPourRechercherUneCatégorie() {
        System.out.println("L'utilisateur est sur la page d'accueil");

        Product.getProductList().clear();
        Product apple = new Product("Apple", 100, 1.0, "Fruits");
        Product banana = new Product("Banana", 150, 0.5, "Fruits");
        Product carrot = new Product("Carrot", 200, 0.75, "Vegetables");
        Product beef = new Product("Beef", 50, 5.0, "Meat");

        apple.addProduct(apple);
        banana.addProduct(banana);
        carrot.addProduct(carrot);
        beef.addProduct(beef);
    }
    @When("l'utilisateur clique sur une catégorie spécifique {string}")
    public void lUtilisateurCliqueSurUneCatégorieSpécifique(String category) {
        selectedCategory = category;
    }

    @Then("l'utilisateur voit une liste de produits dans cette catégorie")
    public void lUtilisateurVoitUneListeDeProduitsDansCetteCatégorie() {
        categoryResults = Product.getProductsByCategory(selectedCategory);
        Assert.assertFalse("La liste des produits ne doit pas être vide", categoryResults.isEmpty());
        for (Product product : categoryResults) {
            System.out.println("Produit dans la catégorie " + selectedCategory + ": " + product.getName());
            Assert.assertTrue("Le produit " + product.getName() + " n'appartient pas à la catégorie " + selectedCategory,
                    product.getCategory().equalsIgnoreCase(selectedCategory));
        }
    }



}
