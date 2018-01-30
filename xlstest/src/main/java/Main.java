import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import sun.plugin.dom.html.HTMLLinkElement;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String args[]) throws IOException {
        File file = new File("C:\\Users\\Durov\\IdeaProjects\\CTLutil\\temp\\temp_copy.xlsx");
        FileInputStream inputStream = new FileInputStream(file);
        XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
      //  XSSFSheet sheet = workbook.getSheetAt(0);
    }
}
