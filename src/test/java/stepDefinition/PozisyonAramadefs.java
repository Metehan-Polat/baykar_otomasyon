package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pom.PozisyonArama.Pozisyon;
import pom.base.Base;

public class PozisyonAramadefs extends Base {
    Pozisyon pozisyon=new Pozisyon();
    @Then("Tüm acik pozisyonlara tikla")
    public void tümAcikPozisyonlaraTikla() {
        pozisyon.acıkPozisyonClick(getDriver());
    }

    @When("Is ilani araya gel")
    public void ısIlaniArayaGel() {
        pozisyon.ilanArama(getDriver(),getElement());
    }

    @Then("Aramayan Akıllı Web Sistemleri Yazılım Test Uzmanı yaz")
    public void aramayanAkıllıWebSistemleriYazılımTestUzmanıYaz() throws InterruptedException {
    pozisyon.ilanAramaYaz(getDriver(),getElement());
    }

    @And("Gelen Sonuca tikla")
    public void gelenSonucaTikla() throws InterruptedException {
        pozisyon.gelenSonuc(getDriver());
    }

    @And("Arama ve gelen sonucu karsilastir")
    public void aramaVeGelenSonucuKarsilastir() {
        pozisyon.kıyaslama(getDriver(),getElement());
    }
}
