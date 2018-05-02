package MenuCreator;

public class InputSubmitParkingTicket implements Menu{
    @Override
    public String getMenu() {
        return HEADER +
                "1 - Check/Out\n" +
                "2 - Lost Ticket\n";
    }
}
