package sda.cards.validation.cardvalidation;

import sda.cards.issuerdetection.IIssuerDetector;
import sda.cards.issuerdetection.IssuerDetectorImpl;
import sda.cards.validation.ValidationResult;
import sda.cards.validation.luhnvalidation.ILuhnValidator;
import sda.cards.validation.luhnvalidation.LuhnValidatorImpl;

public class CardValidatorImpl implements ICardValidator {
    public ValidationResult validateCardNo(String cardNo, String pathToFile) {
        ValidationResult result = new ValidationResult();

        IIssuerDetector detector = new IssuerDetectorImpl();
        String issuer = detector.detectIssuer(cardNo, pathToFile);

        ILuhnValidator validator = new LuhnValidatorImpl();
        boolean isLuhnPassed = validator.isCorrect(cardNo);

        result.setIssuer(issuer);
        result.setLuhnPassed(isLuhnPassed);
        return result;
    }
}
