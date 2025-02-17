package Day3;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class LocalDate {
    public static void main(String[] args) {
        // current date-time
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Current LocalDateTime: " + now);

        // current date-time in UTC
        LocalDateTime utcNow = LocalDateTime.now(ZoneId.of("UTC"));
        System.out.println("Current UTC Time: " + utcNow);

        //date-time in different time zones
        LocalDateTime newYorkTime = LocalDateTime.now(ZoneId.of("America/New_York"));
        LocalDateTime indiaTime = LocalDateTime.now(ZoneId.of("Asia/Kolkata"));
        System.out.println("Current Time in New York: " + newYorkTime);
        System.out.println("Current Time in India: " + indiaTime);

        // Convert LocalDateTime to Epoch Seconds
        long epochSeconds = now.atZone(ZoneId.systemDefault()).toEpochSecond();
        System.out.println("Epoch Seconds (Current Time): " + epochSeconds);

        // Convert LocalDateTime to Epoch Milliseconds
        long epochMillis = now.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
        System.out.println("Epoch Milliseconds (Current Time): " + epochMillis);

        // Create a specific LocalDateTime instance
        LocalDateTime customDate = LocalDateTime.of(2023, 5, 20, 14, 30);
        System.out.println("Custom LocalDateTime: " + customDate);

        // Adding and subtracting time
        LocalDateTime futureDate = now.plusMonths(3).plusDays(10).plusHours(5);
        LocalDateTime pastDate = now.minusYears(2).minusWeeks(5);
        System.out.println("Future Date (+3 months, +10 days, +5 hours): " + futureDate);
        System.out.println("Past Date (-2 years, -5 weeks): " + pastDate);

        // Extracting individual fields
        int year = now.getYear();
        int month = now.getMonthValue();
        int day = now.getDayOfMonth();
        int hour = now.getHour();
        int minute = now.getMinute();
        int second = now.getSecond();
        System.out.println("Extracted Fields - Year: " + year + ", Month: " + month + ", Day: " + day);
        System.out.println("Hour: " + hour + ", Minute: " + minute + ", Second: " + second);

        // Getting day of the week and day of the year
        System.out.println("Day of the Week: " + now.getDayOfWeek());
        System.out.println("Day of the Year: " + now.getDayOfYear());

        // Parsing a string to LocalDateTime
        String dateTimeStr = "2024-02-16T10:15:30";
        LocalDateTime parsedDateTime = LocalDateTime.parse(dateTimeStr);
        System.out.println("Parsed LocalDateTime: " + parsedDateTime);

        // Formatting LocalDateTime
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDate = now.format(formatter);
        System.out.println("Formatted Date-Time: " + formattedDate);

    }
}