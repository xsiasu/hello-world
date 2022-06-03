class Accounting {
    public double valueOfSupply;
    public double vatRate;
    public double expenseRate;
    public void print() {
        System.out.println("total :" + getTotal());
        //공급가
        System.out.println("value of supply:" + valueOfSupply );
        //TAX
        System.out.println("value added tax:" + getVat());
        //비용
        System.out.println("expanse rate:" + expenseRate);
        //income
        System.out.println("income:" + getIncome());
        // 배당
        System.out.println("dividend1:" + getDividend1());
        System.out.println("dividend2:" + getDividend2());
        System.out.println("dividend3:" + getDividend3());
    }


    public double getDividend1() {
        return getIncome() * 0.5;
    }
    public double getDividend2() {
        return getIncome() * 0.3;
    }
    public double getDividend3() {
        return getIncome() * 0.1;

    }
    public double getIncome() {
        return valueOfSupply - getExpense();
    }

    public double getExpense() {
        return valueOfSupply *  expenseRate;
    }

    public double getTotal() {
        return valueOfSupply + getVat();
    }

    //method 생성


    public double getVat() {
        return valueOfSupply * vatRate;
    }
}

public class AccountingClassApp {
    public static void main(String[] args) {
        Accounting a1 = new Accounting();
        a1.valueOfSupply = 20000.0;
        a1.vatRate = 0.8;
        a1.expenseRate = 0.9;
        a1.print();

        Accounting a2 = new Accounting();
        a2.valueOfSupply = 10000.0;
        a2.vatRate = 0.5;
        a2.expenseRate = 0.3;
        a2.print();

    }
}