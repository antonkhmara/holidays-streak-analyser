package io.paytrix.interviews.holidays.config;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeDeserializer extends JsonDeserializer<LocalDateTime> {

    @Override
    public LocalDateTime deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        String date = jsonParser.getText();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yy/MM/dd HH:mm:ss.SSS");
        return LocalDateTime.parse(date, formatter);
    }

}
