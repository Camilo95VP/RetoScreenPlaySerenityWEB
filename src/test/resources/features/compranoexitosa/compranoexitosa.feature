# language: es

Característica: Compra fallida en la tienda
    Como cliente
    necesito comprar algunos productos
    para satisfacer mis necesidades personales

    Escenario: Compra fallida por no aceptación de terminos
        Dado que el cliente navegó hasta el home
        Cuando el cliente navegue hasta la sección de ofertas y escoja los productos
        Y el cliente llene los datos de pago pero no acepte terminos y confirme
        Entonces el cliente podra ver un mensaje que le indica que su compra falló