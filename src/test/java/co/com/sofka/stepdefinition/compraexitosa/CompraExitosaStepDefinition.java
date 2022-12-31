package co.com.sofka.stepdefinition.compraexitosa;

import co.com.sofka.setup.ui.Setup;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import org.apache.log4j.Logger;

import static co.com.sofka.questions.ValidarMensajes.validarDosMensajes;
import static co.com.sofka.tasks.landingpage.OpenLandingPage.openLandingPage;
import static co.com.sofka.tasks.llenarformulario.LlenarFormulario.llenarFormulario;
import static co.com.sofka.tasks.ofertaspage.BuscarOferta.buscarOferta;
import static co.com.sofka.userinterfaces.orderpage.OrderPage.MENSAJE_COMPRA_EXITOSA;
import static co.com.sofka.utils.Constantes.MENSAJE_ESPERADO_COMPRA_EXITOSA;
import static co.com.sofka.utils.Utilidades.obtenerMensajeLocalizador;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CompraExitosaStepDefinition extends Setup {

    public static final String ROL="Cliente";

    private static final Logger LOGGER= Logger.getLogger(CompraExitosaStepDefinition.class);
    @Dado("que el cliente navegó hasta el home")
    public void navegarAlHome() {

        try{
            actorSetupBrowser(ROL);
            theActorInTheSpotlight().attemptsTo(
                    openLandingPage()
            );
        } catch(Exception e){
            LOGGER.error(e.getMessage());
        }

    }

    @Cuando("seleccione un producto")
    public void seleccionarProducto() {

        try{
            theActorInTheSpotlight().attemptsTo(
                    buscarOferta()
            );
        }catch(Exception e){
            LOGGER.error(e.getMessage());
        }

    }

    @Y("confirme la compra")
    public void confirmarCompra() {

        try{
            theActorInTheSpotlight().attemptsTo(
                    llenarFormulario()
            );
        }catch(Exception e){
            LOGGER.error(e.getMessage());
        }

    }

    @Entonces("el cliente podra ver la factura de su compra")
    public void verFacturaDeCompra() {

        try{
            if(MENSAJE_COMPRA_EXITOSA.isVisibleFor(theActorInTheSpotlight())){
                theActorInTheSpotlight().should(
                        seeThat(validarDosMensajes(
                                MENSAJE_ESPERADO_COMPRA_EXITOSA.getValor()
                                ,obtenerMensajeLocalizador(theActorInTheSpotlight(),MENSAJE_COMPRA_EXITOSA)))
                );
            }
            else{
                LOGGER.warn("Uno o mas articulos no estan disponibles");
            }
        }catch(Exception e){
            LOGGER.error(e.getMessage());
        }

    }
}
