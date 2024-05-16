package pom.Click;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OpenPositionsClick implements IClick{
    @Override
    public void click(WebDriver driver) throws InterruptedException {
        driver.findElement(By.xpath("//a[@href='/tr/#open-positions']")).click();
        Thread.sleep(2000);
    }
}
