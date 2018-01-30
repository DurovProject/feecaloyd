import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.IOException;

public class Main {
    public static void main(String args[]) throws IOException {
//        File file = new File("C:\\Users\\Durov\\IdeaProjects\\CTLutil\\temp\\temp_copy.xlsx");
//        FileInputStream inputStream = new FileInputStream(file);
        XSSFWorkbook workbook = new XSSFWorkbook(Main.class.getResourceAsStream("/document.xlsx"));
        XSSFSheet sheet = workbook.getSheetAt(0);
        System.out.println(sheet.getRow(0).getCell(0));
    }
}
