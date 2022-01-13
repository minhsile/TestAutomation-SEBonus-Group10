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

WebUI.click(findTestObject('Object Repository/changepass/Page_Home page/a_Log in'))

WebUI.setText(findTestObject('Object Repository/changepass/Page_Home page Log in to the site/input_Username_username'), 
    'student1')

WebUI.setEncryptedText(findTestObject('Object Repository/changepass/Page_Home page Log in to the site/input_Password_password'), 
    '9ExR24d8uBTe5Y0Xu9Ji6w==')

WebUI.click(findTestObject('Object Repository/changepass/Page_Home page Log in to the site/button_Log in'))

WebUI.click(findTestObject('Object Repository/changepass/Page_Dashboard/a_NH'))

WebUI.click(findTestObject('Object Repository/changepass/Page_Dashboard/a_Profile'))

WebUI.click(findTestObject('Object Repository/changepass/Page_Nguyen Hoa Public profile/a_Edit profile'))

WebUI.click(findTestObject('Object Repository/changepass/Page_Group10 Edit profile/a_Preferences'))

WebUI.click(findTestObject('Object Repository/changepass/Page_Preferences/a_Change password'))

WebUI.setEncryptedText(findTestObject('Object Repository/changepass/Page_Change password/input_Current password_password'), 
    '9ExR24d8uBTe5Y0Xu9Ji6w==')

WebUI.setEncryptedText(findTestObject('Object Repository/changepass/Page_Change password/input_New password_newpassword1'), 
    'OFhcon1PzObx3ErJAwGfGA==')

WebUI.setEncryptedText(findTestObject('Object Repository/changepass/Page_Change password/input_New password (again)_newpassword2'), 
    'OFhcon1PzObx3ErJAwGfGA==')

WebUI.click(findTestObject('Object Repository/changepass/Page_Change password/input_New password (again)_submitbutton'))

WebUI.click(findTestObject('Object Repository/changepass/Page_Preferences/a_NH'))

WebUI.click(findTestObject('Object Repository/changepass/Page_Preferences/a_Log out'))

WebUI.click(findTestObject('Object Repository/changepass/Page_Home page/a_Log in'))

WebUI.setText(findTestObject('Object Repository/changepass/Page_Home page Log in to the site/input_Username_username'), 
    'student1')

WebUI.setEncryptedText(findTestObject('Object Repository/changepass/Page_Home page Log in to the site/input_Password_password'), 
    'OFhcon1PzObx3ErJAwGfGA==')

WebUI.click(findTestObject('Object Repository/changepass/Page_Home page Log in to the site/button_Log in'))

WebUI.closeBrowser()

