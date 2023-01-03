package co.com.sofka.utils;

public enum Constantes{


    MENSAJE_ESPERADO_COMPRA_EXITOSA("Gracias. Tu pedido ha sido recibido."),

    MENSAJE_ESPERADO_COMPRA_NO_EXITOSA("Por favor, lee y acepta los términos y condiciones para proceder con tu pedido.");

    private final String valor;

    public String getValor(){
        return this.valor;
    }

    Constantes(String value) {
        this.valor=value;
    }
}
