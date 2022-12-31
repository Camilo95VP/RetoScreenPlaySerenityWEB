package co.com.sofka.userinterfaces.llenarformulario;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

import static org.openqa.selenium.By.cssSelector;
import static org.openqa.selenium.By.id;
import static org.openqa.selenium.By.xpath;

public class LlenarFormulario extends PageObject {
    public static final Target DOCUMENTO=Target
            .the("Documento")
            .located(id("billing_myfield12"));

    public static final Target CORREO=Target
            .the("Email")
            .located(id("billing_email"));

    public static final Target NOMBRE=Target
            .the("Nombre")
            .located(id("billing_first_name"));

    public static final Target APELLIDO=Target
            .the("Apellido")
            .located(id("billing_last_name"));

    public static final Target DEPARMENTO=Target
            .the("Escoger departamento")
            .located(xpath("//span[@class='select2-selection__arrow']"));

    public static final Target ESCOGER_DEPARTAMENTO=Target
            .the("Departamento")
            .located(xpath("//li[@class='select2-results__option']"));

    public static final Target CIUDAD=Target
            .the("Escoger Ciudad")
            .located(id("select2-billing_city-container"));

    public static final Target ESCOGER_CIUDAD=Target
            .the("Ciudad")
            .located(xpath("//li[@class='select2-results__option']"));
    public static final Target DIRECCION=Target
            .the("Dirección")
            .located(id("billing_address_1"));

    public static final Target CELULAR=Target
            .the("Telefono")
            .located(id("billing_phone"));

    public static final Target METODO_DE_PAGO=Target
            .the("Pagar con")
            .located(id("payment_method_bacs"));

    public static final Target TERMINOS=Target
            .the("Aceptar terminos")
            .located(id("terms"));

    public static final Target REALIZAR_COMPRA=Target
            .the("Confirmar compra")
            .located(id("place_order"));

    public static final Target ALERT=Target
            .the("Mensaje alerta")
            .located(cssSelector("div[class='message-container container alert-color medium-text-center']"));
}
