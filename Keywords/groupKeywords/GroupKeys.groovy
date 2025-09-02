package groupKeywords

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

public class GroupKeys {

	commonKeywords.CommonKeys commKey = new commonKeywords.CommonKeys()

	@Keyword
	def selectWorkflowFromWorkflowsUnderGroups(String workflowName) {

		TestObject iframe = findTestObject('Object Repository/CommonXpaths/iframe_main')
		WebUI.switchToFrame(iframe, GlobalVariable.timeOut)
		TestObject workflowNameObj = findTestObject('Object Repository/UserGroupLicences/Groups/groups_workflows_workflowName', [('workflowName') : workflowName])
		commKey.mouseOverandClick(workflowNameObj)
		WebUI.takeFullPageScreenshot()
		WebUI.switchToDefaultContent()
	}

	@Keyword
	def verifyWorkflowPresentInTheList(String workflowName) {
		TestObject iframe = findTestObject('Object Repository/CommonXpaths/iframe_main')
		WebUI.switchToFrame(iframe, GlobalVariable.timeOut)
		TestObject workflowNameObj = findTestObject('Object Repository/UserGroupLicences/Groups/groups_workflows_workflowName', [('workflowName') : workflowName])
		//Verify version is present in the list.
		WebUI.verifyElementPresent(workflowNameObj, GlobalVariable.timeOut)
		WebUI.takeFullPageScreenshot()
		WebUI.switchToDefaultContent()
	}

	@Keyword
	def verifyWorkflowNotPresentInTheList(String workflowName) {
		TestObject iframe = findTestObject('Object Repository/CommonXpaths/iframe_main')
		WebUI.switchToFrame(iframe, GlobalVariable.timeOut)
		TestObject workflowNameObj = findTestObject('Object Repository/UserGroupLicences/Groups/groups_workflows_workflowName', [('workflowName') : workflowName])
		//Verify version is present in the list.
		WebUI.verifyElementNotPresent(workflowNameObj, GlobalVariable.timeOut)
		WebUI.takeFullPageScreenshot()
		WebUI.switchToDefaultContent()
	}
}
