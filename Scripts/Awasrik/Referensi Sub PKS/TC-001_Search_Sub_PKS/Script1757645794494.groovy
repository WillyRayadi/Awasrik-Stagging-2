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

// ✅ Panggil test case login
WebUI.click(findTestObject('Object Repository/Page_Awasrik  Selamat Datang/a_Referensi'))

WebUI.click(findTestObject('Object Repository/Page_Awasrik  Selamat Datang/p_Referensi Sub PKS'))

WebUI.click(findTestObject('Object Repository/Page_Awasrik  Referensi Sub PKS Badan Usaha/button_Badan Usaha_btnSearchBU'))

WebUI.setText(findTestObject('Object Repository/Page_Awasrik  Referensi Sub PKS Badan Usaha/input_Opsi Pencarian_paramCariBU'), 
    'cipta')

WebUI.click(findTestObject('Object Repository/Page_Awasrik  Referensi Sub PKS Badan Usaha/button_Cari'))

WebUI.click(findTestObject('Object Repository/Page_Awasrik  Referensi Sub PKS Badan Usaha/button_Pilih'))

WebUI.click(findTestObject('Object Repository/Page_Awasrik  Referensi Sub PKS Badan Usaha/button_Cari_1'))

WebUI.click(findTestObject('Object Repository/Page_Awasrik  Referensi Sub PKS Badan Usaha/span_Excel'))

WebUI.click(findTestObject('Object Repository/Page_Awasrik  Referensi Sub PKS Badan Usaha/span_CSV'))

WebUI.click(findTestObject('Object Repository/Page_Awasrik  Referensi Sub PKS Badan Usaha/span_Print'))

