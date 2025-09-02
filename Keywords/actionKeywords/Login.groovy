package actionKeywords

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
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class Login {
	commonKeywords.CommonKeys commKey = new commonKeywords.CommonKeys()

	@Keyword
	def verifyLoginPageUIElements() {

		String pageURL = WebUI.getUrl()
		WebUI.takeFullPageScreenshot()
		String pageTitle = WebUI.getWindowTitle()
		WebUI.verifyMatch(pageURL, '.*login\\?ReturnUrl=%2f.*', true)
		WebUI.comment('pageTitle is' +pageTitle)
		WebUI.delay(GlobalVariable.wait)
		WebUI.takeFullPageScreenshotAsCheckpoint("Login_Page")
		//WebUI.verifyElementPresent(findTestObject('Object Repository/LoginPage/img_Logo'), GlobalVariable.timeOut)
		WebUI.verifyElementPresent(findTestObject('Object Repository/LoginPage/companyCopyRight'), GlobalVariable.timeOut)
	}

	@Keyword
	def login(String username,String password) {
		commKey.navigateToLoginPage()
		enterUsername(username)
		enterPassword(password)
		verifySuccessfulLogin()
	}

	@Keyword
	def logout_bk() {


		commKey.mouseOverandClick(findTestObject('Object Repository/LoginPage/openUserArrow'))
		WebUI.takeFullPageScreenshot()
		commKey.mouseOverandClick(findTestObject('Object Repository/LoginPage/logout'))
		commKey.mouseOverandClick(findTestObject('Object Repository/LoginPage/button_Logout'))
		WebUI.takeFullPageScreenshot()
		WebUI.waitForElementPresent(findTestObject('Object Repository/LoginPage/img_Logo'), GlobalVariable.timeOut)
		WebUI.verifyElementPresent(findTestObject('Object Repository/LoginPage/text_Username'), GlobalVariable.timeOut)
	}

	@Keyword
	def logout() {
		commKey.mouseOverandClick(findTestObject('Object Repository/LoginPage/userDetails_arrow'))
		WebUI.delay(2)
		WebUI.takeFullPageScreenshot()
		commKey.mouseOverandClick(findTestObject('Object Repository/LoginPage/img_Logout'))
		commKey.mouseOverandClick(findTestObject('Object Repository/LoginPage/button_Logout'))
		WebUI.delay(2)
		WebUI.takeFullPageScreenshot()
		WebUI.waitForElementPresent(findTestObject('Object Repository/LoginPage/img_Logo'), GlobalVariable.timeOut)
		WebUI.verifyElementPresent(findTestObject('Object Repository/LoginPage/text_Username'), GlobalVariable.timeOut)
	}

	@Keyword
	def enterUsername(String username) {

		commKey.clearTextfield(findTestObject('Object Repository/LoginPage/text_Username'))
		WebUI.setText(findTestObject('Object Repository/LoginPage/text_Username'), username)
		commKey.mouseOverandClick(findTestObject('Object Repository/LoginPage/button_Continue'))
		WebUI.waitForPageLoad(GlobalVariable.timeOut)
		WebUI.takeFullPageScreenshot()
	}

	@Keyword
	def enterPassword(String password) {

		WebUI.verifyElementPresent(findTestObject('Object Repository/LoginPage/text_Password'), GlobalVariable.timeOut)
		commKey.clearTextfield(findTestObject('Object Repository/LoginPage/text_Password'))
		//WebUI.setEncryptedText(findTestObject('Object Repository/LoginPage/text_Password'), password)
		WebUI.setText(findTestObject('Object Repository/LoginPage/text_Password'), password)
		commKey.mouseOverandClick(findTestObject('Object Repository/LoginPage/button_Login'))
		WebUI.waitForPageLoad(GlobalVariable.timeOut)
	}


	@Keyword
	def verifyLoginWithCorrectPassword(String password) {

		enterPassword(password)
		WebUI.takeFullPageScreenshot()
		WebUI.verifyTextNotPresent('Username / password combination is incorrect', false)
	}

	@Keyword
	def verifyLoginWithIncorrectPassword(String inCorrectPassword) {

		enterPassword(inCorrectPassword)
		WebUI.takeFullPageScreenshot()
		WebUI.verifyTextPresent('Username / password combination is incorrect', false)
	}

	@Keyword
	def verifyLoginWithValidUsername(String username) {

		enterUsername(username)
		WebUI.takeFullPageScreenshot()
		WebUI.verifyTextNotPresent('A username is required to log in', false)
		WebUI.verifyElementPresent(findTestObject('Object Repository/LoginPage/text_Password'), GlobalVariable.timeOut)
	}

	@Keyword
	def verifyLoginWithInValidUsername(String invalidUsername) {

		enterUsername(invalidUsername)
		WebUI.takeFullPageScreenshot()
		WebUI.verifyTextPresent("A user with the username '"+invalidUsername+"' does not exist", false)
	}

	@Keyword
	def verifyLoginWithoutUsername() {

		commKey.mouseOverandClick(findTestObject('Object Repository/LoginPage/button_Continue'))
		WebUI.waitForPageLoad(GlobalVariable.timeOut)
		WebUI.takeFullPageScreenshot()
		WebUI.verifyTextPresent('A username is required to log in', false)
	}

	@Keyword
	def verifyLoginWithoutPassword() {

		WebUI.verifyElementPresent(findTestObject('Object Repository/LoginPage/text_Password'), GlobalVariable.timeOut)
		WebUI.clearText(findTestObject('Object Repository/LoginPage/text_Password'))
		commKey.mouseOverandClick(findTestObject('Object Repository/LoginPage/button_Login'))
		WebUI.takeFullPageScreenshot()
		WebUI.verifyTextPresent('Username / password combination is incorrect', false)
	}

	@Keyword
	def verifySuccessfulLogin() {


		String successHomeUrl = WebUI.getUrl()
		WebUI.verifyMatch(successHomeUrl, GlobalVariable.loginURL +'/executer/desktop/', false)
		WebUI.waitForPageLoad(GlobalVariable.timeOut)
		String Name = GlobalVariable.user_Details_Name
		WebUI.delay(GlobalVariable.wait)
		WebUI.takeFullPageScreenshotAsCheckpoint("Post_Login_Desktop")
		WebUI.delay(GlobalVariable.wait)
		WebUI.verifyElementPresent(findTestObject('Object Repository/LoginPage/user_Validation', [('Name') : Name]), GlobalVariable.timeOut)
	}
}

/*
 *  The purpose of the code is to manage login functionalities and UI verifications for a login page.
 *
 *  1. Create an instance of CommonKeys to use its methods for navigation and element interaction.
 *  2. Define multiple methods to verify UI elements, handle login and logout processes, and check for valid and invalid login scenarios.
 *  3. Utilize WebUI methods to interact with the web elements, take screenshots, and verify the presence of elements and text on the login page.
 *
 */
