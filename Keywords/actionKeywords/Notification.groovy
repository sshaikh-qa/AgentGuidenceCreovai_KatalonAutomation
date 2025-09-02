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
import org.openqa.selenium.WebElement
import internal.GlobalVariable

public class Notification {

	commonKeywords.CommonKeys commKey = new commonKeywords.CommonKeys()
	actionKeywords.Widget widgetKey =new actionKeywords.Widget()

	@Keyword
	def clickGoToNotifyTests() {

		commKey.mouseOverandClick(findTestObject('Object Repository/AgentAssistTest/Notify/button_GoToNotify'))
	}

	@Keyword
	def clickNotifyError() {

		commKey.mouseOverandClick(findTestObject('Object Repository/AgentAssistTest/Notify/button_NotifyError'))
	}

	@Keyword
	def clickNotifyInfo() {

		commKey.mouseOverandClick(findTestObject('Object Repository/AgentAssistTest/Notify/button_NotifyInfo'))
	}

	@Keyword
	def clicktNotifyLoading() {

		commKey.mouseOverandClick(findTestObject('Object Repository/AgentAssistTest/Notify/button_NotifyLoading'))
	}

	@Keyword
	def clickNotifySuccess() {

		commKey.mouseOverandClick(findTestObject('Object Repository/AgentAssistTest/Notify/button_NotifySuccess'))
	}

	@Keyword
	def clickNotifyWarning() {

		commKey.mouseOverandClick(findTestObject('Object Repository/AgentAssistTest/Notify/button_NotifyWarning'))
	}

	@Keyword
	def assertNotifyError(String widget) {
		WebUI.takeFullPageScreenshot()
		if(widget != 'widget') {

			WebUI.verifyElementPresent(findTestObject('Object Repository/AgentAssistTest/Notify/outsideWidget_NotifyError'),GlobalVariable.timeOut)
		}else {
			WebUI.verifyElementPresent(findTestObject('Object Repository/AgentAssistTest/AgentAssist/AI/notifyError'),GlobalVariable.timeOut)
			String notifyMessage = WebUI.getText(findTestObject('Object Repository/AgentAssistTest/AgentAssist/AI/notifyError'))
			String expectedPattern = "Notify Error\nError Notification Alert"
			WebUI.comment(notifyMessage)
			WebUI.verifyMatch(notifyMessage, expectedPattern, true)
			String bgColor = WebUI.getCSSValue(findTestObject('Object Repository/AgentAssistTest/AgentAssist/AI/notifyError'), 'background-color')
			println("Background color: " + bgColor)
			WebUI.verifyMatch(bgColor,'rgba(242, 222, 222, 1)',false)
		}
		
	}

	@Keyword
	def assertNotifyInfo(String widget) {
		WebUI.takeFullPageScreenshot()
		if(widget != 'widget') {

			WebUI.verifyElementPresent(findTestObject('Object Repository/AgentAssistTest/Notify/outsideWidget_NotifyInfo'),GlobalVariable.timeOut)
		}else {
			WebUI.verifyElementPresent(findTestObject('Object Repository/AgentAssistTest/AgentAssist/AI/notifyInfo'),GlobalVariable.timeOut)
			String notifyMessage = WebUI.getText(findTestObject('Object Repository/AgentAssistTest/AgentAssist/AI/notifyInfo'))
			String expectedPattern = "Notify Info\nInfo Notification Alert"
			WebUI.comment(notifyMessage)
			WebUI.verifyMatch(notifyMessage, expectedPattern, true)
			String bgColor = WebUI.getCSSValue(findTestObject('Object Repository/AgentAssistTest/AgentAssist/AI/notifyInfo'), 'background-color')
			println("Background color: " + bgColor)
			WebUI.verifyMatch(bgColor,'rgba(255, 255, 255, 1)',false)
		}
	}

	@Keyword
	def assertNotifyLoading(String widget) {
		WebUI.takeFullPageScreenshot()
		if(widget != 'widget') {

			WebUI.verifyElementPresent(findTestObject('Object Repository/AgentAssistTest/Notify/outsideWidget_NotifyLoading'),GlobalVariable.timeOut)
		}else {
			WebUI.verifyElementPresent(findTestObject('Object Repository/AgentAssistTest/AgentAssist/AI/notifyLoading'),GlobalVariable.timeOut)
			String notifyMessage = WebUI.getText(findTestObject('Object Repository/AgentAssistTest/AgentAssist/AI/notifyLoading'))
			String expectedPattern = "Notify Loading\nLoading Notification Alert"
			WebUI.comment(notifyMessage)
			WebUI.verifyMatch(notifyMessage, expectedPattern, true)
			String bgColor = WebUI.getCSSValue(findTestObject('Object Repository/AgentAssistTest/AgentAssist/AI/notifyLoading'), 'background-color')
			println("Background color: " + bgColor)
			WebUI.verifyMatch(bgColor,'rgba(255, 255, 255, 1)',false)
		}
	}

	@Keyword
	def assertNotifySuccess(String widget) {
		WebUI.takeFullPageScreenshot()
		if(widget != 'widget') {

			WebUI.verifyElementPresent(findTestObject('Object Repository/AgentAssistTest/Notify/outsideWidget_NotifySuccess'),GlobalVariable.timeOut)
		}
		else {
			WebUI.verifyElementPresent(findTestObject('Object Repository/AgentAssistTest/AgentAssist/AI/notifySuccess'),GlobalVariable.timeOut)
			String notifyMessage = WebUI.getText(findTestObject('Object Repository/AgentAssistTest/AgentAssist/AI/notifySuccess'))
			String expectedPattern = "Notify Success\nSuccess Notification Alert"
			WebUI.comment(notifyMessage)
			WebUI.verifyMatch(notifyMessage, expectedPattern, true)
			String bgColor = WebUI.getCSSValue(findTestObject('Object Repository/AgentAssistTest/AgentAssist/AI/notifySuccess'), 'background-color')
			println("Background color: " + bgColor)

			WebUI.verifyMatch(bgColor,'rgba(210, 243, 225, 1)',false)
		}
	}

	@Keyword
	def assertNotifyWarning(String widget) {
		WebUI.takeFullPageScreenshot()
		if(widget != 'widget') {

			WebUI.verifyElementPresent(findTestObject('Object Repository/AgentAssistTest/Notify/outsideWidget_NotifyWarning'),GlobalVariable.timeOut)
		}
		else {
			WebUI.verifyElementPresent(findTestObject('Object Repository/AgentAssistTest/AgentAssist/AI/notifyWarning'),GlobalVariable.timeOut)
			String notifyMessage = WebUI.getText(findTestObject('Object Repository/AgentAssistTest/AgentAssist/AI/notifyWarning'))
			String expectedPattern = "Notify Warning\nWarning Notification Alert"
			WebUI.comment(notifyMessage)
			WebUI.verifyMatch(notifyMessage, expectedPattern, true)
			String bgColor = WebUI.getCSSValue(findTestObject('Object Repository/AgentAssistTest/AgentAssist/AI/notifyWarning'), 'background-color')
			println("Background color: " + bgColor)
			WebUI.verifyMatch(bgColor,'rgba(252, 248, 227, 1)',false)
		}
	}
}
