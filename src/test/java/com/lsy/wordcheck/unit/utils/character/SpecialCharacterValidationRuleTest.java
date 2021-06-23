package com.lsy.wordcheck.unit.utils.character;

import com.lsy.wordcheck.utils.rule.character.NumberCharacterValidationRule;
import com.lsy.wordcheck.utils.rule.character.SpecialCharacterValidationRule;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SpecialCharacterValidationRuleTest {

    private SpecialCharacterValidationRule validationRule;

    @BeforeEach
    void init(){
        validationRule = new SpecialCharacterValidationRule();
    }

    @ParameterizedTest(name =  "{0} is not valid")
    @ValueSource(chars = {'!','@','#','$','%','^','&','*','(',')','-','+'})
    void whenIsValid(Character character){
        assertTrue(validationRule.isValid(character));
    }

    @ParameterizedTest(name =  "{0} is not valid")
    @ValueSource(chars = {'a','b','0','C','D','E','f','g','h','I','J','K','L','n','0','2','3','t','u','v','x','w','z',' '})
    void whenIsInvalid(Character character){
        assertFalse(validationRule.isValid(character));
    }

}

