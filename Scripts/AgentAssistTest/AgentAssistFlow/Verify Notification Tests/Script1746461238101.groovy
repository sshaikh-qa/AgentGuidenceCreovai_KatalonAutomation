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




String TEST_STEP= "GOTO NOTIFY TESTS"

CustomKeywords.'actionKeywords.Notification.clickGoToNotifyTests'()

TEST_STEP= "VERIFY ALL NOTIFY BUTTONS"

CustomKeywords.'actionKeywords.Widget.clickAIIcon'()


TEST_STEP= "VERIFY NOTIFY SUCCESS AND ITS BACKGROUND-COLOR"

CustomKeywords.'actionKeywords.Notification.clickNotifySuccess'()

CustomKeywords.'actionKeywords.Notification.assertNotifySuccess'("widget")

TEST_STEP= "VERIFY NOTIFY ERROR AND ITS BACKGROUND-COLOR"

CustomKeywords.'actionKeywords.Notification.clickNotifyError'()

CustomKeywords.'actionKeywords.Notification.assertNotifyError'("widget")

TEST_STEP= "VERIFY NOTIFY INFO AND ITS BACKGROUND-COLOR"

CustomKeywords.'actionKeywords.Notification.clickNotifyInfo'()

CustomKeywords.'actionKeywords.Notification.assertNotifyInfo'("widget")

TEST_STEP= "VERIFY NOTIFY LOADING AND ITS BACKGROUND-COLOR"

CustomKeywords.'actionKeywords.Notification.clicktNotifyLoading'()

CustomKeywords.'actionKeywords.Notification.assertNotifyLoading'("widget")

TEST_STEP= "VERIFY NOTIFY WARNING AND ITS BACKGROUND-COLOR"

CustomKeywords.'actionKeywords.Notification.clickNotifyWarning'()

CustomKeywords.'actionKeywords.Notification.assertNotifyWarning'("widget")