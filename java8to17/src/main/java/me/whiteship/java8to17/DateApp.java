package me.whiteship.java8to17;

import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class DateApp {
    public static void main(String[] args) {
        Date date = new Date();
        Calendar calendar = new GregorianCalendar();
        SimpleDateFormat dateFormat = new SimpleDateFormat();

        // 기계용 instant
        Instant instant = Instant.now();
        System.out.println(instant); // 기준시 UTC, GMT
        System.out.println(instant.atZone(ZoneId.of("UTC")));

        ZoneId zone = ZoneId.systemDefault();
        System.out.println(zone);
        ZonedDateTime zonedDateTime = instant.atZone(zone);
        System.out.println(zonedDateTime);


        // 사람용 LocalDateTime
        LocalDateTime now = LocalDateTime.now(); // 서버의 시간대가 사용됨
        System.out.println(now);
        LocalDateTime birthDay =
                LocalDateTime.of(1982, Month.JULY, 15, 0, 0, 0);
        ZonedDateTime nowInKorea = ZonedDateTime.now(ZoneId.of("Asia/Seoul"));
        System.out.println(nowInKorea);

        // 서로 변환 가능
        Instant nowInstant = Instant.now();
        ZonedDateTime zonedDateTime1 = nowInstant.atZone(ZoneId.of("Asia/Seoul"));
        System.out.println(zonedDateTime1);


        // 기간 사람용 Period
        LocalDate today = LocalDate.now();
        LocalDate thisYearBirthday = LocalDate.of(2020, Month.JULY, 15);

        Period period = Period.between(today, thisYearBirthday);
        System.out.println(period.getDays());

        Period until = today.until(thisYearBirthday);
        System.out.println(until.get(ChronoUnit.DAYS));


        // 기간 기계용 Duration
        Instant now1 = Instant.now();
        Instant plus = now1.plus(10, ChronoUnit.SECONDS);
        Duration between = Duration.between(now1, plus);
        System.out.println(between.getSeconds());


        // 포맷팅
        LocalDateTime now2 = LocalDateTime.now();
        DateTimeFormatter MMddyyyy = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        System.out.println(now.format(MMddyyyy));

        // 파싱
        LocalDate parse = LocalDate.parse("07/15/1982", MMddyyyy);
        System.out.println(parse);

        // toInstant() from(instant)
        Date date1 = new Date();
        Instant instant1 = date.toInstant();
        Date newDate = Date.from(instant1);

        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        ZonedDateTime dateTime = gregorianCalendar.toInstant().atZone(ZoneId.systemDefault());
        GregorianCalendar from = GregorianCalendar.from(dateTime);

        ZoneId zoneId = TimeZone.getTimeZone("PST").toZoneId();
        TimeZone timeZone = TimeZone .getTimeZone(zoneId);

        LocalDateTime now3 = LocalDateTime.now();
        LocalDateTime plus1 = now3.plus(10, ChronoUnit.DAYS);
    }
}
