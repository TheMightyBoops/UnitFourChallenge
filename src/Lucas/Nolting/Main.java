package Lucas.Nolting;

import FeeCalcs.LostTicketCalc.LostTicketInstance;
import FeeCalcs.MinMaxCalc.MinMaxFeeCalculator;
import FeeCalcs.SpEventCalc.SpEventInstance;
import MenuCreator.*;
import MenuCreator.Menu;
import TimeMachine.TimeMachine;
import java.util.Scanner;
import static MenuCreator.MenuChoice.*;
/**
 * This Main class contains three methods: two to replicate a parking
 * ticket machine on either end of a transaction (one at the entrance, and
 * one for leaving. Main (the final method creates some variables to hold changes between
 * states of the two machines.
 *
 * @version 1.0
 * @author Lucas Nolting
 */


public class Main {

    public static Scanner key = new Scanner(System.in);



    /**
     * This method contains some fields to contain information between the states of the
     * parking ticket machines. And also invokes the machines in a loop to allow the method to
     * run until it is terminated by the user.
     *
     * @param args allows the program to accept arguments from the CLI when the method is invoked.
     */
    public static void main(String[] args) {
        TimeMachine time = new TimeMachine();
        Main main = new Main();
        int i=1;
        double prices[] = {0,0,0};
        int ticketsByType[] = {0,0,0};
        boolean keepGoing = true;

        while (keepGoing) {
            boolean needsSecondMenu =
                    main.virtualTicketMachineOne(i, prices, ticketsByType);


            if(needsSecondMenu) {
                time = new TimeMachine();
                main.virtualTicketMachineTwo(i, prices, ticketsByType, time);
            }

            System.out.println("Keep going?(y,n)");
            String input = key.nextLine();
            if(input.toLowerCase().equals("n")) {
                keepGoing = false;
            }
            ++i;
        }
    }


    /**
     * This method is a representation of a parking ticket machine at
     * the entrance of a parking garage.Not only can the method take
     * input based on the user, but also returns a flag to tell the main
     * method if the user will need to use the machine at the exit. So
     * the user isn't prompted if they do not have to be (eg SP event).
     *
     * @param vehicleId A unique id for a vehicle to track customers
     * @param prices Array of prices for various types of parking.
     * @param ticketsByType Amount of each type of parking ticket in any
     * given session.
     *
     * @return boolean representation of if the second ticket machine will
     * require user input.
     */
    private boolean virtualTicketMachineOne(int vehicleId, double[] prices,
                                         int[] ticketsByType) {


        Menu menu = MenuFactory.createMenu(INPUT_MAIN_MENU);
        System.out.println(menu.getMenu());

        SpEventInstance sp = SpEventInstance.getSpEventInstance(vehicleId);




        int userInput = key.nextInt();
        key.nextLine();

        switch(userInput) {
            case 1:
                break;

            case 2:
                menu = MenuFactory.createMenu(OUTPUT_SPECIAL_EVENT_RECEIPT,vehicleId,
                        sp.getSpecialEventFee());
                prices[1] += sp.getSpecialEventFee();
                ++ticketsByType[1];

                System.out.println(menu.getMenu());

                return false;

            case 3:
                if(prices[0] == 0 && prices[1] == 0 && prices[2] ==0) {
                    this.virtualTicketMachineOne(vehicleId, prices,ticketsByType);
                }

                menu = MenuFactory.createMenu(prices, ticketsByType);
                System.out.println(menu.getMenu());
                return false;


                default:
                    this.virtualTicketMachineOne(vehicleId, prices,ticketsByType);

        }
        return true;
    }

    private void virtualTicketMachineTwo(int vehicleId, double[] prices,
                                         int[] ticketsByType, TimeMachine time) {
        Menu menu = MenuFactory.createMenu(INPUT_SUBMIT_PARKING_TICKET);
        System.out.println(menu.getMenu());
        int userInput = key.nextInt();
        key.nextLine();


        switch (userInput) {
            case 1:
                MinMaxFeeCalculator minCalc = new MinMaxFeeCalculator(vehicleId,
                        time.getHoursInBetweenTimes());

                String timeArray[] = time.getFormattedTimes();
                String timeFrame = timeArray[0] + "-" + timeArray[1];

                menu = MenuFactory.createMenu(vehicleId, time.getHoursInBetweenTimes(),
                        timeFrame, minCalc.getFee());

                prices[0] += minCalc.getFee();
                ++ticketsByType[0];

                System.out.println(menu.getMenu());
                break;
            case 2:
                LostTicketInstance lt = LostTicketInstance.getLostTicketInstance(vehicleId);
                menu = MenuFactory.createMenu(OUTPUT_LOST_TICKET_RECEIPT,vehicleId,
                        lt.getLostTicketFee());
                prices[2] += lt.getLostTicketFee();
                ++ticketsByType[2];

                System.out.println(menu.getMenu());
                break;
                default:
                    this.virtualTicketMachineTwo(vehicleId, prices,ticketsByType, time);
        }

    }
}
