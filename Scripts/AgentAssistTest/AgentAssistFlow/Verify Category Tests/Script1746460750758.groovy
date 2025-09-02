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

String TEST_STEP= "GOTO CATEGORY TESTS"

CustomKeywords.'actionKeywords.Categories.clickGoToCategory'()

CustomKeywords.'actionKeywords.Categories.assertCategoriesAreAdded'()

TEST_STEP= "MATCH CATEGORY"

String message = CustomKeywords.'actionKeywords.Categories.clickOnMatchCategory'()

CustomKeywords.'actionKeywords.Categories.assertPowerlessIsTicked'()

CustomKeywords.'actionKeywords.Categories.assertToastMessageIsDisplayed'(message)

TEST_STEP= "GET CATEGORIES"

CustomKeywords.'actionKeywords.Categories.clickOnGetCategories'()

CustomKeywords.'actionKeywords.Categories.assertCategoriesExpectedJSON'(expectedCategoriesJSON)

TEST_STEP= "REMOVE SPECIFIC CATEGORY"

CustomKeywords.'actionKeywords.Categories.clickOnRemoveCategory'()

CustomKeywords.'actionKeywords.Categories.assertCategoryIsRemoved'()

TEST_STEP= "REMOVE ALL CATEGORY"

CustomKeywords.'actionKeywords.Categories.clickOnRemoveAllCategories'()

CustomKeywords.'actionKeywords.Categories.assertAllCategoriesAreCleared'()


  /*
  *  The purpose of the code is to perform a series of actions related to category management.
  *
  *  1. Define a string variable "TEST_STEP" to indicate the current test step.
  *  2. Call a series of custom keyword actions[eg:CustomKeywords.'actionKeywords.Categories.clickOnRemoveCategory'()] to interact with categories
  *  the keywords are clickGoToCategory,assertCategoriesAreAdded,
  *  clickOnMatchCategory,assertPowerlessIsTicked, assertToastMessageIsDisplayed(message),clickOnGetCategories,assertCategoriesExpectedJSON(json)
  *  clickOnRemoveCategory,assertCategoryIsRemoved,clickOnRemoveAllCategories,assertAllCategoriesAreCleared
  *  3. Update the test step string as the actions progress through different category management tasks.
  *  
  *  Below are the steps
      
 *  
 *  1. click on the "Go To Category" button 
 *  2. assert that specific categories are added by comparing expected texts with actual texts from the UI.
 *  3. click on the "Match Category" button and return the toast message displayed.
 *  4. assert that the "Powerless" checkbox is present and checked.
 *  5. assert that a specific toast message is displayed.
 *  6. click on the "Get Categories" button after 
 *  7. assert that the categories match an expected JSON value.
 *  8. click on the "Remove Category" button 
 *  9. assert that the "Powerless" checkbox is no longer present.
 *  10. click on the "Remove All Categories" button 
 *  11. assert that all categories are cleared by checking the displayed message.
 *
 */

