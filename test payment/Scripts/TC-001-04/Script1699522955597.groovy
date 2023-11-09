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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://payment.page/templates/agency/')

WebUI.click(findTestObject('Object Repository/Page_Agency  Payment Page/span_'))

WebUI.click(findTestObject('Object Repository/Page_Agency  Payment Page/div'))

WebUI.click(findTestObject('Object Repository/Page_Agency  Payment Page/div'))

WebUI.click(findTestObject('Object Repository/Page_Agency  Payment Page/div_Email Address'))

WebUI.setText(findTestObject('Object Repository/Page_Agency  Payment Page/input_YOUR INFORMATION_email_address'), 'p.salsabila@gmail.com')

WebUI.click(findTestObject('Object Repository/Page_Agency  Payment Page/input_Email Address_first_name'))

WebUI.click(findTestObject('Object Repository/Page_Agency  Payment Page/div_First Name'))

WebUI.setText(findTestObject('Object Repository/Page_Agency  Payment Page/input_Email Address_first_name'), 'Putri')

WebUI.click(findTestObject('Object Repository/Page_Agency  Payment Page/div_Last Name'))

WebUI.setText(findTestObject('Object Repository/Page_Agency  Payment Page/input_First Name_last_name'), 'Salsabila')

WebUI.switchToWindowTitle('Agency | Payment Page')

WebUI.setText(findTestObject('Object Repository/Page_Agency  Payment Page/input_First Name_last_name'), 'Salsabila')

WebUI.click(findTestObject('Object Repository/Page_Agency  Payment Page/img_concat(id(  katalon-rec_elementInfoDiv  ))_paypal-logo paypal-logo-paypal paypal-logo-color-blue'))

