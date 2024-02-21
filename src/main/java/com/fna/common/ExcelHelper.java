package com.fna.common;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.web.multipart.MultipartFile;

import com.fna.model.PaymentFailure;


public class ExcelHelper {
  public static String TYPE = "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet";
  static String SHEET = "Sheet1";

  public static boolean hasExcelFormat(MultipartFile file) {

    if (!TYPE.equals(file.getContentType())) {
      return false;
    }

    return true;
  }

  public static List<PaymentFailure> excelToPayment(InputStream is) {
    try {
      Workbook workbook = new XSSFWorkbook(is); 

      Sheet sheet = workbook.getSheet(SHEET);
      Iterator<Row> rows = sheet.iterator();
      DataFormatter formatter = new DataFormatter(Locale.US);

      List<PaymentFailure> tutorials = new ArrayList<PaymentFailure>();

      int rowNumber = 0;
      while (rows.hasNext()) {
        Row currentRow = rows.next();

        // skip header
//        if (rowNumber == 0) {
//          rowNumber++;
//          continue;
//        }

        Iterator<Cell> cellsInRow = currentRow.iterator();

        PaymentFailure tutorial = new PaymentFailure();

        int cellIdx = 0;
        while (cellsInRow.hasNext()) {
          Cell currentCell = cellsInRow.next();

          switch (cellIdx) {
          
          case 0:
              String a = formatter.formatCellValue(currentCell);
              tutorial.setSno(Double.parseDouble(a));
              break;
               
          case 1:
              String b = formatter.formatCellValue(currentCell);
            tutorial.setDate(b);
            break;
 
          case 2:
              String c = formatter.formatCellValue(currentCell);

            tutorial.setCcode(c);
            break;
 
          case 3:
              String d = formatter.formatCellValue(currentCell);

            tutorial.setApfname(d);
            break; 

          case 4:
              String e = formatter.formatCellValue(currentCell);

            tutorial.setApfaccno(e);
            break;
             
          case 5:
              String f = formatter.formatCellValue(currentCell);

              tutorial.setMode(f);
              break;
              
          case 6:
              String g = formatter.formatCellValue(currentCell);

              tutorial.setTbgrno(Integer.parseInt(g)); 
              break;
          case 7:
              String h = formatter.formatCellValue(currentCell);

              tutorial.setSalenoteno(h);
              break;
          case 8:
              String i = formatter.formatCellValue(currentCell);

              tutorial.setGrowername(i);
              break;
          case 9:
              String j = formatter.formatCellValue(currentCell);

              tutorial.setGroweraccno(j);
              break;
          case 10:
              String k = formatter.formatCellValue(currentCell);

              tutorial.setIfsccode(k);
              break;
          case 11:
              String l = formatter.formatCellValue(currentCell);

              tutorial.setNetamount(Double.parseDouble(l));
              break; 
          case 12:
              String m = formatter.formatCellValue(currentCell);

              tutorial.setPaymentprocessfor(m);
              break;
          case 13:
              String n = formatter.formatCellValue(currentCell);

              tutorial.setPaymentdate(n);
              break;
          case 14:
              String o = formatter.formatCellValue(currentCell);

              tutorial.setStatus(o);
              break;
          case 15:
              String p = formatter.formatCellValue(currentCell);

              tutorial.setAckno(p);
              break;
          case 16:
              String q = formatter.formatCellValue(currentCell);

              tutorial.setFailureremarks(q);
              break;
              
          default:
            break;
          }

          cellIdx++;
        }

        tutorials.add(tutorial);
      }

      workbook.close();

      return tutorials;
    } catch (IOException e) {
      throw new RuntimeException("fail to parse Excel file: " + e.getMessage());
    }
  }
}