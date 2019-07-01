package PageTeastCases;

import java.lang.reflect.Method;

import org.testng.annotations.Test;

import ExtentReports.ExtentTestManager;
import PageOperations.Operations;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

//@Listeners({TestListener.class})
@Epic("functional Tests")
@Feature("Login Tests")
public class TestCase extends Operations{
	
		
  @Test(description = "login with correct credentials")
  @Severity(SeverityLevel.NORMAL)
  @Description("Test Case Description : login with correct credentials")
  @Story("Story Name : To check login Page") 
  public void TestProcedure(Method method) throws Exception {
	  ExtentTestManager.startTest(method.getName(), "Invalid Login Scenario with empty username and password.");
	  initiateWebdriver();
	  InputUserName();
	  InputPassword();
	  ClickLogin();
	  veriifyLogin();
	  getDriver().close();
	  
  }
}
