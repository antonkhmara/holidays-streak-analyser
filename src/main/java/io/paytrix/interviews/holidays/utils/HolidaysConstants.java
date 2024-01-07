package io.paytrix.interviews.holidays.utils;

import java.time.LocalDate;

public interface HolidaysConstants {

    String HOLIDAYS_URL = """
                           https://validate.bankersalmanac.com/validate-api/rest/convert/4.6
                           ?countryCode={countryCode}
                           &startDate={startDate}
                           &endDate={endDate}
                           &token={token}
        """;

    String COUNTRY_CODE = "PL";

    LocalDate START_DATE = LocalDate.of(2024, 1, 1);

    LocalDate END_DATE = LocalDate.of(2024, 12, 31);

}
