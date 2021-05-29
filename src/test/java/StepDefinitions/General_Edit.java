package StepDefinitions;

import Pages.DialogContent;
import cucumber.api.java.en.When;

public class General_Edit {

    DialogContent dialogContent=new DialogContent();

    @When("^User edit the \"([^\"]*)\" to \"([^\"]*)\"$")
    public void user_edit_the_to(String positionSalaryName, String newPositionSalaryName)  {

        dialogContent.editAndDeleteFunction(positionSalaryName, "edit");
        dialogContent.findElementAndSendKeysFunction("inputNamePositionSalary", newPositionSalaryName);
        dialogContent.findElementAndClickFunction("saveButton");
    }


    @When("^Positions User edit the \"([^\"]*)\" to \"([^\"]*)\"$")
    public void positions_User_edit_the_to(String PositionsName, String newPositionsName) {

        dialogContent.editAndDeleteFunction(PositionsName, "edit");
        dialogContent.findElementAndSendKeysFunction("nameInput", newPositionsName);
        dialogContent.findElementAndClickFunction("saveButton");
    }

    @When("^Excel Template User edit the \"([^\"]*)\" to \"([^\"]*)\"$")
    public void excel_Template_User_edit_the_to(String ExcelTemplateName, String newExcelTemplateName)  {

        dialogContent.editAndDeleteFunction(ExcelTemplateName, "edit");
        dialogContent.findElementAndSendKeysFunction("nameInput", newExcelTemplateName);
        dialogContent.findElementAndClickFunction("saveButton");
    }

    @When("^Salary Types User edit the \"([^\"]*)\" to \"([^\"]*)\"$")
    public void salary_Types_User_edit_the_to(String salaryTypesName, String newsalaryTypesName){

        dialogContent.editAndDeleteFunction(salaryTypesName, "edit");
        dialogContent.findElementAndSendKeysFunction("nameInput", newsalaryTypesName);
        dialogContent.findElementAndClickFunction("saveButton");
    }

    @When("^Salary Modifiers User edit the \"([^\"]*)\" to \"([^\"]*)\"$")
    public void salary_Modifiers_User_edit_the_to(String Description, String newDescription){

        dialogContent.editAndDeleteFunction(Description, "edit");
        dialogContent.findElementAndSendKeysFunction("description", newDescription);
        dialogContent.findElementAndClickFunction("saveButton");
    }

    @When("^Salary Constants User edit the \"([^\"]*)\" to \"([^\"]*)\"$")
    public void salary_Constants_User_edit_the_to(String SalaryConstantsName, String newSalaryConstantsName) {

        dialogContent.editAndDeleteFunction(SalaryConstantsName, "edit");
        dialogContent.findElementAndSendKeysFunction("salaryConstantNameInput", newSalaryConstantsName);
        dialogContent.findElementAndClickFunction("saveButton");
    }

    @When("^Bank Accounts User edit the \"([^\"]*)\" to \"([^\"]*)\"$")
    public void bank_Accounts_User_edit_the_to(String bankAccountName, String newBankAccountName){

        dialogContent.editAndDeleteFunction(bankAccountName, "edit");
        dialogContent.findElementAndSendKeysFunction("nameInput", newBankAccountName);
        dialogContent.findElementAndClickFunction("saveButton");

    }

    @When("^Cost Centers User edit the \"([^\"]*)\" to \"([^\"]*)\"$")
    public void cost_Centers_User_edit_the_to(String CostCentersName, String newCostCentersName) {

        dialogContent.editAndDeleteFunction(CostCentersName, "edit");
        dialogContent.findElementAndSendKeysFunction("nameInput", newCostCentersName);
        dialogContent.findElementAndClickFunction("saveButton");
    }
}