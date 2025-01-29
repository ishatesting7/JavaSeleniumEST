package testCases;

import TestNGListeners.Log;
import org.testng.annotations.Test;

public class logDemo {

    @Test
    public void LoginTest()
    {
        Log.info("Launching the Chrome Browser");

        try {
            Log.info("Launching the Browser");

            Log.info("Navigating to home page");

            Log.info("Entering the username and password");
        }
        catch (Exception e)
        {
            Log.error("An error occurred"+ e.getMessage());
        }
    }
}
