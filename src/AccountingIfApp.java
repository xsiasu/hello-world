public class AccountingIfApp {
    public static void main(String[] args) {

        double valueOfSupply = Double.parseDouble(args[0]);
        double vatRate = 0.1;
        double vat = valueOfSupply * vatRate;
        double total = valueOfSupply+vat;
        double expanseRate = 0.3;
        double expanse  = valueOfSupply * expanseRate;
        double income = valueOfSupply - expanse;
        double dividend1;
        double dividend2;
        double dividend3;


        if(income > 10000.0) {
            dividend1 = income*0.5;
            dividend2 = income*0.3;
            dividend3 = income*0.2;
        }else {
            dividend1 = income*1.0;
            dividend2 = income*0;
            dividend3 = income*0;
        }

        //total
        System.out.println("total :" + total );
        //공급가
        System.out.println("value of supply:" + valueOfSupply );
        //TAX
        System.out.println("value added tax:" + vat );
        //비용
        System.out.println("expanse rate:" + expanse);
        //income
        System.out.println("income:" + income );
        // 배당
        System.out.println("dividend1:" + dividend1 );
        System.out.println("dividend2:" + dividend2 );
        System.out.println("dividend3:" + dividend3 );
    }
}