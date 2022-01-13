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

WebUI.navigateToUrl('localhost')

WebUI.click(findTestObject('Page_Home page/a_Log in'))

WebUI.setText(findTestObject('Page_Home page Log in to the site/input_Username_username'), 'teacher1')

WebUI.setText(findTestObject('Page_Home page Log in to the site/input_Password_password (1)'), 'Group_10')

WebUI.click(findTestObject('Page_Home page Log in to the site/button_Log in'))

WebUI.click(findTestObject('Page_Dashboard/a_My courses (1)'))

WebUI.click(findTestObject('Page_My courses/span_Test Automation'))

WebUI.click(findTestObject('Page_Course Test Automation/a_Announcements  Forum'))

WebUI.click(findTestObject('Page_Course Test Automation/Page_Announcements/a_Add discussion topic'))

WebUI.setText(findTestObject('Page_Course Test Automation/Page_Announcements/input_Subject_subject'), 'Off next week')

WebUI.setText(findTestObject('Page_Course Test Automation/Page_Announcements/input_Message'), 'Lecturer has a meeting next week')

WebUI.click(findTestObject('Page_Course Test Automation/Page_Announcements/submitbutton'))

WebUI.click(findTestObject('Page_Dashboard/a_NH'))

WebUI.click(findTestObject('Page_Dashboard/a_Log out'))

WebUI.closeBrowser()

