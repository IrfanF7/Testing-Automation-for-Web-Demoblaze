import com.kms.katalon.core.util.KeywordUtil
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

WebUI.navigateToUrl('https://www.demoblaze.com')

WebUI.click(findTestObject('Product_phone/a_Samsung galaxy s6'))

WebUI.waitForPageLoad(5)

WebUI.verifyElementPresent(findTestObject('a_Add to cart'), 5)

WebUI.click(findTestObject('a_Add to cart'))

WebUI.verifyAlertPresent(5)

WebUI.acceptAlert()

WebUI.click(findTestObject('Page_STORE/a_Home (current)'))

WebUI.click(findTestObject('Product_phone/a_Nokia lumia 1520'))

WebUI.waitForPageLoad(5)

WebUI.verifyElementPresent(findTestObject('a_Add to cart'), 5)

WebUI.click(findTestObject('a_Add to cart'))

WebUI.verifyAlertPresent(5)

WebUI.acceptAlert()

WebUI.click(findTestObject('Page_STORE/a_cartur'))

WebUI.delay(3)

WebUI.verifyTextPresent('Samsung galaxy s6', false)

WebUI.verifyTextPresent('Nokia lumia 1520', false)

// Katalon "nengok" ke web dan baca harganya
String harga1 = WebUI.getText(findTestObject('Page_STORE/txt_Price_Samsung'))
// Hasilnya: "360"

String harga2 = WebUI.getText(findTestObject('Page_STORE/txt_Price_Nokia'))
// Hasilnya: "790"

// Ambil juga total yang tertulis di web untuk dibandingkan
String totalWebStr = WebUI.getText(findTestObject('Page_STORE/txt_TotalPrice'))

// Lalu kita suruh Katalon jumlahin (Konversi dulu ke Integer)
int totalBenar = Integer.parseInt(harga1.trim()) + Integer.parseInt(harga2.trim())
int totalSistem = Integer.parseInt(totalWebStr.trim())

// VERIFIKASI: Bandingkan hasil hitungan kita dengan hasil di web
WebUI.verifyEqual(totalSistem, totalBenar)

WebUI.closeBrowser()
println ">>> DEBUG: Harga Samsung yang dibaca = " + harga1
println ">>> DEBUG: Harga Nokia yang dibaca = " + harga2
println ">>> DEBUG: Total di Web yang dibaca = " + totalWebStr
KeywordUtil.logInfo("Konfirmasi Harga: Samsung (\$" + harga1 + ") + Nokia (\$" + harga2 + ") = Total \$" + totalSistem)

