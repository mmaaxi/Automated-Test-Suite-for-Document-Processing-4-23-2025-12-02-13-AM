import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.tc_001Page;

public class tc_001Steps {

    WebDriver driver;
    tc_001Page page;

    @Given("el usuario está en la pantalla de carga de documentos")
    public void el_usuario_está_en_la_pantalla_de_carga_de_documentos() {
        // Lógica para navegar a la pantalla de carga de documentos
        page = PageFactory.initElements(driver, tc_001Page.class);
        driver.get("url_de_la_pagina_de_carga");
    }

    @When("el usuario selecciona la opción 'cargar documentos'")
    public void el_usuario_selecciona_la_opcion_cargar_documentos() {
        page.selectUploadOption();
    }

    @Then("el sistema muestra opción para carga única y carga múltiple")
    public void el_sistema_muestra_opcion_para_carga_única_y_carga_múltiple() {
        page.verifyUploadOptionsDisplayed();
    }

    @When("el usuario elige 'carga en un solo archivo'")
    public void el_usuario_elige_carga_en_un_solo_archivo() {
        page.selectSingleFileUpload();
    }

    @Then("se habilita un único recuadro para subir el archivo")
    public void se_habilita_un_único_recuadro_para_subir_el_archivo() {
        page.verifySingleUploadFieldEnabled();
    }

    @When("el usuario elige 'cargar documentos por separado'")
    public void el_usuario_elige_cargar_documentos_por_separado() {
        page.selectSeparateFilesUpload();
    }

    @Then("se muestran múltiples recuadros correspondientes a cada documento requerido")
    public void se_muestran_múltiples_recuadros_correspondientes_a_cada_documento_requerido() {
        page.verifyMultipleUploadFieldsDisplayed();
    }
}