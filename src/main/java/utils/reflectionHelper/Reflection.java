package utils.reflectionHelper;

import org.apache.commons.lang3.reflect.FieldUtils;
import org.openqa.selenium.WebElement;
import pages.AbstractPage;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class Reflection {
//                   generic
    public static <T extends AbstractPage> T getPage(String name) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<?> page = Class.forName("pages." + name);//packeg search
        return (T) page.getConstructor().newInstance();//creates page

    }


    public static WebElement getElement(AbstractPage page, String elementName) throws IllegalAccessException {
        Field[] fields = FieldUtils.getAllFields(page.getClass());// Fields

        for (Field field : fields) {
            if (field.getName().equals(elementName)) {
                field.setAccessible(true);
                return (WebElement) field.get(page);
            }
        }
        throw new RuntimeException("Not found " + elementName + " on page " + page.getClass().getSimpleName());
    }

}
