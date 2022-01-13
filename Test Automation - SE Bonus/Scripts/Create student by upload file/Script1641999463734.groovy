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

WebUI.setEncryptedText(findTestObject('Page_Home page Log in to the site/input_Password_password (1)'), 'OFhcon1PzObx3ErJAwGfGA==')

WebUI.click(findTestObject('Object Repository/Page_Home page Log in to the site/button_Log in'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/a_Site administration'))

WebUI.click(findTestObject('Object Repository/Page_Group10 Administration Search/a_Users'))

WebUI.click(findTestObject('Object Repository/Page_Group10 Administration Search/a_Upload users'))

WebUI.click(findTestObject('Object Repository/Page_Group10 Administration Users Accounts _c9beb9/input_File_userfilechoose'))

WebUI.uploadFile(findTestObject('Object Repository/Page_Group10 Administration Users Accounts _c9beb9/input_Attachment_repo_upload_file'), 
    'D:\\TestAutomation-SEBonus-Group10\\student.csv')

WebUI.click(findTestObject('Object Repository/Page_Group10 Administration Users Accounts _c9beb9/button_Upload this file'))

WebUI.click(findTestObject('Object Repository/Page_Group10 Administration Users Accounts _c9beb9/input_Preview rows_submitbutton'))

WebUI.click(findTestObject('Page_Group10 Administration Users Accounts Upload users/input_Department_submitbutton'))

WebUI.click(findTestObject('Object Repository/Page_Group10 Administration Users Accounts _c9beb9/a_Site administration'))

WebUI.click(findTestObject('Object Repository/Page_Group10 Administration Search/a_Users'))

WebUI.click(findTestObject('Object Repository/Page_Group10 Administration Search/a_Assign system roles'))

WebUI.click(findTestObject('Object Repository/Page_Group10 Administration Users Permissio_fb4295/a_Student_1'))

WebUI.click(findTestObject('Page_Group10 Administration Users Permissions Assign system roles/option_Le Minh Si (19127064student.hcmus.edu.vn)'))

WebUI.click(findTestObject('Page_Group10 Administration Users Permissions Assign system roles/option_Nguyen Kim Thi To Nga (19127219student.hcmus.edu.vn)'))

WebUI.click(findTestObject('Page_Group10 Administration Users Permissions Assign system roles/option_Nguyen Phuong Vy (19127088student.hcmus.edu.vn)'))

WebUI.click(findTestObject('Page_Group10 Administration Users Permissions Assign system roles/option_Tran Ngoc Lam (19127040student.hcmus.edu.vn)'))

WebUI.click(findTestObject('Object Repository/Page_Group10 Administration Users Permissio_fb4295/input_Match the search text anywhere in the_89f7b5_1'))

WebUI.closeBrowser()

