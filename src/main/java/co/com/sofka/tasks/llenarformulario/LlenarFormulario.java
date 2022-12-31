package co.com.sofka.tasks.llenarformulario;

import co.com.sofka.models.UserModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.time.Duration;

import static co.com.sofka.data.user.UserData.userModel;
import static co.com.sofka.interactions.Click.clickOn;
import static co.com.sofka.interactions.ClickRandomItem.clickRandomItem;
import static co.com.sofka.interactions.Scroll.scrollTo;
import static co.com.sofka.userinterfaces.llenarformulario.LlenarFormulario.APELLIDO;
import static co.com.sofka.userinterfaces.llenarformulario.LlenarFormulario.CELULAR;
import static co.com.sofka.userinterfaces.llenarformulario.LlenarFormulario.CIUDAD;
import static co.com.sofka.userinterfaces.llenarformulario.LlenarFormulario.CORREO;
import static co.com.sofka.userinterfaces.llenarformulario.LlenarFormulario.DEPARMENTO;
import static co.com.sofka.userinterfaces.llenarformulario.LlenarFormulario.DIRECCION;
import static co.com.sofka.userinterfaces.llenarformulario.LlenarFormulario.DOCUMENTO;
import static co.com.sofka.userinterfaces.llenarformulario.LlenarFormulario.ESCOGER_CIUDAD;
import static co.com.sofka.userinterfaces.llenarformulario.LlenarFormulario.ESCOGER_DEPARTAMENTO;
import static co.com.sofka.userinterfaces.llenarformulario.LlenarFormulario.METODO_DE_PAGO;
import static co.com.sofka.userinterfaces.llenarformulario.LlenarFormulario.NOMBRE;
import static co.com.sofka.userinterfaces.llenarformulario.LlenarFormulario.REALIZAR_COMPRA;
import static co.com.sofka.userinterfaces.llenarformulario.LlenarFormulario.TERMINOS;
import static co.com.sofka.userinterfaces.orderpage.OrderPage.MENSAJE_COMPRA_EXITOSA;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class LlenarFormulario implements Task {

    UserModel user =userModel();
    String document=user.getDocument();
    String email=user.getEmail();
    String name=user.getName();
    String lastName=user.getLastName();
    String address=user.getAddress();
    String phone=user.getPhone();

    @Override
    public <T extends Actor> void performAs(T actor) {
        if(DOCUMENTO.isVisibleFor(actor)){
            actor.attemptsTo(
                    Scroll.to(DOCUMENTO),
                    Clear.field(DOCUMENTO),
                    Enter.theValue(this.document).into(DOCUMENTO),
                    Scroll.to(CORREO),
                    Clear.field(CORREO),
                    Enter.theValue(this.email).into(CORREO),
                    Scroll.to(NOMBRE),
                    Clear.field(NOMBRE),
                    Enter.theValue(this.name).into(NOMBRE),
                    Scroll.to(APELLIDO),
                    Clear.field(APELLIDO),
                    Enter.theValue(this.lastName).into(APELLIDO),
                    Scroll.to(DEPARMENTO),
                    Click.on(DEPARMENTO),
                    clickRandomItem(ESCOGER_DEPARTAMENTO),
                    Scroll.to(CIUDAD),
                    Click.on(CIUDAD),
                    clickRandomItem(ESCOGER_CIUDAD),
                    Scroll.to(DIRECCION),
                    Clear.field(DIRECCION),
                    Enter.theValue(this.address).into(DIRECCION),
                    Scroll.to(CELULAR),
                    Clear.field(CELULAR),
                    Enter.theValue(this.phone).into(CELULAR),
                    scrollTo(METODO_DE_PAGO),
                    clickOn(METODO_DE_PAGO),
                    scrollTo(TERMINOS),
                    clickOn(TERMINOS),
                    scrollTo(REALIZAR_COMPRA),
                    clickOn(REALIZAR_COMPRA),
                    WaitUntil.the(MENSAJE_COMPRA_EXITOSA,isVisible()).forNoMoreThan(Duration.ofSeconds(20))
            );
        }
    }
    public static LlenarFormulario llenarFormulario(){
        return new LlenarFormulario();
    }
}
