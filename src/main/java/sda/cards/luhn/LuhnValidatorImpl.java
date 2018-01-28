package sda.cards.luhn;

import sda.cards.luhn.ILuhnValidator;

public class LuhnValidatorImpl implements ILuhnValidator {
    @Override
    public boolean isCorrect(String cardNo) {
        // create array list of card number digits
        int[] cardNumber = convertToInt(cardNo);

        // multiply elements on odd index starts from right side
        for (int i = cardNumber.length - 2; i >= 0; i -= 2) {
            cardNumber[i] *= 2;
        }

        // if number is greater then 10 then add their digits, finally add all digits each other
        int sum = 0;
        for (int i = 0; i < cardNumber.length; i++) {
            if (cardNumber[i] > 9) {
                int helper = cardNumber[i] % 10;
                cardNumber[i] = helper + 1;
            }
            sum += cardNumber[i];
        }
        return sum % 10 == 0;
    }

    /**
     * Convert String card number into array of digits
     *
     * @param cardNo
     * @return
     */
    private int[] convertToInt(String cardNo) {
        int[] cardNumber = new int[cardNo.length()];

        for (int i = 0; i < cardNo.length(); i++) {
            cardNumber[i] = Character.getNumericValue(cardNo.charAt(i));
        }
        return cardNumber;
    }
}
