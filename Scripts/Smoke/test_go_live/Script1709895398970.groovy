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

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Smoke_Golive_Tab/Page_Quest LMS/svg'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Smoke_Golive_Tab/Page_Quest LMS/span_Go Live'), 'Go Live')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Smoke_Golive_Tab/Page_Quest LMS/span_Go Live'), 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Smoke_Golive_Tab/Page_Quest LMS/span_Go Live'))

WebUI.click(findTestObject('Object Repository/Page_Smoke_Golive_Tab/Page_Quest LMS/span_Go Live'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Smoke_Golive_Tab/Page_Quest LMS/h1_Welcome, Tibil'), 'Welcome, Tibil')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Smoke_Golive_Tab/Page_Quest LMS/h1_Welcome, Tibil'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Smoke_Golive_Tab/Page_Quest LMS/h1_Upcoming Sessions'), 'Upcoming Sessions')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Smoke_Golive_Tab/Page_Quest LMS/h1_Upcoming Sessions'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Smoke_Golive_Tab/Page_Quest LMS/h1_Previous Sessions'), 'Previous Sessions')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Smoke_Golive_Tab/Page_Quest LMS/h1_Previous Sessions'), 
    0)

WebUI.takeScreenshot('/home/pavitra/Katalon Studio/katalon_web_assessment/Screenshots/Smoke_Golive.png')

WebUI.closeBrowser()

