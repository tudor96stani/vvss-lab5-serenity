package lab5.features.search;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Issue;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Pending;
import net.thucydides.core.annotations.Steps;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import lab5.steps.serenity.EndUserSteps;

@RunWith(SerenityRunner.class)
public class SearchByKeywordStory {

    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @Steps
    public EndUserSteps anna;

    @Issue("#WIKI-1")
    @Test
    public void searching_by_keyword_apple_should_display_the_corresponding_article() {
        anna.is_the_home_page();
        anna.looks_for("apple");
        anna.should_see_definition("A common, round fruit produced by the tree Malus domestica, cultivated in temperate climates.");

    }

    @Test
    public void searching_by_keyword_banana_should_display_the_corresponding_article() {
        anna.is_the_home_page();
        anna.looks_for("pear");
        anna.should_see_definition("An edible fruit produced by the pear tree, similar to an apple but elongated towards the stem.");
    }

    @Test
    public void searching_by_keyword_computer_should_display_the_corresponding_article(){
        anna.is_the_home_page();
        anna.looks_for("computer");
        anna.should_see_definition("(now rare, chiefly historical) A person employed to perform computations; one who computes.");
    }


    @Test
    public void searching_by_keyword_elephant_should_display_the_corresponding_article(){
        anna.is_the_home_page();
        anna.looks_for("elephant");
        anna.should_see_definition("A mammal of the order Proboscidea, having a trunk, and two large ivory tusks jutting from the upper jaw.");
    }

    @Pending @Test
    public void searching_by_ambiguious_keyword_should_display_the_disambiguation_page() {
    }
} 