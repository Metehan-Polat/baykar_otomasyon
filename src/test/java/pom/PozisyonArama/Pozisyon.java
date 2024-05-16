package pom.PozisyonArama;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Pozisyon  {

    public void acıkPozisyonClick(WebDriver driver)
    {
        driver.findElement(By.xpath("//a[@href='/tr/basvuru/acik-pozisyonlar/']")).click();
    }
    public WebElement ilanArama(WebDriver driver,WebElement webElement)
    {
        webElement=driver.findElement(By.xpath("//input[@id='myInput']"));
        return webElement;
    }
    public void ilanAramaYaz(WebDriver driver,WebElement element) throws InterruptedException {
        ilanArama(driver,element).sendKeys("Akıllı Web Sistemleri Yazılım Test Uzmanı");
        Thread.sleep(3000);

    }
    public void gelenSonuc(WebDriver driver) throws InterruptedException {
        driver.findElement(By.xpath("//a[@href='/tr/basvuru/acik-pozisyonlar/akilli-web-sistemleri-yazilim-test-uzmani']")).click();
        Thread.sleep(2000);


    }
    public void kıyaslama(WebDriver driver, WebElement element)
    {   String a="Akıllı Web Sistemleri Yazılım Test Uzmanı";
        element=driver.findElement(By.xpath("//*[text()='Akıllı Web Sistemleri Yazılım Test Uzmanı']"));
        String b= element.getText();
        Assert.assertEquals(a,b);
    }
}

