package com.lsy.wordcheck.utils.rule.word;

public class NoRepeatCharacterWordValidationRule implements WordValidationRule {
    @Override
    public boolean isValid(final String word) {

        final var chars = word.toCharArray();
        for (var indexChar1 = 0; indexChar1 < chars.length; indexChar1++) {
            for (var indexChar2 = 0; indexChar2 < chars.length; indexChar2++) {
                if (indexChar1 != indexChar2 && chars[indexChar1] == chars[indexChar2]) {
                    return false;
                }
            }
        }
        return true;

    }

}
