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

WebUI.verifyElementText(findTestObject('Object Repository/Page_Smoke_Tab_Title/Page_Quest LMS/div_Dual Login'), 'Dual Login')

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Smoke_Tab_Title/Page_Quest LMS/div_Dual Login'))

WebUI.click(findTestObject('Object Repository/Page_Smoke_Tab_Title/Page_Quest LMS/div_Dual Login'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Smoke_Tab_Title/Page_Quest LMS/div_Single Login'), 'Single Login')

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Smoke_Tab_Title/Page_Quest LMS/div_Single Login'))

WebUI.click(findTestObject('Object Repository/Page_Smoke_Tab_Title/Page_Quest LMS/div_Single Login'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Smoke_Tab_Title/Page_Quest LMS/input_Dual Login_p-inputtext p-component p-_bf18e8'), 
    '')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Smoke_Tab_Title/Page_Quest LMS/input_Dual Login_p-inputtext p-component p-_bf18e8'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Smoke_Tab_Title/Page_Quest LMS/input_Email ID  Mobile Number_p-inputtext p_ccbba2'), 
    '')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Smoke_Tab_Title/Page_Quest LMS/input_Email ID  Mobile Number_p-inputtext p_ccbba2'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Smoke_Tab_Title/Page_Quest LMS/span_Login'), 'Login')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Smoke_Tab_Title/Page_Quest LMS/span_Login'), 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Smoke_Tab_Title/Page_Quest LMS/span_Login'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Smoke_Tab_Title/Page_Quest LMS/h3_Or'), 'Or')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Smoke_Tab_Title/Page_Quest LMS/span_Login with OTP'), 'Login with OTP')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Smoke_Tab_Title/Page_Quest LMS/span_Login with OTP'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Smoke_Tab_Title/Page_Quest LMS/span_Login with OTP'))


WebUI.closeBrowser()

