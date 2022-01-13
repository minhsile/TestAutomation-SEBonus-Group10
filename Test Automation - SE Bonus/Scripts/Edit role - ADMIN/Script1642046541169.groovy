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

WebUI.click(findTestObject('Page_Group10 Administration Search/a_Users'))

WebUI.click(findTestObject('Page_Group10 Administration Search/a_Define roles'))

WebUI.click(findTestObject('Object Repository/Page_Group10 Administration Users Permissio_4e74a7/i_guest_icon fa fa-cog fa-fw'))

WebUI.click(findTestObject('Object Repository/Page_Group10 Administration Users Permissio_4e74a7/input_Short name_shortname'))

WebUI.setText(findTestObject('Object Repository/Page_Group10 Administration Users Permissio_4e74a7/input_Custom full name_name'), 
    'Guest of Site')

WebUI.setText(findTestObject('Object Repository/Page_Group10 Administration Users Permissio_4e74a7/textarea_Custom description_description'), 
    'this is the guest')

WebUI.click(findTestObject('Object Repository/Page_Group10 Administration Users Permissio_4e74a7/input_Context types where this role may be _9568cf'))

WebUI.click(findTestObject('Object Repository/Page_Group10 Administration Users Permissio_4e74a7/input_concat(Editing role , , Guest, , )_sa_01291b'))

WebUI.click(findTestObject('Page_Dashboard/a_Site administration'))

WebUI.click(findTestObject('Page_Group10 Administration Search/a_Users'))

WebUI.click(findTestObject('Page_Group10 Administration Search/a_Define roles'))

WebUI.click(findTestObject('Object Repository/Page_Group10 Administration Users Permissio_4e74a7/i_guest_icon fa fa-cog fa-fw'))

WebUI.click(findTestObject('Object Repository/Page_Group10 Administration Users Permissio_4e74a7/div_Custom full name'))

WebUI.setText(findTestObject('Object Repository/Page_Group10 Administration Users Permissio_4e74a7/input_Custom full name_name'), 
    '')

WebUI.setText(findTestObject('Object Repository/Page_Group10 Administration Users Permissio_4e74a7/textarea_this is the guest'), 
    '')

WebUI.click(findTestObject('Object Repository/Page_Group10 Administration Users Permissio_4e74a7/input_concat(Editing role , , Guest, , )_sa_01291b'))

WebUI.click(findTestObject('Object Repository/Page_Group10 Administration Users Permissio_4e74a7/a_AU'))

WebUI.click(findTestObject('Object Repository/Page_Group10 Administration Users Permissio_4e74a7/a_Log out'))

WebUI.closeBrowser()

