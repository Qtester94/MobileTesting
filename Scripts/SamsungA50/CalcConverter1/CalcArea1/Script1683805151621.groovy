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

Mobile.tap(findTestObject('SamsungA50/Converter/Area/android.widget.ImageViewArea1DropDown'), 0)

Mobile.verifyElementVisible(findTestObject('SamsungA50/Converter/Area/android.widget.TextView - Acres'), 0)

Mobile.verifyElementVisible(findTestObject('SamsungA50/Converter/Area/android.widget.TextView - Ares'), 0)

Mobile.verifyElementVisible(findTestObject('SamsungA50/Converter/Area/android.widget.TextView - Hectares'), 0)

Mobile.verifyElementVisible(findTestObject('SamsungA50/Converter/Area/android.widget.TextView - Square centimetres'), 0)

Mobile.verifyElementVisible(findTestObject('SamsungA50/Converter/Area/android.widget.TextView - Square feet'), 0)

Mobile.verifyElementVisible(findTestObject('SamsungA50/Converter/Area/android.widget.TextView - Square inches'), 0)

Mobile.verifyElementVisible(findTestObject('SamsungA50/Converter/Area/android.widget.TextView - Square metres'), 0)

Mobile.tap(findTestObject('SamsungA50/Converter/Area/android.widget.TextView - Acres'), 0)

Mobile.verifyElementVisible(findTestObject('SamsungA50/Converter/Area/android.widget.TextView - ac'), 0)

Mobile.tap(findTestObject('SamsungA50/Converter/Area/android.widget.ImageViewArea1DropDown'), 0)

Mobile.tap(findTestObject('SamsungA50/Converter/Area/android.widget.TextView - Ares'), 0)

Mobile.verifyElementVisible(findTestObject('SamsungA50/Converter/Area/android.widget.TextView - a'), 0)

Mobile.tap(findTestObject('SamsungA50/Converter/Area/android.widget.ImageViewArea1DropDown'), 0)

Mobile.tap(findTestObject('SamsungA50/Converter/Area/android.widget.TextView - Hectares'), 0)

Mobile.verifyElementVisible(findTestObject('SamsungA50/Converter/Area/android.widget.TextView - ha'), 0)

Mobile.tap(findTestObject('SamsungA50/Converter/Area/android.widget.ImageViewArea1DropDown'), 0)

Mobile.tap(findTestObject('SamsungA50/Converter/Area/android.widget.TextView - Square centimetres'), 0)

Mobile.verifyElementVisible(findTestObject('SamsungA50/Converter/Area/android.widget.TextView - cm'), 0)

Mobile.tap(findTestObject('SamsungA50/Converter/Area/android.widget.ImageViewArea1DropDown'), 0)

Mobile.tap(findTestObject('SamsungA50/Converter/Area/android.widget.TextView - Square feet'), 0)

Mobile.verifyElementVisible(findTestObject('SamsungA50/Converter/Area/android.widget.TextView - ft'), 0)

Mobile.tap(findTestObject('SamsungA50/Converter/Area/android.widget.ImageViewArea1DropDown'), 0)

Mobile.tap(findTestObject('SamsungA50/Converter/Area/android.widget.TextView - Square inches'), 0)

Mobile.verifyElementVisible(findTestObject('SamsungA50/Converter/Area/android.widget.TextView - in'), 0)

Mobile.tap(findTestObject('SamsungA50/Converter/Area/android.widget.ImageViewArea1DropDown'), 0)

Mobile.tap(findTestObject('SamsungA50/Converter/Area/android.widget.TextView - Square metres'), 0)

Mobile.verifyElementVisible(findTestObject('SamsungA50/Converter/Area/android.widget.TextView - m'), 0)

Mobile.tap(findTestObject('SamsungA50/Converter/android.widget.ImageViewBackButton'), 0)

Mobile.closeApplication()

