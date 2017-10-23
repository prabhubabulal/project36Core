package RootClass;

import org.testng.annotations.Test;

import utils.generateHTML;
import utils.webDriverClass;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.testng.annotations.AfterClass;

public class RootClass {
	public static String reportPath = "C:\\TestAutomation\\Result";
	public static String executionInput = "src\\test\\resources\\ExecutionInput\\Adjuster.xlsx";
	public static String testDataPath = "src\\test\\resources\\TestData";
	public static String configpath = "src\\test\\resources\\config\\";
  
	@BeforeSuite
	public void beforeSuite() {
		String currentDate = new SimpleDateFormat("dd-MM-yyyy").format(new Date());
		  Date today = new Date();
		  String currentTime = today.getHours()+"-"+today.getMinutes()+"-"+today.getSeconds();
		  String datetime = currentDate+"-"+currentTime;
		  File file = new File(configpath+"haloApp-UAT.properties");
		  FileInputStream fileInput = null;
		  try {
				fileInput = new FileInputStream(file.getAbsolutePath());
				System.out.println("Application Properties File Path : "+file.getAbsolutePath());
		  } catch (FileNotFoundException e) {
				e.printStackTrace();
		  }
		  Properties prop = new Properties();
        //load properties file
			try {
				prop.load(fileInput);
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		  String appURL = prop.getProperty("app.url");
		  generateHTML.writeStartResults("Halo", datetime, "Prabhu Babulal", "UAT",webDriverClass.appUsername,appURL);
		  generateHTML.writeResults("E2E Testing", "", "", "");		
	}
	
	
	@Test
  public void f() {
  }

  
  
  

}
