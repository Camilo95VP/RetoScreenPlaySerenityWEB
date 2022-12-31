package co.com.sofka.userinterfaces.buscaroferta;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

import static org.openqa.selenium.By.cssSelector;
import static org.openqa.selenium.By.xpath;

public class BuscarOferta extends PageObject {

    public static final Target OFERTAS=Target
            .the("Ofertas")
            .located(xpath("//*[@id=\"mega-menu-item-198556\"]/a"));

    public static final Target PRODUCTOS=Target
            .the("Productos")
            .located(xpath("//a[contains(text(),'Añadir')]"));


    public static final Target COOKIES=Target
            .the("Cookies")
            .located(xpath("//*[@class=\"button primary flatsome-cookies__accept-btn\"]"));

    public static final Target BTN_CARRITO=Target
            .the("Ir al carrito")
            .located(xpath("//a[@title='Carrito']"));

    public static final Target FINALIZAR_COMPRA=Target
            .the("Comprar")
            .located(cssSelector("a[href=\"https://zonafit.co/checkout/\"]"));

    public static final Target BTN_CERRAR=Target
            .the("Botón para cerrar modal info carrito")
            .located(xpath("//button[@title='Close (Esc)']"));

}
