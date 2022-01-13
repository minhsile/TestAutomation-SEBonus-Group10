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

WebUI.click(findTestObject('forum/Page_Dashboard/a_Home'))

WebUI.click(findTestObject('Object Repository/forum/Page_Home page/input_Edit mode_setmode'))

WebUI.click(findTestObject('Object Repository/forum/Page_Home page/span_Add an activity or resource'))

WebUI.click(findTestObject('Object Repository/forum/Page_Home page/div_Forum'))

WebUI.setText(findTestObject('Object Repository/forum/Page_Editing Forum/input_Forum name_name'), 'Forum test')

WebUI.click(findTestObject('Object Repository/forum/Page_Editing Forum/input_Send content change notification_subm_37cbed'))

WebUI.click(findTestObject('Object Repository/forum/Page_Forum test/a_Home'))

WebUI.click(findTestObject('Object Repository/forum/Page_Home page/a_Forum test'))

WebUI.click(findTestObject('Object Repository/forum/Page_Forum test/a_Add discussion topic'))

WebUI.setText(findTestObject('Object Repository/forum/Page_Forum test/input_Subject_subject'), 'hello')

WebUI.click(findTestObject('Object Repository/forum/Page_Forum test/p'))

WebUI.setText(findTestObject('forum/Page_Forum test/div_Rich text editor_id_messageeditable'), 'hello')

WebUI.click(findTestObject('Object Repository/forum/Page_Forum test/input_Rich text editor_submitbutton'))

WebUI.click(findTestObject('Object Repository/forum/Page_Forum test/a_Home_1'))

WebUI.click(findTestObject('Object Repository/forum/Page_Home page/a_Forum test_1'))

WebUI.click(findTestObject('Object Repository/forum/Page_Forum test/a_Site announcements'))

WebUI.click(findTestObject('Object Repository/forum/Page_Site announcements/a_Home'))

WebUI.click(findTestObject('Object Repository/forum/Page_Home page/i_Forum test_icon fa fa-ellipsis-v fa-fw'))

WebUI.click(findTestObject('Object Repository/forum/Page_Home page/span_Delete'))

WebUI.click(findTestObject('Object Repository/forum/Page_Home page/button_Yes'))

WebUI.click(findTestObject('Object Repository/forum/Page_Home page/a_AU'))

WebUI.click(findTestObject('Object Repository/forum/Page_Home page/a_Log out'))

WebUI.closeBrowser()

