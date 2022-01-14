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

WebUI.click(findTestObject('Page_Course Test Automation/input_Edit mode_setmode'))

WebUI.click(findTestObject('Page_Course Test Automation/Add lesson note/button_Add an activity or resource'))

WebUI.click(findTestObject('Page_Course Test Automation/Add lesson note/icon file'))

WebUI.setText(findTestObject('Page_Course Test Automation/Add lesson note/input_Name_name'), 'Lesson note - Week 02')

WebUI.click(findTestObject('Page_Course Test Automation/Add lesson note/Select file in general'))

WebUI.click(findTestObject('Page_Course Test Automation/Add lesson note/select upload file method'))

WebUI.uploadFile(findTestObject('Page_Course Test Automation/Add lesson note/choose file upload'), 'D:\\Katalon\\Note-Week02.docx')

WebUI.click(findTestObject('Page_Course Test Automation/Add lesson note/button_Upload this file'))

WebUI.click(findTestObject('Page_Course Test Automation/Add lesson note/submitbutton'))

WebUI.click(findTestObject('Page_Course Test Automation/Edit lesson note/i_Mark as done_icon fa fa-ellipsis-v fa-fw'))

WebUI.click(findTestObject('Page_Course Test Automation/Edit lesson note/span_Delete'))

WebUI.click(findTestObject('Page_Course Test Automation/Edit lesson note/button_Yes'))

WebUI.click(findTestObject('Page_Dashboard/a_NH'))

WebUI.click(findTestObject('Page_Dashboard/a_Log out'))

WebUI.closeBrowser()

