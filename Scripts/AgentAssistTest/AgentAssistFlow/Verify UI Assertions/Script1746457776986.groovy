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

String TEST_STEP= "UI ASSERTIONS"

CustomKeywords.'actionKeywords.Widget.assertElementsLoadedInTime'()

CustomKeywords.'actionKeywords.Widget.assertAllTabsPresent'()

CustomKeywords.'actionKeywords.Widget.assertFontAndColorSchemes'('IntentsandCategories','Object Repository/CommonXpaths/IntentandCategories_Icon')
CustomKeywords.'actionKeywords.Widget.assertFontAndColorSchemes'('Entities','Object Repository/CommonXpaths/Entities_Icon')
CustomKeywords.'actionKeywords.Widget.assertFontAndColorSchemes'('Conversation','Object Repository/CommonXpaths/conversationIcon')
CustomKeywords.'actionKeywords.Widget.assertFontAndColorSchemes'('AI','Object Repository/CommonXpaths/AI_Icon')

CustomKeywords.'actionKeywords.Widget.assertWidgetTitle'()

CustomKeywords.'actionKeywords.Widget.assertNoPreloadedData'()

CustomKeywords.'actionKeywords.Widget.assertDefaultMessagesOnTabs'()

