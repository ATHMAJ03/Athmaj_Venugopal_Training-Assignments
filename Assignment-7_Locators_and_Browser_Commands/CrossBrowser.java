package Assignment;

import java.util.Scanner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class CrossBrowser {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter browser name (chrome / firefox / edge): ");
        String browser = sc.nextLine();

        WebDriver driver = null;

        if (browser.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
        } 
        else if (browser.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
        } 
        else if (browser.equalsIgnoreCase("edge")) {
            driver = new EdgeDriver();
        } 
        else {
            System.out.println("Invalid browser");
            return;
        }

        driver.manage().window().maximize();
        driver.get("https://www.wikipedia.org/");

        System.out.println("Title is: " + driver.getTitle());
        driver.quit();
    }
}
