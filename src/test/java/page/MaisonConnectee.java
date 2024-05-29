package page;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Helper.Config;

public class MaisonConnectee {

    @FindBy(xpath="/html/body/div[1]/div[5]/div/div/div[1]/div/div[2]/div[4]/form/div/select")
	WebElement triproductselect;
    @FindBy(xpath="/html/body/div[1]/div[5]/div/div/div[1]/div/header/h1")
    WebElement verification;
    @FindBy(xpath="/html/body/div[1]/div[5]/div/div/div[1]/div/div[3]/div/div/div/div[2]/div[2]/h3/a")
	List<WebElement> producttlist;
    @FindBy(xpath="/html/body/div[1]/div[4]/div/div/div/div/div[3]/div[1]/div/div[1]/div/div[1]/h1")
	WebElement productverif;
    public MaisonConnectee() {
    	PageFactory.initElements(Config.driver,this);
    }
    public void triProductSortBy(String sortTri) throws Exception {
    	Thread.sleep(3000);
		Select select=new Select (triproductselect);
				select.selectByVisibleText(sortTri);
	}
	public void clickonproductbyname(String productname) throws Exception {
	   try {
		for (WebElement sousmenu:producttlist) {
			System.out.println(sousmenu.getText());
			if (sousmenu.getText().contains(productname)){
				sousmenu.click();
				Thread.sleep(2000);
		
			}
		}
			
		}catch (Exception e) {
			// TODO: handle exception
		}
	}
	public String verifMsg() {
	String ActualText=productverif.getText();
			return ActualText;
	}
}

