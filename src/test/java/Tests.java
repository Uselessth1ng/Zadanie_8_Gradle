import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.net.MalformedURLException;
import java.net.URL;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class Tests {

    @Test
    void testDropdown() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities("chrome", "120.0", Platform.LINUX);
        WebDriver driver  = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), caps, false);
        driver.get("https://the-internet.herokuapp.com/inputs");
        String title = driver.findElement(By.xpath("//h3")).getText();
        assertEquals("Inputs", title);
        driver.quit();
    }
}
