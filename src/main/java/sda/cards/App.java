package sda.cards;

import sda.cards.validation.cardvalidation.ICardValidator;
import sda.cards.validation.cardvalidation.CardValidatorImpl;
import sda.cards.validation.ValidationResult;

import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
    private static final String PATH_TO_FILE = "C:\\Users\\piotr\\IdeaProjects\\validator\\file.txt";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter card number");
        String cardNo = scanner.next();
        ICardValidator validator = new CardValidatorImpl();
        ValidationResult result = validator.validateCardNo(cardNo, PATH_TO_FILE);
        System.out.println("ISSUER: " + result.getIssuer());
        System.out.println("VALIDATION PASSED: " + result.isLuhnPassed());
    }
}
