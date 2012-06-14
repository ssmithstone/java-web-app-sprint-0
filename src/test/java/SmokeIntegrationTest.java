import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

public class SmokeIntegrationTest {

    @Test
    public void weHaveSmoke(){
        WebDriver driver = new HtmlUnitDriver();
        driver.get("http://localhost:9999/sprint_web/index.jsp");
        assertThat(driver.findElement(By.id("welcome_message")).getText(), equalTo("Hello World!"));
    }
}
