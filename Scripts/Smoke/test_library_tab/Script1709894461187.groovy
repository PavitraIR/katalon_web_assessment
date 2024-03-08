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

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Library_Tab/Page_Quest LMS/svg'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Library_Tab/Page_Quest LMS/span_Library'), 'Library')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Library_Tab/Page_Quest LMS/span_Library'), 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Library_Tab/Page_Quest LMS/span_Library'))

WebUI.click(findTestObject('Object Repository/Page_Library_Tab/Page_Quest LMS/button_Library'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Library_Tab/Page_Quest LMS/h1_Welcome to your library'), 
    'Welcome to your library!')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Library_Tab/Page_Quest LMS/h1_Welcome to your library'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Library_Tab/Page_Quest LMS/span_Communication    Skills'), 
    'Communication Skills')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Library_Tab/Page_Quest LMS/span_Communication    Skills'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Library_Tab/Page_Quest LMS/span_Stories of Success'), 'Stories of Success')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Library_Tab/Page_Quest LMS/span_Stories of Success'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Library_Tab/Page_Quest LMS/span_Career Skills'), 'Career Skills')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Library_Tab/Page_Quest LMS/span_Career Skills'), 0)

WebUI.takeScreenshot('/home/pavitra/Katalon Studio/katalon_web_assessment/Screenshots/Smoke_librarytab.png')

WebUI.closeBrowser()

