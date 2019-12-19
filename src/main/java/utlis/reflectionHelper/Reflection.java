package utlis.reflectionHelper;

import org.apache.commons.lang3.reflect.FieldUtils;
import org.openqa.selenium.WebElement;
import pages.AbstractPage;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class Reflection {
    public static <T extends AbstractPage> T getPage(String name) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<?> page = Class.forName("pages." + name);
        return (T) page.getConstructor().newInstance();

    }

    public static WebElement getElement(AbstractPage page, String elementName) throws IllegalAccessException {
        Field[] fields = FieldUtils.getAllFields(page.getClass());

        for (Field field : fields) {
            if (field.getName().equals(elementName)) {
                field.setAccessible(true);
                return (WebElement) field.get(page);
            }
        }
        throw new RuntimeException("Not found " + elementName + " on page " + page.getClass().getSimpleName());
    }
}
