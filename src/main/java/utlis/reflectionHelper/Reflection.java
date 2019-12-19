package utlis.reflectionHelper;

import org.apache.commons.lang3.reflect.FieldUtils;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import pageObjects.AbstractPage;
import pageObjects.HomePage;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Reflection {
HomePage homePage = new HomePage();
    public static <T extends AbstractPage> T getPage(String name) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<?> page = Class.forName("pageObjects." + name);
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
