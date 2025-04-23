package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class tc_001Page {

    WebDriver driver;

    @FindBy(id = "uploadOption")
    WebElement uploadOptionButton;

    @FindBy(id = "singleFileField")
    WebElement singleFileField;

    @FindBy(id = "multipleFileFields")
    WebElement multipleFileFields;

    public tc_001Page(WebDriver driver) {
        this.driver = driver;
    }

    public void selectUploadOption() {
        uploadOptionButton.click();
    }

    public void verifyUploadOptionsDisplayed() {
        // Assert que las opciones de carga están visibles
    }

    public void selectSingleFileUpload() {
        // Lógica para seleccionar la carga de un solo archivo
    }

    public void verifySingleUploadFieldEnabled() {
        // Assert que verifica que el recuadro de carga única está habilitado
    }

    public void selectSeparateFilesUpload() {
        // Lógica para seleccionar la carga de documentos por separado
    }

    public void verifyMultipleUploadFieldsDisplayed() {
        // Assert que verifica que los recuadros de carga múltiple se muestran
    }
}