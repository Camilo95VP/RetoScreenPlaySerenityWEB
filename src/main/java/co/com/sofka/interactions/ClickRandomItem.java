package co.com.sofka.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.targets.Target;

import java.security.SecureRandom;
import java.util.Random;


public class ClickRandomItem implements Interaction {

    private final Target target;

    private ClickRandomItem(Target target) {
        this.target = target;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        Random random=new SecureRandom();
        int position=random.nextInt(target.resolveAllFor(actor).size());
        target.resolveAllFor(actor).get(position).click();

    }

    public static ClickRandomItem clickRandomItem(Target target) {
        return new ClickRandomItem(target);
    }


}
