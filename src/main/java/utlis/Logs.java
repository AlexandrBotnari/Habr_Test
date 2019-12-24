package utlis;

import browser.PropertyReader;
import lombok.Getter;
import org.apache.log4j.Logger;

import java.text.SimpleDateFormat;
import java.util.Date;

@Getter
public class Logs {

    static {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy-hh-mm-ss");
        System.setProperty("current.date.time", dateFormat.format(new Date()));
    }

    public static Logger logger = Logger.getLogger(Logs.class);

}
