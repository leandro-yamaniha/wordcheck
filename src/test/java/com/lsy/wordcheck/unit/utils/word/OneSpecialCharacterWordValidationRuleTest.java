package com.lsy.wordcheck.unit.utils.word;

import com.lsy.wordcheck.utils.rule.word.OneNumberWordValidationRule;
import com.lsy.wordcheck.utils.rule.word.OneSpecialCharacterWordValidationRule;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class OneSpecialCharacterWordValidationRuleTest {

    private OneSpecialCharacterWordValidationRule validationRule;

    @BeforeEach
    void init(){
        validationRule = new OneSpecialCharacterWordValidationRule();
    }

    @ParameterizedTest(name =  "{0} is not valid")
    @ValueSource(strings = {"12345678L9!","7ABCD+EFGHI","1234&5x67890ABCDEF"})
    void whenIsValid(String word){
        assertTrue(validationRule.isValid(word));
    }

    @ParameterizedTest(name =  "{0} is not valid")
    @ValueSource(strings = {"dsafafewrqrwe","A213dsfdsf","ASDfdsf;."})
    void whenIsInvalid(String word){
        assertFalse(validationRule.isValid(word));

    }

}
