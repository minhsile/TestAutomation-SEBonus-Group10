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

WebUI.maximizeWindow()

WebUI.navigateToUrl('http://localhost/')

WebUI.click(findTestObject('Page_Home page/a_Log in'))

WebUI.setText(findTestObject('Page_Home page Log in to the site/input_Username_username'), 'admin')

WebUI.setEncryptedText(findTestObject('Page_Home page Log in to the site/input_Password_password'), 'OFhcon1PzObx3ErJAwGfGA==')

WebUI.click(findTestObject('Page_Home page Log in to the site/button_Log in'))

WebUI.click(findTestObject('Object Repository/forum/Page_Dashboard/input_Edit mode_setmode'))

WebUI.click(findTestObject('Object Repository/forum/Page_Dashboard/a_Add a block'))

WebUI.click(findTestObject('Object Repository/forum/Page_Dashboard/a_Online users'))

WebUI.click(findTestObject('Object Repository/forum/Page_Dashboard/i_Online users_yui_3_17_2_1_1642063098227_327'))

WebUI.click(findTestObject('Object Repository/forum/Page_Dashboard/a_To item Timeline'))

WebUI.click(findTestObject('Object Repository/forum/Page_Dashboard/a_Online users_action-menu-toggle-6'))

WebUI.click(findTestObject('Object Repository/forum/Page_Dashboard/span_Delete Online users block'))

WebUI.click(findTestObject('Object Repository/forum/Page_Dashboard/button_Delete'))

WebUI.click(findTestObject('Object Repository/forum/Page_Dashboard/a_AU'))

WebUI.click(findTestObject('Object Repository/forum/Page_Dashboard/a_Log out'))

WebUI.closeBrowser()

