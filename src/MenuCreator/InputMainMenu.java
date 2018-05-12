package MenuCreator;

/**
 * This class is a possible selection from the factory, it represents
 * the main menu of the first machine. Implements the Menu interface
 * that basically defines what a menu can be in this context.
 *
 * @version 1.0
 * @author Lucas Nolting
 */
public class InputMainMenu implements Menu {

    /**
     * @return output to user the choices
     * available to them.
     */
    @Override
    public String getMenu() {
        return HEADER + "" +
                "1 - Check/In\n"+
                "2 - Special Event\n"+
                "3 - Close Garage\n";
    }
}
