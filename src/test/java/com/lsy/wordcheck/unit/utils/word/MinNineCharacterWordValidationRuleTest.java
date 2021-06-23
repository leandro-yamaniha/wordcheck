package com.lsy.wordcheck.unit.utils.word;

import com.lsy.wordcheck.utils.rule.word.MinNineCharacterWordValidationRule;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class MinNineCharacterWordValidationRuleTest {

    private MinNineCharacterWordValidationRule validationRule;

    @BeforeEach
    void init(){
        validationRule = new MinNineCharacterWordValidationRule();
    }

    @ParameterizedTest(name =  "{0} is not valid")
    @ValueSource(strings = {"123456789","ABCDEFGHI","1234567890ABCDEF"})
    void whenIsValid(String word){
        assertTrue(validationRule.isValid(word));
    }

    @ParameterizedTest(name =  "{0} is not valid")
    @ValueSource(strings = {"","1","AB","123","abcd","456789","aBcdef"," aBcdef"})
    void whenIsInvalid(String word){
        assertFalse(validationRule.isValid(word));

    }

}

