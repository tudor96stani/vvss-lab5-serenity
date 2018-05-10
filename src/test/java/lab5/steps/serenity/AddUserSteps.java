package lab5.steps.serenity;

import lab5.pages.AddPage;
import net.thucydides.core.annotations.Step;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;

/**
 * Created by tudorstanila on 10/05/2018.
 */
public class AddUserSteps {
    AddPage page;

    @Step
    public void enters(String code,String name,String category,String quantity) {
        page.enter_keywords(code,name,category,quantity);
    }

    @Step
    public void starts_search() {
        page.lookup_terms();
    }

    @Step
    public void should_see_definition(String definition) {
        assertThat(page.getDefinitions(), hasItem(containsString(definition)));
    }

    @Step
    public void is_the_home_page() {
        page.open();
    }

    @Step
    public void looks_for(String code,String name,String category,String quantity) {
        enters(code,name,category,quantity);
        starts_search();
    }
}
