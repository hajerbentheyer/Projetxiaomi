package page;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Helper.Config;

public class HomePage {
@FindBy(xpath="/html/body/div[1]/header/div[1]/div/section/div/div[2]/div/div/div/div/nav/ul/li/a")
List<WebElement>menus;
@FindBy(xpath="/html/body/div[1]/header/div[1]/div/section/div/div[2]/div/div/div/div/nav/ul/li[3]/div/div/div/div/section/div/div/div/div/div/a/div/div[2]/h4")
List<WebElement>produitList;
@FindBy(xpath="/html/body/div[1]/div[5]/div/div/div[1]/div/header/h1")
WebElement verification;
public HomePage() {
	PageFactory.initElements(Config.driver,this);
}
public void mouseHoverOnMenuByName(String menuName) throws Exception {
	Thread.sleep(2000);
	try {
	for (WebElement menu:menus) {
		if(menu.getText().contains(menuName)) {
			Config.action=new Actions (Config.driver);
			Config.action.moveToElement(menu).perform();
		}
	}
		}catch (Exception e) {
			// TODO: handle exception
		}
}
	public void clickonsubmenu(String submenuName) throws Exception{
		Thread.sleep(2000);
		try {
		for(WebElement produit:produitList) {
			if(produit.getText().contains(submenuName)) {
				produit.click();
			}
		}
		}catch (Exception e) {
			// TODO: handle exception
		}
	}
	public String verifMessage() {
		String ActualText= verification.getText();
				return ActualText;
				
	}
}

