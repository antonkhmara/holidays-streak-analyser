package io.paytrix.interviews.holidays.utils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import lombok.experimental.UtilityClass;

@UtilityClass
public class LocalDateConverter {

    public static String convertToIsoString(LocalDate localDate) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yy");
        return localDate.format(formatter);
    }

}
