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
    public void starts_adding() {
        page.add_product();
    }

    @Step
    public void should_see_result(String definition) {
        assertThat(page.getResult(), hasItem(containsString(definition)));
    }

    @Step
    public void is_the_home_page() {
        page.open();
    }

    @Step
    public void adds(String code, String name, String category, String quantity) {
        enters(code,name,category,quantity);
        starts_adding();
    }
}
