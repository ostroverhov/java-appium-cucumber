package hooks;

import drivers.AppFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utils.Logger;

public class Hook {

    private static final Logger logger = Logger.getInstance();
    private final AppFactory appFactory;

    public Hook(AppFactory appFactory) {
        this.appFactory = appFactory;
    }

    @Before
    public void setUp(Scenario scenario) {
        logger.info("===Start scenario [%s]===", scenario.getName());
    }

    @After
    public void close(Scenario scenario) {
        logger.info("===Close scenario [%s] with status [%s]===", scenario.getName(), scenario.getStatus());
        //AppFactory.quit(appFactory.getDriver());
    }
}
