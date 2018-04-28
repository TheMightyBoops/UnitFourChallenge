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

public class Main {
    public static Scanner key = new Scanner(System.in);
    public static void main(String[] args) {
	// write your code here
        /*
        double prices[] = {125.0, 123.0, 110.0};


        Menu menu = MenuFactory.createMenu("outputGarageSpecialEventReceipt");
        System.out.println(menu.getMenu());
        menu = MenuFactory.createMenu(prices);
        System.out.println(menu.getMenu());

        TimeMachine someTimes = new TimeMachine();
        String times[] = someTimes.getFormattedTimes();
        for(int i =0; i < times.length; ++i) {
            System.out.println(times[i]);
        }

        System.out.println(someTimes.getHoursInBetweenTimes());*/


        for(int i = 0; i < 5; i++) {

            MinMaxFeeCalculator minCalc = null;
            double prices[] = {0,0,0};
            TimeMachine time = new TimeMachine();
            int times = time.getHoursInBetweenTimes();
            int menuChoice;
            String tArray[] = time.getFormattedTimes();
            String timeFrame = tArray[0] + " " + tArray[1];


            Menu menu = MenuFactory.createMenu("");
            System.out.println(menu.getMenu());

            menuChoice = key.nextInt();
            key.nextLine();

            if(menuChoice == 1) {
                minCalc = new MinMaxFeeCalculator(i, times);

            }

            else if(menuChoice ==2) {
                SpEventInstance.getSpEventInstance(i);
                menu = MenuFactory.createMenu("outputGarageSpecialEventReceipt", i,
                        SpEventInstance.getSpecialEventFee());
                System.out.println(menu.getMenu());
            }
            else if(menuChoice ==3) {
                menu = MenuFactory.createMenu(prices);
                System.out.println(menu.getMenu());
                key.nextLine();
                break;
            }

            menu = MenuFactory.createMenu("inputSubmitParkingTicket");
            System.out.println(menu.getMenu());
            menuChoice = key.nextInt();
            key.nextLine();

            if(menuChoice== 1) {
               menu = MenuFactory.createMenu(1,times, timeFrame, minCalc.getFee());
               System.out.println(menu.getMenu());
            }

            else if(menuChoice==2) {
                LostTicketInstance ticket = LostTicketInstance.getLostTicketInstance(i);
                menu = MenuFactory.createMenu("outputLostTicketReceipt", i,
                        ticket.getLostTicketFee());
                System.out.println(menu.getMenu());
            }

        }

    }
}
