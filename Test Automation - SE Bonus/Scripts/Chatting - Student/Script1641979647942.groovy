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

WebUI.setText(findTestObject('Object Repository/Page_Home page Log in to the site/input_Username_username'), 'student1')

WebUI.setEncryptedText(findTestObject('Page_Home page Log in to the site/input_Password_password (1)'), 'OFhcon1PzObx3ErJAwGfGA==')

WebUI.click(findTestObject('Object Repository/Page_Home page Log in to the site/button_Log in'))

WebUI.click(findTestObject('Page_Dashboard/i_See all_icon fa fa-comment-o fa-fw'))

WebUI.setText(findTestObject('Object Repository/Page_Dashboard/input_Messages selected_form-control'), 'Nguyen Nga')

WebUI.click(findTestObject('Object Repository/Page_Dashboard/i_Messages selected_icon fa fa-search fa-fw'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/span_Nguyen Nga'))

WebUI.setText(findTestObject('Object Repository/Page_Dashboard/textarea_Use enter to send_yui_3_17_2_1_164_f666ba'), 'Em chào cô ạ')

WebUI.click(findTestObject('Object Repository/Page_Dashboard/i__icon fa fa-paper-plane fa-fw'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/a_NH'))

WebUI.click(findTestObject('Page_Dashboard/a_Log out'))

WebUI.click(findTestObject('Object Repository/Page_Home page/a_Log in'))

WebUI.setText(findTestObject('Object Repository/Page_Home page Log in to the site/input_Username_username'), 'coursecreator1')

WebUI.setEncryptedText(findTestObject('Page_Home page Log in to the site/input_Password_password (1)'), 'OFhcon1PzObx3ErJAwGfGA==')

WebUI.click(findTestObject('Object Repository/Page_Home page Log in to the site/button_Log in'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/i_See all_icon fa fa-comment-o fa-fw'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/strong_Nguyen Hoa'))

WebUI.setText(findTestObject('Object Repository/Page_Dashboard/textarea_Use enter to send_yui_3_17_2_1_164_f0879e'), 'Cô chào em')

WebUI.click(findTestObject('Object Repository/Page_Dashboard/i__icon fa fa-paper-plane fa-fw_1'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/a_NN'))

WebUI.click(findTestObject('Page_Dashboard/a_Log out'))

WebUI.closeBrowser()

