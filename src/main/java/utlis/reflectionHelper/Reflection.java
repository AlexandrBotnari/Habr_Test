package utlis.reflectionHelper;

import org.openqa.selenium.WebElement;
import pageObjects.AbstractPage;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class Reflection {

    public static <T extends AbstractPage> T getPage(String name) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<?> page = Class.forName("pageObjects." + name);
        return (T) page.getConstructor().newInstance();

    }

    //go anotation
    public static WebElement getElement(AbstractPage page, String elementName) throws IllegalAccessException {
        Field[] fields = page.getClass().getDeclaredFields();
        for (Field field : fields) {
            if (field.getName().equals(elementName)) {
                field.setAccessible(true);
                return (WebElement) field.get(page);
            }
        }
        throw new RuntimeException("Not found " + elementName + " on page " + page.getClass().getSimpleName());
    }
}
