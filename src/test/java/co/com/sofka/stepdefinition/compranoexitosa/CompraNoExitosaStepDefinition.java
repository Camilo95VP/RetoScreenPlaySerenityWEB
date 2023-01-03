package co.com.sofka.stepdefinition.compranoexitosa;

import co.com.sofka.setup.ui.Setup;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import org.apache.log4j.Logger;

import static co.com.sofka.questions.ValidarMensajes.validarDosMensajes;
import static co.com.sofka.tasks.landingpage.OpenLandingPage.openLandingPage;
import static co.com.sofka.tasks.ofertaspage.BuscarOferta.buscarOferta;
import static co.com.sofka.userinterfaces.llenarformularioincompleto.LlenarFormularioIncompleto.llenarFormularioIncompleto;
import static co.com.sofka.userinterfaces.orderpage.OrderPage.MENSAJE_COMPRA_NO_EXITOSA;
import static co.com.sofka.utils.Constantes.MENSAJE_ESPERADO_COMPRA_NO_EXITOSA;
import static co.com.sofka.utils.Utilidades.obtenerMensajeLocalizador;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


public class CompraNoExitosaStepDefinition extends Setup {

    private static final Logger LOGGER= Logger.getLogger(CompraNoExitosaStepDefinition.class);
    public static final String ROL="Cliente";
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
    @Cuando("el cliente seleccione un producto")
    public void elClienteSeleccioneUnProducto() {
        try{
            theActorInTheSpotlight().attemptsTo(
                    buscarOferta()
            );
        }catch(Exception e){
            LOGGER.error(e.getMessage());
        }
    }

    @Y("de click en realizar compra sin confirmar los terminos y condiciones")
    public void deClickEnRealizarCompraSinConfirmarLosTerminosYCondiciones() {
        try{
            theActorInTheSpotlight().attemptsTo(
                    llenarFormularioIncompleto()
            );
        }catch (Exception e){
            LOGGER.error(e.getMessage());
        }
    }

    @Entonces("podra ver un mensaje que le indica que su compra falló")
    public void podraVerUnMensajeQueLeIndicaQueSuCompraFalló() {
        theActorInTheSpotlight().should(
                seeThat(validarDosMensajes(
                        MENSAJE_ESPERADO_COMPRA_NO_EXITOSA.getValor()
                        ,obtenerMensajeLocalizador(theActorInTheSpotlight(),MENSAJE_COMPRA_NO_EXITOSA)))
        );
    }
}
