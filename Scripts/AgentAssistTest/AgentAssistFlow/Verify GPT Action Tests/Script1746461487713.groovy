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


String TEST_STEP= "GOTO GPT ACTION TESTS"

CustomKeywords.'actionKeywords.GPTAction.clickGoToGptActionTests'()

TEST_STEP= "ADD GPT ACTION"

CustomKeywords.'actionKeywords.GPTAction.clickAddGptAction'()

CustomKeywords.'actionKeywords.GPTAction.assertGptActionAdded'()

TEST_STEP= "CLICK CALLER DETAILS ACTION"

CustomKeywords.'actionKeywords.Widget.clickAIIcon'()

CustomKeywords.'actionKeywords.GPTAction.clickOnCallerDetailsAction'()

CustomKeywords.'actionKeywords.GPTAction.assertActionExecutedAndAddedToTimeline'()

TEST_STEP= "REMOVE GPT ACTION"

CustomKeywords.'actionKeywords.GPTAction.clickRemoveGptAction'()

CustomKeywords.'actionKeywords.GPTAction.assertGptActionRemoved'()

TEST_STEP= "REMOVE ALL GPT ACTION"

CustomKeywords.'actionKeywords.GPTAction.clickRemoveAllGptActions'()

CustomKeywords.'actionKeywords.GPTAction.assertAllGptActionsCleared'()