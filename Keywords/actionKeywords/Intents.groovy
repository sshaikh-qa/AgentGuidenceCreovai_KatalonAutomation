package actionKeywords

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import groovy.json.JsonSlurper
import internal.GlobalVariable

public class Intents {

	/*Write custom keywords for the below 
	 * •	Click on Match Intent and get the toast message
	 o	Assert "Greetings" Intent is ticked
	 o	Assert toast message is displayed
	 •	Click on Get Intents
	 o	Assert the text box contains expected JSON structure:
	 •	Click on Remove Intent
	 o	Assert "Greetings" Intent is removed
	 •	Click on Remove All Intents
	 o	Assert all intents are cleared
	 */

	commonKeywords.CommonKeys commKey = new commonKeywords.CommonKeys()
	actionKeywords.Widget widgetKey =new actionKeywords.Widget()

	@Keyword
	def clickGoToIntents() {
		commKey.mouseOverandClick(findTestObject('Object Repository/AgentAssistTest/Intents/button_GoToIntent'))
		WebUI.waitForPageLoad(GlobalVariable.timeOut)
		WebUI.delay(GlobalVariable.wait)
		WebUI.takeFullPageScreenshot()
		String intentsAndCategories =  WebUI.getText(findTestObject('Object Repository/AgentAssistTest/AgentAssist/IntentsAndCategories/IntentsandCategories_container'))
		WebUI.comment(intentsAndCategories)
	}
	@Keyword
	def clickOnMatchIntent() {
		WebUI.takeFullPageScreenshot()
		WebUI.verifyElementPresent(findTestObject('Object Repository/AgentAssistTest/AgentAssist/IntentsAndCategories/checkbox_Greetings'), GlobalVariable.timeOut)
		commKey.mouseOverandClick(findTestObject('Object Repository/AgentAssistTest/Intents/button_MatchIntent'))
		WebUI.takeFullPageScreenshot()
		String toastMessage = WebUI.getText(findTestObject('Object Repository/AgentAssistTest/AgentAssist/IntentsAndCategories/toastMessage'))

		return toastMessage
	}

	@Keyword
	def assertGreetingsIntentIsTicked() {
		WebUI.takeFullPageScreenshot()

		WebUI.verifyElementPresent(findTestObject('Object Repository/AgentAssistTest/AgentAssist/IntentsAndCategories/checkbox_Greetings'), GlobalVariable.timeOut)
		WebUI.verifyElementChecked(findTestObject('Object Repository/AgentAssistTest/AgentAssist/IntentsAndCategories/checkbox_Greetings'), GlobalVariable.timeOut)
	}

	@Keyword
	def assertToastMessageIsDisplayed(String expectedMessage) {
		WebUI.takeFullPageScreenshot()
		WebUI.verifyMatch("Greetings Intent Matched", expectedMessage, false)
	}

	@Keyword
	def clickOnGetIntents() {
		commKey.mouseOverandClick(findTestObject('Object Repository/AgentAssistTest/Intents/button_GetIntents'))
	}
	def stripAddedTime(jsonArray) {
		return jsonArray.collect { it.findAll { k, v -> k != 'addedTime' } }
	}
	@Keyword
	def assertIntentExpectedJSON(String expectedJSON) {

		String getJSONValue = WebUI.getAttribute(findTestObject('Object Repository/AgentAssistTest/Intents/input_GetIntents'),'value')
		String actualJSON = commKey.matchedTimeToNull(getJSONValue)
		WebUI.takeFullPageScreenshot()
		WebUI.comment('Actual JSON' +actualJSON )
		def actualJson = new JsonSlurper().parseText(actualJSON)
		def expectedJson = new JsonSlurper().parseText(expectedJSON)
		assert stripAddedTime(actualJson) == stripAddedTime(expectedJson)
		
		//WebUI.verifyMatch(actualJSON, expectedJSON, false)
	}

	@Keyword
	def clickOnRemoveIntent() {
		commKey.mouseOverandClick(findTestObject('Object Repository/AgentAssistTest/Intents/button_RemoveIntent'))
	}

	@Keyword
	def assertGreetingsIntentIsRemoved() {
		WebUI.takeFullPageScreenshot()
		WebUI.verifyElementNotPresent(findTestObject('Object Repository/AgentAssistTest/AgentAssist/IntentsAndCategories/checkbox_Greetings'), GlobalVariable.timeOut)
	}

	@Keyword
	def clickOnRemoveAllIntents() {
		commKey.mouseOverandClick(findTestObject('Object Repository/AgentAssistTest/Intents/button_RemoveAllIntents'))
	}

	@Keyword
	def assertAllIntentsAreCleared() {
		WebUI.takeFullPageScreenshot()
		String intentsAndCategories =  WebUI.getText(findTestObject('Object Repository/AgentAssistTest/AgentAssist/IntentsAndCategories/IntentsandCategories_container'))
		WebUI.verifyMatch(intentsAndCategories,'No intents or categories to display',false)
		println intentsAndCategories
	}
}

