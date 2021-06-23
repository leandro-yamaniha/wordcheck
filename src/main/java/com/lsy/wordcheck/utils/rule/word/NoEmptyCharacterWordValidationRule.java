package com.lsy.wordcheck.utils.rule.word;

public class NoEmptyCharacterWordValidationRule implements WordValidationRule {
    @Override
    public boolean isValid(final String word) {

        final var chars = word.toCharArray();
        for (final char character : chars) {
            if (character == (char)32) {
                return false;
            }
        }
        return true;

    }
}
