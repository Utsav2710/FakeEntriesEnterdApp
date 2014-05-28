package com.Nokia;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NokiaApp {
	
	private WebDriver driver;
	private String baseUrl;
	
	public NokiaApp(WebDriver driver){
		super();  
        this.driver = driver; 
        baseUrl = "https://www.facebook.com";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	public void testNokia(String appName,String userFirstName,String userLastName,String userEmailId,String userLocation,String faceBookEmailId,String faceBookPassword){
		driver.get(baseUrl+ "/NokiaIndia/app_1407313569544113");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.switchTo().frame(0);
	    WebElement innerdiv=driver.findElement(By.xpath("//body[@id='xCampaign16183']/main/div/header[@id='xSectionHeader']/div[@id='HeaderR1']/div[@class='xRowInner']/div[@id='HeaderR1C1']/div[@class='xCellInner']/div[@id='Header_xModule_Header']/div[@class='xComponentInner']/div[@class='xNavShareWrapper']/nav[@class='xNavigation']/ul[@class='xTabs xNavMain']/li[@class='nav xTab entryTab']/a[@class='xTabLink']"));
		innerdiv.click();
		WebElement appTextBox=driver.findElement(By.xpath("//body[@id='xCampaign16183']/main/div/section[@id='xSectionEntry']/div[@class='xSectionInner']/div[@id='xSectionEntryR2']/div[@class='xRowInner']/div[@id='xSectionEntryR2C1']/div[@class='xCellInner']/div[@id='xSectionEntry_xModule_Entry']/div[@class='xComponentInner']/div[@class='xFormContainer xFacebookForm']/form[@id='xCampaignForm']/div[@class='xFormPages']/div/fieldset/div[@id='Suggest_an_App_01Wrapper']/div[@class='xFieldContainer xFieldWidthMedium']/div[@class='xField']/input[@name='Suggest_an_App_01']"));
		appTextBox.click();
		appTextBox.sendKeys(appName);
		
		WebElement firstName=driver.findElement(By.xpath("//body[@id='xCampaign16183']/main/div/section[@id='xSectionEntry']/div[@class='xSectionInner']/div[@id='xSectionEntryR2']/div[@class='xRowInner']/div[@id='xSectionEntryR2C1']/div[@class='xCellInner']/div[@id='xSectionEntry_xModule_Entry']/div[@class='xComponentInner']/div[@class='xFormContainer xFacebookForm']/form[@id='xCampaignForm']/div[@class='xFormPages']/div/fieldset/div[@id='nameWrapper']/div[@class='xFieldContainer xFieldWidthMedium']/div[@class='xField xCompositeItem-FirstName']/input[@id='name_Firstname']"));
		firstName.click();
		firstName.sendKeys(userFirstName);
		
		WebElement lastName=driver.findElement(By.xpath("//body[@id='xCampaign16183']/main/div/section[@id='xSectionEntry']/div[@class='xSectionInner']/div[@id='xSectionEntryR2']/div[@class='xRowInner']/div[@id='xSectionEntryR2C1']/div[@class='xCellInner']/div[@id='xSectionEntry_xModule_Entry']/div[@class='xComponentInner']/div[@class='xFormContainer xFacebookForm']/form[@id='xCampaignForm']/div[@class='xFormPages']/div/fieldset/div[@id='nameWrapper']/div[@class='xFieldContainer xFieldWidthMedium']/div[@class='xField xCompositeItem-LastName']/input[@id='name_Lastname']"));
		lastName.click();
		lastName.sendKeys(userLastName);
		
		
		
		WebElement emailId=driver.findElement(By.xpath("//body[@id='xCampaign16183']/main/div/section[@id='xSectionEntry']/div[@class='xSectionInner']/div[@id='xSectionEntryR2']/div[@class='xRowInner']/div[@id='xSectionEntryR2C1']/div[@class='xCellInner']/div[@id='xSectionEntry_xModule_Entry']/div[@class='xComponentInner']/div[@class='xFormContainer xFacebookForm']/form[@id='xCampaignForm']/div[@class='xFormPages']/div/fieldset/div[@id='Email_IDWrapper']/div[@class='xFieldContainer xFieldWidthMedium']/div[@class='xField']/input[@name='Email_ID']"));
		emailId.click();
		emailId.sendKeys(userEmailId);
		WebElement location=driver.findElement(By.xpath("//body[@id='xCampaign16183']/main/div/section[@id='xSectionEntry']/div[@class='xSectionInner']/div[@id='xSectionEntryR2']/div[@class='xRowInner']/div[@id='xSectionEntryR2C1']/div[@class='xCellInner']/div[@id='xSectionEntry_xModule_Entry']/div[@class='xComponentInner']/div[@class='xFormContainer xFacebookForm']/form[@id='xCampaignForm']/div[@class='xFormPages']/div/fieldset/div[@id='LocationWrapper']/div[@class='xFieldContainer xFieldWidthMedium']/div[@class='xField']/input[@name='Location']"));
		location.click();
		location.sendKeys(userLocation);
		WebElement termsAndCondition=driver.findElement(By.xpath("//body[@id='xCampaign16183']/main/div/section[@id='xSectionEntry']/div[@class='xSectionInner']/div[@id='xSectionEntryR2']/div[@class='xRowInner']/div[@id='xSectionEntryR2C1']/div[@class='xCellInner']/div[@id='xSectionEntry_xModule_Entry']/div[@class='xComponentInner']/div[@class='xFormContainer xFacebookForm']/form[@id='xCampaignForm']/div[@class='xFormPages']/div/fieldset/div[@id='terms_and_conditionsWrapper']/div[@class='xFieldContainer']/div[@class='xField xFieldCheckboxChoice']/div[@class='xCheckbox']/span/input[@name='terms_and_conditions']"));
		termsAndCondition.click();
		WebElement submitButton=driver.findElement(By.xpath("//body[@id='xCampaign16183']/main/div/section[@id='xSectionEntry']/div[@class='xSectionInner']/div[@id='xSectionEntryR2']/div[@class='xRowInner']/div[@id='xSectionEntryR2C1']/div[@class='xCellInner']/div[@id='xSectionEntry_xModule_Entry']/div[@class='xComponentInner']/div[@class='xFormContainer xFacebookForm']/form[@id='xCampaignForm']/div[@class='xActionContainer xActionsForm']/div[@class='xSubmitContainer']/button[@class='xButton xCTA xSubmit']"));
		submitButton.click();
		driver.findElement(By.id("email")).clear();
	    driver.findElement(By.id("email")).sendKeys(faceBookEmailId);
	    driver.findElement(By.id("pass")).clear();
	    driver.findElement(By.id("pass")).sendKeys(faceBookPassword);
	    driver.findElement(By.id("u_0_1")).click();
	    try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    //driver.findElement(By.id("userNavigationLabel")).click();
	    //driver.findElement(By.cssSelector("input.uiLinkButtonInput")).click();
	    
		
		System.out.println("USER ADDED SUCCESSFULLY");
	    	
	
	}
	public void testNokia1(String appName,String userFirstName,String userLastName,String userEmailId,String userLocation){
		
		driver.switchTo().frame(0);
	    WebElement innerdiv=driver.findElement(By.xpath("//body[@id='xCampaign16183']/main/div/header[@id='xSectionHeader']/div[@id='HeaderR1']/div[@class='xRowInner']/div[@id='HeaderR1C1']/div[@class='xCellInner']/div[@id='Header_xModule_Header']/div[@class='xComponentInner']/div[@class='xNavShareWrapper']/nav[@class='xNavigation']/ul[@class='xTabs xNavMain']/li[@class='nav xTab entryTab']/a[@class='xTabLink']"));
		innerdiv.click();
		WebElement appTextBox=driver.findElement(By.xpath("//body[@id='xCampaign16183']/main/div/section[@id='xSectionEntry']/div[@class='xSectionInner']/div[@id='xSectionEntryR2']/div[@class='xRowInner']/div[@id='xSectionEntryR2C1']/div[@class='xCellInner']/div[@id='xSectionEntry_xModule_Entry']/div[@class='xComponentInner']/div[@class='xFormContainer xFacebookForm']/form[@id='xCampaignForm']/div[@class='xFormPages']/div/fieldset/div[@id='Suggest_an_App_01Wrapper']/div[@class='xFieldContainer xFieldWidthMedium']/div[@class='xField']/input[@name='Suggest_an_App_01']"));
		appTextBox.click();
		appTextBox.sendKeys(appName);
		
		WebElement firstName=driver.findElement(By.xpath("//body[@id='xCampaign16183']/main/div/section[@id='xSectionEntry']/div[@class='xSectionInner']/div[@id='xSectionEntryR2']/div[@class='xRowInner']/div[@id='xSectionEntryR2C1']/div[@class='xCellInner']/div[@id='xSectionEntry_xModule_Entry']/div[@class='xComponentInner']/div[@class='xFormContainer xFacebookForm']/form[@id='xCampaignForm']/div[@class='xFormPages']/div/fieldset/div[@id='nameWrapper']/div[@class='xFieldContainer xFieldWidthMedium']/div[@class='xField xCompositeItem-FirstName']/input[@id='name_Firstname']"));
		firstName.click();
		firstName.sendKeys(userFirstName);
		
		WebElement lastName=driver.findElement(By.xpath("//body[@id='xCampaign16183']/main/div/section[@id='xSectionEntry']/div[@class='xSectionInner']/div[@id='xSectionEntryR2']/div[@class='xRowInner']/div[@id='xSectionEntryR2C1']/div[@class='xCellInner']/div[@id='xSectionEntry_xModule_Entry']/div[@class='xComponentInner']/div[@class='xFormContainer xFacebookForm']/form[@id='xCampaignForm']/div[@class='xFormPages']/div/fieldset/div[@id='nameWrapper']/div[@class='xFieldContainer xFieldWidthMedium']/div[@class='xField xCompositeItem-LastName']/input[@id='name_Lastname']"));
		lastName.click();
		lastName.sendKeys(userLastName);
		
		
		
		WebElement emailId=driver.findElement(By.xpath("//body[@id='xCampaign16183']/main/div/section[@id='xSectionEntry']/div[@class='xSectionInner']/div[@id='xSectionEntryR2']/div[@class='xRowInner']/div[@id='xSectionEntryR2C1']/div[@class='xCellInner']/div[@id='xSectionEntry_xModule_Entry']/div[@class='xComponentInner']/div[@class='xFormContainer xFacebookForm']/form[@id='xCampaignForm']/div[@class='xFormPages']/div/fieldset/div[@id='Email_IDWrapper']/div[@class='xFieldContainer xFieldWidthMedium']/div[@class='xField']/input[@name='Email_ID']"));
		emailId.click();
		emailId.sendKeys(userEmailId);
		WebElement location=driver.findElement(By.xpath("//body[@id='xCampaign16183']/main/div/section[@id='xSectionEntry']/div[@class='xSectionInner']/div[@id='xSectionEntryR2']/div[@class='xRowInner']/div[@id='xSectionEntryR2C1']/div[@class='xCellInner']/div[@id='xSectionEntry_xModule_Entry']/div[@class='xComponentInner']/div[@class='xFormContainer xFacebookForm']/form[@id='xCampaignForm']/div[@class='xFormPages']/div/fieldset/div[@id='LocationWrapper']/div[@class='xFieldContainer xFieldWidthMedium']/div[@class='xField']/input[@name='Location']"));
		location.click();
		location.sendKeys(userLocation);
		WebElement termsAndCondition=driver.findElement(By.xpath("//body[@id='xCampaign16183']/main/div/section[@id='xSectionEntry']/div[@class='xSectionInner']/div[@id='xSectionEntryR2']/div[@class='xRowInner']/div[@id='xSectionEntryR2C1']/div[@class='xCellInner']/div[@id='xSectionEntry_xModule_Entry']/div[@class='xComponentInner']/div[@class='xFormContainer xFacebookForm']/form[@id='xCampaignForm']/div[@class='xFormPages']/div/fieldset/div[@id='terms_and_conditionsWrapper']/div[@class='xFieldContainer']/div[@class='xField xFieldCheckboxChoice']/div[@class='xCheckbox']/span/input[@name='terms_and_conditions']"));
		termsAndCondition.click();
		WebElement submitButton=driver.findElement(By.xpath("//body[@id='xCampaign16183']/main/div/section[@id='xSectionEntry']/div[@class='xSectionInner']/div[@id='xSectionEntryR2']/div[@class='xRowInner']/div[@id='xSectionEntryR2C1']/div[@class='xCellInner']/div[@id='xSectionEntry_xModule_Entry']/div[@class='xComponentInner']/div[@class='xFormContainer xFacebookForm']/form[@id='xCampaignForm']/div[@class='xActionContainer xActionsForm']/div[@class='xSubmitContainer']/button[@class='xButton xCTA xSubmit']"));
		submitButton.click();
		try{
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.get(baseUrl+ "/NokiaIndia/app_1407313569544113");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("SUCCESS");
		
	}
		
	
	
}
