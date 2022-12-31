package co.com.sofka.userinterfaces.orderpage;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

import static org.openqa.selenium.By.cssSelector;
import static org.openqa.selenium.By.xpath;

public class OrderPage extends PageObject {
    public static final Target PRICE=Target
            .the("Precio")
            .located(xpath("//*[@id=\"main\"]/div[2]/div/div/div[1]/section[2]/table/tbody/tr/td/span/bdi"));

    public static final Target SUBTOTAL=Target
            .the("Subtotal")
            .located(xpath("//*[@id=\"main\"]/div[2]/div/div/div[1]/section[2]/table/tfoot/tr[1]/td/span"));

    public static final Target DISCOUNT=Target
            .the("Descuento")
            .located(xpath("//*[@id=\"main\"]/div[2]/div/div/div[1]/section[2]/table/tfoot/tr[2]/td/span"));

    public static final Target TOTAL=Target
            .the("Precio final")
            .located(xpath("//*[@id=\"main\"]/div[2]/div/div/div[1]/section[2]/table/tfoot/tr[5]/td"));

    public static final Target DETAILS=Target
            .the("Detalles de la compra")
            .located(cssSelector("h2[class='woocommerce-order-details__title']"));

    public static final Target MENSAJE_COMPRA_EXITOSA=Target
            .the("Mensaje compra exitosa")
            .located(xpath("//p[@class='success-color woocommerce-notice woocommerce-notice--success woocommerce-thankyou-order-received']"));
}
