package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkPartialLinkText {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");

        // LinkText
        driver.findElement(By.linkText("Gmail")).click();

        driver.navigate().back();

        // Partial LinkText
        driver.findElement(By.partialLinkText("Imag")).click();
    }
}

