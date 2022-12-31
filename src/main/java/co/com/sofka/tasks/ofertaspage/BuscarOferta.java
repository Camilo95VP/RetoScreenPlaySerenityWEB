package co.com.sofka.tasks.ofertaspage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.time.Duration;

import static co.com.sofka.interactions.Click.clickOn;
import static co.com.sofka.interactions.ClickRandomItem.clickRandomItem;
import static co.com.sofka.interactions.Scroll.scrollTo;
import static co.com.sofka.userinterfaces.buscaroferta.BuscarOferta.BTN_CARRITO;
import static co.com.sofka.userinterfaces.buscaroferta.BuscarOferta.BTN_CERRAR;
import static co.com.sofka.userinterfaces.buscaroferta.BuscarOferta.COOKIES;
import static co.com.sofka.userinterfaces.buscaroferta.BuscarOferta.FINALIZAR_COMPRA;
import static co.com.sofka.userinterfaces.buscaroferta.BuscarOferta.OFERTAS;
import static co.com.sofka.userinterfaces.buscaroferta.BuscarOferta.PRODUCTOS;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class BuscarOferta implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        if(COOKIES.isVisibleFor(actor)){
            actor.attemptsTo(clickOn(COOKIES));
        }
        actor.attemptsTo(
                Scroll.to(OFERTAS),
                Click.on(OFERTAS),
                Click.on(OFERTAS),

                WaitUntil.the(PRODUCTOS, WebElementStateMatchers.isVisible()).forNoMoreThan(Duration.ofSeconds(15)),
                Scroll.to(PRODUCTOS),
                clickRandomItem(PRODUCTOS),
                WaitUntil.the(BTN_CERRAR,isClickable()).forNoMoreThan(Duration.ofSeconds(15)),
                Click.on(BTN_CERRAR),
                Scroll.to(OFERTAS),
                Click.on(OFERTAS),
                Click.on(OFERTAS),

/*                WaitUntil.the(PRODUCTOS, WebElementStateMatchers.isVisible()).forNoMoreThan(Duration.ofSeconds(15)),
                Scroll.to(PRODUCTOS),
                clickRandomItem(PRODUCTOS),
                WaitUntil.the(BTN_CERRAR,isClickable()).forNoMoreThan(Duration.ofSeconds(15)),
                Click.on(BTN_CERRAR),
                Scroll.to(OFERTAS),
                Click.on(OFERTAS),
                Click.on(OFERTAS),

                WaitUntil.the(PRODUCTOS, WebElementStateMatchers.isVisible()).forNoMoreThan(Duration.ofSeconds(15)),
                Scroll.to(PRODUCTOS),
                clickRandomItem(PRODUCTOS),
                WaitUntil.the(BTN_CERRAR,isClickable()).forNoMoreThan(Duration.ofSeconds(15)),
                Click.on(BTN_CERRAR),
                Scroll.to(OFERTAS),
                Click.on(OFERTAS),
                Click.on(OFERTAS),

                WaitUntil.the(PRODUCTOS, WebElementStateMatchers.isVisible()).forNoMoreThan(Duration.ofSeconds(15)),
                Scroll.to(PRODUCTOS),
                clickRandomItem(PRODUCTOS),
                WaitUntil.the(BTN_CERRAR,isClickable()).forNoMoreThan(Duration.ofSeconds(15)),
                Click.on(BTN_CERRAR),*/

                WaitUntil.the(BTN_CARRITO,isClickable()).forNoMoreThan(Duration.ofSeconds(10)),
                Click.on(BTN_CARRITO),
                WaitUntil.the(FINALIZAR_COMPRA, isClickable()).forNoMoreThan(Duration.ofSeconds(15)),
                scrollTo(FINALIZAR_COMPRA),
                clickOn(FINALIZAR_COMPRA)
        );
    }

    public static BuscarOferta buscarOferta(){
        return new BuscarOferta();
    }
}
