package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class tc_010Page {

    private WebDriver driver;
    private WebDriverWait wait;

    private By documentUploadButton = By.id("uploadButton");
    private By processDocumentsButton = By.id("processButton");
    private By slipGeneratedMessage = By.id("slipGenerated");
    private By originalDocumentsHistory = By.id("originalDocs");
    private By extractedDataHistory = By.id("extractedData");

    public tc_010Page(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
    }

    public void navigateToDocumentUploadPage() {
        driver.get("http://localhost:8080/document-upload");
    }

    public void uploadAndProcessDocuments() {
        WebElement uploadButton = wait.until(ExpectedConditions.elementToBeClickable(documentUploadButton));
        uploadButton.click();
        WebElement processButton = wait.until(ExpectedConditions.elementToBeClickable(processDocumentsButton));
        processButton.click();
    }

    public boolean isSlipGenerated() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(slipGeneratedMessage)).isDisplayed();
    }

    public boolean areOriginalDocumentsStored() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(originalDocumentsHistory)).isDisplayed();
    }

    public boolean areExtractedDataStored() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(extractedDataHistory)).isDisplayed();
    }
}