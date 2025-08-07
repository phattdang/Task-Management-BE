package phatdang.se.taskapi.utils;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ConvertTime {
    public static LocalDateTime convertStringToLocalDateTime(String date){
        return LocalDate.parse(date, DateTimeFormatter.ofPattern(("dd-MM-yyyy"))).atStartOfDay();
    }
}
