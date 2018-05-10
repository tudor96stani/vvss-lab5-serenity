package lab5.pages;


import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.ArrayList;
import java.util.stream.Collectors;

import net.serenitybdd.core.annotations.findby.FindBy;

import net.thucydides.core.pages.PageObject;

import java.util.List;

/**
 * Created by tudorstanila on 10/05/2018.
 */
@DefaultUrl("http://localhost:8080/AddServlet.html")
public class AddPage extends PageObject {

    @FindBy(name="code")
    private WebElementFacade code;

    @FindBy(name="name")
    private WebElementFacade name;

    @FindBy(name="category")
    private WebElementFacade category;

    @FindBy(name="quantity")
    private WebElementFacade quantity;

    @FindBy(name="addBtn")
    private WebElementFacade addBtn;


    public void enter_keywords(String code,String name,String category,String quantity) {

        this.code.type(code);
        this.name.type(name);
        this.quantity.type(quantity);
        this.category.type(category);
    }

    public void add_product() {
        addBtn.click();
    }

    public List<String> getResult() {
        WebElementFacade definitionList = find(By.id("res"));
        String text = definitionList.getText();
        List<String> list = new ArrayList<>();
        list.add(text);
        return list;
    }
}
