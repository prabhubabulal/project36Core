package FunctionalSpecific;


import utils.captureImage;
import utils.generateHTML;
import utils.webElementActionClass;
import variables.haloVariables;

public class search {
public static void appSearch(String playerID){
		
	try{
		System.out.println("Player ID:"+playerID);
		webElementActionClass.setText("xpath", haloVariables.SEARCH_PLAYER_ID, playerID);
		System.out.println("=====================================");
		webElementActionClass.WebElementLink("xpath", haloVariables.SEARCH_IMAGE);
		System.out.println("=====================================");
		Thread.sleep(1000);	  
//		generateHTML.writeResults("Player Search", "Pass", "Player "+playerID+" Search Sucessful ", captureImage.capture("searchPage"));;
		System.out.println("Search Player Completed");
	}catch(Exception e){e.printStackTrace();}
}
}
