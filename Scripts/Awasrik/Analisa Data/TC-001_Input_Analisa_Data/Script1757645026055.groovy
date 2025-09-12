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
//WebUI.callTestCase(findTestCase('Awasrik/Login/TC-001_Login_User_Valid'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Awasrik  Selamat Datang/p_Analisa Data Mandiri'))

WebUI.setText(findTestObject('Object Repository/Page_Awasrik  Analisa Data Mandiri/input_Kode BU PKS_txtKodeBUSar'), '01732349')

WebUI.click(findTestObject('Object Repository/Page_Awasrik  Analisa Data Mandiri/button_Cari'))

WebUI.click(findTestObject('Object Repository/Page_Awasrik  Analisa Data Mandiri/button_Tambah'))

WebUI.click(findTestObject('Object Repository/Page_Awasrik  Analisa Data Mandiri/input_Tanggal Pemeriksaan_swalTglPeriksa'))

WebUI.click(findTestObject('Object Repository/Page_Awasrik  Analisa Data Mandiri/td_13'))

WebUI.click(findTestObject('Object Repository/Page_Awasrik  Analisa Data Mandiri/button_Simpan'))

// 🔎 Verifikasi hasil popup
if (WebUI.verifyTextPresent('Progress Berhasil', false, FailureHandling.OPTIONAL)) {
    // Jika berhasil
    WebUI.comment('✅ Data berhasil disimpan')
    WebUI.waitForElementClickable(findTestObject('Page_Awasrik  Analisa Data Mandiri/button_OK'), 10)
    WebUI.click(findTestObject('Page_Awasrik  Analisa Data Mandiri/button_OK'))
} else if (WebUI.verifyTextPresent('Perhatian Badan Usaha ini terdapat pada data pemeriksaan kantor tahap: Perencanaan Kantor', false, FailureHandling.OPTIONAL)) {
    // Jika gagal karena duplikat data di bulan yang sama
    WebUI.comment('❌ Data gagal disimpan: BU sudah punya tanggal di bulan ini')
    WebUI.waitForElementClickable(findTestObject('Page_Awasrik  Analisa Data Mandiri/button_OK'), 10)
    WebUI.click(findTestObject('Page_Awasrik  Analisa Data Mandiri/button_OK'))
} else {
    // Jika pesan popup tidak dikenali
    WebUI.comment('⚠️ Tidak ada popup yang sesuai ditemukan')
}

