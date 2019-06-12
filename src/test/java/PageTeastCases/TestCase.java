package PageTeastCases;

import org.testng.annotations.Test;
import PageOperations.Operations;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;


public class TestCase extends Operations{
  @Test(description = "login with correct credentials")
  @Severity(SeverityLevel.NORMAL)
  @Description("Test Case Description : login with correct credentials")
  @Story("Story Name : To check login Page")
  public void TestProcedure() throws Exception {
	  
	  initiateWebdriver();
	  InputUserName();
	  InputPassword();
	  ClickLogin();
	  veriifyLogin();
  }
}
