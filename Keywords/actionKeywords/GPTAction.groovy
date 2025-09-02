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

import internal.GlobalVariable

public class GPTAction {

	commonKeywords.CommonKeys commKey = new commonKeywords.CommonKeys()
	actionKeywords.Widget widgetKey =new actionKeywords.Widget()

	@Keyword
	def clickGoToGptActionTests() {
		
		commKey.mouseOverandClick(findTestObject('Object Repository/AgentAssistTest/GPTAction/button_GoToGPTAction'))
	}

	@Keyword
	def clickAddGptAction() {
		
		commKey.mouseOverandClick(findTestObject('Object Repository/AgentAssistTest/GPTAction/button_AddGPTAction'))
	}

	@Keyword
	def assertGptActionAdded() {
		WebUI.takeFullPageScreenshot()

		WebUI.verifyElementPresent(findTestObject('Object Repository/CommonXpaths/AgentAssistTest_Common/Actions_Icon'), GlobalVariable.timeOut)
	}

	@Keyword
	def clickOnCallerDetailsAction() {
		WebUI.takeFullPageScreenshot()

		commKey.mouseOverandClick(findTestObject('Object Repository/CommonXpaths/AgentAssistTest_Common/Actions_Icon'))
		WebUI.takeFullPageScreenshot()
		commKey.mouseOverandClick(findTestObject('Object Repository/AgentAssistTest/AgentAssist/Actions/callerDetailsAction'))
	}

	@Keyword
	def assertActionExecutedAndAddedToTimeline() {
		WebUI.takeFullPageScreenshot()

		WebUI.verifyElementPresent(findTestObject('Object Repository/AgentAssistTest/AgentAssist/Actions/callerDetails'), GlobalVariable.timeOut)
	}

	@Keyword
	def clickRemoveGptAction() {
		
		commKey.mouseOverandClick(findTestObject('Object Repository/AgentAssistTest/GPTAction/button_RemoveGPTAction'))
	}

	@Keyword
	def assertGptActionRemoved() {
		WebUI.takeFullPageScreenshot()
		commKey.mouseOverandClick(findTestObject('Object Repository/CommonXpaths/AgentAssistTest_Common/Actions_Icon'))
		WebUI.verifyElementNotPresent(findTestObject('Object Repository/AgentAssistTest/AgentAssist/Actions/callerDetailsAction'), GlobalVariable.timeOut)
	}

	@Keyword
	def clickRemoveAllGptActions() {
		
		commKey.mouseOverandClick(findTestObject('Object Repository/AgentAssistTest/GPTAction/button_RemoveAllGPTActions'))
	}

	@Keyword
	def assertAllGptActionsCleared() {
		commKey.mouseOverandClick(findTestObject('Object Repository/CommonXpaths/AgentAssistTest_Common/Actions_Icon'))
		WebUI.takeFullPageScreenshot()
		WebUI.verifyElementNotPresent(findTestObject('Object Repository/AgentAssistTest/AgentAssist/Actions/callerDetailsAction'), GlobalVariable.timeOut)
	}
}
