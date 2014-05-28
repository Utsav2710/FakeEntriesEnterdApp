package com.Nokia;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AppLaunch {

public static void main(String args[]){
	
	
	AppLaunch obj = new AppLaunch();
	obj.run();
	System.out.println("NO OF USER REGISTER DONE");
}
public void run(){
	
	String csvFile="./emailAddress.csv";
	BufferedReader br = null;
	String line = "";
	String cvsSplitBy = ",";
	int count = 0;
	HashMap appName=new HashMap();
	  appName.put(1,"World of Red Bull");
	  
	  appName.put(2,"Angry Birds Roast");
	  
	  appName.put(3,"ESPN Hub");
	  
	  appName.put(4,"Sozoom");
	  appName.put(5,"Pics Art");
	  appName.put(6,"lineChat");
	  appName.put(7, "instagram");
	  appName.put(8,"Nokia Pro Cam");
	  appName.put(9,"InNote");
	  appName.put(10,"GoPro");
	  
	         try{
	              br = new BufferedReader(new FileReader(csvFile));
	              WebDriver driver=  new  FirefoxDriver();
	        	  NokiaApp nokiaApp=new NokiaApp(driver);
	        	  nokiaApp.testNokia("test", "test", "test", "test@gmail.com", "test","rameshsureshmanish@gmail.com","230_Channel");
	              
	              while ((line = br.readLine()) != null) {
                      count++; 
	            	  String[] details = line.split(cvsSplitBy);
	            	  int randomNo=randInt(1, 10);

	            		System.out.println("RANDOM NO"+randomNo);
	            		String AppName=(String) appName.get(randomNo);
	            		System.out.println("APP_NAME===="+AppName);
	            	  System.out.println("user details [FirstName= " + details[0] 
	            			  + " , Location=" + details[3]); 
	            	  System.out.println("##########nokia app Start#########");
	            	 
	            	  nokiaApp.testNokia1(AppName, details[0], details[1], details[2], details[3]);
	                System.out.println("NO OF USER REGISTER=="+count);
	              }
}catch(FileNotFoundException e){
	System.out.println("INSIDE THE CATCH OF FILE NOT FOUND");
	e.printStackTrace();
	
}
catch(IOException e){
	System.out.println("INSIDE THE CATCH OF IO ");
	e.printStackTrace();
}
	         
	         System.out.println("Done");
}


public  int randInt(int min, int max) {

    // Usually this should be a field rather than a method variable so
    // that it is not re-seeded every call.
    Random rand = new Random();

    // nextInt is normally exclusive of the top value,
    // so add 1 to make it inclusive
    int randomNum = rand.nextInt((max - min) + 1) + min;

    return randomNum;
}
}