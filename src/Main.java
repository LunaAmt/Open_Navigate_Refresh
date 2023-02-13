import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.wikipedia.org/");
        driver.findElement(By.id("js-link-box-en")).click();
        driver.navigate().back();
        driver.navigate().refresh();
        driver.quit();


    }
}