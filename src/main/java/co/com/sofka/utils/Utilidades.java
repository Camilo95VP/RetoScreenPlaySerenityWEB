package co.com.sofka.utils;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.targets.Target;

public class Utilidades {

    public static String obtenerMensajeLocalizador(Actor actor, Target target){
        return target.resolveFor(actor).getText();
    }
}
