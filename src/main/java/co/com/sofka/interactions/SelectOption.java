package co.com.sofka.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.targets.Target;
public class SelectOption implements Interaction {
    private final Target target;
    private SelectOption(Target target){
        this.target=target;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        for(int x=0;x<target.resolveAllFor(actor).size();x++){
            target.resolveAllFor(actor).get(x).click();
            target.resolveAllFor(actor).get(x).select().byIndex(1);
        }
    }

    public static SelectOption selectOption(Target target){
        return new SelectOption(target);
    }

}
