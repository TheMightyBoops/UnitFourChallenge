package Lucas.Nolting;
import FeeCalcs.LostTicketCalc.LostTicketInstance;
import FeeCalcs.MinMaxCalc.MinMaxFeeCalculator;
import FeeCalcs.SpEventCalc.SpEventInstance;
import MenuCreator.*;
import MenuCreator.Menu;
import TimeMachine.TimeMachine;

import java.awt.*;
import java.util.Date;
import java.util.Scanner;
import static MenuCreator.MenuChoice.*;

public class Main {

    public static Scanner key = new Scanner(System.in);

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
