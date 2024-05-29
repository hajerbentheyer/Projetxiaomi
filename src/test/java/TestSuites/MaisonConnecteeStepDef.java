package TestSuites;

import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;

import Helper.Config;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.MaisonConnectee;

public class MaisonConnecteeStepDef {
	//@Given("utilisateur est sur la page de {string}")
	@Given("utilisateur est sur la page de maison connectee")
	public void utilisateur_est_sur_la_page_de() throws Exception {
		    Config.ConfChrome();
		    Config.driver= new ChromeDriver();
		    Config.maximizewindow();
		   // Config.driver.get(Utils.getproprety("Web_Linkk2"));
		    String url="https://mistore.com.tn/product-category/maison-connectee/";
            Config.driver.get(url);
	}

	@When("utilisateur fait le {string}")
	public void utilisateur_fait_le(String tri) throws Exception {
	MaisonConnectee page=new MaisonConnectee();
	page.triProductSortBy(tri);
	} 

	@When("utilisateur clique sur le produit {string}")
	public void utilisateur_clique_sur_le_produit(String click) throws Exception {
		MaisonConnectee page=new MaisonConnectee();
		page.clickonproductbyname(click);
         }

	@Then("utilisateur est dirige vers la page du produit {string}")
	public void utilisateur_est_dirige_vers_la_page_du_produit(String nomproduit ) {
		MaisonConnectee page=new MaisonConnectee();
		String ActualMessage=page.verifMsg();
        Assert.assertEquals(nomproduit, ActualMessage);
	   
	}

}
