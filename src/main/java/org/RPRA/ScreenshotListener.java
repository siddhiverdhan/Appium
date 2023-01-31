package org.RPRA;

import org.junit.runner.notification.Failure;
import org.junit.runner.notification.RunListener;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;

public class ScreenshotListener extends RunListener {

    private TakesScreenshot screenshotTaker;

    @Override
    public void testFailure(Failure failure) throws Exception {
        File file = screenshotTaker.getScreenshotAs(OutputType.FILE);
        // do something with your file
    }

}
