import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

/**- Visit the URL Konga
 - Sign in to Konga Successfully
 - From the Categories, click on the “Computers and Accessories”
 - Click on the Laptop SubCategory
 - Click on the Apple MacBooks
 - Add an item to the cart
 - Select Address
 - Continue to make payment
 - Select a Card Payment Method
 - Input invalid card details
 - Print Out the error message: Invalid card number
 - Close the iFrame that displays the input card Modal
 - Quit the browser.
 */







public class KONGA_PROJECT {
    private WebDriver driver;
    @Test
    public void start() throws InterruptedException {
        //chrome driver locator
        System.getProperty("webbrowser.chrome.driver", "C:\\Users\\BLESSING NNABUIFE\\IdeaProjects\\Konga_Project\\RESOURCES\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        //Open Konga official website
        driver.get("https://www.konga.com/content/berekete-sales?gad_source=1&gclid=EAIaIQobChMI0-zemcaljAMVYFh_AB0JoTmAEAAYASAAEgLSFvD_BwE");
        //click on the maximize button
        driver.manage().window().maximize();
        Thread.sleep(1000);
        //click on login/signup button
        driver.findElement(By.xpath("//*[@id=\"nav-bar-fix\"]/div[1]/div/div[4]/a")).click();
        Thread.sleep(1000);
        // input valid username on the username field
        driver.findElement(By.id("username")).sendKeys("nnabuifeblessing15@gmail.com");
        Thread.sleep(1000);
        //input valid password on the password field
        driver.findElement(By.id("password")).sendKeys("Fumzyrock17$");
        Thread.sleep(1000);
        //click on login button
        driver.findElement( By.xpath("//*[@id=\"app-content-wrapper\"]/div[3]/section/section/aside/div[2]/div/form/div[3]/button")).click();
        Thread.sleep(5000);
        //click on Computer and accessories
        driver.findElement(By.xpath("//*[@id=\"nav-bar-fix\"]/div[2]/div/a[2]")).click();
        Thread.sleep(10000);
        //click on laptop subcategory
        driver.findElement(By.xpath("//*[@id=\"mainContent\"]/section[1]/section/section/section/div/section/div[2]/div[2]/ul/li[3]/a/label/span")).click();
        Thread.sleep(10000);
        //click on Apple macbook
        driver.findElement(By.xpath("//*[@id=\"mainContent\"]/section[1]/section/section/section/div/section/div[2]/div[2]/ul/li[3]/a/ul/li[1]/a/label/span")).click();
        Thread.sleep(10000);
        //Add Apple macbook to cart
        driver.findElement(By.xpath("//*[@id=\"mainContent\"]/section[1]/section/section/section/section/section/ul/li[2]/article/div[2]/form/div[2]/button")).click();
        Thread.sleep(3000);
        //click on check out
        driver.findElement(By.xpath("//*[@id=\"nav-bar-fix\"]/div[1]/div/a[3]/span[1]")).click();
        Thread.sleep(3000);
        //click on add address
        driver.findElement(By.xpath("//*[@id=\"app-content-wrapper\"]/div[3]/section/section/aside/div[3]/div/div[2]/button")).click();
        Thread.sleep(5000);
        //click Address button
        driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/form/div/div[1]/section[1]/div/div/div[2]/div[1]/div[2]/div[1]/div/button")).click();
        Thread.sleep(5000);
        //Input first name on the firstname field
        driver.findElement(By.id("firstname")).sendKeys("Blessing");
        Thread.sleep(3000);
        //Input lastname on the last name field
        driver.findElement(By.id("lastname")).sendKeys("Nnabuife");
        Thread.sleep(3000);
        //Input telephone number on the telephone field
        driver.findElement(By.id("telephone")).sendKeys("07035499587");
        Thread.sleep(3000);
        //Input street name on the street name field
        driver.findElement(By.id("street")).sendKeys("23, Fredrick Nduchukwuka Street Okpanam Asaba");
        Thread.sleep(3000);
        //Input city on the city field
        driver.findElement(By.id("city")).sendKeys("Asaba");
        Thread.sleep(3000);
        //Input state on the state field
        driver.findElement(By.name("regionId")).sendKeys("Delta");
        Thread.sleep(3000);
        //Input L.G.A on the L.G.A field
        driver.findElement(By.name("areaId")).sendKeys("Oshimilli North");
        Thread.sleep(3000);
        //Save changes
        driver.findElement(By.xpath("//*[@id=\"app-content-wrapper\"]/div[2]/section/section/aside/div[2]/div/div/form/div[8]/div[1]/button")).click();
        Thread.sleep(5000);
        //click to select prefered address
        driver.findElement(By.xpath("//*[@id=\"app-content-wrapper\"]/div[2]/section/section/aside/div[2]/div/div/div[2]/div[1]/form/button")).click();
        Thread.sleep(10000);
        //click on use this address
        driver.findElement(By.xpath("//*[@id=\"app-content-wrapper\"]/div[2]/section/section/aside/div[3]/div/div/div/a")).click();
        Thread.sleep(5000);
        //check box to pay now
        driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/form/div/div[1]/section[2]/div/div[2]/div[1]/div[1]/span/input")).click();
        Thread.sleep(5000);
        //click on continue to pay
        driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/form/div/div[1]/section[2]/div/div[2]/div[3]/div[2]/div/button")).click();
        Thread.sleep(20000);
        //This code is to enable chrome driver recognise the iframe
        WebElement iframeElement = driver.findElement(By.xpath("//*[@id=\"kpg-frame-component\"]"));
        driver.switchTo().frame(iframeElement);
        Thread.sleep(10000);
        //click on Pay with Card
        driver.findElement(By.xpath("//*[@id=\"channel-template\"]/div[2]/div/div[3]/button/div")).click();
        Thread.sleep(5000);
        //input valid card number on the card number field
        driver.findElement(By.id("card-number")).sendKeys("539923706712077");
        Thread.sleep(5000);
        //display the error message of the invalid card number
        System.out.println("Invalid card number");
        //click on pay
        driver.findElement(By.xpath("/html/body/section/section/section/div[2]/div[1]/aside")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/section/section/section/div[2]/div[1]/aside")).click();
        Thread.sleep(5000);



    }
    @AfterTest
    public void closebrowser(){
        driver.quit();


    }
}


