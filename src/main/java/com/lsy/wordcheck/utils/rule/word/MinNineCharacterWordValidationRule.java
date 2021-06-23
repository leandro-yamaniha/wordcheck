package com.lsy.wordcheck.utils.rule.word;

public class MinNineCharacterWordValidationRule implements WordValidationRule {

    @Override
    public boolean isValid(final String word) {

        return word.length() >= 9;

    }

}
