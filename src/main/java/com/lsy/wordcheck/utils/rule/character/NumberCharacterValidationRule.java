package com.lsy.wordcheck.utils.rule.character;

public class NumberCharacterValidationRule implements CharacterValidationRule {

    @Override
    public boolean isValid(final char character) {

        return SequenceCharacterValidation.isValid('0', '9', character);

    }

}
