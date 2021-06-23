package com.lsy.wordcheck.unit.utils.character;

import com.lsy.wordcheck.utils.rule.character.NumberCharacterValidationRule;
import com.lsy.wordcheck.utils.rule.character.UpperCaseCharacterValidationRule;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class NumberCharacterValidationRuleTest {

    private NumberCharacterValidationRule validationRule;

    @BeforeEach
    void init(){
        validationRule = new NumberCharacterValidationRule();
    }

    @ParameterizedTest(name =  "{0} is not valid")
    @ValueSource(chars = {'0','1','2','3','4','5','6','7','8','9','0'})
    void whenIsValid(Character character){
        assertTrue(validationRule.isValid(character));
    }

    @ParameterizedTest(name =  "{0} is not valid")
    @ValueSource(chars = {'a','b','O','C','D','E','f','g','h','I','J','K','L','n','.',';','=','t','u','v','x','w','z',' '})
    void whenIsInvalid(Character character){
        assertFalse(validationRule.isValid(character));
    }

}

