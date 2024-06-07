import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Product;
import org.example.repository.ProductRepository;
import org.junit.Assert;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.doAnswer;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class UserStepsStory5 {

    private ProductRepository productRepository;
    private List<Product> order = new ArrayList<>();
    private Product currentProduct;

    @Given("l'utilisateur est sur la page produit du produit")
    public void lUtilisateurEstSurLaPageProduitDuProduit() {
        List<Product> products = Arrays.asList(
                new Product("Apple", 100, 1.0, "Fruit"),
                new Product("Banana", 150, 0.5, "Fruit"),
                new Product("Orange", 200, 0.75, "Fruit")
        );
        currentProduct = products.stream()
                .filter(product -> product.getName().equalsIgnoreCase(product.getName()))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Produit non trouvé"));

    }

    @When("l'utilisateur clique sur le bouton {string}")
    public void lUtilisateurCliqueSurLeBouton(String button) {
        if ("Ajouter à la commande".equals(button)) {
            order.add(currentProduct);
        }

    }

    @Then("l'utilisateur voit une confirmation que le produit a été ajouté à la commande")
    public void lUtilisateurVoitUneConfirmationQueLeProduitAÉtéAjoutéÀLaCommande() {
        Assert.assertTrue("Le produit doit être dans la commande",
                order.contains(currentProduct));
        System.out.println("Confirmation : Le produit " + currentProduct.getName() + " a été ajouté à la commande.");
    }
}
