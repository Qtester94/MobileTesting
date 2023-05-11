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

Mobile.verifyElementExist(findTestObject('Object Repository/SamsungA50/Calc/android.widget.EditText'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/SamsungA50/Calc/android.widget.RelativeLayout'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/SamsungA50/Calc/android.widget.RelativeLayout (1)'), 0)

Mobile.tap(findTestObject('SamsungA50/Calc/android.widget.Button - C'), 0)

Mobile.tap(findTestObject('Object Repository/SamsungA50/Calc/android.widget.Button - 4'), 0)

Mobile.tap(findTestObject('Object Repository/SamsungA50/Calc/android.widget.Button - 5'), 0)

Mobile.tap(findTestObject('SamsungA50/Calc/android.widget.ButtonAddition'), 0)

Mobile.tap(findTestObject('Object Repository/SamsungA50/Calc/android.widget.Button - 6'), 0)

Mobile.tap(findTestObject('Object Repository/SamsungA50/Calc/android.widget.Button - 2'), 0)

Mobile.tap(findTestObject('SamsungA50/Calc/android.widget.ButtonEquall'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/SamsungA50/Calc/android.widget.EditText - 107 Calculation result'), 
    '107 Calculation result')

Mobile.tap(findTestObject('Object Repository/SamsungA50/Calc/android.widget.Button - C'), 0)

Mobile.closeApplication()

