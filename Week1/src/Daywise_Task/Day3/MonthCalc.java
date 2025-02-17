package Day3;
import java.time.LocalDateTime;

public class MonthCalc {
	    public static void main(String[] args) {
	        LocalDateTime startDate = LocalDateTime.of(2022, 5, 10, 10, 30);
	        LocalDateTime endDate = LocalDateTime.of(2024, 2, 15, 12, 45);
	        int yearsDiff = endDate.getYear() - startDate.getYear();
	        int monthsDiff = endDate.getMonthValue() - startDate.getMonthValue();

	        // Convert total difference into months
	        int totalMonths = (yearsDiff * 12) + monthsDiff;

	        System.out.println("Number of months between: " + totalMonths);
	    }
	}
}
