import com.thoughtworks.gauge.Step;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;

import java.time.Duration;
import java.util.List;
import java.util.Random;

public class BaseStep extends BaseSetup {




    @Step("<second> kadar bekle")
    public void waitForsecond(int second) throws InterruptedException {
        Thread.sleep(1000 * second);

    }

    @Step("<key> id' li elemente tıkla")
    public void clickByid(String key) {
        appiumDriver.findElement(By.id(key)).click();
    }

    @Step("Kategoriler sayfasi <key> xpath'li elemente tıkla")
    public void clickByxpath(String key) {
        System.out.println("Kategoriler kismina tiklandi" + appiumDriver.findElement(By.xpath(key)).getSize());
        appiumDriver.findElement(By.xpath(key)).click();

    }

    @Step("<key> xpathli elementi bul ve içinde <keyword> değeri var mı kontrol et ")
    public void check(String key, String keyword) {
        Assert.assertTrue("Element Bulundu bilgisi", appiumDriver.findElement(By.xpath(key)).getText().equals(keyword));


    }

    @Step("Menuden Kadin secenegine tikla <key> xpath'li elemente tıkla")
    public void clickKadinxpath(String Key) {
        System.out.println("Kadin kismina tiklandi" + appiumDriver.findElement(By.xpath(Key)).getSize());
        appiumDriver.findElement(By.xpath(Key)).click();

    }

    @Step("Pantolon Kategorisi Acilir  <key> xpath'li elemente tıkla")
    public void clickPantolonxpath(String Key) {
        System.out.println("Pantolon kismina tiklandi" + appiumDriver.findElement(By.xpath(Key)).getSize());
        appiumDriver.findElement(By.xpath(Key)).click();

    }
    @Step("<Key> id ile  <keyword> degerini yaz")
    public void sendkeysByid(String key, String keyword) {
        appiumDriver.findElement(By.id(key)).sendKeys(keyword);
    }

    @Step("Sayfayı yukarı kaydır")
    public void swipeUpI() {
        Dimension dims = appiumDriver.manage().window().getSize();
        System.out.println("Telefon Boyutu " + dims);
        PointOption pointOptionStart, pointOptionEnd;
        int edgeBorder = 40;
        final int PRESS_TIME = 200; // ms
        pointOptionStart = PointOption.point(dims.width / 2, dims.height / 2);
        System.out.println("pointOptionStart " + pointOptionStart);
        pointOptionEnd = PointOption.point(dims.width / 2, edgeBorder);
        System.out.println("pointOptionEnd " + pointOptionEnd);
        new TouchAction(appiumDriver).press(pointOptionStart).waitAction(WaitOptions.waitOptions(Duration.ofMillis(PRESS_TIME))).moveTo(pointOptionEnd).release().perform();
    }

    @Step("Urunlerden rasgele Urun Secilir")
    public void clickRasgelexpath() {
        List<MobileElement> element = appiumDriver.findElements(By.xpath("//*[@resource-id='com.ozdilek.ozdilekteyim:id/imageView']"));
        Random random = new Random();
        int selectRandomInt = random.nextInt(element.size());
        element.get(selectRandomInt).click();

    }

    @Step("Bedenlerden rasgele Beden Seçilir")
    public void randomBeden() {
        List<MobileElement> beden = appiumDriver.findElements(By.id("com.ozdilek.ozdilekteyim:id/recyclerSizeList"));
        Random random = new Random();
        int selectRandomInt = random.nextInt(beden.size());
        beden.get(selectRandomInt).click();
    }


    @Step("Favoriler butonuna tıklanir  <key> xpath'li elemente tıkla")
    public void clickFavorixpath(String Key) {
        System.out.println("Favoriler butonuna tıklandi" + appiumDriver.findElement(By.xpath(Key)).getSize());
        appiumDriver.findElement(By.xpath(Key)).click();
    }

    @Step("Geri Tıklama")
    public void geriTiklama() {
        MobileElement GeriTık = appiumDriver.findElement(By.id("com.ozdilek.ozdilekteyim:id/ivBack"));
        GeriTık.click();
    }

}
