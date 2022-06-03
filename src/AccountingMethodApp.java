public class AccountingMethodApp {

    private static double valueOfSupply;
    private static double vatRate;
    private static double expanseRate;

    public static void main(String[] args) {
        // 로컬변수를 필드로 변경한다.
        valueOfSupply = 10000.0;
        vatRate = 0.1;
        expanseRate = 0.3;
        //total
        print();
    }

    private static void print() {
        System.out.println("total :" + getTotal());
        //공급가
        System.out.println("value of supply:" + valueOfSupply );
        //TAX
        System.out.println("value added tax:" + getVat());
        //비용
        System.out.println("expanse rate:" + expanseRate);
        //income
        System.out.println("income:" + getIncome());
        // 배당
        System.out.println("dividend1:" + getDividend1());
        System.out.println("dividend2:" + getDividend2());
        System.out.println("dividend3:" + getDividend3());
    }


    private static double getDividend1() {
        return getIncome() * 0.5;
    }
    private static double getDividend2() {
        return getIncome() * 0.3;
    }
    private static double getDividend3() {
        return getIncome() * 0.1;

    }
    private static double getIncome() {
        return valueOfSupply - getExpense();
    }

    private static double getExpense() {
        return valueOfSupply *  expanseRate;
    }

    private static double getTotal() {
        return valueOfSupply + getVat();
    }

    //method 생성
    private static double getVat() {
        return valueOfSupply * vatRate;
    }
}