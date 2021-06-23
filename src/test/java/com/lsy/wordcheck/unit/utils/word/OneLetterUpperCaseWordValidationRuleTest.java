package com.lsy.wordcheck.unit.utils.word;

import com.lsy.wordcheck.utils.rule.word.OneLetterLowerCaseWordValidationRule;
import com.lsy.wordcheck.utils.rule.word.OneLetterUpperCaseWordValidationRule;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class OneLetterUpperCaseWordValidationRuleTest {

    private OneLetterUpperCaseWordValidationRule validationRule;

    @BeforeEach
    void init(){
        validationRule = new OneLetterUpperCaseWordValidationRule();
    }

    @ParameterizedTest(name =  "{0} is not valid")
    @ValueSource(strings = {"12345678L9","gABCDEFGHI","12345x67890ABCDEF"})
    void whenIsValid(String word){
        assertTrue(validationRule.isValid(word));
    }

    @ParameterizedTest(name =  "{0} is not valid")
    @ValueSource(strings = {"1234567891","dsafafewrqrwe","1234567890dsfdsf","1+34567890asd+1fdsf"})
    void whenIsInvalid(String word){
        assertFalse(validationRule.isValid(word));

    }

}
