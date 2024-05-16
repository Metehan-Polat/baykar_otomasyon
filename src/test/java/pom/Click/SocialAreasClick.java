package pom.Click;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SocialAreasClick implements IClick{
    @Override
    public void click(WebDriver driver) {
        driver.findElement(By.xpath("//a[@href='/tr/#life_in_baykar']")).click();

    }
}
