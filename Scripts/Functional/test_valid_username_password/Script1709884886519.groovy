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
    GlobalVariable.Username)

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Valid_Username_Password/Page_OrangeHRM/input_Password_password'), 
    GlobalVariable.Password)

WebUI.click(findTestObject('Object Repository/Page_Valid_Username_Password/Page_OrangeHRM/button_Login'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Dashboard/Page_OrangeHRM/h6_Dashboard'), 'Dashboard')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Dashboard/Page_OrangeHRM/h6_Dashboard'), 0)

//if (WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Dashboard/Page_OrangeHRM/h6_Dashboard'), 10)) {
//    println('Login passed successfully with dashboard page')
//} else {
//    println('Login failed with invalid credentials')
//        
//}

def loginSuccessful = WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Dashboard/Page_OrangeHRM/h6_Dashboard'), 
    10)

if (loginSuccessful == true) {
    println('Login successful with dashboard page')
} else {
    println('Login failed with invalid credentials')
	
	String screenshotPath = 'Screenshots/validusername_validpassword.png'
	WebUI.takeScreenshot(screenshotPath)
	
    assert false
}



WebUI.closeBrowser()

