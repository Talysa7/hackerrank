package thirtyDaysChallenge;

public class SecondDay {
	static void solve(double meal_cost, int tip_percent, int tax_percent) {
		double tip = meal_cost * (tip_percent*0.01);
		double tax = meal_cost * (tax_percent*0.01);
		int totalCost = (int)Math.round(meal_cost + tip + tax);
		System.out.println(totalCost);
    }
}
