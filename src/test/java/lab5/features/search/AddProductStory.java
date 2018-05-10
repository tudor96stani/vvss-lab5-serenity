package lab5.features.search;

import lab5.steps.serenity.AddUserSteps;
import lab5.steps.serenity.EndUserSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Issue;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Pending;
import net.thucydides.core.annotations.Steps;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
/**
 * Created by tudorstanila on 10/05/2018.
 */
@RunWith(SerenityRunner.class)
public class AddProductStory {
    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @Steps
    public AddUserSteps tudor;


    @Issue("#ADD-1")
    @Test
    public void adding_correct_data_should_display_the_success_message() {
        tudor.is_the_home_page();
        tudor.looks_for("12345","ABC","Categ","120");
        tudor.should_see_definition("Added");

    }

    @Test
    public void adding_incorrect_data_should_display_the_error_message() {
        tudor.is_the_home_page();
        tudor.looks_for("-12345","ABC","Categ","120");
        tudor.should_see_definition("Not added");

    }

}
