package MenuCreator;

import com.sun.xml.internal.ws.server.sei.MessageFiller;


/**
 * This is a class of probably bad decisions that reproduces a desired result
 * if I were to use the menu factory for something else this class would get nuked
 * and I would pretend that it never existed, but it really works for the context
 * of this project. Let's go on a journey of madness.
 * @version 1.0
 * @author Lucas Nolting
 */
public class OutputGarageClosedReport implements Menu {

    private double prices[]; //assigned in method



    private int checkIns = 0; //iterate with each new regular receipt
    private int spEvents = 0; //iterate with each sp event receipt
    private int lostTickets =0; // iterate ...
    private int amountOfTicketsByType[] = {checkIns, spEvents, lostTickets}; //this is bad and im sorry
    private String namesOfTicketTypes[] = {"Check Ins", "Special Events" ,  "Lost Tickets"};

    private double totalCollected=0;

    /**
     * Constructor gets some params from the factory and first copies the totals,
     * and then runs a loop to quickly iterate over the list and total the prices.
     *
     * @param pricesToDisplayAndTotal list of all transactions being fed to the menu.
     * @param amountTixType different types of parking tickets based on user's parking
     * type.
     */
    OutputGarageClosedReport(double[] pricesToDisplayAndTotal, int[] amountTixType) {
        this.prices = pricesToDisplayAndTotal;
        this.amountOfTicketsByType = amountTixType;
        for(int i =0; i < prices.length; ++i) {
            totalCollected = prices[i] + totalCollected;
        }
    }


    /**
     * This method is where all the the action happens. This
     * menu has to be more dynamic than the other, that's
     * why this class got so ugly for being a menu. It can take
     * a lot of types of data that can change, appends them into a
     * readable menu. It looks ugly, but as mentioned before, it
     * works.
     *
     * @return Menu representation of the end of day report.
     */
    //!!! Add to this if more types of tickets need to be added
    @Override
    public String getMenu() {
        //append prices to end of list
        StringBuilder subdividedTickets = new StringBuilder();

        //This for loop is ugly, but it rules
        for(int i =0; i < prices.length; ++i) {
            subdividedTickets.append("$")
                    .append(String.format("%.2f", prices[i]))
                    .append(" was collected from ")
                    .append(amountOfTicketsByType[i])
                    .append(" ")
                    .append(namesOfTicketTypes[i])
                    .append("\n");
            }

        return HEADER +
                "Activity to date\n\n" +
                subdividedTickets + "\n\n" +
                "$" + String.format("%.2f", totalCollected) + " collected overall";

    }
}
