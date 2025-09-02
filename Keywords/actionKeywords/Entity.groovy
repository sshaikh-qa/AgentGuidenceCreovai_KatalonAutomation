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

public class Entity {

	commonKeywords.CommonKeys commKey = new commonKeywords.CommonKeys()
	actionKeywords.Widget widgetKey =new actionKeywords.Widget()

	@Keyword
	def clickGoToEntities() {

		commKey.mouseOverandClick(findTestObject('Object Repository/AgentAssistTest/Entities/button_GoToEntities'))
	}

	@Keyword
	def clickAddEntities() {

		commKey.mouseOverandClick(findTestObject('Object Repository/AgentAssistTest/Entities/button_AddEntities'))
	}

	@Keyword
	def assertEntitiesAdded() {

		widgetKey.clickEntitiesIcon()
		WebUI.takeFullPageScreenshot()
		WebUI.verifyElementPresent(findTestObject('Object Repository/AgentAssistTest/AgentAssist/Entities/person'), GlobalVariable.timeOut)
		WebUI.verifyElementPresent(findTestObject('Object Repository/AgentAssistTest/AgentAssist/Entities/location'), GlobalVariable.timeOut)
	}

	@Keyword
	def clickGetEntities() {

		commKey.mouseOverandClick(findTestObject('Object Repository/AgentAssistTest/Entities/button_GetEntities'))
	}
    
	@Keyword
	def assertResponseMatches(String expectedResponse) {

		String actualResponse = WebUI.getAttribute(findTestObject('Object Repository/AgentAssistTest/Entities/input_Entities'),'value')
		WebUI.takeFullPageScreenshot()
		WebUI.verifyEqual(actualResponse, expectedResponse)
	}
}