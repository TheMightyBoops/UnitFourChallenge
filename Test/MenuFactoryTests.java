import MenuCreator.Menu;
import MenuCreator.MenuFactory;
import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Type;

public class MenuFactoryTests {
    static Menu testMenu;

    @Test
    public void testMenuFactory() {
        testMenu = MenuFactory.createMenu(" ");
        Assert.assertTrue("Your menu is null somehow",testMenu!= null);
    }
}
