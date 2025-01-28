package pageObject;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;


public class generateReportDemo extends BaseTestReport {

    @Test
    public void testPassed() {
        extentTest = extentReports.createTest("Test Case 1", "This test case has passed");
        Assert.assertTrue(true);
    }

    @Test
    public void testFailed() {
        extentTest = extentReports.createTest("Test Case 2", "This test case has failed");
        Assert.assertTrue(false);
    }

    @Test
    public void testSkipped() {
        extentTest = extentReports.createTest("Test Case 3", "This test case has been skipped");
        throw new SkipException("The test has been skipped");
    }
}