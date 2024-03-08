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

WebUI.navigateToUrl(GlobalVariable.URL1)

WebUI.setText(findTestObject('Object Repository/Page_Smoke_Valid_Username_Password/Page_Quest LMS/input_Dual Login_p-inputtext p-component p-_bf18e8'), 
    GlobalVariable.Username1)

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Smoke_Valid_Username_Password/Page_Quest LMS/input_Email ID  Mobile Number_p-inputtext p_20a8de'), 
    GlobalVariable.Password1)

WebUI.click(findTestObject('Object Repository/Page_Smoke_Valid_Username_Password/Page_Quest LMS/span_Login'))

WebUI.takeScreenshot('/home/pavitra/Katalon Studio/katalon_web_assessment/Screenshots/Smoke_Credentials.png')

WebUI.closeBrowser()
