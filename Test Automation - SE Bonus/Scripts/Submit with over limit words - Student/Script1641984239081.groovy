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

WebUI.click(findTestObject('Page_Home page/a_Log in'))

WebUI.setText(findTestObject('Page_Home page Log in to the site/input_Username_username'), 'student1')

WebUI.setEncryptedText(findTestObject('Page_Home page Log in to the site/input_Username_username'), 'OFhcon1PzObx3ErJAwGfGA==')

WebUI.click(findTestObject('Page_Home page Log in to the site/button_Log in'))

WebUI.click(findTestObject('Page_Dashboard/a_My courses (1)'))

WebUI.click(findTestObject('Page_My courses/span_Test Automation'))

WebUI.click(findTestObject('Page_Course Test Automation/a_Homework 1  Assignment'))

WebUI.click(findTestObject('Object Repository/Page_TA Homework 1/button_Edit submission_1_2'))

WebUI.click(findTestObject('Object Repository/Page_TA Homework 1 - Edit submission/div_Rich text editorTest homework1Test home_3db0d2'))

WebUI.click(findTestObject('Object Repository/Page_TA Homework 1 - Edit submission/div_Rich text editorTest homework1Test home_1e7171'))

WebUI.setText(findTestObject('Page_TA Homework 1 - Edit submission/div_Test homework1'), 'Test homework1 Test homework1 Test homework1 Test homework1')

WebUI.click(findTestObject('Object Repository/Page_TA Homework 1 - Edit submission/input_Test homework1_submitbutton'))

WebUI.setText(findTestObject('Page_TA Homework 1 - Edit submission/div_Test homework1'), 'Test homework1')

WebUI.click(findTestObject('Object Repository/Page_TA Homework 1 - Edit submission/input_Test homework1_submitbutton'))

WebUI.click(findTestObject('Page_TA Homework 1/a_NH'))

WebUI.click(findTestObject('Page_TA Homework 1/a_Log out'))

WebUI.closeBrowser()

