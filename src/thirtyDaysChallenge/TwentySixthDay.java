package thirtyDaysChallenge;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class TwentySixthDay {
	final static int COMMON_FINE = 15;
	final static int EXTRA_FINE = 500;

	public static int getFine(Calendar actual, Calendar expected) {
		DateFormat month = new SimpleDateFormat("MM");
		DateFormat year = new SimpleDateFormat("yyyy");
		int fine = 0;
		int days = (int) ((actual.getTimeInMillis() - expected.getTimeInMillis()) / (24 * 60 * 60 * 1000));
		int months = Integer.parseInt(month.format(actual.getTime()))-Integer.parseInt(month.format(expected.getTime()));
		int years = Integer.parseInt(year.format(actual.getTime()))-Integer.parseInt(year.format(expected.getTime()));
		
		//System.out.println("Actual : " + month.format(actual.getTime()) + " / " + year.format(actual.getTime()));
		//System.out.println("Expected : " + month.format(expected.getTime()) + " / " + year.format(expected.getTime()));
		
		//System.out.println("Years : " + years + ", Months : " + months + ", Days : " + days);
		
		if (days <= 0) {
            fine = 0;
        } else if (years > 0) {
            fine = 10000;
        } else if (months != 0) {
            fine = months * EXTRA_FINE;
        } else {
            fine = days * COMMON_FINE;
        }

		return fine;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String actual = sc.nextLine();
		String expected = sc.nextLine();

		sc.close();

		String[] a = actual.split(" ");
		String[] e = expected.split(" ");
		
		Calendar actualReturnDate = Calendar.getInstance();
		actualReturnDate.clear();
		actualReturnDate.set(Integer.parseInt(a[2]), Integer.parseInt(a[1])-1, Integer.parseInt(a[0]));
		
		Calendar expectedReturnDate = Calendar.getInstance();
		expectedReturnDate.clear();
		expectedReturnDate.set(Integer.parseInt(e[2]), Integer.parseInt(e[1])-1, Integer.parseInt(e[0]));

		System.out.print(getFine(actualReturnDate, expectedReturnDate));
	}
}
