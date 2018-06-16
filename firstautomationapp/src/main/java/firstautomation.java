import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class firstautomation {
    @Test
    public void test() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/thanosbabalas/IdeaProjects/firstautomationapp/src/main/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.facebook.com");
        driver.manage().window().maximize();
        driver.findElement(By.name("firstname")).sendKeys("first_name_automated_user");
        driver.findElement(By.name("lastname")).sendKeys("last_name_automated_user");
        driver.findElement(By.name("reg_email__")).sendKeys("email@automated_user.com");
        driver.findElement(By.name("reg_passwd__")).sendKeys("password_automated");

        Select day = new Select(driver.findElement(By.name("birthday_day")));
		day.selectByIndex(15);

		driver.findElement(By.name("birthday_year")).sendKeys("1989");
        driver.findElement(By.name("birthday_month")).sendKeys("Ιούνιος");

        driver.findElement(By.name("websubmit")).click();
        WebElement rdBtn_Exp = driver.findElement(By.id("u_0_a"));
        rdBtn_Exp.click();
        Thread.sleep(5000);

        driver.close();
        driver.quit();
    }
}

