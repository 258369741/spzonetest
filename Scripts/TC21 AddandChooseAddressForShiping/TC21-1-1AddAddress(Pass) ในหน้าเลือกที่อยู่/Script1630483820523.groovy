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

WebUI.setText(findTestObject('Object Repository/Page_Sp zone/input_LOGIN_L_email'), 'thx123@hotmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Sp zone/input_LOGIN_L_password'), 'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.click(findTestObject('Page_Sp zone/Page_Sp zone/input_loginforuse'))

WebUI.click(findTestObject('Page_Sp zone/svg_cart'))

WebUI.click(findTestObject('Object Repository/Page_Sp zone/button_Checkout'))

WebUI.click(findTestObject('Object Repository/Page_Sp zone/h5_add new address'))

WebUI.setText(findTestObject('Object Repository/Page_Sp zone/input_Add Address_A_receive_name'), 'thx')

WebUI.setText(findTestObject('Object Repository/Page_Sp zone/input_Add Address_A_phone'), '1234567890')

WebUI.setText(findTestObject('Object Repository/Page_Sp zone/input_Add Address_A_homenumber'), '99')

WebUI.setText(findTestObject('Object Repository/Page_Sp zone/input_Add Address_A_moo'), '9')

WebUI.selectOptionByValue(findTestObject('Page_Sp zone/select_'), '1', true)

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Sp zone/select__1'), '1', true)

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Sp zone/select__1_2'), '1', true)

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Sp zone/select_10200'), '10200', true)

WebUI.click(findTestObject('Page_Sp zone/button_submit'))

WebUI.verifyTextPresent('พระบรมมหาราชวัง', false)

WebUI.closeBrowser()

