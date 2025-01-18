package seleniumPractice;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

public class DataProviderExcelUtility {

    public static WebDriver driver;
    String chrome_path;
    public static XSSFWorkbook workbook;
    public static XSSFSheet worksheet;
    public static DataFormatter formatter= new DataFormatter();
    public static String file_location = "src/testData/testDataNew.xls";
    static String SheetName= "Sheet1";
    public  String Res;
    public int DataSet=-1;

    @BeforeSuite
    public void OpenBrowser() throws InterruptedException

    {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://freelance-learn-automation.vercel.app/login");
        Thread.sleep(3000);
    }

    @DataProvider
    public static Object[][] ReadVariant() throws IOException
    {
        FileInputStream fileInputStream= new FileInputStream(file_location); //Excel sheet file location get mentioned here
        workbook = new XSSFWorkbook(fileInputStream); //get my workbook
        worksheet=workbook.getSheet(SheetName);// get my sheet from workbook
        XSSFRow Row=worksheet.getRow(0);   	 //get my Row which start from 0

        int RowNum = worksheet.getPhysicalNumberOfRows();// count my number of Rows
        int ColNum= Row.getLastCellNum(); // get last ColNum

        Object Data[][]= new Object[RowNum-1][ColNum]; // pass my  count data in array

        for(int i=0; i<RowNum-1; i++) //Loop work for Rows
        {
            XSSFRow row= worksheet.getRow(i+1);

            for (int j=0; j<ColNum; j++) //Loop work for colNum
            {
                if(row==null)
                    Data[i][j]= "";
                else
                {
                    XSSFCell cell= row.getCell(j);
                    if(cell==null)
                        Data[i][j]= ""; //if it get Null value it pass no data
                    else
                    {
                        String value=formatter.formatCellValue(cell);
                        Data[i][j]=value; //This formatter get my all values as string i.e integer, float all type data value
                        System.out.println(Data[i][j]);
                    }
                }
            }
        }

        return Data;
    }
    @Test(dataProvider="ReadVariant")
    public void AddVariants(String  email, String password, String expected) throws Exception
    {

        System.out.println("NAme of product available are:" +email);
        System.out.println("Weight for products are:" +password);
        System.out.println("Volume of product are:" +expected);

        WebDriverWait wait =  new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://freelance-learn-automation.vercel.app/login");
        driver.findElement(By.id("email1")).sendKeys(email);
        driver.findElement(By.id("password1")).sendKeys(password);

        driver.findElement(By.cssSelector("[type='submit']")).click();
// User get Login
//        driver.get("http://192.168.1.91/user/login");
//        driver.findElement(By.id("prependedInput")).sendKeys("admin");
//        driver.findElement(By.id("prependedInput2")).sendKeys("admin");
//        driver.findElement(By.id("_submit")).click();

        Thread.sleep(4000);

// Click on product label
//        WebElement element1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href ='#/enrich/product/']")));
//        driver.findElement(By.xpath("//a[@href ='#/enrich/product/']")).click();
//        Thread.sleep(2000);
////click on create product
//        driver.findElement(By.cssSelector("div[data-drop-zone='buttons'] a")).click();
////click on product model
//        driver.findElement(By.cssSelector("[data-form='pim-product-create-modal']")).click();
//        Thread.sleep(6000);
////click on SKU and passed data from dataprovider i.e MODEL
//        driver.findElement(By.name("identifier")).sendKeys(MODEL);
////Thread.sleep(6000);
//// Select family of product
//        WebElement element2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[17]/div[2]/div/div/div[2]/div[3]/div[2]/div[2]/div/a")));
//        driver.findElement(By.xpath("/html/body/div[17]/div[2]/div/div/div[2]/div[3]/div[2]/div[2]/div/a")).click();
//        Thread.sleep(2000);
//
////driver.findElement(By.xpath("/html/body/div[19]/ul/li[1]")).click();
////click on save
//        driver.findElement(By.xpath("/html/body/div[17]/div[3]/a[2]")).click();
//        Thread.sleep(8000);
//
//        WebElement element3 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[data-attribute='name'] input")));
////click on name input field and clear .
//        driver.findElement(By.cssSelector("div[data-attribute='name'] input")).clear();
////Send Name parameter from dataprovider
//        driver.findElement(By.cssSelector("div[data-attribute='name'] input")).sendKeys(NAME);
////clear description field
//        driver.findElement(By.className("note-editable")).clear();
////send description parameter from data provider
//        driver.findElement(By.className("note-editable")).sendKeys(DESCRIPTION);
////clear weight field
//        driver.findElement(By.cssSelector("div[data-attribute='weight'] input")).clear();
////send weight parameter from data provider
//        driver.findElement(By.cssSelector("div[data-attribute='weight'] input")).sendKeys(WEIGHT);
////send price parameter from data provider
//        driver.findElement(By.cssSelector("div[data-attribute='main_price'] input")).sendKeys(PRICE);
//
//        Thread.sleep(4000);
//        driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div[1]/div[2]/div[1]/header/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[3]/button")).click();
////Result is equal to pass mentioned here
//        Res="Pass";
//        obj1.WriteResult(Res, DataSet+1); //It call write Result program and DataSet get increase by +1 after execution of write Result method
//
//        /* code for logout */
//
//        Thread.sleep(4000);
//        driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div[1]/div[2]/div[1]/header/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div/div[1]/div[1]")).click();
//        Thread.sleep(4000);
//        driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div[1]/div[2]/div[1]/header/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div/div[1]/div[2]/div[3]")).click();
////driver.findElement(By.cssSelector("div[data-attribute='Model_new'] input")).sendKeys(MODEL);



    }



    //https://freelance-learn-automation.vercel.app/login
}

