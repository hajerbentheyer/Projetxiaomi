package TestSuites;

import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;

import Helper.Config;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.HomePage;

public class HomePageStepDef {
	//@Given("utilisateur est sur la page de maison connectee")
	public void utilisateur_est_sur_la_page_de_maison_connectee() throws Exception {
	    Config.ConfChrome();
	    Config.driver= new ChromeDriver();
	    Config.maximizewindow();
	    //Config.driver.get(Utils.getProperty("Web_Link"));
	    String url="https://mistore.com.tn/";
	    Config.driver.get(url);
	}

	@When("utilisateur survol la souris sur le menu {string}")
	public void utilisateur_survol_la_souris_sur_le_menu(String menuname) throws Exception {
	  HomePage page=new HomePage();
	  page.mouseHoverOnMenuByName(menuname);
	}

	@When("utilisateur clique sur le submenu {string}")
	public void utilisateur_clique_sur_le_submenu(String produitName) throws Exception {
		HomePage page=new HomePage();
		page.clickonsubmenu(produitName);
	}

	@Then("utilisateur est dirigé vers la page de submenu {string}")
	public void utilisateur_est_dirigé_vers_la_page_de_submenu(String NomProduit) {
		HomePage page=new HomePage();
        String ActualMessage=page.verifMessage();
        Assert.assertEquals(NomProduit, ActualMessage);
	}
	
}
