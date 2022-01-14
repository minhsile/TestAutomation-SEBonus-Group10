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

WebUI.click(findTestObject('Object Repository/Page_TA Participants/a_My courses'))

WebUI.click(findTestObject('Object Repository/Page_My courses/span_H quan tri c s d liu'))

WebUI.click(findTestObject('Object Repository/Page_Course H quan tri c s d liu/a_Participants'))

WebUI.click(findTestObject('Page_HQTCSDL Participants/input_Participants tertiary navigation_btn btn-primary'))

WebUI.click(findTestObject('Page_HQTCSDL Participants/span_'))

WebUI.click(findTestObject('Page_HQTCSDL Participants/li_Nguyen Nga    teacher1email.com'))

/*WebUI.selectOptionByValue(findTestObject('Object Repository/Page_HQTCSDL Participants/select_guest1 group10    guest1group10email_b41192'), 
    '7', true)

//WebUI.selectOptionByValue(findTestObject('Object Repository/Page_HQTCSDL Participants/select_guest1 group10    guest1group10email_b41192'), 
    '7', true)

//WebUI.selectOptionByValue(findTestObject('Object Repository/Page_HQTCSDL Participants/select_guest1 group10    guest1group10email_b41192'), 
    '7', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_HQTCSDL Participants/select_guest1 group10    guest1group10email_b41192'), 
    '7', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_HQTCSDL Participants/select_guest1 group10    guest1group10email_b41192'), 
    '7', true)*/
WebUI.click(findTestObject('Object Repository/Page_HQTCSDL Participants/div_Assign role'))

WebUI.click(findTestObject('Page_HQTCSDL Participants/select_Manager            Teacher          _ffc00f'))

WebUI.click(findTestObject('Object Repository/Page_HQTCSDL Participants/button_Enrol users'))

WebUI.click(findTestObject('Object Repository/Page_TA Participants/a_My courses'))

WebUI.click(findTestObject('Page_My courses/span_Test Automation'))

WebUI.click(findTestObject('Object Repository/Page_Course H quan tri c s d liu/a_Participants'))

WebUI.click(findTestObject('Page_HQTCSDL Participants/input_Participants tertiary navigation_btn btn-primary'))

WebUI.click(findTestObject('Page_HQTCSDL Participants/span_'))

WebUI.click(findTestObject('Page_HQTCSDL Participants/li_Nguyen Nga    teacher1email.com'))

/*WebUI.selectOptionByValue(findTestObject('Object Repository/Page_HQTCSDL Participants/select_guest1 group10    guest1group10email_b41192'), 
    '7', true)

//WebUI.selectOptionByValue(findTestObject('Object Repository/Page_HQTCSDL Participants/select_guest1 group10    guest1group10email_b41192'), 
    '7', true)

//WebUI.selectOptionByValue(findTestObject('Object Repository/Page_HQTCSDL Participants/select_guest1 group10    guest1group10email_b41192'), 
    '7', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_HQTCSDL Participants/select_guest1 group10    guest1group10email_b41192'), 
    '7', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_HQTCSDL Participants/select_guest1 group10    guest1group10email_b41192'), 
    '7', true)*/
WebUI.click(findTestObject('Object Repository/Page_HQTCSDL Participants/div_Assign role'))

WebUI.click(findTestObject('Page_HQTCSDL Participants/select_Manager            Teacher            Non-editing teacher            Student'))

WebUI.click(findTestObject('Object Repository/Page_HQTCSDL Participants/button_Enrol users'))

WebUI.click(findTestObject('Object Repository/Page_HQTCSDL Participants/a_AU'))

WebUI.click(findTestObject('Object Repository/Page_HQTCSDL Participants/a_Log out'))

WebUI.click(findTestObject('Page_Home page/a_Log in'))

WebUI.setText(findTestObject('Page_Home page Log in to the site/input_Username_username'), 'teacher1')

WebUI.setEncryptedText(findTestObject('Page_Home page Log in to the site/input_Password_password'), 'OFhcon1PzObx3ErJAwGfGA==')

WebUI.click(findTestObject('Page_Home page Log in to the site/button_Log in'))

WebUI.click(findTestObject('Page_TA Participants/a_My courses'))

WebUI.click(findTestObject('Object Repository/Page_My courses/span_H quan tri c s d liu'))

WebUI.click(findTestObject('Object Repository/Page_Course H quan tri c s d liu/a_Participants'))

WebUI.click(findTestObject('Object Repository/Page_HQTCSDL Participants/a_NN'))

WebUI.click(findTestObject('Object Repository/Page_HQTCSDL Participants/a_Log out'))

WebUI.click(findTestObject('Page_Home page/a_Log in'))

WebUI.setText(findTestObject('Page_Home page Log in to the site/input_Username_username'), 'admin')

WebUI.setEncryptedText(findTestObject('Page_Home page Log in to the site/input_Password_password'), 'OFhcon1PzObx3ErJAwGfGA==')

WebUI.click(findTestObject('Page_Home page Log in to the site/button_Log in'))

WebUI.click(findTestObject('Page_TA Participants/a_My courses'))

WebUI.click(findTestObject('Object Repository/Page_My courses/span_H quan tri c s d liu'))

WebUI.click(findTestObject('Object Repository/Page_Course H quan tri c s d liu/a_Participants'))

WebUI.click(findTestObject('Object Repository/Page_HQTCSDL Participants/i_Active_icon fa fa-trash fa-fw'))

WebUI.click(findTestObject('Object Repository/Page_HQTCSDL Participants/button_Unenrol'))

WebUI.click(findTestObject('Object Repository/Page_HQTCSDL Participants/a_AU'))

WebUI.click(findTestObject('Object Repository/Page_HQTCSDL Participants/a_Log out'))

WebUI.closeBrowser()

