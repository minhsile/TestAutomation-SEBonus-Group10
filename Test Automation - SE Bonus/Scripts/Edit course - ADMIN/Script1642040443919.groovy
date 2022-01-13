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

WebUI.click(findTestObject('Object Repository/Page_Home page/a_Log in'))

WebUI.setText(findTestObject('Object Repository/Page_Home page Log in to the site/input_Username_username'), 'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Home page Log in to the site/input_Password_password'), 'OFhcon1PzObx3ErJAwGfGA==')

WebUI.click(findTestObject('Object Repository/Page_Home page Log in to the site/button_Log in'))

WebUI.click(findTestObject('Object Repository/Page_My courses/a_Site administration'))

WebUI.click(findTestObject('Object Repository/Page_Group10 Administration Search/a_Courses'))

WebUI.click(findTestObject('Object Repository/Page_Group10 Administration Search/a_Manage courses and categories'))

WebUI.click(findTestObject('Object Repository/Page_Course and category management/i_H quan tri c s d liu_yui_3_17_2_1_1642039_4632b5'))

WebUI.setText(findTestObject('Object Repository/Page_Edit course settings/input_Course full name_fullname'), 'Hệ quản trị cơ sở dữ liệu (edited)')

WebUI.click(findTestObject('Object Repository/Page_Edit course settings/input_Enable_enddateenabled'))

WebUI.setText(findTestObject('Object Repository/Page_Edit course settings/div_this is summary'), 'this is summary')

WebUI.click(findTestObject('Object Repository/Page_Edit course settings/input__saveanddisplay'))

WebUI.click(findTestObject('Object Repository/Page_Edit course settings/a_Site administration'))

WebUI.click(findTestObject('Object Repository/Page_Group10 Administration Search/a_Courses'))

WebUI.click(findTestObject('Object Repository/Page_Group10 Administration Search/a_Manage courses and categories'))

WebUI.click(findTestObject('Object Repository/Page_Course and category management/i_H quan tri c s d liu (edited)_yui_3_17_2__de8f09'))

WebUI.setText(findTestObject('Object Repository/Page_Edit course settings/input_Course full name_fullname'), 'Hệ quản trị cơ sở dữ liệu')

WebUI.click(findTestObject('Object Repository/Page_Edit course settings/input_Enable_enddateenabled'))

WebUI.click(findTestObject('Object Repository/Page_Edit course settings/input__saveandreturn'))

WebUI.click(findTestObject('Object Repository/Page_Course and category management/a_AU'))

WebUI.click(findTestObject('Object Repository/Page_Course and category management/a_Log out'))

WebUI.closeBrowser()

