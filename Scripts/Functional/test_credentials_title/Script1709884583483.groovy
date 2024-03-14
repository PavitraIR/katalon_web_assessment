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

WebUI.navigateToUrl(GlobalVariable.URL)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Credentials_Title/Page_OrangeHRM/label_Username'), 'Username')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Credentials_Title/Page_OrangeHRM/label_Username'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Credentials_Title/Page_OrangeHRM/label_Password'), 'Password')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Credentials_Title/Page_OrangeHRM/label_Password'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Credentials_Title/Page_OrangeHRM/button_Login'), 'Login')

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Credentials_Title/Page_OrangeHRM/button_Login'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Credentials_Title/Page_OrangeHRM/p_Forgot your password'), 
    'Forgot your password?')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Credentials_Title/Page_OrangeHRM/p_Forgot your password'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Credentials_Title/Page_OrangeHRM/p_Forgot your password'))

def usernametitle = WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Credentials_Title/Page_OrangeHRM/label_Username'), 
    0)
def passwordtitle = WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Credentials_Title/Page_OrangeHRM/label_Password'), 
    0)

if (usernametitle == true) {
	println('Username title is displayed!')
} else {
	println('Username title is not displayed!')
	
	String screenshotPath = 'Screenshots/usernametitle.png'
	WebUI.takeScreenshot(screenshotPath)
	assert false
}

if (passwordtitle == true) {
	println('Password title is displayed!')
} else {
	println('Password title is not displayed!')
	String screenshotPath = 'Screenshots/passwordtitle.png'
	WebUI.takeScreenshot(screenshotPath)
	assert false
}

WebUI.closeBrowser()



