package sda.cards.cardvalidation;

import sda.cards.issuers.IIssuerDetector;
import sda.cards.issuers.IssuerDetectorImpl;
import sda.cards.luhn.ILuhnValidator;
import sda.cards.luhn.LuhnValidatorImpl;

public class SDACardValidator implements ICardValidator {
    public ValidationResult validateCardNo(String cardNo) {
        ValidationResult result = new ValidationResult();

        IIssuerDetector detector = new IssuerDetectorImpl();
        String issuer = detector.detectIssuer(cardNo);

        ILuhnValidator validator = new LuhnValidatorImpl();
        boolean isLuhnPassed = validator.isCorrect(cardNo);

        result.setIssuer(issuer);
        result.setLuhnPassed(isLuhnPassed);
        return result;
    }
}
