package co.com.sofka.stepdefinition.compraexitosa;

import co.com.sofka.setup.ui.Setup;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import org.apache.log4j.Logger;

import static co.com.sofka.tasks.landingpage.OpenLandingPage.openLandingPage;
import static co.com.sofka.tasks.llenarformulario.LlenarFormulario.llenarFormulario;
import static co.com.sofka.tasks.ofertaspage.BuscarOferta.buscarOferta;
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
    }
}
