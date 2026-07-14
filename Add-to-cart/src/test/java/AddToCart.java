import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class AddToCart {

    WebDriver driver;

    @BeforeMethod
    public void openLinkDashboard() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://member.daraz.lk/user/login"); //navigate to Daraz login page
        Thread.sleep(5000);

    }

    @Test
    public void addItem() throws InterruptedException {

        //Account login
        WebElement email = driver.findElement(By.xpath("//input[@type='text']"));
        email.sendKeys("kifyclothing@gmail.com"); //add email

        WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
        password.sendKeys("Navoda@925929"); //enter password
        Thread.sleep(3000);

        WebElement button = driver.findElement(By.xpath("//button[@type='submit']"));
        button.submit(); //click login button
        Thread.sleep(10000);

        //search the product
        WebElement searchBar = driver.findElement(By.id("q"));
        searchBar.sendKeys("iphone 17 pro max");
        Thread.sleep(2000);
        searchBar.submit();


        //select the relevant item
        driver.findElement(By.xpath("//a[normalize-space()='Apple iPhone 17 Pro Max 256GB (E Sim)']")).click();
        Thread.sleep(5000);

        //get product details
        List<WebElement> productDetails = driver.findElements(By.xpath("(//div[contains(@class,'html-content pdp-product-highlights')])[1]"));
        System.out.println(productDetails.size());
        Thread.sleep(10000);
        for(WebElement pDetails :productDetails){
            System.out.println("Product Details: " + pDetails.getText());
        }
        Thread.sleep(10000);


        List<WebElement> colour = driver.findElements(By.xpath("//span[normalize-space()='Silver']"));
        List<WebElement> storage = driver.findElements(By.xpath("//span[contains(@class,'sku-name')][normalize-space()='256GB']"));

        if (!colour.isEmpty() && !storage.isEmpty()) {

            WebElement addToCart = driver.findElement(By.xpath("//span[contains(text(),'Add to Cart')]"));
            addToCart.click();

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement closeBtn = wait.until(
                    ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(@class,'next-dialog-close')]")));
            closeBtn.click();

        } else {
            System.out.println("Required variant is not available.");
        }

        //check the cart
        WebElement cart = driver.findElement(By.xpath("//span[@class='cart-icon-daraz']//*[name()='svg']"));
        Thread.sleep(5000);
        cart.click();
        System.out.println("Product added to your Cart.");

    }
}
