package com.lsy.wordcheck.utils.rule.word;

import com.lsy.wordcheck.utils.rule.character.CharacterValidationRule;
import com.lsy.wordcheck.utils.rule.character.LowerCaseCharacterValidationRule;

public class OneLetterLowerCaseWordValidationRule
        extends QuantityRepeatedCharacterWordValidationRule {

    @Override
    CharacterValidationRule getCharacterValidationRule() {
        return new LowerCaseCharacterValidationRule();
    }

    @Override
    int getQuantity() {
        return 1;
    }
}
