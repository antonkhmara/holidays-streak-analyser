package io.paytrix.interviews.holidays.service.model;

import java.time.OffsetDateTime;

public record HolidaysStreakRequest(String countryCode, OffsetDateTime startDate, OffsetDateTime endDate) {

}
