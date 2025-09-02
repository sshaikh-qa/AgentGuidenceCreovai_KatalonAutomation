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

WebUI.comment('Workflow Versions -1')

String TEST_STEP= "CLICK ON THE MENU ITEM AND SELECT DESIGN"
CustomKeywords.'commonKeywords.CommonKeys.navigateToMenu'('Design')

TEST_STEP= "CLICK ON THE WORKFLOWS UNDER DESIGN"
CustomKeywords.'commonKeywords.CommonKeys.selectSubmenu'('Workflows')

TEST_STEP= "SELECT WORKFLOW FROM LEFT NAVIGATION"
//CustomKeywords.'workflowKeywords.WorkflowsKeys.selectWorkflowleftNav'(GlobalVariable.workflowNameGlobal)
CustomKeywords.'commonKeywords.CommonKeys.selectItemFromLeftPane'(GlobalVariable.workflowNameGlobal)

TEST_STEP= "VERIFY THE WORKFLOW OPENED SUCCESSFULLY"
CustomKeywords.'workflowKeywords.WorkflowsKeys.verifyWorkflowOpenedSuccessfully'(GlobalVariable.workflowNameGlobal)

TEST_STEP= "VERIFY THE VERSION DELETE BUTTON IS PRESENT"
CustomKeywords.'workflowKeywords.WorkflowsKeys.verifyVersionButtonsPresence'('Delete')

TEST_STEP= "VERIFY THE VERSION EDIT BUTTON IS PRESENT"
CustomKeywords.'workflowKeywords.WorkflowsKeys.verifyVersionButtonsPresence'('Edit')

TEST_STEP= "VERIFY THE DUPLICATE VERSION BUTTON IS PRESENT"
CustomKeywords.'workflowKeywords.WorkflowsKeys.verifyVersionButtonsPresence'('Duplicate Version')

TEST_STEP= "VERIFY THE VERSION DELETE BUTTON IS DISABLED"
CustomKeywords.'workflowKeywords.WorkflowsKeys.verifyVersionButtonsState'('Delete', 'Disabled')

TEST_STEP= "VERIFY THE VERSION EDIT BUTTON IS DISABLED"
CustomKeywords.'workflowKeywords.WorkflowsKeys.verifyVersionButtonsState'('Edit', 'Disabled')

TEST_STEP= "SELECT THE VERSION FROM THE LIST Version 001"
CustomKeywords.'workflowKeywords.WorkflowsKeys.selectVersionFromList'('Version 001')

TEST_STEP= "VERIFY THE VERSION DELETE BUTTON IS DISABLED AS ONLY Version 001 IS PRESENT IN THE LIST "
CustomKeywords.'workflowKeywords.WorkflowsKeys.verifyVersionButtonsState'('Delete', 'Disabled')

TEST_STEP= "VERIFY THE VERSION EDIT BUTTON IS ENABLED"
CustomKeywords.'workflowKeywords.WorkflowsKeys.verifyVersionButtonsState'('Edit', 'Enabled')


