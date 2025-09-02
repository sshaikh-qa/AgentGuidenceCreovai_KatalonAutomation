package actionKeywords

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.testobject.TestObject
import org.openqa.selenium.WebElement
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import groovy.json.JsonSlurper
import internal.GlobalVariable

public class Categories {
	commonKeywords.CommonKeys commKey = new commonKeywords.CommonKeys()
	actionKeywords.Widget widgetKey =new actionKeywords.Widget()

	@Keyword
	def clickGoToCategory() {

		commKey.mouseOverandClick(findTestObject('Object Repository/AgentAssistTest/Category/button_GoToCategory'))
		WebUI.waitForPageLoad(GlobalVariable.timeOut)
		WebUI.delay(GlobalVariable.wait)
		WebUI.takeFullPageScreenshot()
	}

	@Keyword
	def assertCategoriesAreAdded() {

		WebUI.waitForPageLoad(GlobalVariable.timeOut)
		WebUI.delay(GlobalVariable.wait)
		WebUI.takeFullPageScreenshot()
		TestObject testObject = findTestObject('Object Repository/AgentAssistTest/Category/chk_label')
		List<WebElement> elements = WebUI.findWebElements(testObject, GlobalVariable.timeOut)
		List<String> expectedTexts = [
			'[ST Effort] A: Powerless to Help',
			'[ST Effort] A: Acknowledgement'
		]
		List<String> actualTexts = []
		WebUI.comment('elements size'+elements.size())
		for (int i = 0; i < expectedTexts.size(); i++) {

			String text = elements[i].getText().trim()
			WebUI.comment("Element[$i]: " + text)
			actualTexts.add(text)
			WebUI.verifyMatch(text, expectedTexts[i], false)
		}
	}

	@Keyword
	def clickOnMatchCategory() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/AgentAssistTest/AgentAssist/IntentsAndCategories/checkbox_Powerless'), GlobalVariable.timeOut)
		commKey.mouseOverandClick(findTestObject('Object Repository/AgentAssistTest/Category/button_MatchCategory'))
		WebUI.takeFullPageScreenshot()
		String toastMessage = WebUI.getText(findTestObject('Object Repository/AgentAssistTest/AgentAssist/IntentsAndCategories/category_ToastMessage'))
		return toastMessage
	}

	@Keyword
	def assertPowerlessIsTicked() {
		WebUI.takeFullPageScreenshot()
		WebUI.verifyElementPresent(findTestObject('Object Repository/AgentAssistTest/AgentAssist/IntentsAndCategories/checkbox_Powerless'), GlobalVariable.timeOut)
		WebUI.verifyElementChecked(findTestObject('Object Repository/AgentAssistTest/AgentAssist/IntentsAndCategories/checkbox_Powerless'), GlobalVariable.timeOut)
	}

	@Keyword
	def assertToastMessageIsDisplayed(String expectedMessage) {
		WebUI.takeFullPageScreenshot()
		WebUI.verifyMatch("Category Matched", expectedMessage, false)
	}

	@Keyword
	def clickOnGetCategories() {

		commKey.mouseOverandClick(findTestObject('Object Repository/AgentAssistTest/Category/button_GetCategories'))
	}
	def stripAddedTime(jsonArray) {
		return jsonArray.collect { it.findAll { k, v -> k != 'addedTime'
			} }
	}
	@Keyword
	def assertCategoriesExpectedJSON(String expectedJSON) {
		String getJSONValue = WebUI.getAttribute(findTestObject('Object Repository/AgentAssistTest/Category/input_Categories'),'value')
		String actualJSON = commKey.matchedTimeToNull(getJSONValue)
		WebUI.takeFullPageScreenshot()
		WebUI.comment('Actual JSON' +actualJSON )
		def actualJson = new JsonSlurper().parseText(actualJSON)
		def expectedJson = new JsonSlurper().parseText(expectedJSON)
		assert stripAddedTime(actualJson) == stripAddedTime(expectedJson)
		//WebUI.verifyMatch(actualJSON, expectedJSON, false)
	}

	@Keyword
	def clickOnRemoveCategory() {
		commKey.mouseOverandClick(findTestObject('Object Repository/AgentAssistTest/Category/button_RemoveCategory'))
	}

	@Keyword
	def assertCategoryIsRemoved() {
		WebUI.takeFullPageScreenshot()
		WebUI.verifyElementNotPresent(findTestObject('Object Repository/AgentAssistTest/AgentAssist/IntentsAndCategories/checkbox_Powerless'), GlobalVariable.timeOut)
	}

	@Keyword
	def clickOnRemoveAllCategories() {

		commKey.mouseOverandClick(findTestObject('Object Repository/AgentAssistTest/Category/button_RemoveAllCategories'))
	}

	@Keyword
	def assertAllCategoriesAreCleared() {
		WebUI.takeFullPageScreenshot()
		String intentsAndCategories =  WebUI.getText(findTestObject('Object Repository/AgentAssistTest/AgentAssist/IntentsAndCategories/IntentsandCategories_container'))
		WebUI.verifyMatch(intentsAndCategories,'No intents or categories to display',false)
		println intentsAndCategories
	}

	/*Create a custom keyword for the below steps
	 * Click login
	 * click the menu icon
	 * select the submenu
	 */
}

