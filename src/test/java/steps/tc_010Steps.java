package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.tc_010Page;

public class tc_010Steps {

    private tc_010Page page = new tc_010Page();

    @Given("el usuario está en la página de carga de documentos")
    public void el_usuario_esta_en_la_pagina_de_carga_de_documentos() {
        page.navigateToDocumentUploadPage();
    }

    @When("completa la carga y procesamiento de documentos")
    public void completa_la_carga_y_procesamiento_de_documentos() {
        page.uploadAndProcessDocuments();
    }

    @Then("el sistema genera el 'Slip de salida'")
    public void el_sistema_genera_el_slip_de_salida() {
        Assert.assertTrue("El Slip de salida no fue generado", page.isSlipGenerated());
    }

    @Then("los documentos originales se guardan en el historial de la solicitud")
    public void los_documentos_originales_se_guardan_en_el_historial_de_la_solicitud() {
        Assert.assertTrue("Los documentos originales no están en el historial", page.areOriginalDocumentsStored());
    }

    @Then("los datos extraídos se almacenan en el historial de la solicitud")
    public void los_datos_extraidos_se_almacenan_en_el_historial_de_la_solicitud() {
        Assert.assertTrue("Los datos extraídos no se almacenaron en el historial", page.areExtractedDataStored());
    }
}