package commonKeywords
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.annotation.Keyword

import java.text.DateFormat;
import java.text.Format;
import java.text.SimpleDateFormat;

import org.openqa.selenium.StaleElementReferenceException
import org.openqa.selenium.WebElement
import com.kms.katalon.core.model.FailureHandling

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.common.WebUiCommonHelper
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import java.time.Instant
import java.time.format.DateTimeFormatter
import java.time.ZoneOffset
import java.time.temporal.ChronoUnit
import internal.GlobalVariable
import groovy.json.JsonSlurper
import groovy.json.JsonOutput
import org.openqa.selenium.WebDriver
import org.openqa.selenium.interactions.Actions
import com.kms.katalon.core.testobject.ConditionType



public class CommonKeys {

	//workflowKeywords.WorkflowsKeys wrkflowKey = new workflowKeywords.WorkflowsKeys()

	TestData loginData
	@Keyword
	def setupBrowserWithPrefs() {
		//WebDriver driver = DriverFactory.getWebDriver()
		String driverType = DriverFactory.getExecutedBrowser().getName()
		String downloadFilePath = RunConfiguration.getProjectDir() + "/downloads"

		Map<String, Object> prefs = [:]
		prefs.put("download.default_directory", downloadFilePath)
		prefs.put("download.prompt_for_download", false)
		prefs.put("profile.default_content_setting_values.automatic_downloads", 1)
		prefs.put("credentials_enable_service", false)
		prefs.put("profile.password_manager_enabled", false)
		prefs.put("profile.password_manager_leak_detection_enabled", false)
		prefs.put("password_manager_leak_detection_enabled", false)

		if (driverType == 'HEADLESS_DRIVER') {
			RunConfiguration.setWebDriverPreferencesProperty('args', [
				'--window-size=1366,768',
				'--incognito',
				'--disable-save-password-bubble',
				'--disable-features=PasswordManagerEnabled,PasswordLeakDetection'
			])
			RunConfiguration.setWebDriverPreferencesProperty('prefs', prefs)
		}

		if (driverType == 'CHROME_DRIVER') {
			RunConfiguration.setWebDriverPreferencesProperty('prefs', prefs)
			RunConfiguration.setWebDriverPreferencesProperty('args', [
				'--start-maximized',
				'--incognito',
				'--disable-save-password-bubble',
				'--disable-features=BiDiMapper,PasswordManagerEnabled,PasswordLeakDetection'
			])
			RunConfiguration.setWebDriverPreferencesProperty('excludeSwitches', ['enable-automation'])
		}

		if (driverType == 'FIREFOX_DRIVER') {
			Map<String, Object> ffPrefs = [:]
			ffPrefs.put("browser.download.dir", downloadFilePath)
			ffPrefs.put("browser.download.folderList", 2)
			ffPrefs.put("browser.download.useDownloadDir", true)
			ffPrefs.put("browser.helperApps.neverAsk.saveToDisk", "application/pdf,text/csv")
			ffPrefs.put("signon.rememberSignons", false)
			ffPrefs.put("signon.autofillForms", false)
			ffPrefs.put("signon.autologin.proxy", false)
			ffPrefs.put("signon.management.page.breach-alerts.enabled", false)
			ffPrefs.put("extensions.formautofill.addresses.enabled", false)
			ffPrefs.put("extensions.formautofill.creditCards.enabled", false)
			ffPrefs.put("browser.privatebrowsing.autostart", true) // incognito mode

			RunConfiguration.setWebDriverPreferencesProperty('args', [
				'--start-maximized',
				'--private',
				'--disable-save-password-bubble',
				'--disable-features=BiDiMapper,PasswordManagerEnabled,PasswordLeakDetection'
			])
			RunConfiguration.setWebDriverPreferencesProperty('prefs', ffPrefs)
		}
	}

	@Keyword
	def navigateToMenu(String menuName) {
		clickMenuIcon()
		clickMenuItem(menuName)
	}

	def clickMenuIcon() {
		mouseOverandClick(findTestObject('Object Repository/CommonXpaths/MenuIcon'))
		WebUI.takeFullPageScreenshot()
	}


	def clickMenuItem(String menuName) {
		
		 //Normalize HTML entity
		String normalizedMenuName = menuName.replace("&amp;", "&")
		
		String menuNameFinal
		if (normalizedMenuName.equalsIgnoreCase("Users, Groups & Licences")) {
			menuNameFinal = normalizedMenuName
		} else {
			menuNameFinal = normalizedMenuName.toUpperCase()
		}		

		mouseOverandClick(findTestObject('Object Repository/CommonXpaths/MenuItem', [('menuName') : menuNameFinal]))
		WebUI.takeFullPageScreenshot()
	}

	@Keyword
	def selectSubmenu(String submenu) {
		String normalizedSubmenuName = submenu.toLowerCase().capitalize()
		mouseOverandClick(findTestObject('Object Repository/CommonXpaths/SubMenuItem', [('submenuName') : normalizedSubmenuName]))
		WebUI.takeFullPageScreenshot()
	}
	
	@Keyword
	def selectItemFromLeftPane(String itemName) {
		TestObject itemLeftNav = findTestObject('Object Repository/CommonXpaths/LeftPane_ItemName', [('itemName') : itemName])
		mouseOverandClick(itemLeftNav)
		WebUI.takeFullPageScreenshot()
	}

	@Keyword
	def clickOnAddPlusIcon(String addName) {
		mouseOverandClick(findTestObject('Object Repository/CommonXpaths/AddNewPlusIcon_dynamic',[('addName') : addName]))
		WebUI.takeFullPageScreenshot()
	}


	@Keyword
	def navigateToLoginPage() {
		try {
			setupBrowserWithPrefs()
			WebUI.openBrowser('')
			WebUI.navigateToUrl(GlobalVariable.loginURL)
			WebUI.waitForPageLoad(GlobalVariable.timeOut)
			WebUI.verifyElementPresent(findTestObject('Object Repository/LoginPage/img_Logo'), GlobalVariable.timeOut)
		} catch (Exception e) {
			WebUI.takeFullPageScreenshot()
			println("Error: " + e.message)
			throw e
		}
	}



	@Keyword
	def getCurrentUTCTime() {
		Instant now = Instant.now().truncatedTo(ChronoUnit.MILLIS);
		// Format as ISO-8601 with 'Z' for UTC
		String formattedUtc = DateTimeFormatter
				.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'")
				.withZone(ZoneOffset.UTC)
				.format(now);

		println("Current UTC Time: " + formattedUtc);
	}

	@Keyword
	def matchedTimeToNull(String jsonText) {
		def slurper = new JsonSlurper()
		def data = slurper.parseText(jsonText)

		if (data instanceof List) {
			data.each { item ->
				if (item instanceof Map && item.containsKey('matchedTime')) {
					if (item.matchedTime != null) {
						// If matchedTime is not null, set matched = false
						item.matched = false
					}
					// Set matchedTime to null
					item.matchedTime = null
				}
			}


			// Return formatted JSON string
			return JsonOutput.toJson(data)
		}
	}




	@Keyword
	def clickButton(String Name) {
		mouseOverandClick(findTestObject('Object Repository/CommonXpaths/AgentAssistTest_Common/button_Dynamic',[('Name'):Name]))
		//waitForPageLoadMessage()
	}

	@Keyword
	def clickButtonWithTitle(String titleOfButton) {
		mouseOverandClick(findTestObject('Object Repository/CommonXpaths/buttonTitle',[('title'):titleOfButton]))
		//waitForPageLoadMessage()
	}

	@Keyword
	def waitForPageLoadMessage() {
		for(int i=0; i<10;i++) {
			if (WebUI.waitForElementVisible(findTestObject('Object Repository/CommonXpaths/pageLoading'), 2)) {
				WebUI.waitForElementNotVisible(findTestObject('Object Repository/CommonXpaths/pageLoading'), 5)
				WebUI.waitForPageLoad(GlobalVariable.timeOut)
			}
			else {
				KeywordUtil.logInfo('exit loop')
				break
			}
		}
	}


	public static boolean isElementPresent(TestObject testObject, int timeout) {
		try {
			List<WebElement> elements = WebUiCommonHelper.findWebElements(testObject, timeout);
			return elements.size() > 0;
		} catch (Exception e) {
			return false;
		}
	}

	@Keyword
	def verifyTextboxIsEmpty(TestObject txtBox) {
		try {
			// Verify if empty
			String currentValue = WebUI.getAttribute(txtBox, 'value')
			println "Current value is: ${currentValue}"
			WebUI.waitForElementVisible(txtBox, GlobalVariable.timeOut)
			WebUI.verifyElementAttributeValue(txtBox,'value','',GlobalVariable.timeOut)
		} catch (Exception e) {
			KeywordUtil.markFailed("Error while verifying textbox '${txtBox.getObjectId()}': " + e.getMessage())
		}
	}
	
	@Keyword
	def verifyToastMessage(String expMessage) {
		TestObject toastMessage = new TestObject('dynamicToastMessage')
		toastMessage.addProperty('xpath', ConditionType.EQUALS, "//div[contains(@class,'cs-toast')]//p[contains(@class,'cs-toast-message')]")
		WebUI.waitForElementPresent(toastMessage, GlobalVariable.timeOut)
		WebUI.verifyElementText(toastMessage, expMessage)
		WebUI.takeFullPageScreenshot()
	}

	@Keyword
	def createGroup() {
		navigateToMenu('Users, Groups &amp; Licences')
		selectSubmenu('Groups')
		clickOnAddPlusIcon('Add')

		String groupName = "group_" + System.currentTimeMillis()
		GlobalVariable.groupNameGlobal = groupName
		enterTextNameField(groupName)
		clickOnButton_Add_AddCancel_dynamic_btn('Add')
		WebUI.takeFullPageScreenshot()
		// return groupName so the caller can use it
		//return groupName
	}

	@Keyword
	def clickOnButton_Add_AddCancel_dynamic_btn(String btnName) {
		String normalizedBtnName = btnName.toLowerCase().capitalize()
		mouseOverandClick(findTestObject('Object Repository/CommonXpaths/Add_AddCancel_dynamic_btn', [('btnText') : normalizedBtnName]))
		WebUI.takeFullPageScreenshot()
	}



	//******************************** Functions ******************************************//


	def mouseOverandClick(TestObject element) {
		WebUI.waitForPageLoad(GlobalVariable.timeOut)
		int attempts = 0
		while(attempts < 2) {
			try {
				WebUI.waitForElementVisible(element, GlobalVariable.timeOut)
				WebUI.waitForElementClickable(element, GlobalVariable.timeOut)
				WebUI.enhancedClick(element)
				break
			}catch(StaleElementReferenceException e) {
				WebUI.delay(GlobalVariable.wait)
				WebUI.takeFullPageScreenshot()
			}catch(Exception e) {
				WebUI.takeFullPageScreenshot()
			}
			attempts++
		}
	}

	def clearTextfield(TestObject Test) {
		//mouseOverandClick(Test)
		WebUI.clearText(Test)
		WebUI.delay(GlobalVariable.wait)
	}

	def clearAndEnterTextfield(TestObject element, String Text) {
		clearTextfield(element)
		WebUI.setText(element, Text)
	}

	@Keyword
	def enterTextNameField(String Text) {
		clearTextfield(findTestObject('Object Repository/CommonXpaths/Add_Name_textbox'))
		WebUI.setText(findTestObject('Object Repository/CommonXpaths/Add_Name_textbox'), Text)
		WebUI.takeFullPageScreenshot()
	}


	def JsclearAndEnterTextfield(TestObject element, String Text) {
		WebElement jselement = WebUiCommonHelper.findWebElement(element, GlobalVariable.timeOut)
		WebUI.executeJavaScript("arguments[0].value=''", Arrays.asList(jselement))
		WebUI.executeJavaScript("arguments[0].value='"+ Text +"'", Arrays.asList(jselement))
	}
}
