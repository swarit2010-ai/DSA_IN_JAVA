public class Pro_14 {
    public static void main(String[] args) {
        int income = 1223423;
        int tax_income = income - 300000;
        double tax = 15/100.0 *tax_income;
        System.out.println("The tax is " + tax + " rupees");
    }
}
