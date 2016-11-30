/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addressapp.util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

/**
 *
 * @author Alberto
 */

public class DateUtil {
    
    private static final String DATE_PATTERN = "dd.MM.yyyy";
    private static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern(DATE_PATTERN);
    
    public static String format(LocalDate date) {
        if(date == null)
            return null;
        return DATE_FORMATTER.format(date);
    }
    
    public static LocalDate parse(String dateString) {
        try {
            return DATE_FORMATTER.parse(dateString, LocalDate::from);
        } catch(DateTimeParseException e) {
            return null;
        }
    }
    
    public static boolean validDate(String dateString) {        
        return DateUtil.parse(dateString) != null;
    }
    
}
