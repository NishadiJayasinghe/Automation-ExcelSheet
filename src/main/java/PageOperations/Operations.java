package PageOperations;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;

import Base.BaseTerms;
import PageElements.Locators;
import dataProvider.ExcelUtilsReader;
import io.qameta.allure.Step;

public class Operations extends BaseTerms {
	@Step("Initiate browser and excelsheet")
	public static void initiateWebdriver() throws Exception {
       ExcelUtilsReader.setExcelFile(getPropertyValue("Path_TestData") +getPropertyValue("File_TestData"),"Sheet1");
        LaunchBrowser();
    }
    
	@Step("Input Username step....")
    public static void InputUserName() throws Exception {
       String sUserName = ExcelUtilsReader.getCellData(1,0);
		type(Locators.UserName(), sUserName);
        //Locators.UserName().sendKeys(sUserName);
    }
    
	@Step("Input password step....")
    public static void InputPassword() throws Exception {
        String sPassword = ExcelUtilsReader.getCellData(1, 1);
        type(Locators.Password(), sPassword);
       // Locators.Password().sendKeys(sPassword);
    }
    
	@Step("click on login button....")
    public static void ClickLogin() {
		click(Locators.login());
        //Locators.login().click();
    }
    
	@Step("verify login....")
	 public static void veriifyLogin () {
	 try{
	        
	      Alert alt = getDriver().switchTo().alert();
	        String actualBoxtitle = alt.getText();
	        alt.accept();
	        if (actualBoxtitle.contains(EXPECT_ERROR)) { 
	            System.out.println("Test case : Passed got expected error alert");
	        } else {
	            System.out.println("Test case : Failed didn't get expected error alert");
	        }
	    }
	catch (NoAlertPresentException Ex){
	    String actualTitle = getDriver().getTitle();

	        if (actualTitle.contains(EXPECT_TITLE)) {
	            System.out.println("Test case : Passed, navigated to the correct page");
	        } else {
	            System.out.println("Test case : Failed, didn't get the expected title");
	        }
	        
	}


}
}
