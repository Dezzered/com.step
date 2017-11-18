package pages;

import org.openqa.selenium.By;
import org.testng.Assert;

/**
 * Created by Englich on 11.11.2017.
 *
 */
public class HeadphonesPage extends CommonCatalogPage {
    private static By HEADPHONES_PAGE_TITLE = By.cssSelector(".schema-header__title");

    public HeadphonesPage() {
        super();
    }

    public HeadphonesPage isHeadphonesPageOpened () {
        Assert.assertTrue(driver.findElement(HEADPHONES_PAGE_TITLE).getText().contains("Наушники и гарнитуры"));
        return new HeadphonesPage();
    }
}
