package com.clientname.app.tests;

import org.junit.Assert;
import org.testng.ITestResult;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;


public class Example_SimpleTestReporter {
	
	public static  ExtentHtmlReporter htmlReporter;
	public static  ExtentReports extent;
	public static ExtentTest logger;
	
	
	 @BeforeSuite(alwaysRun = true)
	 public void startReport(){
	 System.out.println("Start the tests");
	 
	 htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") +"/test-output/extentreports/STMExtentReport.html");
	 extent = new ExtentReports ();
	 extent.attachReporter(htmlReporter);
	 extent.setSystemInfo("Host Name", "SoftwareTestingMaterial");
	 extent.setSystemInfo("Environment", "Automation Testing");
	 
	 htmlReporter.config().setDocumentTitle("Title of the Report Comes here");
	 htmlReporter.config().setReportName("Name of the Report Comes here");
	 htmlReporter.config().setTestViewChartLocation(ChartLocation.TOP);
	 htmlReporter.config().setTheme(Theme.STANDARD);
	 }
	 
	 
	 @Test (groups = {"Extent"})
	 public void passTest(){
		 System.out.println("TEST 1");
	 logger = extent.createTest("passTest");
	 Assert.assertTrue(true);
	 logger.log(Status.PASS, MarkupHelper.createLabel("Test Case Passed is passTest", ExtentColor.GREEN));

	 }
	 
	 @Test (groups = {"Extent"})
	 public void failTest(){
		 System.out.println("TEST 2");
	 logger = extent.createTest("failTest");
	 
	 Assert.assertTrue(false);
	 
	 logger.log(Status.PASS, "Test Case (failTest) Status is passed");
	 logger.log(Status.PASS, MarkupHelper.createLabel("Test Case (failTest) Status is passed", ExtentColor.GREEN));
	 
	 }
	 
	 @Test (groups = {"Extent"})
	 public void skipTest(){
		 
		 System.out.println("TEST 3");
	 logger = extent.createTest("skipTest");
	 throw new SkipException("Skipping - This is not ready for testing ");
	 }
	 
	 
	 
	 @AfterMethod(alwaysRun = true)
	 public synchronized void getResult(ITestResult result){
		
		 System.out.println("After METHOD");
		 
	 if(result.getStatus() == ITestResult.FAILURE){
			 logger.log(Status.FAIL, MarkupHelper.createLabel(result.getName() + " - Test Case Failed", ExtentColor.RED));
			 logger.log(Status.FAIL, MarkupHelper.createLabel(result.getThrowable() + " - Test Case Failed", ExtentColor.RED));
	 }else if(result.getStatus() == ITestResult.SKIP){
		 	logger.log(Status.SKIP, MarkupHelper.createLabel(result.getName() + " - Test Case Skipped", ExtentColor.ORANGE)); 
		 }
//	 endReport();
	 }
	 
	 @AfterSuite(alwaysRun = true)
	 public  void endReport(){
		 System.out.println("After Flush");
		 extent.flush();
	    }
	 
	 
}
