import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost/')

WebUI.click(findTestObject('Object Repository/Page_Home page/a_Log in (6)'))

WebUI.setText(findTestObject('Object Repository/Page_Home page Log in to the site/input_Username_username (6)'), 'student1')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Home page Log in to the site/input_Password_password (6)'), 
    'OFhcon1PzObx3ErJAwGfGA==')

WebUI.click(findTestObject('Object Repository/Page_Home page Log in to the site/button_Log in (6)'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/a_NH (1)'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/a_Grades (1)'))

WebUI.click(findTestObject('Object Repository/Page_Grades - Nguyen Hoa/a_Test Automation'))

WebUI.click(findTestObject('Object Repository/Page_TA Activity report (grade)/a_Quiz1'))

WebUI.click(findTestObject('Object Repository/Page_TA Quiz1/a_NH (2)'))

WebUI.click(findTestObject('Object Repository/Page_TA Quiz1/a_Log out (2)'))

WebUI.closeBrowser()
