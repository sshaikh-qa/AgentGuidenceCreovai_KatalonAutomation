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

WebUI.comment('Add workflow 1')

//1)Click on the add new workflow button
//2)click on the cancel button


String TEST_STEP= "CLICK ON THE MENU ITEM AND SELECT DESIGN"
CustomKeywords.'commonKeywords.CommonKeys.navigateToMenu'('Design')

TEST_STEP= "CLICK ON THE WORKFLOWS UNDER DESIGN"
CustomKeywords.'commonKeywords.CommonKeys.selectSubmenu'('Workflows')

TEST_STEP= "CLICK ON THE ADD NEW WORKFLOW BUTTON" 
CustomKeywords.'commonKeywords.CommonKeys.clickOnAddPlusIcon'('Add workflow')

TEST_STEP= "Verify ADD NEW WORKFLOW DIALOGUE BOX IS OPENED"
CustomKeywords.'workflowKeywords.WorkflowsKeys.assertAddWorkflowDialogueBoxOpened'()

TEST_STEP= "Verify NAME TEXTBOX IS BLANK"
CustomKeywords.'workflowKeywords.WorkflowsKeys.assertWorkflowNameTextboxIsBlank'()

TEST_STEP= "CLICK ON THE CANCEL BUTTON"
CustomKeywords.'commonKeywords.CommonKeys.clickOnButton_Add_AddCancel_dynamic_btn'('Cancel')

TEST_STEP= "Verify ADD NEW WORKFLOW DIALOGUE BOX IS CLOSED" 
CustomKeywords.'workflowKeywords.WorkflowsKeys.assertDialogueBoxClosed'()
