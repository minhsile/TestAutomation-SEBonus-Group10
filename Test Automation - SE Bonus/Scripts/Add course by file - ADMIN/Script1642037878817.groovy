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

WebUI.click(findTestObject('Object Repository/Page_Group10 Administration Search/a_Courses'))

WebUI.click(findTestObject('Object Repository/Page_Group10 Administration Search/a_Upload courses'))

WebUI.click(findTestObject('Object Repository/Page_Group10 Administration Courses Upload courses/input_File_coursefilechoose'))

WebUI.uploadFile(findTestObject('Object Repository/Page_Group10 Administration Courses Upload courses/input_Attachment_repo_upload_file'), 
    'D:\\KHTN\\1st Sem - Year 3\\NMCNPM\\BonusAssignment\\Katalon\\TestAutomation-SEBonus-Group10\\course.csv')

WebUI.click(findTestObject('Object Repository/Page_Group10 Administration Courses Upload courses/button_Upload this file'))

WebUI.click(findTestObject('Object Repository/Page_Group10 Administration Courses Upload courses/input_Allow resets_submitbutton'))

WebUI.click(findTestObject('Object Repository/Page_Group10 Administration Courses Upload courses/input_Enable_defaultsenddateenabled'))

WebUI.click(findTestObject('Object Repository/Page_Group10 Administration Courses Upload courses/input_Allow resets_submitbutton'))

WebUI.click(findTestObject('Object Repository/Page_Group10 Administration Courses Upload courses/button_Continue'))

WebUI.click(findTestObject('Object Repository/Page_Group10 Administration Courses Upload courses/a_Courses'))

WebUI.click(findTestObject('Object Repository/Page_Group10 Administration Search/a_Manage courses and categories'))

WebUI.click(findTestObject('Object Repository/Page_Course and category management/a_Sort courses'))

WebUI.click(findTestObject('Object Repository/Page_Course and category management/span_Sort by Course time created descending'))

WebUI.click(findTestObject('Object Repository/Page_Course and category management/i_Course restored 4_yui_3_17_2_1_1642036973057_625'))

WebUI.click(findTestObject('Object Repository/Page_Group10 Delete courserestored4/button_Delete'))

WebUI.click(findTestObject('Object Repository/Page_Group10 Deleting courserestored4/button_Continue'))

WebUI.click(findTestObject('Object Repository/Page_Course and category management/i_Course restored 3_yui_3_17_2_1_1642037030374_504'))

WebUI.click(findTestObject('Object Repository/Page_Group10 Delete courserestored3/button_Delete'))

WebUI.click(findTestObject('Object Repository/Page_Group10 Deleting courserestored3/button_Continue'))

WebUI.click(findTestObject('Object Repository/Page_Course and category management/i_Course restored 2_yui_3_17_2_1_1642037037091_442'))

WebUI.click(findTestObject('Object Repository/Page_Group10 Delete courserestored2/button_Delete'))

WebUI.click(findTestObject('Object Repository/Page_Group10 Deleting courserestored2/button_Continue'))

WebUI.click(findTestObject('Object Repository/Page_Course and category management/i_Course restored_yui_3_17_2_1_1642037043486_382'))

WebUI.click(findTestObject('Object Repository/Page_Group10 Delete courserestored/button_Delete'))

WebUI.click(findTestObject('Object Repository/Page_Group10 Deleting courserestored/button_Continue'))

WebUI.click(findTestObject('Object Repository/Page_Course and category management/a_AU'))

WebUI.click(findTestObject('Object Repository/Page_Course and category management/a_Log out'))

WebUI.closeBrowser()

