package com.lsy.wordcheck.utils.rule.character;

public class SpecialCharacterValidationRule implements CharacterValidationRule {

    @Override
    public boolean isValid(final char character) {

        for (final char specialcharacter : "!@#$%^&*()-+".toCharArray()) {
            if (specialcharacter == character) {
                return true;
            }
        }
        return false;

    }

}
