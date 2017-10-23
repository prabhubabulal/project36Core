package FunctionalSpecific;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utils.captureImage;
import utils.generateHTML;
import utils.webDriverClass;
import utils.webElementActionClass;
import variables.bConnectedVariables;
import variables.haloVariables;

public class bConnected {
	
public static void enroll(){
	  try{
		  Thread.sleep(1000);
		  WebDriver connectedDriver = webDriverClass.bConnectedDriver;
		  List<WebElement> wElement = connectedDriver.findElements(By.xpath(bConnectedVariables.STARTHERE));
		  wElement.get(4).click();
		  System.out.println();
	  }catch(Exception e){
		  System.out.println(e.getMessage());
	  }
	
}
	 
	 
}
