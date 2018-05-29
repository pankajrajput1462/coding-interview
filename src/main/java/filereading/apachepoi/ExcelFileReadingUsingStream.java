/*
package filereading.apachepoi;

import java.io.*;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import com.monitorjbl.xlsx.StreamingReader;

public class ExcelFileReadingUsingStream {

    public static void main(String[] args) {

        System.out.println("Execle file is to read");
        InputStream stream=null;
        try {
             stream = new FileInputStream(new File("C:\\Users\\psi143\\Desktop\\software\\sample.xlsx"));
            int kb = stream.available() / 1024;
            int mb = kb / 1024;
            System.out.println("fileSizeInKB : " + kb + " File Size in MB: " + mb);

       //     Workbook workbook = StreamingReader.builder().rowCacheSize(100).bufferSize(4096).open(stream);

         */
/*   for (Sheet sheet : workbook){
                System.out.println(sheet.getSheetName());
                for (Row r : sheet) {
                    for (Cell c : r) {
                        System.out.println(c.getStringCellValue());
                    }
                }
            }*//*


            Sheet orders = workbook.getSheet("Orders");
            Row row1 = orders.createRow(8401);

            for (Row row : orders) {
             */
/*   for (Cell cell :row) {
                    System.out.println(cell.getStringCellValue());

                }*//*

            }


        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        finally {
            try {
                stream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

}
*/
