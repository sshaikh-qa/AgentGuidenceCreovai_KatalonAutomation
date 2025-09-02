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
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSimport com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement

import internal.GlobalVariable

public class Widget {
	commonKeywords.CommonKeys commKey = new commonKeywords.CommonKeys()
	WebDriver driver = DriverFactory.getWebDriver()

	@Keyword
	def popCampaignviaAgentAssist() {
		switchAgentAssistOuterIframe()
		WebUI.waitForElementVisible(findTestObject('Object Repository/AgentAssistTest/AgentAssist/iframe_AgentAssist_Inner'), GlobalVariable.timeOut)
		WebUI.switchToFrame(findTestObject('Object Repository/AgentAssistTest/AgentAssist/iframe_AgentAssist_Inner'), GlobalVariable.timeOut)
		WebUI.delay(GlobalVariable.wait)
		WebUI.takeFullPageScreenshot()
		WebUI.enhancedClick(findTestObject('Object Repository/CommonXpaths/AgentAssistTest_Common/AgentAssistTests'))
		WebUI.switchToDefaultContent()
		switchAgentAssistOuterIframe()
		WebUI.takeFullPageScreenshot()
		commKey.mouseOverandClick(findTestObject('Object Repository/AgentAssistTest/AgentAssist/button_CreateNewRecord'))
		WebUI.switchToDefaultContent()
		WebUI.switchToDefaultContent()
	}

	@Keyword
	def clickAddUtteranceButton() {


		commKey.mouseOverandClick(findTestObject('Object Repository/AgentAssistTest/AgentAssist/button_AddUtterances'))
	}

	@Keyword
	def switchAgentAssistOuterIframe() {
		WebUI.waitForElementVisible(findTestObject('Object Repository/AgentAssistTest/AgentAssist/iframe_AgentAssist_Outer'), GlobalVariable.timeOut)
		WebUI.switchToFrame(findTestObject('Object Repository/AgentAssistTest/AgentAssist/iframe_AgentAssist_Outer'), GlobalVariable.timeOut)
		WebUI.delay(GlobalVariable.wait)
	}

	@Keyword
	def switchCampaignInnerIframe() {
		WebUI.waitForElementVisible(findTestObject('Object Repository/AgentAssistTest/AgentAssist/iframe_Campaign_Inner'), GlobalVariable.timeOut)
		WebUI.switchToFrame(findTestObject('Object Repository/AgentAssistTest/AgentAssist/iframe_Campaign_Inner'), GlobalVariable.timeOut)
		WebUI.delay(GlobalVariable.wait)
	}

	@Keyword
	def clickWidget() {

		commKey.mouseOverandClick(findTestObject('Object Repository/AgentAssistTest/AgentAssist/Icon_Widget'))
		WebUI.takeFullPageScreenshot()
	}

	@Keyword
	def clickConversationIcon() {

		commKey.mouseOverandClick(findTestObject('Object Repository/CommonXpaths/AgentAssistTest_Common/conversationIcon'))
		WebUI.takeFullPageScreenshot()
	}

	@Keyword
	def clickIntentandCategoriesIcon() {

		commKey.mouseOverandClick(findTestObject('Object Repository/CommonXpaths/AgentAssistTest_Common/IntentandCategories_Icon'))
		WebUI.takeFullPageScreenshot()
	}

	@Keyword
	def clickEntitiesIcon() {

		commKey.mouseOverandClick(findTestObject('Object Repository/CommonXpaths/AgentAssistTest_Common/Entities_Icon'))
		WebUI.takeFullPageScreenshot()
	}
	@Keyword
	def clickAIIcon() {

		commKey.mouseOverandClick(findTestObject('Object Repository/CommonXpaths/AgentAssistTest_Common/AI_Icon'))
		WebUI.takeFullPageScreenshot()
	}
	@Keyword
	def assertAllTabsPresent() {
		WebUI.takeFullPageScreenshot()
		// Assert that all expected tabs are present on the page
		WebUI.verifyElementPresent(findTestObject('Object Repository/CommonXpaths/AgentAssistTest_Common/IntentandCategories_Icon'), GlobalVariable.timeOut)
		WebUI.verifyElementPresent(findTestObject('Object Repository/CommonXpaths/AgentAssistTest_Common/Entities_Icon'), GlobalVariable.timeOut)
		WebUI.verifyElementPresent(findTestObject('Object Repository/CommonXpaths/AgentAssistTest_Common/conversationIcon'), GlobalVariable.timeOut)
		WebUI.verifyElementPresent(findTestObject('Object Repository/CommonXpaths/AgentAssistTest_Common/AI_Icon'), GlobalVariable.timeOut)
	}

	@Keyword
	def assertFontAndColorSchemes(String iconName, String testObjectPath) {
		WebUI.takeFullPageScreenshot()
		TestObject icon = findTestObject(testObjectPath)
		String fontFamily = WebUI.getCSSValue(icon, "font-family")
		String fontSize = WebUI.getCSSValue(icon, "font-size")
		String color = WebUI.getCSSValue(icon, "color")
		WebUI.verifyMatch(fontFamily, '"Font Awesome 6 Pro"', false)
		WebUI.verifyMatch(fontSize, '15px', false)
		if(iconName=='IntentsandCategories') {
			//WebUI.verifyMatch(color, 'rgba(0, 102, 255, 1)', false)
			WebUI.verifyMatch(color, 'rgba(0, 86, 224, 1)', false)
		}
		else{

			WebUI.verifyMatch(color, 'rgba(78, 84, 94, 1)', false)
		}
	}

	@Keyword
	def assertElementsLoadedInTime() {
		WebUI.takeFullPageScreenshot()
		// Assert that all expected tabs are present on the page
		WebUI.verifyElementPresent(findTestObject('Object Repository/CommonXpaths/AgentAssistTest_Common/IntentandCategories_Icon'), GlobalVariable.timeOut)
		WebUI.verifyElementPresent(findTestObject('Object Repository/CommonXpaths/AgentAssistTest_Common/Entities_Icon'), GlobalVariable.timeOut)
		WebUI.verifyElementPresent(findTestObject('Object Repository/CommonXpaths/AgentAssistTest_Common/conversationIcon'), GlobalVariable.timeOut)
		WebUI.verifyElementPresent(findTestObject('Object Repository/CommonXpaths/AgentAssistTest_Common/AI_Icon'), GlobalVariable.timeOut)
	}

	@Keyword
	def assertWidgetTitle() {
		WebUI.takeFullPageScreenshot()
		// Assert that the widget title is correct
		String widgetTitle=WebUI.getText(findTestObject('Object Repository/CommonXpaths/AgentAssistTest_Common/widget_Title'))
		WebUI.verifyMatch(widgetTitle, 'AGENT ASSIST', false)
	}

	@Keyword
	def assertNoPreloadedData() {

		clickIntentandCategoriesIcon()
		String intentsAndCategories =  WebUI.getText(findTestObject('Object Repository/AgentAssistTest/AgentAssist/IntentsAndCategories/IntentsandCategories_container'))
		WebUI.delay(GlobalVariable.wait)
		WebUI.takeFullPageScreenshotAsCheckpoint("IntentsAndCategories_tab_Default_Validation")
		clickEntitiesIcon()
		String entitiesContainer =  WebUI.getText(findTestObject('Object Repository/AgentAssistTest/AgentAssist/Entities/Entities_container'))
		WebUI.delay(GlobalVariable.wait)
		WebUI.takeFullPageScreenshotAsCheckpoint("Entities_tab_Default_Validation")
		clickConversationIcon()
		WebUI.takeFullPageScreenshot()
		String conversationContainer =  WebUI.getText(findTestObject('Object Repository/AgentAssistTest/AgentAssist/Conversation/conversation_container'))
		clickAIIcon()
		String aiContainer =  WebUI.getText(findTestObject('Object Repository/AgentAssistTest/AgentAssist/AI/AI_container'))
		WebUI.delay(GlobalVariable.wait)
		WebUI.takeFullPageScreenshotAsCheckpoint("AI_tab_Default_Validation")
		WebUI.verifyMatch(intentsAndCategories,'No intents or categories to display',false)
		WebUI.verifyMatch(entitiesContainer,'No entities to display',false)
		//WebUI.verifyMatch(conversationContainer,'No conversation to display',false)
		WebUI.verifyMatch(aiContainer,'No AI responses to display',false)
	}

	@Keyword
	def assertDefaultMessagesOnTabs() {
		// Assert that default messages on each tab are correct
		clickIntentandCategoriesIcon()
		WebUI.takeFullPageScreenshot()
		String intentsAndCategories =  WebUI.getText(findTestObject('Object Repository/AgentAssistTest/AgentAssist/IntentsAndCategories/IntentsandCategories_container'))
		clickEntitiesIcon()
		WebUI.takeFullPageScreenshot()
		String entitiesContainer =  WebUI.getText(findTestObject('Object Repository/AgentAssistTest/AgentAssist/Entities/Entities_container'))
		clickConversationIcon()
		WebUI.takeFullPageScreenshot()
		String conversationContainer =  WebUI.getText(findTestObject('Object Repository/AgentAssistTest/AgentAssist/Conversation/conversation_container'))
		clickAIIcon()
		WebUI.takeFullPageScreenshot()
		String aiContainer =  WebUI.getText(findTestObject('Object Repository/AgentAssistTest/AgentAssist/AI/AI_container'))
		WebUI.verifyMatch(intentsAndCategories,'No intents or categories to display',false)
		WebUI.verifyMatch(entitiesContainer,'No entities to display',false)
		//WebUI.verifyMatch(conversationContainer,'No conversation to display',false)
		WebUI.verifyMatch(aiContainer,'No AI responses to display',false)
	}

	@Keyword
	def assertUtterancesAddedToConversationTab() {
		WebUI.delay(GlobalVariable.timeOut)
		TestObject testObj1 = findTestObject('Object Repository/AgentAssistTest/AgentAssist/Conversation/conversation_container')
		List<WebElement> conversationItems = WebUI.findWebElements(testObj1, 10)
		assert conversationItems.size() > 1
		String afterUtterance = WebUI.getText(findTestObject('Object Repository/AgentAssistTest/AgentAssist/Conversation/conversation_container'))
		WebUI.takeFullPageScreenshot()
		WebUI.verifyNotMatch(afterUtterance, 'No conversation to display', false)
	}

	@Keyword
	def assertGreetingsIntentAddedByDefault() {

		clickIntentandCategoriesIcon()
		String intentsAndCategories =  WebUI.getText(findTestObject('Object Repository/AgentAssistTest/AgentAssist/IntentsAndCategories/IntentsandCategories_container'))
		WebUI.takeFullPageScreenshot()
		WebUI.verifyMatch(intentsAndCategories,'Greetings',false)
	}

	@Keyword
	def clickGoToWidgetToggle() {
		commKey.mouseOverandClick(findTestObject('Object Repository/AgentAssistTest/WidgetToggle/button_GoToWidgetToggle'))
	}

	@Keyword
	def clickCloseWidget() {

		commKey.mouseOverandClick(findTestObject('Object Repository/AgentAssistTest/WidgetToggle/button_CloseWidget'))
	}

	@Keyword
	def assertWidgetClosed() {
		WebUI.takeFullPageScreenshot()
		WebUI.verifyElementNotPresent(findTestObject('Object Repository/AgentAssistTest/AgentAssist/Widget_Max'),GlobalVariable.timeOut)
	}

	@Keyword
	def clickToggleWidget() {

		commKey.mouseOverandClick(findTestObject('Object Repository/AgentAssistTest/WidgetToggle/button_ToggleWidget'))
	}

	@Keyword
	def assertWidgetReopened() {
		WebUI.takeFullPageScreenshot()
		WebUI.verifyElementPresent(findTestObject('Object Repository/AgentAssistTest/AgentAssist/Widget_Max'),GlobalVariable.timeOut)
	}

	@Keyword
	def clickCloseWidgetAgain() {

		commKey.mouseOverandClick(findTestObject('Object Repository/AgentAssistTest/WidgetToggle/button_CloseWidget'))
	}

	@Keyword
	def assertWidgetMinimized() {
		WebUI.takeFullPageScreenshot()
		WebUI.verifyElementNotPresent(findTestObject('Object Repository/AgentAssistTest/AgentAssist/Widget_Max'),GlobalVariable.timeOut)
	}

	@Keyword
	def clickOpenWidget() {

		commKey.mouseOverandClick(findTestObject('Object Repository/AgentAssistTest/WidgetToggle/button_OpenWidget'))
	}

	@Keyword
	def assertWidgetMaximized() {
		WebUI.takeFullPageScreenshot()
		WebUI.verifyElementPresent(findTestObject('Object Repository/AgentAssistTest/AgentAssist/Widget_Max'),GlobalVariable.timeOut)
	}

	@Keyword
	def clickCompleteButton() {
		commKey.mouseOverandClick(findTestObject('Object Repository/AgentAssistTest/WidgetToggle/button_Complete'))
	}
}
