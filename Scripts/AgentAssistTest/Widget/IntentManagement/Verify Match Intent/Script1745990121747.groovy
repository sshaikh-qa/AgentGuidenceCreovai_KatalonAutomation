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

//CustomKeywords.'actionKeywords.Login.login'(GlobalVariable.userName,GlobalVariable.password)
//
//CustomKeywords.'actionKeywords.Widget.popCampaignviaAgentAssist'()
//
//CustomKeywords.'actionKeywords.Widget.clickWidget'()

CustomKeywords.'actionKeywords.Widget.clickIntentandCategoriesIcon'()
WebUI.comment('Click on GoTo Intents')
CustomKeywords.'actionKeywords.Intents.clickGoToIntents'()

WebUI.comment('Click on Match Intents')
String message = CustomKeywords.'actionKeywords.Intents.clickOnMatchIntent'()

WebUI.comment('Assert "Greetings" Intent is ticked')
CustomKeywords.'actionKeywords.Intents.assertGreetingsIntentIsTicked'()

WebUI.comment('Assert toast message is displayed')
CustomKeywords.'actionKeywords.Intents.assertToastMessageIsDisplayed'(message)



