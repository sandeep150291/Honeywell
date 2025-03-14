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
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.WebDriver as Keys
import org.openqa.selenium.WebElement as WebElement
import org.testng.Assert as Assert

WebUI.openBrowser('')

WebUI.navigateToUrl(findTestData('Testdata').getValue(2, 1))

WebUI.maximizeWindow()

WebUI.click(findTestObject('Contact/Manage_Option'))

WebUI.click(findTestObject('Contact/Accept_All'))

WebUI.mouseOver(findTestObject('Contact/About'))

WebUI.scrollToElement(findTestObject('Contact/Contact_us'), 10)

WebUI.click(findTestObject('Contact/Contact_us'))

String val = WebUI.getText(findTestObject('Contact/Contact_US_Title'))

System.out.println(val)

String mailadd = WebUI.getText(findTestObject('Contact/Mail_address'))

System.out.println(mailadd)

List<WebElement> lst = WebUI.findWebElements(findTestObject('Contact/Tel_No'), 5)

System.out.println(lst.size())

String telno = lst.get(0).getText()

String telno1 = lst.get(1).getText()

System.out.println((telno + '   ') + telno1)

//WebUI.verifyTextPresent(findTestData('Testdata').getValue(2, 2), val)
String value = findTestData('Testdata').getValue(2, 2)

System.out.println(value)

assert value == val

assert mailadd == findTestData('Testdata').getValue(2, 3)

assert telno == findTestData('Testdata').getValue(2, 4)

assert telno1 == findTestData('Testdata').getValue(2, 5)

WebUI.closeBrowser()

