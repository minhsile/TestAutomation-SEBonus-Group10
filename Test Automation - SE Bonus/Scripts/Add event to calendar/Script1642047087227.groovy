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

WebUI.click(findTestObject('Page_Course Test Automation/span_Add an activity or resource_2'))

WebUI.click(findTestObject('Page_Course Test Automation/img_Recommended_icon icon activityicon'))

WebUI.setText(findTestObject('Page_Course Test Automation/Page_Editing Assignment/input_name-assignment'), 'Midterm')

WebUI.setText(findTestObject('Page_Course Test Automation/Page_Editing Assignment/input_description_assignment'), 'MSSV.pdf')

WebUI.selectOptionByValue(findTestObject('Page_Course Test Automation/Page_Editing Assignment/select_allow_submit_day'), 
    '20', false)

WebUI.selectOptionByValue(findTestObject('Page_Course Test Automation/Page_Editing Assignment/select_allow_submit_time'), 
    '13', false)

WebUI.selectOptionByValue(findTestObject('Page_Course Test Automation/Page_Editing Assignment/select_due_date_day'), '20', 
    false)

WebUI.selectOptionByValue(findTestObject('Page_Course Test Automation/Page_Editing Assignment/select_due_date_time'), '15', 
    false)

WebUI.click(findTestObject('Page_Course Test Automation/Page_Editing Assignment/submitbutton-assignment'))

WebUI.click(findTestObject('Page_My courses/a_Dashboard'))

WebUI.click(findTestObject('Page_Course Test Automation/input_Edit mode_setmode'))

WebUI.click(findTestObject('Page_Course Test Automation/view_event'))

WebUI.click(findTestObject('Page_Course Test Automation/Page_Group10 Calendar Day view Thursday, 20 January 2022/h3_Midterm is due'))

WebUI.click(findTestObject('Page_Course Test Automation/Page_Group10 Calendar Day view Thursday, 20 January 2022/a_Go to activity'))

WebUI.click(findTestObject('Page_Dashboard/a_NH'))

WebUI.click(findTestObject('Page_Dashboard/a_Log out'))

WebUI.closeBrowser()

