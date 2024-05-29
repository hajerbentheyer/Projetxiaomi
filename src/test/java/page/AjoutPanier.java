package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Helper.Config;

public class AjoutPanier {
	
	    @FindBy(xpath="/html/body/div[1]/div[4]/div/div/div/div/div[3]/div[1]/div/div[3]/div/form/div/button")
		WebElement addtocard;
	    @FindBy(xpath="/html/body/div[1]/header/div[1]/div/section/div/div[4]/div/section/div/div[2]/div/div/div/div/div/div/a/span/i")
		WebElement panier;
	    @FindBy(xpath="/html/body/div [1]/header/div[1]/div/section/div/div[4]/div/section/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/ul/li/div[2]/a[1]/span")
		WebElement verifproduit;
	    public AjoutPanier() {
	    	PageFactory.initElements(Config.driver,this);
	    }
	    public void clickaddtocard() throws Exception {
	
			addtocard.click();
				}
			public void clickpanier() throws Exception {
				
			           panier.click();
					}
			
	    public String verifMsg() {
	    	String ActualText=verifproduit.getText();
	    			return ActualText;
	    	}
}
