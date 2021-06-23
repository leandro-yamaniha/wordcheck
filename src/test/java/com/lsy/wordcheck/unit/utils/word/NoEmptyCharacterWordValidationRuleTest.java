package com.lsy.wordcheck.unit.utils.word;

import com.lsy.wordcheck.utils.rule.word.MinNineCharacterWordValidationRule;
import com.lsy.wordcheck.utils.rule.word.NoEmptyCharacterWordValidationRule;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class NoEmptyCharacterWordValidationRuleTest {

    private NoEmptyCharacterWordValidationRule validationRule;

    @BeforeEach
    void init(){
        validationRule = new NoEmptyCharacterWordValidationRule();
    }

    @ParameterizedTest(name =  "{0} is not valid")
    @ValueSource(strings = {"123456789","ABCDEFGHI","1234567890ABCDEF"})
    void whenIsValid(String word){
        assertTrue(validationRule.isValid(word));
    }

    @ParameterizedTest(name =  "{0} is not valid")
    @ValueSource(strings = {" ","A B","12 3","a bcd","45678 9","aBcdef "," aBcdef"})
    void whenIsInvalid(String word){
        assertFalse(validationRule.isValid(word));

    }

}

