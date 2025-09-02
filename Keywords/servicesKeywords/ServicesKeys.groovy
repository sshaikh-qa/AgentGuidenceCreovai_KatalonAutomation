package servicesKeywords

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

public class ServicesKeys {
	
	commonKeywords.CommonKeys commKey = new commonKeywords.CommonKeys()
	
	@Keyword
	def verifyServicePageOpenedSuccessfully(String headingName) {
		TestObject iframe = findTestObject('Object Repository/CommonXpaths/iframe_main')
		WebUI.switchToFrame(iframe, GlobalVariable.timeOut)
		TestObject headingNameObj = findTestObject('Object Repository/Admin/Services/Heading_dynamic', [('h1Text') : headingName])		
		WebUI.verifyElementPresent(headingNameObj, GlobalVariable.timeOut)
		WebUI.takeFullPageScreenshot()
		WebUI.switchToDefaultContent()
	}
	
	@Keyword
	def activeStateToggleButton(String state) {
		TestObject iframe = findTestObject('Object Repository/CommonXpaths/iframe_main')
		WebUI.switchToFrame(iframe, GlobalVariable.timeOut)
		TestObject toggleObj = findTestObject('Object Repository/Admin/Services/Toggle_button')
		WebUI.verifyElementPresent(toggleObj, GlobalVariable.timeOut)
		commKey.mouseOverandClick(toggleObj)
		WebUI.takeFullPageScreenshot()
		WebUI.switchToDefaultContent()
	}
	
	
	
	
	
}
