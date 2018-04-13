package com.missingartifacts.arithmeticoperations;

public class OrdinalNumber {
    public static String numberToOrdinal( Integer number ) {
        StringBuilder builder = new StringBuilder();
        int num = number.intValue();

        if( num >= 0 ) {
            builder.append(num);

            int moduloByLastDigit = num % 10;
            int moduloByLast2Digits = num % 100;

            if(moduloByLast2Digits >=10 && moduloByLast2Digits <= 20) {
                builder.append("th");
            } else {
                if(moduloByLastDigit == 1) {
                    builder.append("st");
                } else if(moduloByLastDigit == 2) {
                    builder.append("nd");
                } else if(moduloByLastDigit == 3) {
                    builder.append("rd");
                } else {
                    builder.append("th");
                }
            }


        }

        return builder.toString();
    }
}
