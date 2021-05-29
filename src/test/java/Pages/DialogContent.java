package Pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.ArrayList;
import java.util.List;

public class DialogContent extends Parent {

    WebElement myElement;

    public DialogContent() {

        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "mat-input-0")
    private WebElement username;

    @FindBy(id = "mat-input-1")
    private WebElement password;

    @FindBy(css = "button[aria-label='LOGIN']")
    private WebElement loginButton;

    @FindBy(linkText = "Got it!")
    private WebElement gotItBtn;


    @FindAll({
            @FindBy(linkText = "Got it!")
    })
    private List<WebElement> gotItBtns;

    @FindBy(xpath = "//div[@id='toast-container']")
    private WebElement msjContainer;

    @FindAll({
            @FindBy(xpath = "//div[@id='toast-container']")
    })
    private List<WebElement> msjContainers;

    @FindBy(xpath = "//div[contains(text(),'Error')]")
    private WebElement ErrorMessage;

    @FindAll({
            @FindBy(xpath = "//ms-delete-button/button")
    })
    public List<WebElement> deleteButtonList;

    @FindAll({
            @FindBy(xpath = "//ms-edit-button/button")
    })
    public List<WebElement> editButtonList;

    @FindAll({
            @FindBy(xpath = "//table/tbody/tr/td[2]")
    })
    public List<WebElement> nameList;

    @FindBy(xpath = "//mat-select[@formcontrolname='id']")
    private WebElement countrySelect;

    @FindBy(xpath = "(//span[@class='mat-option-text'])[23]")
    private WebElement countryOption;

    @FindBy(xpath = "//span[contains(text(),'Group5Country')]")
    private WebElement Group5Country;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='code']/input")
    private WebElement codeInput;

    @FindBy(xpath = "//mat-select[@formcontrolname='id']")
    private WebElement subjectCategory;

    @FindBy(xpath = "(//span[@class='mat-option-text'])[1]")
    private WebElement subjectOption;

    @FindBy(xpath = "//mat-select[@formcontrolname='value']")
    private WebElement style;

    @FindBy(xpath = "//ms-add-button[contains(@tooltip,'TITLE.ADD')]//button")
    private WebElement addButton;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='title']/input")
    private WebElement inputNamePositionSalary;

    @FindBy(xpath = "//ms-save-button//button")
    private WebElement saveButton;

    @FindBy(xpath = "//span[text()=' Yes ']")
    private WebElement yesButton;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='name']/input")
    private WebElement nameInput;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='shortName']/input")
    private WebElement shortName;

    @FindBy(xpath = "//ms-add-button[contains(@tooltip,'FIELD.ADD')]//button")
    private WebElement addButtonReports;

    @FindBy(xpath = "//ms-integer-field[contains(@placeholder,'FIELD.ROW_SIZE')]//input")
    private WebElement rowSizeExcelTemplate;

    @FindBy(xpath = "//ms-integer-field[contains(@placeholder,'FIELD.COLUMN_SIZE')]//input")
    private WebElement columnSizeExcelTemplate;

    @FindBy(xpath = "//span[text()='Add Version']")
    private WebElement addVersion;

    @FindBy(xpath = "//button[@aria-label='Close dialog']")
    private WebElement closeButton;

    @FindBy(xpath = "//input[@matchipinputaddonblur='false']")
    private WebElement salaryUserType;

    @FindBy(xpath = "(//span[@class='mat-option-text'])[6]")
    private WebElement salaryUserTypeOption;

    @FindBy(xpath = "//input[@formcontrolname='description']")
    private WebElement description;

    @FindBy(xpath = "//input[@formcontrolname='variable']")
    private WebElement variable;

    @FindBy(xpath = "//input[@formcontrolname='priority']")
    private WebElement priority;

    @FindBy(xpath = "//input[@type='text']")
    private WebElement amount;

    @FindBy(xpath = "//input[@formcontrolname='name']")
    private WebElement salaryConstantNameInput;

    @FindBy(xpath = "//input[@data-placeholder='Valid From']")
    private WebElement validFromInput;

    @FindBy(xpath = "(//mat-month-view[@class='ng-star-inserted']//td)[7]")
    private WebElement calendar;

    @FindBy(xpath = "//ms-text-field[@name='key']/input")
    private WebElement keyInput;

    @FindBy(xpath = "//ms-integer-field[@formcontrolname='value']/input")
    private WebElement valueInput;

    @FindBy(xpath = "//input[@data-placeholder='Name']")
    private WebElement searchNameInput;

    @FindBy(xpath = "//span[text()=' Search ']")
    private WebElement searchButton;

    @FindBy(xpath = "//span[text()='Type']")
    private WebElement type;

    @FindBy(xpath = "(//span[@class='mat-option-text'])[1]")
    private WebElement typeOptions;

    @FindBy(xpath = "//mat-select[@formcontrolname='balanceType']")
    private WebElement balanceType;

    @FindBy(xpath = "(//span[@class='mat-option-text'])[2]")
    private WebElement balanceTypeOptions;

    @FindBy(xpath = "//ms-add-button[contains(@tooltip,'GENERAL.BUTTON')]//button")
    private WebElement BudgetAccountsAddButton;

    @FindBy(xpath = "//button[@style='width: 40px;']")
    private WebElement backButton;

    @FindBy(xpath = "//ms-text-field[@type='number']/input")
    private WebElement orderNoInput;

    @FindBy(xpath = "//input[@aria-autocomplete='list']")
    private WebElement expenceAccoundcode;

    @FindBy(xpath = "(//span[@class='mat-option-text'])[1]")
    private WebElement expenceAccoundcodeOptions;

    @FindBy(xpath = "(//mat-select[@role='combobox']/div/div)[1]")
    private WebElement budgetCategory;

    @FindBy(xpath = "//span[text()=' General ']")
    private WebElement budgetCategoryOptions;

    @FindBy(xpath = "//button[@aria-label='Close']")
    private WebElement budgetClose;

    @FindBy(xpath = "//ms-masked-text-field[@formcontrolname='iban']/input")
    private WebElement ibanInput;

    @FindBy(xpath = "(//mat-select[@role='combobox']//span)[4]")
    private WebElement currency;

    @FindBy(xpath = "(//span[@class='mat-option-text'])[3]")
    private WebElement currencyOption;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='integrationCode']/input")
    private WebElement integrationCodeInput;


    public void findElementAndClickFunction(String ElementName) {

        switch (ElementName) {
            case "loginButton":
                myElement = loginButton;
                break;

            case "gotItBtn":
                if (gotItBtns.size() == 0)
                    return;

                myElement = gotItBtn;
                break;

            case "addButton":
                myElement = addButton;
                break;

            case "saveButton":
                myElement = saveButton;
                break;

            case "yesButton":
                myElement = yesButton;
                break;

            case "subjectCategory":
                myElement = subjectCategory;
                break;

            case "subjectOption":
                myElement = subjectOption;
                break;

            case "style":
                myElement = style;
                break;

            case "addButtonReports":
                myElement = addButtonReports;
                break;


            case "addVersion":
                myElement = addVersion;
                break;

            case "closeButton":
                myElement = closeButton;
                break;

            case "salaryUserType":
                myElement = salaryUserType;
                break;

            case "salaryUserTypeOption":
                myElement = salaryUserTypeOption;
                break;

            case "countrySelect":
                myElement = countrySelect;
                break;

            case "countryOption":
                myElement = countryOption;
                break;

            case "Group5Country":
                myElement = Group5Country;
                break;

            case "validFromInput":
                myElement = validFromInput;
                break;

            case "calendar":
                myElement = calendar;
                break;

            case "type":
                myElement = type;
                break;

            case "typeOptions":
                myElement = typeOptions;
                break;

            case "balanceType":
                myElement = balanceType;
                break;

            case "balanceTypeOptions":
                myElement = balanceTypeOptions;
                break;

            case "BudgetAccountsAddButton":
                myElement = BudgetAccountsAddButton;
                break;

            case "backButton":
                myElement = backButton;
                break;

            case "expenceAccoundcode":
                myElement = expenceAccoundcode;
                break;

            case "expenceAccoundcodeOptions":
                myElement = expenceAccoundcodeOptions;
                break;

            case "searchButton":
                myElement = searchButton;
                break;

            case "budgetCategory":
                myElement = budgetCategory;
                break;

            case "budgetCategoryOptions":
                myElement = budgetCategoryOptions;
                break;

            case "budgetClose":
                myElement = budgetClose;
                break;

            case "currency":
                myElement = currency;
                break;

            case "currencyOption":
                myElement = currencyOption;
                break;
        }

        clickFunction(myElement);
    }


    public void findElementAndSendKeysFunction(String ElementName, String value) {

        switch (ElementName) {
            case "username":
                myElement = username;
                break;

            case "password":
                myElement = password;
                break;

            case "inputNamePositionSalary":
                myElement = inputNamePositionSalary;
                break;

            case "nameInput":
                myElement = nameInput;
                break;

            case "shortName":
                myElement = shortName;
                break;

            case "codeInput":
                myElement = codeInput;
                break;

            case "rowSizeExcelTemplate":
                myElement = rowSizeExcelTemplate;
                break;

            case "columnSizeExcelTemplate":
                myElement = columnSizeExcelTemplate;
                break;

            case "description":
                myElement = description;
                break;

            case "variable":
                myElement = variable;
                break;

            case "priority":
                myElement = priority;
                break;

            case "amount":
                myElement = amount;
                break;

            case "salaryConstantNameInput":
                myElement = salaryConstantNameInput;
                break;

            case "keyInput":
                myElement = keyInput;
                break;

            case "valueInput":
                myElement = valueInput;
                break;

            case "orderNoInput":
                myElement = orderNoInput;
                break;

            case "searchNameInput":
                myElement = searchNameInput;
                break;

            case "ibanInput":
                myElement = ibanInput;
                break;

            case "integrationCodeInput":
                myElement = integrationCodeInput;
                break;
        }

        sendKeysFunction(myElement, value);
    }


    public void findElementAndVerifyContainsText(String ElementName, String msg) {
        switch (ElementName) {
            case "msjContainer":
                myElement = msjContainer;
                break;

            case "ErrorMessage":
                myElement = ErrorMessage;
                break;
        }

        verifyElementContainsText(myElement, msg);
    }

    public void editAndDeleteFunction(String leftNavName, String editOrDelete) {

       if (msjContainers.size()>0) {
           if (msjContainer.isDisplayed())
               wait.until(ExpectedConditions.invisibilityOfAllElements(msjContainer));
       }

        List<WebElement> btnList = new ArrayList<>();

        if (editOrDelete.equalsIgnoreCase("delete"))
            btnList = waitVisibleListAllElement(deleteButtonList);
        else
            btnList = waitVisibleListAllElement(editButtonList);

        List<WebElement> nameListNew = waitVisibleListAllElement(nameList);
        for (int i = 0; i < nameListNew.size(); i++) {
            if (nameListNew.get(i).getText().equalsIgnoreCase(leftNavName)) {
                clickFunction(btnList.get(i));
            }
        }
    }
}