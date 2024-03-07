package utils;

import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;

public class RandomListSelect {

    public static WebElement GetRandomFromList(List<WebElement> list) {
        Random random = new Random();
        int RandomProd = random.nextInt(list.size());
        return list.get(RandomProd);

    }
}
