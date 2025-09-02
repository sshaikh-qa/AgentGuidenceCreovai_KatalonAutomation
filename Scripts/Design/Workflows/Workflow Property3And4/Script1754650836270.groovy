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

WebUI.comment('Workflow property -3 and 4')

String TEST_STEP= "CLICK ON THE MENU ITEM AND SELECT DESIGN"
CustomKeywords.'commonKeywords.CommonKeys.navigateToMenu'('Design')

TEST_STEP= "CLICK ON THE WORKFLOWS UNDER DESIGN"
CustomKeywords.'commonKeywords.CommonKeys.selectSubmenu'('Workflows')

TEST_STEP= "SELECT WORKFLOW FROM LEFT NAVIGATION"
//CustomKeywords.'workflowKeywords.WorkflowsKeys.selectWorkflowleftNav'(GlobalVariable.workflowNameGlobal)
CustomKeywords.'commonKeywords.CommonKeys.selectItemFromLeftPane'(GlobalVariable.workflowNameGlobal)

TEST_STEP= "VERIFY THE WORKFLOW OPENED SUCCESSFULLY"
CustomKeywords.'workflowKeywords.WorkflowsKeys.verifyWorkflowOpenedSuccessfully'(GlobalVariable.workflowNameGlobal)

TEST_STEP="ENTER '1Workflowtest ' WITH A TRAILING SPACE"
String textTrailing = "1Workflowtest   "
CustomKeywords.'workflowKeywords.WorkflowsKeys.enterworkflowName'(textTrailing)

TEST_STEP= "CLICK ON THE SAVE BUTTON"
CustomKeywords.'workflowKeywords.WorkflowsKeys.clickOnButtonWorkflow_SaveOrDelete'('Save')

TEST_STEP= "VERIFY ON MOUSE HOVER OVER THE TEXTBOX - This field cannot start or end with a space - POPUP APPEARED"
CustomKeywords.'workflowKeywords.WorkflowsKeys.verifyWorkflowNameTooltipMessage'('This field cannot start or end with a space')

TEST_STEP="ENTER ' Workflow test' WITH A LEADING SPACE"
String textLeading = "  1Workflow test"
CustomKeywords.'workflowKeywords.WorkflowsKeys.enterworkflowName'(textLeading)

TEST_STEP= "CLICK ON THE SAVE BUTTON"
CustomKeywords.'workflowKeywords.WorkflowsKeys.clickOnButtonWorkflow_SaveOrDelete'('Save')

TEST_STEP= "VERIFY ON MOUSE HOVER OVER THE TEXTBOX - This field cannot start or end with a space - POPUP APPEARED"
CustomKeywords.'workflowKeywords.WorkflowsKeys.verifyWorkflowNameTooltipMessage'('This field cannot start or end with a space')
