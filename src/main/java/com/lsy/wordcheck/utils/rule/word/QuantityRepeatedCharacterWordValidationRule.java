package com.lsy.wordcheck.utils.rule.word;

import com.lsy.wordcheck.utils.rule.character.CharacterValidationRule;

public abstract class QuantityRepeatedCharacterWordValidationRule implements WordValidationRule {

    abstract CharacterValidationRule getCharacterValidationRule();
    abstract int getQuantity();

    public boolean isValid(final String word) {

        var quantityFound = 0;
        for (final char character : word.toCharArray()) {
            if (getCharacterValidationRule().isValid(character)) {
                quantityFound++;
            }
            if (quantityFound == getQuantity()) {
                return true;
            }
        }
        return false;

    }

}
