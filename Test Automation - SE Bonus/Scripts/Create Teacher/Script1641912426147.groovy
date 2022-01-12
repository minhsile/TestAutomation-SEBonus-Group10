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

WebUI.click(findTestObject('Object Repository/Page_Dashboard/a_Site administration'))

WebUI.click(findTestObject('Object Repository/Page_Group10 Administration Search/a_Users'))

WebUI.click(findTestObject('Object Repository/Page_Group10 Administration Search/a_Add a new user'))

WebUI.setText(findTestObject('Object Repository/Page_Group10 Administration Users Accounts _5007a8/input_Username_username'), 
    'teacher1')

WebUI.click(findTestObject('Object Repository/Page_Group10 Administration Users Accounts _5007a8/em_Click to enter text'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Group10 Administration Users Accounts _5007a8/input_New password_newpassword'), 
    'OFhcon1PzObx3ErJAwGfGA==')

WebUI.click(findTestObject('Object Repository/Page_Group10 Administration Users Accounts _5007a8/i_Click to enter text_icon fa fa-eye fa-fw'))

WebUI.setText(findTestObject('Object Repository/Page_Group10 Administration Users Accounts _5007a8/input_First name_firstname'), 
    'Nguyen')

WebUI.setText(findTestObject('Object Repository/Page_Group10 Administration Users Accounts _5007a8/input_Surname_lastname'), 
    'Nga')

WebUI.setText(findTestObject('Object Repository/Page_Group10 Administration Users Accounts _5007a8/input_Email address_email'), 
    'teacher1@email.com')

WebUI.click(findTestObject('Object Repository/Page_Group10 Administration Users Accounts _5007a8/input_Address_submitbutton'))

WebUI.click(findTestObject('Object Repository/Page_Group10 Administration Users Permissio_4e74a7/a_Site administration'))

WebUI.click(findTestObject('Object Repository/Page_Group10 Administration Search/a_Users'))

WebUI.click(findTestObject('Object Repository/Page_Group10 Administration Search/a_Assign system roles'))

WebUI.click(findTestObject('Object Repository/Page_Group10 Administration Users Permissio_fb4295/a_Teacher'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Group10 Administration Users Permissio_fb4295/select_Nguyen Hoa (student1email.com)    Tr_06c355'), 
    '7', true)

WebUI.click(findTestObject('Object Repository/Page_Group10 Administration Users Permissio_fb4295/input_Match the search text anywhere in the_89f7b5'))

WebUI.click(findTestObject('Object Repository/Page_Group10 Administration Users Accounts _9567d5/span_AU'))

WebUI.click(findTestObject('Object Repository/Page_Group10 Administration Users Accounts _9567d5/a_Log out'))

WebUI.click(findTestObject('Object Repository/Page_Home page/span_Log in'))

WebUI.setText(findTestObject('Object Repository/Page_Home page Log in to the site/input_Username_username'), 'teacher1')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Home page Log in to the site/input_Password_password'), 'OFhcon1PzObx3ErJAwGfGA==')

WebUI.click(findTestObject('Object Repository/Page_Home page Log in to the site/button_Log in'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/a_NV'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/a_Log out'))

WebUI.closeBrowser()

