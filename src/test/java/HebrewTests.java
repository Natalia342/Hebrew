import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class HebrewTests {
    WebDriver wd;
    @BeforeMethod
    public void preCondition(){
        wd=new ChromeDriver();
        wd.navigate().to("https://telranedu.web.app/home");
  //      wd.navigate().to("https://www.zebratix.com/?gclid=Cj0KCQiA-rj9BRCAARIsANB_4ACKtBcEamSd_tPOiMk1ya5uSECytwfjY2rAHNFRFXMhja-vFRYzPM0aAmIqEALw_wcB");
    }
    @Test
    public void testFind(){
//        WebElement element = wd.findElement(By.xpath("//h3[text()='זברה לשירותכם']"));
//        System.out.println(element);
        WebElement element = wd.findElement(By.xpath("//div[@class='search-results']"));
 //       WebElement element = wd.findElement(By.xpath("//div[@class='pace-activity']"));
        System.out.println(element);
    }
    @AfterMethod
    public void postCondition(){
        //    wd.quit();
    }
}
