package FileHandling;


import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExampleFile_ReadFromXsls {

    public static void main(String[] args) throws IOException {
        String path = System.getProperty("user.dir")+ File.separator+"TestData"+File.separator+"testdata.xlsx";

        FileInputStream fis = new FileInputStream(path);
        XSSFWorkbook wb = new XSSFWorkbook(fis);
        Sheet st = wb.getSheet("sheet1");
        String val = st.getRow(1).getCell(1).getStringCellValue();
        System.out.println(val);

    }

}
