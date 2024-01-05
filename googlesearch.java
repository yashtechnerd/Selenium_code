import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.net.URL;

public class GoogleSearchtest {

    public static void main(String[] args) {
        try {
            // Specify Selenium Grid Hub URL
            URL gridUrl = new URL("http://localhost:4444/wd/hub"); 
            
            // Define ChromeOptions
            ChromeOptions options = new ChromeOptions();
            
            // Initialize WebDriver using RemoteWebDriver pointing to Grid Hub
            WebDriver driver = new RemoteWebDriver(gridUrl, options);
            
            // Open Google
            driver.get("https://www.google.com");
            
            // Close the browser
            driver.quit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
