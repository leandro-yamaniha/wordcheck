package com.lsy.wordcheck.unit.utils.character;

import com.lsy.wordcheck.utils.rule.character.LowerCaseCharacterValidationRule;
import com.lsy.wordcheck.utils.rule.character.UpperCaseCharacterValidationRule;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class UpperCaseCharacterValidationRuleTest {

    private UpperCaseCharacterValidationRule validationRule;

    @BeforeEach
    void init(){
        validationRule = new UpperCaseCharacterValidationRule();
    }

    @ParameterizedTest(name =  "{0} is not valid")
    @ValueSource(chars = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','X','W','Y','Z'})
    void whenIsValid(Character character){
        assertTrue(validationRule.isValid(character));
    }

    @ParameterizedTest(name =  "{0} is not valid")
    @ValueSource(chars = {'a','b','0','1','2','3','4','5','6','7','8','9','0','n','.',';','=','t','u','v','x','w','z',' '})
    void whenIsInvalid(Character character){
        assertFalse(validationRule.isValid(character));
    }

}
