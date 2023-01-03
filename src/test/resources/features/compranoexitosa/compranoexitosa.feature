# language: es

Característica: Compra fallida en la tienda
    Como cliente
    necesito comprar algunos productos
    para satisfacer mis necesidades personales

    Escenario: Compra fallida por no aceptación de terminos
        Dado que el cliente navegó hasta el home
        Cuando el cliente seleccione un producto
        Y de click en realizar compra sin confirmar los terminos y condiciones
        Entonces podra ver un mensaje que le indica que su compra falló