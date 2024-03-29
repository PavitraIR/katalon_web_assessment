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

WebUI.callTestCase(findTestCase('Loginpage'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Smoke_Logout/Page_Quest LMS/span_Profile'), 'Profile')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Smoke_Logout/Page_Quest LMS/span_Profile'), 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Smoke_Logout/Page_Quest LMS/span_Profile'))

WebUI.click(findTestObject('Object Repository/Page_Smoke_Logout/Page_Quest LMS/span_Profile'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Smoke_Logout/Page_Quest LMS/span_Logout'), 'Logout')

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Smoke_Logout/Page_Quest LMS/span_Logout'))

WebUI.click(findTestObject('Object Repository/Page_Smoke_Logout/Page_Quest LMS/span_Logout'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Smoke_Project_Title/Page_Quest LMS/h1_Welcome to Quest App'), 
    'Welcome to Quest App')

def logoutSuccessful = WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Smoke_Project_Title/Page_Quest LMS/h1_Welcome to Quest App'), 
    10)

if (logoutSuccessful == true) {
	println('Logout successful and redirected to login page.')
	
} else {
	println('Logout successful but not redirected to login page.')
	
	String screenshotPath = 'Screenshots/smoke_logout.png'
	
	WebUI.takeScreenshot(screenshotPath)
	
	assert false
}



WebUI.closeBrowser()

