package pom.Click;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardClick implements IClick{
    @Override
    public void click(WebDriver driver) {

        driver.findElement(By.xpath("//a[@href='/tr/dashboard/']")).click();

    }}


