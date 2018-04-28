package MenuCreator;

import com.sun.xml.internal.ws.server.sei.MessageFiller;

public class OutputGarageClosedReport implements Menu {

    private double prices[]; //assigned in method



    private int checkIns = 0; //iterate with each new regular receipt
    private int spEvents = 0; //iterate with each sp event receipt
    private int lostTickets =0; // iterate ...
    private int amountOfTicketsByType[] = {checkIns, spEvents, lostTickets}; //this is bad and im sorry
    private String namesOfTicketTypes[] = {"Check Ins", "Special Events" ,  "Lost Tickets"};

    private double totalCollected=0;

    OutputGarageClosedReport(double[] pricesToDisplayAndTotal) {
        this.prices = pricesToDisplayAndTotal;
        for(int i =0; i < prices.length; ++i) {
            totalCollected = prices[i] + totalCollected;
        }
    }

    public void iterateTicketsByType(int index) {
    ++amountOfTicketsByType[index];
    }

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
