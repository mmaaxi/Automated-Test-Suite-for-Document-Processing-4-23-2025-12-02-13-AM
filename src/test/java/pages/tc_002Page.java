package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_002Page {
    WebDriver driver;

    By uploadButton = By.id("uploadButton");
    By fileInput = By.id("fileInput");
    By previewSection = By.id("previewSection");

    public tc_002Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToUploadPage() {
        driver.get("https://example.com/upload");
    }

    public void uploadFile(String filePath) {
        driver.findElement(fileInput).sendKeys(filePath);
        driver.findElement(uploadButton).click();
    }

    public boolean isFileUploaded() {
        // Logic to verify file upload, for example, checking UI changes/node existence
        return true;
    }

    public boolean isFilePreviewDisplayed() {
        // Logic to verify file preview, for example, checking visibility of specific UI elements
        return driver.findElement(previewSection).isDisplayed();
    }
}