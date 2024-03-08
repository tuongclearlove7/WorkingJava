package com.example.TestProject.service.impl;

import com.example.TestProject.model.Person;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class ExcelUploadService {


    public static boolean isValidExcelFile(MultipartFile file){

        String content = "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet";

        return Objects.equals(file.getContentType(), content);
    }


    public static List<Person> getPersonsDataFromExcel(InputStream inputStream){

        List<Person> persons = new ArrayList<>();
        try {
            XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
            XSSFSheet sheet = workbook.getSheet("persons");
            int rowIndex =0;
            for (Row row : sheet){
                if (rowIndex ==0){
                    rowIndex++;
                    continue;
                }
                Iterator<Cell> cellIterator = row.iterator();
                int cellIndex = 0;
                Person person = new Person();
                while (cellIterator.hasNext()){
                    Cell cell = cellIterator.next();
                    switch (cellIndex){
                        case 0 -> {
                            if (cell.getCellType() == CellType.NUMERIC) {
                                person.setId((long) cell.getNumericCellValue());
                            } else {
                                System.out.println("Not number");
                            }
                        }
                        case 1 -> person.setName(cell.getStringCellValue());
                        case 2 ->  {
                            if (cell.getCellType() == CellType.NUMERIC) {
                                person.setAge((int) cell.getNumericCellValue());
                            } else {
                                System.out.println("Not number");
                            }
                        }
                        default -> {
                        }
                    }
                    cellIndex++;
                }
                persons.add(person);
            }
        } catch (IOException e) {

            System.out.println("Error upload service");
            e.getStackTrace();
        }
        return persons;
    }

}