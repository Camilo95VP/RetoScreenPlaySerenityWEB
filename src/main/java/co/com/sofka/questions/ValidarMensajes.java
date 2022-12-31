package co.com.sofka.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidarMensajes implements Question <Boolean>{

    String mensajeEsperado;
    String mensajeObtenido;

    public ValidarMensajes(String mensajeEsperado, String mensajeObtenido) {
        this.mensajeEsperado = mensajeEsperado;
        this.mensajeObtenido = mensajeObtenido;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return mensajeEsperado.equals(mensajeObtenido);
    }


    public static ValidarMensajes validarDosMensajes(String mensajeEsperado,String mensajeObtenido){
        return new ValidarMensajes(mensajeEsperado,mensajeObtenido);
    }
}
