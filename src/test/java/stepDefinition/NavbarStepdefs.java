package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pom.Click.*;
import pom.base.Base;
import pom.url.GetUrl;

public class NavbarStepdefs extends Base {




    @Given("{string} ı  ac")
    public void ıAc(String arg0) {
        this.driver(arg0);
    }

    @And("Baykar sayfasına git")
    public void baykarSayfasınaGit() {
        GetUrl getUrl=new GetUrl();
        getUrl.url(getDriver());
    }

    @When("Kariyer'e gel")
    public void kariyerEGel() throws InterruptedException {
        ChooseClick chooseClick=new ChooseClick(new KariyerClick());
        chooseClick.clickButtons(getDriver());
    }

    @Then("İstatistik'e tikla")
    public void istatistikETikla() throws InterruptedException {
        ChooseClick chooseClick=new ChooseClick(new StatisticsClick());
        chooseClick.clickButtons(getDriver());
    }

    @And("Yerleskemiz'e tikla")
    public void yerleskemizETikla() throws InterruptedException {
        ChooseClick chooseClick=new ChooseClick(new OurCampusesClick());
        chooseClick.clickButtons(getDriver());
    }

    @And("Sundugumuz Faydalar'a tikla")
    public void sundugumuzFaydalarATikla() throws InterruptedException {
        ChooseClick chooseClick=new ChooseClick(new TheBenefitsWeOfferClick());
        chooseClick.clickButtons(getDriver());
    }

    @And("Sosyal Alanlar'a tikla")
    public void sosyalAlanlarATikla() throws InterruptedException {
        ChooseClick chooseClick=new ChooseClick(new SocialAreasClick());
        chooseClick.clickButtons(getDriver());
    }

    @And("Acik Pozisyonlara tikla")
    public void acikPozisyonlaraTikla() throws InterruptedException {
        ChooseClick chooseClick=new ChooseClick(new OpenPositionsClick());
        chooseClick.clickButtons(getDriver());
    }

    @When("Staj'a gel")
    public void stajAGel() throws InterruptedException {

        ChooseClick chooseClick=new ChooseClick(new IntershipClick());
        chooseClick.clickButtons(getDriver());
    }

    @Then("Staj Donemlerine tikla")
    public void stajDonemlerineTikla() throws InterruptedException {
        ChooseClick chooseClick=new ChooseClick(new InternshipSeasonsClick());
        chooseClick.clickButtons(getDriver());
        Thread.sleep(1000);
    }

    @And("Staj SSS'ye tikla")
    public void stajSSSYeTikla() throws InterruptedException {
        ChooseClick chooseClick=new ChooseClick(new IntershipClick());
        chooseClick.clickButtons(getDriver());
        ChooseClick chooseClicks=new ChooseClick(new InternshipFAQsClick());
        chooseClicks.clickButtons(getDriver());
    }

    @And("SSS'ye tikla")
    public void sssYeTikla() throws InterruptedException {
        ChooseClick chooseClick=new ChooseClick(new FAQClick());
        chooseClick.clickButtons(getDriver());
    }

    @And("Baykar'a tıkla")
    public void baykarATıkla() throws InterruptedException {
        ChooseClick chooseClick=new ChooseClick(new BaykarClick());
        chooseClick.clickButtons(getDriver());
    }

    @And("EN'ye tikla")
    public void enYeTikla() throws InterruptedException {
        ChooseClick chooseClick=new ChooseClick(new TrClick());
        chooseClick.clickButtons(getDriver());
    }

    @And("Dashboard'a tikla")
    public void dashboardATikla() throws InterruptedException {
        ChooseClick chooseClick=new ChooseClick(new DashboardClick());
        chooseClick.clickButtons(getDriver());
    }

    @And("Kapat")
    public void kapat() {
        quitMethod();
    }

}
