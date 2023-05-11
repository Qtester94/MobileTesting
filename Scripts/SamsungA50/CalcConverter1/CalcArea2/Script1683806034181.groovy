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

Mobile.startExistingApplication('com.sec.android.app.popupcalculator')

Mobile.tap(findTestObject('SamsungA50/Converter/android.view.ViewGroupConvertButton'), 0)

Mobile.verifyElementExist(findTestObject('SamsungA50/Converter/android.widget.TextView - Area'), 0)

Mobile.tap(findTestObject('SamsungA50/Converter/android.widget.TextView - Area'), 0)

Mobile.tap(findTestObject('SamsungA50/Converter/Area/android.widget.ImageViewArea2DropDown'), 0)

Mobile.verifyElementVisible(findTestObject('SamsungA50/Converter/Area/android.widget.TextView - Acres2'), 0)

Mobile.verifyElementVisible(findTestObject('SamsungA50/Converter/Area/android.widget.TextView - Ares2'), 0)

Mobile.verifyElementVisible(findTestObject('SamsungA50/Converter/Area/android.widget.TextView - Hectares2'), 0)

Mobile.verifyElementVisible(findTestObject('SamsungA50/Converter/Area/android.widget.TextView - Square centimetres2'), 0)

Mobile.verifyElementVisible(findTestObject('SamsungA50/Converter/Area/android.widget.TextView - Square feet2'), 0)

Mobile.verifyElementVisible(findTestObject('SamsungA50/Converter/Area/android.widget.TextView - Square inches2'), 0)

Mobile.verifyElementVisible(findTestObject('SamsungA50/Converter/Area/android.widget.TextView - Square metres2'), 0)

Mobile.tap(findTestObject('SamsungA50/Converter/Area/android.widget.TextView - Acres2'), 0)

Mobile.verifyElementVisible(findTestObject('SamsungA50/Converter/Area/android.widget.TextView - ac2'), 0)

Mobile.tap(findTestObject('SamsungA50/Converter/Area/android.widget.ImageViewArea2DropDown'), 0)

Mobile.tap(findTestObject('SamsungA50/Converter/Area/android.widget.TextView - Ares2'), 0)

Mobile.verifyElementVisible(findTestObject('SamsungA50/Converter/Area/android.widget.TextView - a2'), 0)

Mobile.tap(findTestObject('SamsungA50/Converter/Area/android.widget.ImageViewArea2DropDown'), 0)

Mobile.tap(findTestObject('SamsungA50/Converter/Area/android.widget.TextView - Hectares2'), 0)

Mobile.verifyElementVisible(findTestObject('SamsungA50/Converter/Area/android.widget.TextView - ha2'), 0)

Mobile.tap(findTestObject('SamsungA50/Converter/Area/android.widget.ImageViewArea2DropDown'), 0)

Mobile.tap(findTestObject('SamsungA50/Converter/Area/android.widget.TextView - Square centimetres2'), 0)

Mobile.verifyElementVisible(findTestObject('SamsungA50/Converter/Area/android.widget.TextView - cm2'), 0)

Mobile.tap(findTestObject('SamsungA50/Converter/Area/android.widget.ImageViewArea2DropDown'), 0)

Mobile.tap(findTestObject('SamsungA50/Converter/Area/android.widget.TextView - Square feet2'), 0)

Mobile.verifyElementVisible(findTestObject('SamsungA50/Converter/Area/android.widget.TextView - ft2'), 0)

Mobile.tap(findTestObject('SamsungA50/Converter/Area/android.widget.ImageViewArea2DropDown'), 0)

Mobile.tap(findTestObject('SamsungA50/Converter/Area/android.widget.TextView - Square inches2'), 0)

Mobile.verifyElementVisible(findTestObject('SamsungA50/Converter/Area/android.widget.TextView - in2'), 0)

Mobile.tap(findTestObject('SamsungA50/Converter/Area/android.widget.ImageViewArea2DropDown'), 0)

Mobile.tap(findTestObject('SamsungA50/Converter/Area/android.widget.TextView - Square metres2'), 0)

Mobile.verifyElementVisible(findTestObject('SamsungA50/Converter/Area/android.widget.TextView - m2'), 0)

Mobile.tap(findTestObject('SamsungA50/Converter/android.widget.ImageViewBackButton'), 0)

Mobile.closeApplication()

