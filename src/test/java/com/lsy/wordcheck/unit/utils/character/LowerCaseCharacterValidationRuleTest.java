package com.lsy.wordcheck.unit.utils.character;

import com.lsy.wordcheck.utils.rule.character.LowerCaseCharacterValidationRule;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class LowerCaseCharacterValidationRuleTest {

    private LowerCaseCharacterValidationRule validationRule;

    @BeforeEach
    void init(){
        validationRule = new LowerCaseCharacterValidationRule();
    }

    @ParameterizedTest(name =  "{0} is not valid")
    @ValueSource(chars = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','x','w','y','z'})
    void whenIsValid(Character character){
        assertTrue(validationRule.isValid(character));
    }

    @ParameterizedTest(name =  "{0} is not valid")
    @ValueSource(chars = {'A','B','0','1','2','3','4','5','6','7','8','9','0','N','.',';','=','R','S','T','X','W','Y',' '})
    void whenIsInvalid(Character character){
        assertFalse(validationRule.isValid(character));
    }
}
