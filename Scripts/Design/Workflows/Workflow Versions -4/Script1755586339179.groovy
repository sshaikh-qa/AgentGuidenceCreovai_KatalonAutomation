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

WebUI.comment('Workflow Versions -4')

String TEST_STEP= "CLICK ON THE MENU ITEM AND SELECT DESIGN"
CustomKeywords.'commonKeywords.CommonKeys.navigateToMenu'('Design')

TEST_STEP= "CLICK ON THE WORKFLOWS UNDER DESIGN"
CustomKeywords.'commonKeywords.CommonKeys.selectSubmenu'('Workflows')

TEST_STEP= "SELECT WORKFLOW FROM LEFT NAVIGATION"

CustomKeywords.'commonKeywords.CommonKeys.selectItemFromLeftPane'(GlobalVariable.workflowNameGlobal)

TEST_STEP= "VERIFY THE WORKFLOW OPENED SUCCESSFULLY"
CustomKeywords.'workflowKeywords.WorkflowsKeys.verifyWorkflowOpenedSuccessfully'(GlobalVariable.workflowNameGlobal)

TEST_STEP= "VERIFY THE VERSION DELETE BUTTON IS DISABLED BEFORE THE VERSION IS SELECTED"
CustomKeywords.'workflowKeywords.WorkflowsKeys.verifyVersionButtonsState'('Delete', 'Disabled')

TEST_STEP= "CLICK ON THE DUPLICATE VERSION BUTTON"
CustomKeywords.'workflowKeywords.WorkflowsKeys.clickOnButtonWorkflow_VersionDeleteEditDuplicate'('Duplicate Version')

TEST_STEP= "VERIFY NEW VERSION IS ADDED TO THE LIST"
CustomKeywords.'workflowKeywords.WorkflowsKeys.verifyNewVersionAddedToTheList'('Version 002')

TEST_STEP= "VERIFY THE VERSION DELETE BUTTON IS ENABLED"
CustomKeywords.'workflowKeywords.WorkflowsKeys.verifyVersionButtonsState'('Delete', 'Enabled')

TEST_STEP= "CLICK ON THE DELETE VERSION BUTTON"
CustomKeywords.'workflowKeywords.WorkflowsKeys.clickOnButtonWorkflow_VersionDeleteEditDuplicate'('Delete')

TEST_STEP= "CLICK ON THE DELETE CONFIRMATION BUTTON"
CustomKeywords.'workflowKeywords.WorkflowsKeys.clickOnDeleteConfirmationButton'('Delete')

TEST_STEP= "VERIFY THE VERSION SELECTED IS DELETED FROM THE LIST"
CustomKeywords.'workflowKeywords.WorkflowsKeys.verifyDeletedVersionIsNotPfresentInTheList'('Version 002')










