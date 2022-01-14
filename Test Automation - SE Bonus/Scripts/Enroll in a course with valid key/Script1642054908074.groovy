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

WebUI.setText(findTestObject('Page_Home page Log in to the site/input_Username_username'), 'student2')

WebUI.setText(findTestObject('Page_Home page Log in to the site/input_Password_password (1)'), 'Group_10')

WebUI.click(findTestObject('Page_Home page Log in to the site/button_Log in'))

WebUI.click(findTestObject('Self enroll course/a_Home'))

WebUI.setText(findTestObject('Self enroll course/input_Search courses_q'), 'Test automation')

WebUI.click(findTestObject('Self enroll course/icon search'))

WebUI.click(findTestObject('Self enroll course/a_Test Automation'))

WebUI.setText(findTestObject('Self enroll course/input_Enrolment key_enrolpassword'), 'Group_10')

WebUI.click(findTestObject('Self enroll course/input_Enrolment key_submitbutton'))

WebUI.verifyTextPresent('You are enrolled in the course.', false)

WebUI.click(findTestObject('Page_Dashboard/a_NH'))

WebUI.click(findTestObject('Page_Dashboard/a_Log out'))

WebUI.closeBrowser()

