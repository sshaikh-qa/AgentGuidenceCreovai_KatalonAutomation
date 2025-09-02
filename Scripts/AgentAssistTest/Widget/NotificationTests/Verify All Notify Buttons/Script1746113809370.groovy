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


WebUI.comment('Click on AI Icon')
CustomKeywords.'actionKeywords.Widget.clickAIIcon'()

WebUI.comment('Assert that each type of notification is correctly triggered and displayed in the widget')

WebUI.comment('Click on Notify Success')
CustomKeywords.'actionKeywords.Notification.clickNotifySuccess'()

WebUI.comment('Assert Notify Success and its background-color')
CustomKeywords.'actionKeywords.Notification.assertNotifySuccess'("widget")

WebUI.comment('Click on Notify Error')
CustomKeywords.'actionKeywords.Notification.clickNotifyError'()

WebUI.comment('Assert Notify Error and its background-color')
CustomKeywords.'actionKeywords.Notification.assertNotifyError'("widget")

WebUI.comment('Click on Notify Info')
CustomKeywords.'actionKeywords.Notification.clickNotifyInfo'()

WebUI.comment('Assert Notify Info and its background-color')
CustomKeywords.'actionKeywords.Notification.assertNotifyInfo'("widget")

WebUI.comment('Click on Notify Loading')
CustomKeywords.'actionKeywords.Notification.clicktNotifyLoading'()

WebUI.comment('Assert Notify Loading and its background-color')
CustomKeywords.'actionKeywords.Notification.assertNotifyLoading'("widget")

WebUI.comment('Click on Notify Warning')
CustomKeywords.'actionKeywords.Notification.clickNotifyWarning'()

WebUI.comment('Assert Notify Warning and its background-color')
CustomKeywords.'actionKeywords.Notification.assertNotifyWarning'("widget")