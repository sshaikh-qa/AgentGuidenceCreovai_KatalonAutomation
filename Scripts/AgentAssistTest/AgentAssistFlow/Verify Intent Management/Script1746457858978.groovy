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

CustomKeywords.'actionKeywords.Widget.clickIntentandCategoriesIcon'()

CustomKeywords.'actionKeywords.Intents.clickGoToIntents'()

String TEST_STEP= "MATCH INTENT"

String message = CustomKeywords.'actionKeywords.Intents.clickOnMatchIntent'()

CustomKeywords.'actionKeywords.Intents.assertGreetingsIntentIsTicked'()

CustomKeywords.'actionKeywords.Intents.assertToastMessageIsDisplayed'(message)

TEST_STEP= "GET INTENT"

CustomKeywords.'actionKeywords.Intents.clickOnGetIntents'()

CustomKeywords.'actionKeywords.Intents.assertIntentExpectedJSON'(expectedIntentJSON)

TEST_STEP= "REMOVE INTENT"

CustomKeywords.'actionKeywords.Intents.clickOnRemoveIntent'()

CustomKeywords.'actionKeywords.Intents.assertGreetingsIntentIsRemoved'()


TEST_STEP= "REMOVE ALL INTENT"

CustomKeywords.'actionKeywords.Intents.clickOnRemoveAllIntents'()

CustomKeywords.'actionKeywords.Intents.assertAllIntentsAreCleared'()