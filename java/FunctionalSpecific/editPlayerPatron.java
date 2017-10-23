package FunctionalSpecific;


import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.captureImage;
import utils.generateHTML;
import utils.webDriverClass;
import utils.webElementActionClass;
import variables.haloVariables;

public class editPlayerPatron {
public static void editPlayer(String playerID) throws InterruptedException{
	WebDriver driver = webDriverClass.driver;
	WebDriverWait wait = new WebDriverWait(driver,60);
	search.appSearch(playerID);
	webElementActionClass.clickLink("id", haloVariables.PLAYERFUNCTIONSMENU);
	Thread.sleep(900);
	webElementActionClass.clickLink(haloVariables.EDIT_PATRON_MENU);	
	Thread.sleep(2000);
	generateHTML.writeResults("Edit Patron", "Pass", "Edit Player Successful", captureImage.capture("editPatron"));	
	webElementActionClass.clickLink("xpath", haloVariables.BTN_ENROLL);
	Thread.sleep(1000);
	System.out.println("Edit Player Patron Completed");
	
}
}
