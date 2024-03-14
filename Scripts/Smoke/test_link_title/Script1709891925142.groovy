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

WebUI.navigateToUrl(GlobalVariable.URL1)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Link_Title/Page_Quest LMS/div_Forgot Password'), 'Forgot Password?')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Link_Title/Page_Quest LMS/div_Forgot Password'), 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Link_Title/Page_Quest LMS/div_Forgot Password'))

def forgotPassword = WebUI.verifyElementText(findTestObject('Object Repository/Page_Link_Title/Page_Quest LMS/div_Forgot Password'), 'Forgot Password?') 
if (forgotPassword == true) {
	println('Element text Forgot Password is present')
} else {
	println('Element text Forgot Password is present')
	
	String screenshotPath = 'Screenshots/forgotpassword.png'
	
	WebUI.takeScreenshot(screenshotPath)
	assert false
}

WebUI.click(findTestObject('Object Repository/Page_Link_Title/Page_Quest LMS/span_New User'))

WebUI.click(findTestObject('Object Repository/Page_Link_Title/Page_Quest LMS/span_New User'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Link_Title/Page_Quest LMS/span_New User'), 'New User?')

WebUI.click(findTestObject('Object Repository/Page_Link_Title/Page_Quest LMS/span_New User'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Link_Title/Page_Quest LMS/span_New User'), 0)

def newUser = WebUI.verifyElementText(findTestObject('Object Repository/Page_Link_Title/Page_Quest LMS/span_New User'), 'New User?')
if (newUser == true) {
	println('Element New User is present')
} else {
	println('Element New User is not present')
	
	String screenshotPath = 'Screenshots/newUser.png'
	
	WebUI.takeScreenshot(screenshotPath)
	assert false
}


WebUI.verifyElementText(findTestObject('Object Repository/Page_Link_Title/Page_Quest LMS/span_Register'), 'Register')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Link_Title/Page_Quest LMS/span_Register'), 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Link_Title/Page_Quest LMS/span_Register'))

def register = WebUI.verifyElementText(findTestObject('Object Repository/Page_Link_Title/Page_Quest LMS/span_Register'), 'Register')
if (register == true) {
	println('Element register is present')
} else {
	println('Element register is not present')
	
	String screenshotPath = 'Screenshots/register.png'
	
	WebUI.takeScreenshot(screenshotPath)
	assert false

}

WebUI.verifyElementText(findTestObject('Object Repository/Page_Link_Title/Page_Quest LMS/div_Help'), 'Help?')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Link_Title/Page_Quest LMS/div_Help'), 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Link_Title/Page_Quest LMS/div_Help'))

def help = WebUI.verifyElementText(findTestObject('Object Repository/Page_Link_Title/Page_Quest LMS/div_Help'), 'Help?')
if (help == true) {
	println('Element help is present')
} else {
	println('Element help not present')
	String screenshotPath = 'Screenshots/help.png'
	
	WebUI.takeScreenshot(screenshotPath)
	assert false

}

WebUI.closeBrowser()

