package FunctionalSpecific;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageFactory.HomePage;
import pageFactory.LoginPage;
import utils.captureImage;
import utils.generateHTML;
import utils.webDriverClass;


public class loginClass {
	
public static void login(String userName, String password, String domain){
	
	  try{
		  WebDriver driver = webDriverClass.driver;	
		  WebDriverWait wait = new WebDriverWait(driver,20);
		  LoginPage login = PageFactory.initElements(driver, LoginPage.class);
		  HomePage homePage = PageFactory.initElements(driver, HomePage.class);
		  login.LOGINUSERNAME.sendKeys(userName);
		  login.LOGINPASSWORD.sendKeys(password);
		  login.LOGINDOMAIN.sendKeys(domain);
		  login.LOGINSUBMIT.click();		  
		  wait.until(ExpectedConditions.visibilityOf(homePage.PLAYERIDSEARCH));		  	  		  
		  if(homePage.PLAYERIDSEARCH.isDisplayed()) {
			  generateHTML.writeResults("Login", "Pass", "Login Sucessful with "+userName, captureImage.capture("LoginPage"));
		  }else {
			  generateHTML.writeResults("Login", "Fail", "Login UnSucessful", captureImage.capture("LoginPage"));
		  }		 
		  Thread.sleep(1000);		 
	  }catch(Exception e){
		  generateHTML.writeResults("Login", "Fail", "Login UnSucessful", captureImage.capture("LoginPage"));
		  System.out.println(e.getMessage());
	  }
	
}
	 
	 
}
