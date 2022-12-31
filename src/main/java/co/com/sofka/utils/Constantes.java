package co.com.sofka.utils;

public enum Constantes{


    MENSAJE_ESPERADO_COMPRA_EXITOSA("Gracias. Tu pedido ha sido recibido.");


    private final String valor;

    public String getValor(){
        return this.valor;
    }

    Constantes(String value) {
        this.valor=value;
    }
}
