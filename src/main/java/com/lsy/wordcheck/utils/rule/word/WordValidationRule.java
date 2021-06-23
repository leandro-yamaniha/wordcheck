package com.lsy.wordcheck.utils.rule.word;

import com.lsy.wordcheck.utils.rule.exception.InvalidWordValidationRuleException;

public interface WordValidationRule {

    boolean isValid(final String word);

    default void validate(final String word) throws InvalidWordValidationRuleException {

        if (!isValid(word)) {
            throw new InvalidWordValidationRuleException();
        }
    }

}
