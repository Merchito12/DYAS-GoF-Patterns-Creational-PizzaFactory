package edu.unisabana.pizzafactory.model.implementaciones;
import edu.unisabana.pizzafactory.model.interfaces.Moldeador;
import java.util.logging.Level;
import java.util.logging.Logger;


public class MoldeadorPizzaDelgada implements Moldeador {

    
    @Override
    public void moldearPizzaPequena() {
        Logger.getLogger(MoldeadorPizzaDelgada.class.getName())
                .log(Level.INFO, "[O] Moldeando pizza pequena de masa convencional.");

    }

    @Override
    public void moldearPizzaMediana() {
        Logger.getLogger(MoldeadorPizzaDelgada.class.getName())
                .log(Level.INFO, "[O] Moldeando pizza mediana de masa convencional.");

    }
}
