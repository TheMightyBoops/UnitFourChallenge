package MenuCreator;

public class InputMainMenu implements Menu {

    @Override
    public String getMenu() {
        return HEADER + "" +
                "1 - Check/In\n"+
                "2 - Special Event\n"+
                "3 - Close Garage\n";
    }
}
