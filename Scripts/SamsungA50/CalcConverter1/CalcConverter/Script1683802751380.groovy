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

Mobile.verifyElementExist(findTestObject('SamsungA50/Converter/android.widget.TextView - Length'), 0)

Mobile.tap(findTestObject('SamsungA50/Converter/android.widget.TextView - Length'), 0)

Mobile.verifyElementExist(findTestObject('SamsungA50/Converter/android.widget.TextView - Temperature'), 0)

Mobile.tap(findTestObject('SamsungA50/Converter/android.widget.TextView - Temperature'), 0)

Mobile.verifyElementExist(findTestObject('SamsungA50/Converter/android.widget.TextView - Volume'), 0)

Mobile.tap(findTestObject('SamsungA50/Converter/android.widget.TextView - Volume'), 0)

Mobile.verifyElementExist(findTestObject('SamsungA50/Converter/android.widget.TextView - Mass'), 0)

Mobile.tap(findTestObject('SamsungA50/Converter/android.widget.TextView - Mass'), 0)

Mobile.verifyElementExist(findTestObject('SamsungA50/Converter/android.widget.TextView - Data'), 0)

Mobile.tap(findTestObject('SamsungA50/Converter/android.widget.TextView - Data'), 0)

Mobile.verifyElementExist(findTestObject('SamsungA50/Converter/android.widget.TextView - Speed'), 0)

Mobile.tap(findTestObject('SamsungA50/Converter/android.widget.TextView - Speed'), 0)

Mobile.verifyElementExist(findTestObject('SamsungA50/Converter/android.widget.TextView - Time'), 0)

Mobile.tap(findTestObject('SamsungA50/Converter/android.widget.TextView - Time'), 0)

Mobile.verifyElementExist(findTestObject('SamsungA50/Converter/android.widget.TextView - Tip'), 0)

Mobile.tap(findTestObject('SamsungA50/Converter/android.widget.TextView - Tip'), 0)

Mobile.tap(findTestObject('SamsungA50/Converter/android.widget.TextView - Volume'), 0)

Mobile.tap(findTestObject('SamsungA50/Converter/android.widget.TextView - Length'), 0)

Mobile.tap(findTestObject('SamsungA50/Converter/android.widget.TextView - Area'), 0)

Mobile.tap(findTestObject('SamsungA50/Converter/android.widget.ImageViewBackButton'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/SamsungA50/Calc/android.widget.EditText'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/SamsungA50/Calc/android.widget.RelativeLayout'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/SamsungA50/Calc/android.widget.RelativeLayout (1)'), 0)

Mobile.closeApplication()

