package LabsWeek3;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {
        //Task 1 create a method that acceptsBigDecimal and returns a double of the
        //BigDecimal number rounded to the nearest hundredth
        BigDecimal a = new BigDecimal("4.2545");
        BigDecimal rounded = a.round(new MathContext(3, RoundingMode.HALF_EVEN));
        System.out.println(rounded);
        //Task :create a method that accepts a BigDeciaml, reverse the sign(-to+ and vice versa)
        //and it rounds the number to one decimal.

        MathContext mc = new MathContext(2);
        BigDecimal bd1 = BigDecimal.valueOf(1.2345);
        System.out.println(bd1.negate(mc));//This method returns the negative value
        MathContext mc1 =new MathContext(3);
        BigDecimal bd2 = BigDecimal.valueOf(-45.67);
        System.out.println(bd2.abs(mc1));//This method returns the absolute value





    }


}

