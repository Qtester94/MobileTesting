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

Mobile.setText(findTestObject('Object Repository/SamsungA52/android.widget.EditText - Search or type web address (2)'), 'https://opensource-demo.orangehrmlive.com/web/index.php/auth/login', 
    0)

Mobile.tap(findTestObject('Object Repository/SamsungA52/android.widget.TextView - OrangeHRM (1)'), 0)

Mobile.setText(findTestObject('Object Repository/SamsungA52/android.widget.EditText (2)'), 'Admin', 0)

Mobile.setText(findTestObject('Object Repository/SamsungA52/android.widget.EditText (3)'), 'admin123', 0)

Mobile.tap(findTestObject('Object Repository/SamsungA52/android.widget.EditText -'), 0)

Mobile.tap(findTestObject('Object Repository/SamsungA52/android.widget.Button - Login (1)'), 0)

Mobile.tap(findTestObject('Object Repository/SamsungA52/android.widget.TextView -'), 0)

Mobile.tap(findTestObject('Object Repository/SamsungA52/android.view.MenuItem - Logout'), 0)

Mobile.closeApplication()

