package steps;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.tc_002Page;

public class tc_002Steps {
    WebDriver driver;
    tc_002Page uploadPage;

    @Given("I am on the file upload page")
    public void i_am_on_the_file_upload_page() {
        driver = new WebDriverFactory().getDriver();
        uploadPage = new tc_002Page(driver);
        uploadPage.navigateToUploadPage();
    }

    @When("I select a file with a valid PDF/DOCX format under 50 MB")
    public void i_select_a_file_with_a_valid_pdf_docx_format_under_50_mb() {
        uploadPage.uploadFile("path/to/validfile.pdf");
    }

    @Then("the file is uploaded successfully")
    public void the_file_is_uploaded_successfully() {
        Assert.assertTrue(uploadPage.isFileUploaded());
    }

    @And("I should see the file preview with name, size, and type")
    public void i_should_see_the_file_preview_with_name_size_and_type() {
        Assert.assertTrue(uploadPage.isFilePreviewDisplayed());
    }
}