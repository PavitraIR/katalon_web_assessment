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

WebUI.setText(findTestObject('Object Repository/Page_Invalid_Username_Password/Page_OrangeHRM/input_Username_username'), 
    'test')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Invalid_Username_Password/Page_OrangeHRM/input_Password_password'), 
    '/5S6MFFLcE4mlsixtc6/Tg==')

WebUI.click(findTestObject('Object Repository/Page_Invalid_Username_Password/Page_OrangeHRM/button_Login'))


WebUI.verifyElementText(findTestObject('Object Repository/Page_Error/Page_OrangeHRM/p_Invalid credentials'), 'Invalid credentials')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Error/Page_OrangeHRM/p_Invalid credentials'), 0)



def loginSuccessful = WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Error/Page_OrangeHRM/p_Invalid credentials'),
	10)

if (loginSuccessful == true) {
	println('Login successful with dashboard page')
} else {
	println('Login failed with invalid credentials')
	
	String screenshotPath = 'Screenshots/invalidsername_invalidpassword.png'
	WebUI.takeScreenshot(screenshotPath)
	
	assert false
}




WebUI.closeBrowser()

