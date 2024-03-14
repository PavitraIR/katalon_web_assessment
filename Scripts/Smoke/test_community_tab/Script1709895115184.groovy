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

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Smoke_Community_Tab/Page_Quest LMS/svg'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Smoke_Community_Tab/Page_Quest LMS/span_Community'), 'Community')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Smoke_Community_Tab/Page_Quest LMS/span_Community'), 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Smoke_Community_Tab/Page_Quest LMS/span_Community'))

WebUI.click(findTestObject('Object Repository/Page_Smoke_Community_Tab/Page_Quest LMS/span_Community'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Smoke_Community_Tab/Page_Quest LMS/h1_Welcome to your Community'), 
    'Welcome to your Community!')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Smoke_Community_Tab/Page_Quest LMS/h1_Welcome to your Community'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Smoke_Community_Tab/Page_Quest LMS/textarea_Welcome to your Community_mat-input-0'), 
    '')
//if (WebUI.getUrl().contains('/community/welcome')) {
def community = WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Smoke_Community_Tab/Page_Quest LMS/h1_Welcome to your Community'),
	10)

if (community == true) {
	println('Clicked on the tab and redirected to the welcome to your community page.')
} else {
	println('Clicked on the tab but not redirected to the welcome to your community page.')
	String screenshotPath = 'Screenshots/smoke_community.png'
	
	WebUI.takeScreenshot(screenshotPath)
	assert false
}

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Smoke_Community_Tab/Page_Quest LMS/div_Enter text here'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Smoke_Community_Tab/Page_Quest LMS/h1_Filter'), 'Filter')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Smoke_Community_Tab/Page_Quest LMS/h1_Filter'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Smoke_Community_Tab/Page_Quest LMS/h1_All posts'), 'All posts')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Smoke_Community_Tab/Page_Quest LMS/h1_All posts'), 0)

WebUI.closeBrowser()

