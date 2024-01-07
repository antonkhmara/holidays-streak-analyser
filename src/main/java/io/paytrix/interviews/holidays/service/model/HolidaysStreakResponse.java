package io.paytrix.interviews.holidays.service.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.paytrix.interviews.holidays.config.LocalDateTimeDeserializer;
import java.time.LocalDateTime;
import java.util.List;

public record HolidaysStreakResponse(List<Holiday> holidays) {

    public record Holiday(String title,
                          @JsonDeserialize(using = LocalDateTimeDeserializer.class)
                          LocalDateTime start,
                          @JsonDeserialize(using = LocalDateTimeDeserializer.class)
                          LocalDateTime end) {

    }
}
