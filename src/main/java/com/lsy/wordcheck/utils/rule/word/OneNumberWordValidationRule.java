package com.lsy.wordcheck.utils.rule.word;

import com.lsy.wordcheck.utils.rule.character.CharacterValidationRule;
import com.lsy.wordcheck.utils.rule.character.NumberCharacterValidationRule;

public class OneNumberWordValidationRule
        extends QuantityRepeatedCharacterWordValidationRule {

    @Override
    CharacterValidationRule getCharacterValidationRule() {
        return new NumberCharacterValidationRule();
    }

    @Override
    int getQuantity() {
        return 1;
    }
}
