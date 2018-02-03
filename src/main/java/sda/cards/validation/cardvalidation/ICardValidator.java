package sda.cards.validation.cardvalidation;

import sda.cards.validation.ValidationResult;

public interface ICardValidator {
    ValidationResult validateCardNo(String cardNo, String pathToFile);
}
