public class FinancialForecast {


    public static double calculateFutureValueRecursive(double principal, double rate, int years) {

        if (years == 0) {
            return principal;
        }
        //multiplying with 1+rate to calculate compound intrest doing this until it become 0
        return calculateFutureValueRecursive(principal, rate, years - 1) * (1 + rate);
    }
    /*
    explanation:
    initiallypassing 1000,0.1,3
    1st year-passing 1000,0.1,2*(1+0.1)==1000*1.1=1100
    2nd year-passing 1000,0.1,1*(1+0.1)*(1+0.1)==1100*1.1=1210
    3rd year-passing 1000,0.1,1*(1+0.1)*(1+0.1)*(1+0.1)==1210*1.1=1331


     */

    public static void main(String[] args) {
        double principal = 1000.0; // that amount we gave
        double rate = 0.1;        // rate of intrest (10%)
        int years = 3;            // For how many years


        double futureValue = calculateFutureValueRecursive(principal, rate, years);


        System.out.printf("Future Value after %d years: %.2f\n", years, futureValue);
    }
}
