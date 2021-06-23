package com.lsy.wordcheck.utils.rule.word;

import com.lsy.wordcheck.utils.rule.character.CharacterValidationRule;
import com.lsy.wordcheck.utils.rule.character.UpperCaseCharacterValidationRule;

public class OneLetterUpperCaseWordValidationRule
        extends QuantityRepeatedCharacterWordValidationRule {

    @Override
    CharacterValidationRule getCharacterValidationRule() {
        return new UpperCaseCharacterValidationRule();
    }

    @Override
    int getQuantity() {
        return 1;
    }
}
