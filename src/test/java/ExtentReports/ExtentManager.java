package ExtentReports;

import com.relevantcodes.extentreports.ExtentReports;

public class ExtentManager {
 
  private static ExtentReports extent;
  
  public synchronized static ExtentReports getReporter() {
	  
	  if(extent == null) {
		  //set HTML reporting file Location
		  String workingDir = System.getProperty("user.dir");
		  extent = new ExtentReports(workingDir + "\\ExtentReports\\ExtentReportResults.html", true);
	  }
	  return extent;
  }
	
}
