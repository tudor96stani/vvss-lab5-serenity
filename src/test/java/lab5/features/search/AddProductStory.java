package lab5.features.search;

import lab5.steps.serenity.AddUserSteps;
import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Issue;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.Pages;
import net.thucydides.junit.annotations.Qualifier;
import net.thucydides.junit.annotations.UseTestDataFrom;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;



/**
 * Created by tudorstanila on 10/05/2018.
 */
@RunWith(SerenityParameterizedRunner.class)
@UseTestDataFrom(value = "/Users/tudorstanila/Documents/an3sem2/ssvv/Lab1/lab5/src/test/resources/features/add/AddData.csv")
public class AddProductStory {
    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @Steps
    public AddUserSteps tudor;

    private String code;
    private String name;
    private String quantity;
    private String category;
    private String result;


    @Issue("#ADD-1")
    @Test
    public void adding_data_should_display_the_correct_message() {
        tudor.is_the_home_page();
        tudor.adds(getCode(),getName(),getCategory(),getQuantity());
        tudor.should_see_result(getResult());


    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    @Qualifier
    public String getQualifier() {
        return code;
    }
}
