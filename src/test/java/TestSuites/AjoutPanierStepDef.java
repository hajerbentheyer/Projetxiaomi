package TestSuites;

import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;

import Helper.Config;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.AjoutPanier;

public class AjoutPanierStepDef {
	
	@Given("utilisateur sur la page de produit")
	public void utilisateur_sur_la_page_de_produit() throws Exception {
		Config.ConfChrome();
		   Config.driver= new ChromeDriver();
		   Config.maximizewindow();
		   String url="https://mistore.com.tn/product/mi-temperature-and-humidity-monitor-pro/";
		   Config.driver.get(url);
	}

	@When("utilisateur clique sur Ajouter Au Panier")
	public void utilisateur_clique_sur_ajouter_au_panier() throws Exception {
		AjoutPanier page=new AjoutPanier ();
		page.clickaddtocard();
	}

	@When("utilisateur accede a la page panier")
	public void utilisateur_accede_a_la_page_panier() throws Exception {
		AjoutPanier page=new AjoutPanier ();
         page.clickpanier();
	}
	@Then("utilisateur verifie le produit ajoute a la liste {string}")
	public void utilisateur_verifie_le_produit_ajoute_a_la_liste(String expectedmsg) {
		AjoutPanier page=new AjoutPanier ();
		String Actualmsg=page.verifMsg();
		Assert.assertEquals(expectedmsg, Actualmsg);
	}
	
	


}
