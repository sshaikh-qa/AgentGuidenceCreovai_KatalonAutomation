package workflowKeywords

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import org.openqa.selenium.WebDriver
import org.openqa.selenium.interactions.Actions
import com.kms.katalon.core.webui.driver.DriverFactory
import org.openqa.selenium.WebElement
import java.text.SimpleDateFormat

import internal.GlobalVariable

public class WorkflowsKeys {

	commonKeywords.CommonKeys commKey = new commonKeywords.CommonKeys()

//	@Keyword
//	def selectWorkflowleftNav(String workflowName) {
//		TestObject workflowLeftNav = findTestObject('Object Repository/CommonXpaths/LeftPane_ItemName', [('workflowName') : workflowName])
//		commKey.mouseOverandClick(workflowLeftNav)
//		WebUI.takeFullPageScreenshot()
//	}



	@Keyword
	def clickOnButtonWorkflow_SaveOrDelete(String btnName) {
		TestObject iframe = findTestObject('Object Repository/CommonXpaths/iframe_main')
		WebUI.switchToFrame(iframe, GlobalVariable.timeOut)
		commKey.mouseOverandClick(findTestObject('Object Repository/Design/Workflows/workflowSaveAndDelete_btn_dynamic', [('btnText') : btnName]))
		WebUI.takeFullPageScreenshot()
		WebUI.switchToDefaultContent()
	}

	@Keyword
	def clickOnDeleteConfirmationButton(String btnName) {
		//TestObject iframe = findTestObject('Object Repository/CommonXpaths/iframe_main')
		//WebUI.switchToFrame(iframe, GlobalVariable.timeOut)
		commKey.mouseOverandClick(findTestObject('Object Repository/Design/Workflows/clickOnButton_WorkflowVersion_DeleteConfirmation_DynamicBtn', [('btnText') : btnName]))
		WebUI.takeFullPageScreenshot()
		//WebUI.switchToDefaultContent()
	}

	@Keyword
	def clickOnButtonWorkflow_VersionDeleteEditDuplicate(String btnName) {
		TestObject iframe = findTestObject('Object Repository/CommonXpaths/iframe_main')
		WebUI.switchToFrame(iframe, GlobalVariable.timeOut)

		// Map to correct buttonId
		String buttonId = ""
		switch(btnName.toLowerCase().trim()) {
			case "edit":
				buttonId = "editVersion"
				break

			case "delete":
				buttonId = "deleteVersion"
				break

			case "duplicate":
			case "duplicate version":
			case "duplicateversion":   // also handling if someone passes without space
				buttonId = "newVersion"
				break

			default:
				throw new IllegalArgumentException("Invalid buttonType: use 'edit', 'delete', or 'duplicate'")
		}

		commKey.mouseOverandClick(findTestObject('Object Repository/Design/Workflows/workflow_versionDeleteEditDuplicate_dynamic_btn', [('buttonId') : buttonId]))

		// Step 1: Capture the time when version is created
		// Step 1: Capture current system timestamp in UK timezone
		Date now = new Date()
		// Define formatter with UK timezone
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss")
		sdf.setTimeZone(TimeZone.getTimeZone("Europe/London"))
		// Expected timestamp in UK timezone
		String expectedDateTime = sdf.format(now)
		println("Expected DateTime at creation (UK timezone): " + expectedDateTime)

		WebUI.takeFullPageScreenshot()
		WebUI.switchToDefaultContent()
	}

	@Keyword
	def assertDialogueBoxClosed() {
		WebUI.verifyElementNotPresent(findTestObject('Object Repository/CommonXpaths/AddNewWorkflow_DialogueBox'), GlobalVariable.timeOut)
		WebUI.takeFullPageScreenshot()
	}

	@Keyword
	def assertAddWorkflowDialogueBoxOpened() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/CommonXpaths/AddNewWorkflow_DialogueBox'), GlobalVariable.timeOut)
		WebUI.takeFullPageScreenshot()
	}

	@Keyword
	def assertAddWorkflowNameTextboxIsBlank() {
		TestObject nameTextbox = findTestObject('Object Repository/CommonXpaths/Add_Name_textbox')
		commKey.verifyTextboxIsEmpty(nameTextbox)
		WebUI.takeFullPageScreenshot()
	}

	@Keyword
	def assertWorkflowNameTextboxIsBlank() {
		TestObject iframe = findTestObject('Object Repository/CommonXpaths/iframe_main')
		WebUI.switchToFrame(iframe, GlobalVariable.timeOut)
		TestObject nameTextbox = findTestObject('Object Repository/Design/Workflows/workflowName_textbox', [('namefield') : GlobalVariable.workflowNameGlobal])
		commKey.verifyTextboxIsEmpty(nameTextbox)
		WebUI.takeFullPageScreenshot()
		WebUI.switchToDefaultContent()
	}

	@Keyword
	def selectVersionFromList(String versionName) {
		TestObject iframe = findTestObject('Object Repository/CommonXpaths/iframe_main')
		WebUI.switchToFrame(iframe, GlobalVariable.timeOut)
		TestObject versionNumber = findTestObject('Object Repository/Design/Workflows/workflow_version_number', [('version') : versionName])
		commKey.mouseOverandClick(versionNumber)
		WebUI.takeFullPageScreenshot()
		WebUI.switchToDefaultContent()
	}
	
	@Keyword
	def selectTabUnderWorkflow(String tabName) {
		String normalizedTabName = tabName.toLowerCase().capitalize()
		TestObject iframe = findTestObject('Object Repository/CommonXpaths/iframe_main')
		WebUI.switchToFrame(iframe, GlobalVariable.timeOut)
		TestObject tabNameObj = findTestObject('Object Repository/Design/Workflows/workflow_dynamic_tabs', [('linkText') : normalizedTabName])
		commKey.mouseOverandClick(tabNameObj)
		WebUI.takeFullPageScreenshot()
		WebUI.switchToDefaultContent()
	}
	
	@Keyword
	def clickDeleteIconGroupname(String groupName) {		
		TestObject iframe = findTestObject('Object Repository/CommonXpaths/iframe_main')
		WebUI.switchToFrame(iframe, GlobalVariable.timeOut)
		TestObject tabNameObj = findTestObject('Object Repository/Design/Workflows/Groups/workflow_Groups_dynamic_workflowRedcrossIcon', [('groupName') : groupName])
		commKey.mouseOverandClick(tabNameObj)
		WebUI.takeFullPageScreenshot()
		WebUI.switchToDefaultContent()
	}
	
	@Keyword
	def selectGroupFromGrouplistUnderWorkflow(String groupName) {
		
		//TestObject iframe = findTestObject('Object Repository/CommonXpaths/iframe_main')
		//WebUI.switchToFrame(iframe, GlobalVariable.timeOut)
		TestObject groupNameObj = findTestObject('Object Repository/Design/Workflows/Groups/workflow_Groups_Dynamic_groupList', [('groupName') : groupName])
		commKey.mouseOverandClick(groupNameObj)
		WebUI.takeFullPageScreenshot()
		//WebUI.switchToDefaultContent()
	}
	
	
	
	@Keyword
	def clickOnButtonWorkflow_Groups_GroupList_AddCancel(String btnName) {
		//TestObject iframe = findTestObject('Object Repository/CommonXpaths/iframe_main')
		//WebUI.switchToFrame(iframe, GlobalVariable.timeOut)
		commKey.mouseOverandClick(findTestObject('Object Repository/Design/Workflows/Groups/workflow_Groups_Dynamic_AddCancelBtn', [('btnName') : btnName]))
		WebUI.takeFullPageScreenshot()
		//WebUI.switchToDefaultContent()
	}
	
	
	
	@Keyword
	def clickOnSaveButtonWorkflow_Groups() {
		TestObject iframe = findTestObject('Object Repository/CommonXpaths/iframe_main')
		WebUI.switchToFrame(iframe, GlobalVariable.timeOut)
		commKey.mouseOverandClick(findTestObject('Object Repository/Design/Workflows/Groups/workflow_Groups_Save_Btn'))
		WebUI.takeFullPageScreenshot()
		WebUI.switchToDefaultContent()
	}
	
	
	@Keyword
	def clickOnSelectButtonUnderGroupTab() {
		
		TestObject iframe = findTestObject('Object Repository/CommonXpaths/iframe_main')
		WebUI.switchToFrame(iframe, GlobalVariable.timeOut)
		TestObject selectBtn = findTestObject('Object Repository/Design/Workflows/Groups/workflow_Groups_Select_btn')
		commKey.mouseOverandClick(selectBtn)
		WebUI.takeFullPageScreenshot()
		WebUI.switchToDefaultContent()
	}

	@Keyword
	def verifyVersionIsSelected(String versionName) {
		//Verify version is selected
		TestObject iframe = findTestObject('Object Repository/CommonXpaths/iframe_main')
		WebUI.switchToFrame(iframe, GlobalVariable.timeOut)
		String xpath = "//div[contains(@class,'CSSelectionListItem') and contains(@class,'Selected')]//div[@class='Left' and normalize-space(text())='" + versionName + "']"
		TestObject selectedVersion = new TestObject("dynamicSelectedVersion")
		selectedVersion.addProperty("xpath", ConditionType.EQUALS, xpath)
		WebUI.verifyElementPresent(selectedVersion, GlobalVariable.timeOut)
		WebUI.takeFullPageScreenshot()
		WebUI.switchToDefaultContent()
	}

	@Keyword
	def verifyEditVersionPageOpenedSuccessfully(String versionName) {
		TestObject pageTitle = findTestObject(
				'Object Repository/Design/Workflows/workflow_Version_EditPage_Title',
				[('workflowName') : GlobalVariable.workflowNameGlobal, ('version') : versionName]
				)
		// Get actual title text
		String actualTitle = WebUI.getText(pageTitle)
		println("Actual Title: " + actualTitle)
		String expectedTitle = "Designer - ${GlobalVariable.workflowNameGlobal} - ${versionName}"
		WebUI.verifyMatch(actualTitle, expectedTitle, false)
		WebUI.comment('The workflow name and version matches with the title.')
		WebUI.takeFullPageScreenshot()
	}

	@Keyword
	def verifyVersionButtonsPresence(String buttonType) {
		TestObject iframe = findTestObject('Object Repository/CommonXpaths/iframe_main')
		WebUI.switchToFrame(iframe, GlobalVariable.timeOut)

		// Map to correct buttonId
		String buttonId = ""
		switch(buttonType.toLowerCase().trim()) {
			case "edit":
				buttonId = "editVersion"
				break

			case "delete":
				buttonId = "deleteVersion"
				break

			case "duplicate":
			case "duplicate version":
			case "duplicateversion":   // also handling if someone passes without space
				buttonId = "newVersion"
				break

			default:
				throw new IllegalArgumentException("Invalid buttonType: use 'edit', 'delete', or 'duplicate'")
		}

		TestObject nameTextbox = findTestObject('Object Repository/Design/Workflows/workflow_versionDeleteEditDuplicate_dynamic_btn', [('buttonId') : buttonId])

		WebUI.verifyElementPresent(nameTextbox, GlobalVariable.timeOut)
		WebUI.takeFullPageScreenshot()
		WebUI.switchToDefaultContent()
	}
	


	@Keyword
	def verifyNewVersionAddedToTheList(String versionName) {
		TestObject toastMessage = new TestObject('dynamicToastMessage')
		toastMessage.addProperty('xpath', ConditionType.EQUALS, "//div[contains(@class,'cs-toast')]//p[contains(@class,'cs-toast-message')]")
		WebUI.verifyElementText(toastMessage, "Item added")
		WebUI.takeFullPageScreenshot()

		TestObject iframe = findTestObject('Object Repository/CommonXpaths/iframe_main')
		WebUI.switchToFrame(iframe, GlobalVariable.timeOut)
		TestObject versionNumber = findTestObject('Object Repository/Design/Workflows/workflow_version_number', [('version') : versionName])
		//Verify version is present in the list.
		WebUI.verifyElementPresent(versionNumber, GlobalVariable.timeOut)
		WebUI.comment(versionName + ' IS ADDED TO THE LIST')
		WebUI.takeFullPageScreenshot()
		WebUI.switchToDefaultContent()
	}

	@Keyword
	def verifyDeletedVersionIsNotPfresentInTheList(String versionName) {
		TestObject toastMessage = new TestObject('dynamicToastMessage')
		toastMessage.addProperty('xpath', ConditionType.EQUALS, "//div[contains(@class,'cs-toast')]//p[contains(@class,'cs-toast-message')]")
		//WebUI.waitForElementVisible(toastMessage, GlobalVariable.timeOut)
		WebUI.verifyElementText(toastMessage, "Item deleted")
		WebUI.takeFullPageScreenshot()

		TestObject iframe = findTestObject('Object Repository/CommonXpaths/iframe_main')
		WebUI.switchToFrame(iframe, GlobalVariable.timeOut)
		TestObject versionNumber = findTestObject('Object Repository/Design/Workflows/workflow_version_number', [('version') : versionName])
		//Verify version is present in the list.

		WebUI.verifyElementNotPresent(versionNumber, GlobalVariable.timeOut)
		WebUI.comment(versionName + ' IS DELETED FROM THE LIST')
		WebUI.takeFullPageScreenshot()
		WebUI.switchToDefaultContent()
	}

	@Keyword
	def verifyNewVersionAddedWithTimeDateUsername(String versionName) {
		TestObject iframe = findTestObject('Object Repository/CommonXpaths/iframe_main')
		WebUI.switchToFrame(iframe, GlobalVariable.timeOut)

		// Dynamic XPath for Date
		//String version = "Version 003"
		String expectedCreator = GlobalVariable.user_Details_Name

		// Step 1: Capture current system timestamp in UK timezone
		Date now = new Date()

		// Define formatter with UK timezone
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss")
		sdf.setTimeZone(TimeZone.getTimeZone("Europe/London"))
		String expectedLondon = sdf.format(now)

		sdf.setTimeZone(TimeZone.getTimeZone("UTC"))
		String expectedUTC = sdf.format(now)

		println("System Default TZ: " + TimeZone.getDefault().getID())
		println("Expected London (Europe/London): " + expectedLondon)
		println("Expected UTC: " + expectedUTC)
		// 👉 Step 2: Click duplicate button
		//WebUI.click(findTestObject('Object Repository/Design/Workflows/duplicate_button'))

		// Step 3: Wait for new version to appear
		//WebUI.delay(3)  // adjust based on app speed

		// Step 4: Build dynamic TestObjects
		TestObject dateTimeObj = new TestObject("dynamicDateTime")
		dateTimeObj.addProperty("xpath", ConditionType.EQUALS,
				"//div[@class='text'][div[@class='Left' and normalize-space(text())='" + versionName + "']]//div[@class='Right RightMargin Ellipsis' and @title='Date created']"
				)

		TestObject creatorObj = new TestObject("dynamicCreator")
		creatorObj.addProperty("xpath", ConditionType.EQUALS,
				"//div[@class='text'][div[@class='Left' and normalize-space(text())='" + versionName + "']]//div[@class='Right RightMargin Ellipsis' and not(@title)]"
				)

		// Step 5: Read values from UI
		String actualDateTime = WebUI.getText(dateTimeObj).trim()
		String actualCreator  = WebUI.getText(creatorObj).trim()

		println("UI shows => DateTime: " + actualDateTime + " | Creator: " + actualCreator)

		// Step 7: Validation logic (check both London & UTC)
		SimpleDateFormat parser = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss")
		parser.setTimeZone(TimeZone.getTimeZone("UTC"))  // parsing as plain string

		Date actualDate = parser.parse(actualDateTime)
		Date expectedDateLondon = parser.parse(expectedLondon)
		Date expectedDateUTC    = parser.parse(expectedUTC)

		// check both with tolerance
		long diffLondon = Math.abs((actualDate.time - expectedDateLondon.time) / 1000)
		long diffUTC    = Math.abs((actualDate.time - expectedDateUTC.time) / 1000)

		if (diffLondon <= 5) {
			WebUI.comment("✅ DateTime matches London (BST/GMT) within tolerance (" + diffLondon + "s)")
		} else if (diffUTC <= 5) {
			WebUI.comment("✅ DateTime matches UTC within tolerance (" + diffUTC + "s)")
		} else {
			WebUI.comment("❌ DateTime mismatch! UI: " + actualDateTime +
					" | Expected London: " + expectedLondon +
					" | Expected UTC: " + expectedUTC)
			WebUI.verifyEqual(actualDateTime, expectedLondon) // force fail
		}

		// Step 7: Validate creator
		WebUI.verifyEqual(actualCreator, expectedCreator)

		WebUI.takeFullPageScreenshot()
		WebUI.switchToDefaultContent()
	}

	@Keyword
	def verifyVersionButtonsState(String buttonType, String buttonState) {
		TestObject iframe = findTestObject('Object Repository/CommonXpaths/iframe_main')
		WebUI.switchToFrame(iframe, GlobalVariable.timeOut)

		// Map to correct buttonId
		String buttonId = ""
		switch(buttonType.toLowerCase().trim()) {
			case "edit":
				buttonId = "editVersion"
				break

			case "delete":
				buttonId = "deleteVersion"
				break

			case "duplicate":
			case "duplicate version":
			case "duplicateversion":   // also handling if someone passes without space
				buttonId = "newVersion"
				break

			default:
				throw new IllegalArgumentException("Invalid buttonType: use 'edit', 'delete', or 'duplicate'")
		}

		// Map state
		String status = ""
		switch(buttonState.toLowerCase()) {
			case "enabled":
				status = "and not(@disabled)"
				break
			case "disabled":
				status = "and @disabled"
				break
			case "any":
				status = ""
				break
		}

		TestObject versionButton = findTestObject('Object Repository/Design/Workflows/workflow_versionDeleteEditDuplicate_Status_dynamic_btn', [('buttonId') : buttonId, ('status') : status])
		String attr = WebUI.getAttribute(versionButton, "disabled")
		println "attr value is : ${attr}"
		WebUI.comment(attr + ' is the value for attr')
		if (attr.equalsIgnoreCase("false")) {
			println("Button is ENABLED")
			WebUI.comment(buttonType + ' Button is Enabled')
		} else {
			println("Button is DISABLED")
			WebUI.comment(buttonType + ' Button is Disabled')
		}
		WebUI.takeFullPageScreenshot()
		WebUI.switchToDefaultContent()
	}

	@Keyword
	def assertWorkflowNotesUpdated(String expectedText) {
		TestObject toastMessage = new TestObject('dynamicToastMessage')
		toastMessage.addProperty('xpath', ConditionType.EQUALS, "//div[contains(@class,'cs-toast')]//p[contains(@class,'cs-toast-message')]")
		WebUI.verifyElementText(toastMessage, "Changes saved")
		WebUI.takeFullPageScreenshot()

		//Click on the workflow from left navigation, to get the updated html dom
		TestObject workflowLeftNav = findTestObject('Object Repository/CommonXpaths/LeftPane_ItemName', [('workflowName') : GlobalVariable.workflowNameGlobal])
		commKey.mouseOverandClick(workflowLeftNav)

		TestObject iframe = findTestObject('Object Repository/CommonXpaths/iframe_main')
		WebUI.switchToFrame(iframe, GlobalVariable.timeOut)

		TestObject notesTextbox = findTestObject('Object Repository/Design/Workflows/workflowNotes_textbox')
		String notesText = WebUI.getText(notesTextbox)
		WebUI.verifyMatch(notesText.trim(), expectedText.trim(), false)
		WebUI.switchToDefaultContent()
	}

	@Keyword
	def verifyAddWorkflowNameTooltipMessage(String expectedError) {
		// Locate the textbox container div (has the tooltip data)
		TestObject txtBoxContainer = findTestObject('Object Repository/CommonXpaths/Add_Name_textbox')
		// Get the tooltip text from 'data-content' attribute
		TestObject toolTipMessage = findTestObject('Object Repository/Design/Workflows/AddNameFieldErrorMessage_dynamic', [('errorMsg') : expectedError])
		// Hover over the element
		WebUI.mouseOver(txtBoxContainer)
		// Optional: small delay to allow tooltip to appear
		WebUI.delay(1)
		String tooltipText = WebUI.getAttribute(toolTipMessage, 'data-content')
		// Verify tooltip text
		WebUI.verifyMatch(tooltipText.trim(), expectedError.trim(), false)
		WebUI.takeFullPageScreenshot()
		// Move mouse away to hide tooltip
		WebDriver driver = DriverFactory.getWebDriver()
		Actions actions = new Actions(driver)
		actions.moveByOffset(-100, -100).perform() // Move mouse to top-left corner
		WebUI.delay(1)
	}

	@Keyword
	def verifyWorkflowNameTooltipMessage(String expectedError) {
		TestObject iframe = findTestObject('Object Repository/CommonXpaths/iframe_main')
		WebUI.switchToFrame(iframe, GlobalVariable.timeOut)
		// Locate the textbox container div (has the tooltip data)
		TestObject txtBoxContainer = findTestObject('Object Repository/Design/Workflows/workflowName_textbox', [('namefield') : GlobalVariable.workflowNameGlobal])
		// Get the tooltip text from 'data-content' attribute
		TestObject toolTipMessage = findTestObject('Object Repository/Design/Workflows/WorkflowNameerrorMessage_dynamic', [('errorMessage') : expectedError])
		// Hover over the element
		WebUI.mouseOver(txtBoxContainer)

		//***********************
		WebElement element = WebUI.findWebElement(txtBoxContainer)
		Actions actions = new Actions(DriverFactory.getWebDriver())
		actions.moveToElement(element).perform()
		WebUI.delay(2)
		//***********************
		TestObject tooltip = new TestObject('dynamicTooltip')
		tooltip.addProperty('xpath', ConditionType.EQUALS, "//div[contains(@id,'popover')]")
		WebUI.waitForElementVisible(tooltip, 5)
		String tooltipText = WebUI.getText(tooltip)
		WebUI.verifyMatch(tooltipText.trim(), expectedError.trim(), false)
		WebUI.takeFullPageScreenshot()
		WebUI.switchToDefaultContent()
	}

	@Keyword
	def enterTextNameField(String Text) {
		commKey.clearTextfield(findTestObject('Object Repository/CommonXpaths/Add_Name_textbox'))
		WebUI.setText(findTestObject('Object Repository/CommonXpaths/Add_Name_textbox'), Text)
		WebUI.takeFullPageScreenshot()
	}

	@Keyword
	def enterworkflowName(String Text) {
		TestObject iframe = findTestObject('Object Repository/CommonXpaths/iframe_main')
		WebUI.switchToFrame(iframe, GlobalVariable.timeOut)

		TestObject workflowNameField = findTestObject('Object Repository/Design/Workflows/workflowName_textbox', [('namefield') : GlobalVariable.workflowNameGlobal])
		commKey.clearTextfield(workflowNameField)
		WebUI.setText(workflowNameField, Text)
		WebUI.takeFullPageScreenshot()
		WebUI.switchToDefaultContent()
	}

	@Keyword
	def enterworkflowNotes(String Text) {
		TestObject iframe = findTestObject('Object Repository/CommonXpaths/iframe_main')
		WebUI.switchToFrame(iframe, GlobalVariable.timeOut)

		TestObject workflowNotesField = findTestObject('Object Repository/Design/Workflows/workflowNotes_textbox')
		commKey.clearTextfield(workflowNotesField)
		WebUI.setText(workflowNotesField, Text)
		WebUI.takeFullPageScreenshot()
		WebUI.switchToDefaultContent()
	}

	@Keyword
	def deleteWorkflow(String btnText) {
		commKey.mouseOverandClick(findTestObject('Object Repository/Design/Workflows/workflowSaveAndDelete_btn_dynamic', [('btnText') : btnText]))
		WebUI.delay(1)
		WebUI.takeFullPageScreenshot()
		commKey.mouseOverandClick(findTestObject('Object Repository/Design/Workflows/workflowDeleteConfirmation_btn'))
	}

	@Keyword
	def verifyWorkflowAddedSuccessfully(String workflowName) {
		TestObject toastMessage = new TestObject('dynamicToastMessage')
		toastMessage.addProperty('xpath', ConditionType.EQUALS, "//div[contains(@class,'cs-toast')]//p[contains(@class,'cs-toast-message')]")
		WebUI.verifyElementText(toastMessage, "Item added")

		//Verify the workflow is present in left navigation
		TestObject workflowLeftNav = findTestObject('Object Repository/CommonXpaths/LeftPane_ItemName', [('itemName') : workflowName])
		WebUI.waitForElementVisible(workflowLeftNav,GlobalVariable.timeOut)
		WebUI.verifyElementPresent(workflowLeftNav, GlobalVariable.timeOut)

		TestObject iframe = findTestObject('Object Repository/CommonXpaths/iframe_main')
		WebUI.switchToFrame(iframe, GlobalVariable.timeOut)

		TestObject workflowNameField = findTestObject('Object Repository/Design/Workflows/workflowName_textbox', [('namefield') : workflowName])
		WebUI.waitForElementVisible(workflowNameField,GlobalVariable.timeOut)
		WebUI.verifyElementPresent(workflowNameField, GlobalVariable.timeOut)

		//Verify the workflow heading is same as newly added workflow
		TestObject workflowNameheading = findTestObject('Object Repository/Design/Workflows/workflowName_heading', [('name') : workflowName])
		WebUI.waitForElementVisible(workflowNameheading,GlobalVariable.timeOut)
		WebUI.verifyElementPresent(workflowNameheading, GlobalVariable.timeOut)
		WebUI.takeFullPageScreenshot()
		WebUI.switchToDefaultContent()
	}

	@Keyword
	def verifyWorkflowPresenceLeftNavigation(String workflowName) {
		//Verify the workflow is present in left navigation
		TestObject workflowLeftNav = findTestObject('Object Repository/CommonXpaths/LeftPane_ItemName', [('workflowName') : workflowName])
		WebUI.waitForElementVisible(workflowLeftNav,GlobalVariable.timeOut)
		WebUI.verifyElementPresent(workflowLeftNav, GlobalVariable.timeOut)
	}

	@Keyword
	def verifyWorkflowOpenedSuccessfully(String workflowName) {
		TestObject iframe = findTestObject('Object Repository/CommonXpaths/iframe_main')
		WebUI.switchToFrame(iframe, GlobalVariable.timeOut)

		TestObject workflowNameField = findTestObject('Object Repository/Design/Workflows/workflowName_textbox', [('namefield') : workflowName])
		WebUI.verifyElementPresent(workflowNameField, GlobalVariable.timeOut)
		//Verify the workflow heading.
		TestObject workflowNameheading = findTestObject('Object Repository/Design/Workflows/workflowName_heading', [('name') : workflowName])
		WebUI.waitForElementVisible(workflowNameheading,GlobalVariable.timeOut)
		WebUI.verifyElementPresent(workflowNameheading, GlobalVariable.timeOut)
		WebUI.takeFullPageScreenshot()
		WebUI.switchToDefaultContent()
	}
}
