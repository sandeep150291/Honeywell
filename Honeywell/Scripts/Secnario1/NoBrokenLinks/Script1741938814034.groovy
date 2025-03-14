import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import java.sql.Driver as Driver
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable

import org.junit.Test
import org.openqa.selenium.By
import org.openqa.selenium.Keys
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebDriver as Keys
import org.openqa.selenium.WebElement
import org.openqa.selenium.chrome.ChromeDriver as WebElement
//
//WebUI.openBrowser('')
//
//WebUI.navigateToUrl(findTestData('Testdata').getValue(2, 1))
//
//WebUI.maximizeWindow()
//
//WebUI.click(findTestObject('Contact/Manage_Option'))
//
//WebUI.click(findTestObject('Contact/Accept_All'))
//
//List<WebElement> lst = WebUI.findWebElements(findTestObject('SubMenus/MainMenu'), 5)
//System.out.println(lst.size())
//for(int i=1;i<=lst.size()-1;i++) {
//	
//	String data = lst.get(0).getText();
//	String RunTimeXpath = "//span[contains(text(),'"${data}"')]
//	WebUI.mouseOver(findTestObject("//span[text()='"+text+"']"))
	
//}
class submenu {
	
@Test
 void menus() {
String Chromepath = System.getProperty("user.dir");

System.setProperty("webdriver.chrome.driver", "Chromepath\\Drivers\\chromedriver.exe")
WebDriver driver = new ChromeDriver();
String url = findTestData('Testdata').getValue(2, 1)
driver.get(url);
driver.manage().window().maximize();
String manage = findTestObject('Contact/Manage_Option');
System.out.println(manage);
driver.findElement(By.xpath(manage)).click();
String accept = findTestObject('Contact/Accept_All');
driver.findElement(By.xpath(accept)).click();
}
}