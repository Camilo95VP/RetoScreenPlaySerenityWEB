package co.com.sofka.tasks.orderpage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.sofka.userinterfaces.orderpage.OrderPage.*;

public class SeeOrderPage implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        if(DETAILS.isVisibleFor(actor) && TOTAL.isVisibleFor(actor)){
            actor.attemptsTo(
                    Scroll.to(DETAILS),
                    Scroll.to(SUBTOTAL),
                    Scroll.to(TOTAL)
            );
        }

    }

    public static SeeOrderPage seeOrderPage(){
        return new SeeOrderPage();
    }
}
