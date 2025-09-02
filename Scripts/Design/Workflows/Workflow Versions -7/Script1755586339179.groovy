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

WebUI.comment('Workflow Versions -7')


String TEST_STEP= "CLICK ON THE MENU ITEM AND SELECT DESIGN"
CustomKeywords.'commonKeywords.CommonKeys.navigateToMenu'('Design')

TEST_STEP= "CLICK ON THE WORKFLOWS UNDER DESIGN"
CustomKeywords.'commonKeywords.CommonKeys.selectSubmenu'('Workflows')

TEST_STEP= "SELECT WORKFLOW FROM LEFT NAVIGATION"
CustomKeywords.'commonKeywords.CommonKeys.selectItemFromLeftPane'(GlobalVariable.workflowNameGlobal)

TEST_STEP= "VERIFY THE WORKFLOW OPENED SUCCESSFULLY"
CustomKeywords.'workflowKeywords.WorkflowsKeys.verifyWorkflowOpenedSuccessfully'(GlobalVariable.workflowNameGlobal)

TEST_STEP= "SELECT GROUPS TAB UNDER WORKFLOW"
CustomKeywords.'workflowKeywords.WorkflowsKeys.selectTabUnderWorkflow'('Groups')

TEST_STEP= "CLICK ON DELETE ICON AGAINST THE GROUPNAME"
CustomKeywords.'workflowKeywords.WorkflowsKeys.clickDeleteIconGroupname'(GlobalVariable.groupNameGlobal)

TEST_STEP= "CLICK ON SAVE BUTTON"
CustomKeywords.'workflowKeywords.WorkflowsKeys.clickOnSaveButtonWorkflow_Groups'()

TEST_STEP= "VERIFY THE TOAST MESSAGE FOR SAVE CHANGES"
CustomKeywords.'commonKeywords.CommonKeys.verifyToastMessage'('Changes saved')

TEST_STEP= "CLICK ON THE MENU ITEM AND SELECT Users, Groups & Licences"
CustomKeywords.'commonKeywords.CommonKeys.navigateToMenu'('Users, Groups & Licences')

TEST_STEP= "CLICK ON THE GROUPS UNDER Users, Groups & Licences"
CustomKeywords.'commonKeywords.CommonKeys.selectSubmenu'('Groups')

TEST_STEP= "SELECT GROUP FROM LEFT NAVIGATION"
CustomKeywords.'commonKeywords.CommonKeys.selectItemFromLeftPane'(GlobalVariable.groupNameGlobal)

TEST_STEP= "VERIFY THE WORKFLOW NAME IN THE WORKFLOW CONTAINER UNDER GROUPS"
CustomKeywords.'groupKeywords.GroupKeys.verifyWorkflowNotPresentInTheList'(GlobalVariable.workflowNameGlobal)
