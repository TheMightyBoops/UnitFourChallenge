package MenuCreator;
/**
 * This class represents a menu to tell the user
 * of various choices they have. It implements menu: meeting
 * the definition of a menu.
 *
 * @version 1.0
 * @author Lucas Nolting
 */
public class InputSubmitParkingTicket implements Menu{

    /**
     * @return menu representation of inputs available to the user.
     */

    @Override
    public String getMenu() {
        return HEADER +
                "1 - Check/Out\n" +
                "2 - Lost Ticket\n";
    }
}
