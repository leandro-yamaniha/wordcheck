package com.lsy.wordcheck.utils.rule.character;

public class UpperCaseCharacterValidationRule implements CharacterValidationRule {

    @Override
    public boolean isValid(final char character) {

        return SequenceCharacterValidation.isValid('A', 'Z', character);

    }

}
