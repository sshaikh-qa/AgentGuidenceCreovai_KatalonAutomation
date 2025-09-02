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



/*
WebUI.comment('Login to the CREOVAI Site')

CustomKeywords.'commonKeywords.CommonKeys.navigateToCREOVAILogin'()

WebUI.waitForElementPresent(findTestObject('Object Repository/LoginPage/img_Logo'), GlobalVariable.timeOut)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('Object Repository/LoginPage/text_Username'), GlobalVariable.timeOut)

WebUI.clearText(findTestObject('Object Repository/LoginPage/text_Username'))

WebUI.setText(findTestObject('Object Repository/LoginPage/text_Username'), 'vasanthi.j@inapp.com')

WebUI.enhancedClick(findTestObject('Object Repository/LoginPage/button_Continue'))

WebUI.delay(GlobalVariable.wait)

WebUI.takeFullPageScreenshot()

WebUI.verifyTextNotPresent('A username is required to log in', false)

WebUI.verifyElementPresent(findTestObject('Object Repository/LoginPage/text_Password'), GlobalVariable.timeOut)

WebUI.clearText(findTestObject('Object Repository/LoginPage/text_Password'))

WebUI.setText(findTestObject('Object Repository/LoginPage/text_Password'), 'Inapp@vasanthi111#')

WebUI.enhancedClick(findTestObject('Object Repository/LoginPage/button_Login'))

WebUI.takeFullPageScreenshot()

WebUI.verifyTextNotPresent('Username / password combination is incorrect', false)


String successHomeUrl = WebUI.getUrl()
WebUI.verifyMatch(successHomeUrl, GlobalVariable.loginURL +'/executer/desktop/', false)
String Name
if (GlobalVariable.userName == 'vasanthi.j@inapp.com') {
    Name = 'Vasanthi Jayakumar'
}
WebUI.verifyElementPresent(findTestObject('Object Repository/LoginPage/user_Validation', [('Name') : Name]), GlobalVariable.timeOut)
*/

String TEST_STEP= "Verify Login after successful Login"

CustomKeywords.'actionKeywords.Login.verifySuccessfulLogin'()
