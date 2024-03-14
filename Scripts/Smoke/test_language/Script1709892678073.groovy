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

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Smoke_Lanuage/Page_Quest LMS/div_EnglishLanguage'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Smoke_Lanuage/Page_Quest LMS/div_English_mat-select-arrow-wrapper ng-tns-c89-1'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Smoke_Lanuage/Page_Quest LMS/div_English_mat-select-arrow-wrapper ng-tns-c89-1'))

WebUI.click(findTestObject('Object Repository/Page_Smoke_Lanuage/Page_Quest LMS/div_English_mat-select-arrow ng-tns-c89-1'))

WebUI.delay(2)


options = findTestObject('Object Repository/Page_Smoke_Lanuage/Page_Quest LMS/div_English_mat-select-arrow ng-tns-c89-1')
String screenshotPath = 'Screenshots/smoke_home.png'

WebUI.takeScreenshot(screenshotPath)
if (options == true) {
    println('Options are present in the language dropdown' )
        
        
} else {
    println('No options found in the language dropdown')
	String screenshotPath = 'Screenshots/smoke_language.png'
	
	WebUI.takeScreenshot(screenshotPath)
	assert false
}


WebUI.closeBrowser()

