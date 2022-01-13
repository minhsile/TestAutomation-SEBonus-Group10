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

WebUI.setText(findTestObject('Page_Home page Log in to the site/input_Username_username'), 'admin')

WebUI.setEncryptedText(findTestObject('Page_Home page Log in to the site/input_Password_password'), 'OFhcon1PzObx3ErJAwGfGA==')

WebUI.click(findTestObject('Page_Home page Log in to the site/button_Log in'))

WebUI.click(findTestObject('Page_Dashboard/a_Site administration'))

WebUI.click(findTestObject('Page_Group10 Administration Search/a_Courses'))

WebUI.click(findTestObject('Page_Group10 Administration Search/a_Add a new course'))

WebUI.click(findTestObject('Object Repository/Page_Group10 Add a new course/input_Course full name_fullname'))

WebUI.setText(findTestObject('Object Repository/Page_Group10 Add a new course/input_Course full name_fullname'), 'Course test for delete')

WebUI.setText(findTestObject('Object Repository/Page_Group10 Add a new course/input_Course short name_shortname'), 'testdelete')

WebUI.click(findTestObject('Object Repository/Page_Group10 Add a new course/label_Enable'))

WebUI.click(findTestObject('Object Repository/Page_Group10 Add a new course/input__saveanddisplay'))

WebUI.click(findTestObject('Object Repository/Page_Course Course test for delete/a_Site administration'))

WebUI.click(findTestObject('Page_Group10 Administration Search/a_Courses'))

WebUI.click(findTestObject('Page_Group10 Administration Search/a_Manage courses and categories'))

WebUI.click(findTestObject('Page_Course and category management/a_Sort courses'))

WebUI.click(findTestObject('Page_Course and category management/span_Sort by Course time created descending'))

WebUI.click(findTestObject('Object Repository/Page_Course and category management/i_Course test for delete_yui_3_17_2_1_16420_0ef4d4'))

WebUI.click(findTestObject('Object Repository/Page_Group10 Delete testdelete/button_Delete'))

WebUI.click(findTestObject('Object Repository/Page_Group10 Deleting testdelete/button_Continue'))

WebUI.click(findTestObject('Object Repository/Page_Course and category management/span_AU'))

WebUI.click(findTestObject('Page_Course and category management/a_Log out'))

WebUI.closeBrowser()

