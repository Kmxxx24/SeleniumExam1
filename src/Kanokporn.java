import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import junit.framework.Assert;

class Kanokporn {

    @Test
    void Kanokporn() throws InterruptedException {
        WebDriver driver = null;

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\chromedriver.exe");
        driver = new ChromeDriver();

        driver.get("https://nxtgenaiacademy.com/demo-site/");

        
        driver.findElement(By.id("vfb-5")).sendKeys("Kanokporn");
        driver.findElement(By.id("vfb-7")).sendKeys("Donpaitee");
        
        driver.findElement(By.id("vfb-31-2")).sendKeys("Female");
        
        driver.findElement(By.id("vfb-13-address")).sendKeys("กำแพงแสน");
        driver.findElement(By.id("vfb-13-address-2")).sendKeys("121");
        driver.findElement(By.id("vfb-13-city")).sendKeys("ห้วยม่วง");
        driver.findElement(By.id("vfb-13-state")).sendKeys("นครปฐม");
        driver.findElement(By.id("vfb-13-zip")).sendKeys("73180");
        driver.findElement(By.id("vfb-14")).sendKeys("644259001@webmail.npru.ac.th");
        driver.findElement(By.id("vfb-18")).sendKeys("02/08/2023");
        driver.findElement(By.id("vfb-19")).sendKeys("0123467890");
        
        driver.findElement(By.id("vfb-20-0")).click();
        driver.findElement(By.id("vfb-20-1")).click();
        driver.findElement(By.id("vfb-20-2")).click();
        driver.findElement(By.id("vfb-20-3")).click();
        driver.findElement(By.id("vfb-20-4")).click();
        driver.findElement(By.id("vfb-20-5")).click();
        
        driver.findElement(By.id("vfb-23")).sendKeys("no");
        driver.findElement(By.id("vfb-3")).sendKeys("99");
        
        driver.findElement(By.id("vfb-4")).click();
        
        
        String result = driver.findElement(By.xpath("//*[@id=\"main\"]/div[2]/div[1]/div/div/div/div/div/div/div/h2")).getText();
        assertEquals("Dynamic Transaction Verification",result);
        
        String title = driver.getTitle();
        System.out.print(title);
        
        
        Thread.sleep(5000);
        driver.quit();
    }
}