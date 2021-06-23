package com.lsy.wordcheck.unit.utils.word;

import com.lsy.wordcheck.utils.rule.word.NoRepeatCharacterWordValidationRule;
import com.lsy.wordcheck.utils.rule.word.OneLetterLowerCaseWordValidationRule;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class OneLetterLowerCaseWordValidationRuleTest {

    private OneLetterLowerCaseWordValidationRule validationRule;

    @BeforeEach
    void init(){
        validationRule = new OneLetterLowerCaseWordValidationRule();
    }

    @ParameterizedTest(name =  "{0} is not valid")
    @ValueSource(strings = {"123456789l","gABCDEFGHI","12345x67890ABCDEF"})
    void whenIsValid(String word){
        assertTrue(validationRule.isValid(word));
    }

    @ParameterizedTest(name =  "{0} is not valid")
    @ValueSource(strings = {"1234567891","AABCDEFGHI","1234567890ABC1DEF","1+34567890AB+1DEF"})
    void whenIsInvalid(String word){
        assertFalse(validationRule.isValid(word));

    }

}
