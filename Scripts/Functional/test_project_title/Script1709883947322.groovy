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

WebUI.verifyElementText(findTestObject('Object Repository/Page_Project_Title/Page_OrangeHRM/img'), '')

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Project_Title/Page_OrangeHRM/img'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Project_Title/Page_OrangeHRM/h5_Login'), 'Login')

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Project_Title/Page_OrangeHRM/h5_Login'))


def title = WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Project_Title/Page_OrangeHRM/h5_Login'),
	10)

if (title == true) {
	println('Title is displaying')
} else {
	println('Title is not displaying')
	
	String screenshotPath = 'Screenshots/project_title.png'
	WebUI.takeScreenshot(screenshotPath)
	
	assert false
	
}



WebUI.closeBrowser()

