package com.lsy.wordcheck.utils.rule.word;

import com.lsy.wordcheck.utils.rule.character.CharacterValidationRule;
import com.lsy.wordcheck.utils.rule.character.SpecialCharacterValidationRule;

public class OneSpecialCharacterWordValidationRule
        extends QuantityRepeatedCharacterWordValidationRule {

    @Override
    CharacterValidationRule getCharacterValidationRule() {
        return new SpecialCharacterValidationRule();
    }

    @Override
    int getQuantity() {
        return 1;
    }
}
