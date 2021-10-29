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

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:3000/')

WebUI.click(findTestObject('Object Repository/Page_Sp zone/span_Log in'))

WebUI.setText(findTestObject('Object Repository/Page_Sp zone/input_LOGIN_L_email'), '614259043@hotmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Sp zone/input_LOGIN_L_password'), 'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.click(findTestObject('Object Repository/Page_Sp zone/input'))

WebUI.click(findTestObject('Object Repository/Page_Sp zone/span_'))

WebUI.click(findTestObject('Object Repository/Page_Sp zone/a_'))

WebUI.click(findTestObject('Object Repository/Page_Sp zone/button_'))

WebUI.verifyTextPresent('plant', false)

WebUI.verifyTextPresent('hat-vintage', false)

WebUI.verifyTextPresent('t-shirt', false)

WebUI.closeBrowser()
