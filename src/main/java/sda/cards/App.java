package sda.cards;

import sda.cards.cardvalidation.ICardValidator;
import sda.cards.cardvalidation.SDACardValidator;
import sda.cards.cardvalidation.ValidationResult;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadz numer karty");
        String cardNo = scanner.next();
        ICardValidator validator = new SDACardValidator();
        ValidationResult result = validator.validateCardNo(cardNo);
        System.out.println("ISSUER: " + result.getIssuer());
        System.out.println("LUHN PASSED: " + result.isLuhnPassed());
    }
}
