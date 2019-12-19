package utlis;
import cucumber.api.Scenario;
import lombok.Getter;
import org.apache.log4j.Logger;

@Getter
public class Logs {

    public static Logger logger = Logger.getLogger(Logs.class);

}
