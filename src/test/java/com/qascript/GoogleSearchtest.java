import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchTest {

    public static void main(String[] args) {
        try {
            // Set ChromeDriver path - adjust this to your ChromeDriver's location
            System.setProperty("webdriver.chrome.driver", "C:\Jenkins\tools\chromedriver.exe");
            
            // Initialize ChromeDriver
            WebDriver driver = new ChromeDriver();
            
            // Open Google
            driver.get("https://www.google.com");
            
            // Optional: Perform actions on the webpage
            
            // Close the browser
            driver.quit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
