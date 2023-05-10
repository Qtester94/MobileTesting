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

Mobile.startExistingApplication('com.android.chrome')

Mobile.setText(findTestObject('Object Repository/android.widget.EditText - Search or type web address (3)'), 'https://opensource-demo.orangehrmlive.com/web/index.php/auth/login', 
    0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - OrangeHRM (2)'), 0)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText (4)'), 'Admin', 0)

Mobile.swipe(0, 400, 0, 100)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText (5)'), 'admin123', 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - Login (2)'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/android.view.View'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - (1)'), 0)

Mobile.tap(findTestObject('Object Repository/android.view.MenuItem - Logout (1)'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/android.widget.TextView - Login'), 'Login')

Mobile.closeApplication()

