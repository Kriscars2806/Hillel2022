import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import com.codeborne.selenide.Selenide;
import io.github.bonigarcia.wdm.WebDriverManager;



import static com.codeborne.selenide.Selenide.$;
public class HilelTest {

    @Test
    public void homePageTest() {
        //System.out.println("Hello");

        WebDriverManager.chromedriver().setup();

        Selenide.open("https://next.privat24.ua/money-transfer/card");

        Selenide.$("[data-qa-node='numberdebitSource']").sendKeys("4552 3314 4813 8217");
        Selenide.$("[data-qa-node='expiredebitSource']").sendKeys("0524");
        Selenide.$("[data-qa-node='cvvdebitSource']").sendKeys("926");
       Selenide.$("[data-qa-node='firstNamedebitSource']").sendKeys("Kris");
       Selenide.$("[data-qa-node='lastNamedebitSource']").sendKeys("Hope");
       Selenide.$("[data-qa-node='numberreceiver']").sendKeys("4004 1591 1544 9003");
       Selenide. $("[data-qa-node='firstNamereceiver']").sendKeys("Olga");
       Selenide.$("[data-qa-node='lastNamereceiver']").sendKeys("Dimitrieva");
       Selenide.$("[data-qa-node='amount']").sendKeys("123");
       Selenide.$("[data-qa-node='currency']").click();
       Selenide.$("[data-qa-value='USD']").click();
       Selenide.$("[class='sc-VigVT hcHAAV']").click();
        Selenide.$("[data-qa-node='payer-card']").shouldHave(Condition.text("4552 3314 4813 8217"));
        Selenide.$("[data-qa-node='payer-amount']").shouldHave(Condition.text("123 USD"));
        Selenide.$("[data-qa-node='payer-currency']").shouldHave(Condition.text("5.41 USD"));
        Selenide.$("[data-qa-node='receiver-name']").shouldHave(Condition.text("Olga Dimitrieva"));
        Selenide.$("[data-qa-node='receiver-card']").shouldHave(Condition.text("4004 1591 1544 9003"));
        Selenide.$("[data-qa-node='receiver-amount']").shouldHave(Condition.text("123 USD"));
        Selenide.$("[data-qa-node='receiver-currency']").shouldHave(Condition.text("0 USD"));
        Selenide.$("[class='sc-chPdSV iiqwfv']").shouldHave(Condition.text("128.41 USD"));
        Selenide.$("[data-qa-node='submit']").click();

    }
}
