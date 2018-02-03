package sda.cards;

import org.junit.Test;
import sda.cards.validation.luhnvalidation.LuhnValidatorImpl;

import static org.junit.Assert.*;

public class LuhnValidatorImplTest {

    @Test
    public void should_check_cardNo_is_correct() {
        LuhnValidatorImpl luhnValidator = new LuhnValidatorImpl();
        boolean even = luhnValidator.isCorrect("18606");
        boolean odd = luhnValidator.isCorrect("1412");
        assertEquals(true, even);
        assertEquals(true, odd);
    }
}