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
import org.openqa.selenium.WebElement

//WebUI.comment('Login to the CREOVAI Site and Navigate to desktop')
//
//CustomKeywords.'actionKeywords.Login.login'(GlobalVariable.userName,GlobalVariable.password)

WebUI.comment('Pop the given campaign via the desktop “Agent Assist Tests”')
CustomKeywords.'actionKeywords.Widget.popCampaignviaAgentAssist'()


WebUI.comment('Click on conversation and validate before clicking Add Utterance button')
CustomKeywords.'actionKeywords.Widget.clickWidget'()

CustomKeywords.'actionKeywords.Widget.clickConversationIcon'()

String beforeUtterance = WebUI.getText(findTestObject('Object Repository/AgentAssistTest/AgentAssist/Conversation/conversation_container'))

WebUI.verifyMatch(beforeUtterance, 'No conversation to display', false)


WebUI.comment('Click on Add Utterance button')
CustomKeywords.'actionKeywords.Widget.clickAddUtteranceButton'()

WebUI.comment('Assert utterances are added to the conversations tab')
CustomKeywords.'actionKeywords.Widget.assertUtterancesAddedToConversationTab'()

WebUI.comment('Assert "Greetings" Intent is added by default')
CustomKeywords.'actionKeywords.Widget.assertGreetingsIntentAddedByDefault'()


