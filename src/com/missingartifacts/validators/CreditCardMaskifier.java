package com.missingartifacts.validators;

public class CreditCardMaskifier {
    public static String maskify(String creditCardNumber) {
        String maskifiedCardNumber;
        char maskCharacter = '#';
        if(creditCardNumber.length() >= 6 && !("".equals(creditCardNumber))) {
            StringBuilder maskBuilder = new StringBuilder();
            int cardNumLength = creditCardNumber.length();
            maskBuilder.append(creditCardNumber.substring(0,1));
            for( int i = 1; i< cardNumLength - 4; i++) {
                char ch = creditCardNumber.charAt(i);
                if(Character.isDigit(ch)) {
                    maskBuilder.append(maskCharacter);
                } else {
                    maskBuilder.append(ch);
                }
            }
            maskBuilder.append(creditCardNumber.substring(cardNumLength-4));
            maskifiedCardNumber = maskBuilder.toString();
        } else {
            maskifiedCardNumber = creditCardNumber;
        }

        return maskifiedCardNumber;
    }
}