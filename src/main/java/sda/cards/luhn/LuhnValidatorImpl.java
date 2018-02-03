package sda.cards.luhn;

public class LuhnValidatorImpl implements ILuhnValidator {
    @Override
    public boolean isCorrect(String cardNo) {
        // create array list of card number digits
        int[] cardNumberArray = convertToInt(cardNo);

        // multiply elements on odd index starts from right side
        boolean alternate = false;
        int sum = 0;
        for (int i = cardNumberArray.length - 1; i >= 0; i--) {
            if (alternate) {
                cardNumberArray[i] *= 2;
                if (cardNumberArray[i] > 9) {
                    cardNumberArray[i] -= 9;
                }
            }
            alternate = !alternate;
            sum += cardNumberArray[i];
        }
        return sum % 10 == 0;
    }

    /**
     * Convert String card number into array of digits
     *
     * @param cardNo - card number in String format
     * @return - array of digits
     */
    private int[] convertToInt(String cardNo) {
        int[] cardNumber = new int[cardNo.length()];

        for (int i = 0; i < cardNo.length(); i++) {
            cardNumber[i] = Character.getNumericValue(cardNo.charAt(i));
        }
        return cardNumber;
    }
}
