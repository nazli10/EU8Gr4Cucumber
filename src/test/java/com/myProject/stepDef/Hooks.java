package com.myProject.stepDef;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.bs.A;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import com.myProject.utilities.Driver;

public class Hooks {

    @After
    public void tearDownScenario(Scenario scenario){

        if (scenario.isFailed()){
            byte[]screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png", scenario.getName());
        }

        //BrowserUtils.sleep(4);
        Driver.closeDriver();
        //System.out.println("-----------Closing browser using cucumber @After-----------");
    }
}
