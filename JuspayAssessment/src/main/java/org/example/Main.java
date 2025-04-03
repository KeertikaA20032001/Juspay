package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
//        driver.get("https://www.amazon.in/");
        driver.get("https://www.flipkart.com/");
        WebElement searchBox=driver.findElement(By.xpath("//input[contains(@type,\"text\")]"));
        searchBox.sendKeys("Shoes");
        searchBox.submit();
        driver.findElement(By.xpath("(//div[text()=\"ADIDAS\"])[1]")).click();
        driver.findElement(By.xpath("//div[@class=\"WOvzF4\"]"));
        driver.findElement(By.xpath("//div[text()=\"Newest First\"]")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement emailField = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(@title,\"Track-Tech Running Shoes For Men\")]")));
//       driver.findElement(By.xpath("//a[contains(@title,\"Track-Tech Running Shoes For Men\")]")).click();
//        driver.findElement(By.xpath("//a[contains(@href, '/adidas-torbar-m-running-shoes-men')][3]")).click();
        String mainWindowHandle = driver.getWindowHandle();
        driver.findElement(By.xpath("//div[@data-id=\"SHOGW4GFJAGZCQMV\"]")).click();
        Set<String> allWindowHandles = driver.getWindowHandles();
        driver.findElement(By.xpath("//button[text()='Add to cart']"));
        driver.findElement(By.xpath("//span[text()='Place Order']"));






//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.scrollBy(0,500)");
//        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
//        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(20));
//        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Add to cart']")));
//       WebElement element = driver.findElement(By.xpath("//button[text()='Add to cart']"));
//        js.executeScript("arguments[0].scrollIntoView(true);", element);
//        long lastHeight = (long) js.executeScript("return document.body.scrollHeight");
//        while (true) {
//            js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
//            try {
//                Thread.sleep(2000); // Wait for new content to load
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            long newHeight = (long) js.executeScript("return document.body.scrollHeight");
//            if (newHeight == lastHeight) {
//                break;
//            }
//            lastHeight = newHeight;
//        }
//        Thread.sleep(3000);
//        driver.close();







//        ------------------------NYKA___________________
//        driver.get("https://www.nykaa.com/");
//        driver.findElement(By.xpath("//div[contains(@class,\"megaMenu_main\")][1]"));
//        driver.findElement(By.xpath("//input[contains(@name,\"search\")]")).sendKeys("Facemasks");



//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//        try {
//            WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[contains(@kind, \"secondary\")][1]")));
//            element.click();
//        } catch (Exception e) {
//            System.out.println("Element not found: " + e.getMessage());
//        }
//
//      WebElement emailField = driver.findElement(By.xpath("//input[@name=\"emailMobile\"]"));
//        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
//        WebElement emailField = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name=\"emailMobile\"]")));
//        emailField.sendKeys("keertiark2001@gmail.com");
//        emailField.submit();
//        WebElement passwordField = driver.findElement(By.xpath(""));
//        passwordField.sendKeys("Keerti@2001"); // Do NOT hardcode passwords in real tests!
//        passwordField.submit();



    }
}