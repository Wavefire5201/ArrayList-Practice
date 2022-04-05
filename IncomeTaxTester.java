public class IncomeTaxTester {
    public static void main(String[] args) {
        IncomeTaxStudent e = new IncomeTaxStudent();
        System.out.println(e.taxBracket(50000.0));
        System.out.println(e.taxOwed(50000.0));
        System.out.println(e.percentageOfIncome(50000.0));
    }
}