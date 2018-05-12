package MenuCreator;
/**
 * This interface defines what menu can be as well
 * as contains the heading that is used for each
 * menu in this factory.
 *
 * @version 1.0
 * @author Lucas Nolting
 */
public interface Menu {
    public final String HEADER = "Best Value Parking Garage\n"+
                                 "=========================\n";

    /**
     * @return Gets whatever menu is required by the
     * driver program.
     */
    public abstract  String getMenu();
}
