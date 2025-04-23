Feature: Validate file upload with valid format and preview

  Scenario: Upload a PDF/DOCX file under 50 MB and verify preview
    Given I am on the file upload page
    When I select a file with a valid PDF/DOCX format under 50 MB
    Then the file is uploaded successfully
    And I should see the file preview with name, size, and type