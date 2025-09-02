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

WebUI.comment('Assert all elements are loaded within the expected time frame')
CustomKeywords.'actionKeywords.Widget.assertElementsLoadedInTime'()

WebUI.comment('Assert all tabs are present')
CustomKeywords.'actionKeywords.Widget.assertAllTabsPresent'()

WebUI.comment('Assert font and colour schemes match the design specification')
CustomKeywords.'actionKeywords.Widget.assertFontAndColorSchemes'('IntentsandCategories','Object Repository/CommonXpaths/IntentandCategories_Icon')
CustomKeywords.'actionKeywords.Widget.assertFontAndColorSchemes'('Entities','Object Repository/CommonXpaths/Entities_Icon')
CustomKeywords.'actionKeywords.Widget.assertFontAndColorSchemes'('Conversation','Object Repository/CommonXpaths/conversationIcon')
CustomKeywords.'actionKeywords.Widget.assertFontAndColorSchemes'('AI','Object Repository/CommonXpaths/AI_Icon')

WebUI.comment('Assert widget title is correct')
CustomKeywords.'actionKeywords.Widget.assertWidgetTitle'()

WebUI.comment('Assert widget does not preload with any previous data')
CustomKeywords.'actionKeywords.Widget.assertNoPreloadedData'()

WebUI.comment('Assert widget does not preload with any previous data')
CustomKeywords.'actionKeywords.Widget.assertDefaultMessagesOnTabs'()

