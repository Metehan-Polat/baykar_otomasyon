package pom.Click;

import org.openqa.selenium.WebDriver;

public class ChooseClick {

 IClick iClick;

    public ChooseClick(IClick iClick)
    {
        this.iClick=iClick;
    }


    public void clickButtons(WebDriver driver) throws InterruptedException {
        iClick.click(driver);
    }
}


