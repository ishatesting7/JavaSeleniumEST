package seleniumPractice;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class ApachePOIDemo {


    public static void main(String args[]) throws IOException {

        String filePath = "src/testData/testData.xls";
        FileInputStream fis = new FileInputStream(new File(filePath));
        Workbook workbook = new XSSFWorkbook(fis);
        Sheet sheet = workbook.getSheetAt(0);

        for (Row row : sheet) {
            for (Cell cell : row) {
                switch (cell.getCellType()) {
                        case STRING -> {
                            System.out.println(cell.getStringCellValue());

                            break;
                        }
                        default -> {
                            System.out.println("invalid Data");
                            break;
                        }

                    }

                }
            }

        }
}
