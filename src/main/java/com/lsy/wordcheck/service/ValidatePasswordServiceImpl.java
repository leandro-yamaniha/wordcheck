package com.lsy.wordcheck.service;

import com.lsy.wordcheck.utils.rule.exception.InvalidWordValidationRuleException;
import com.lsy.wordcheck.utils.rule.word.*;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Service
public class ValidatePasswordServiceImpl implements ValidatePasswordService {

    final List<WordValidationRule> validationRules = new ArrayList<>();

    @PostConstruct
    public void initRules() {
        validationRules.add(new MinNineCharacterWordValidationRule());
        validationRules.add(new OneNumberWordValidationRule());
        validationRules.add(new OneLetterLowerCaseWordValidationRule());
        validationRules.add(new OneLetterUpperCaseWordValidationRule());
        validationRules.add(new OneSpecialCharacterWordValidationRule());
        validationRules.add(new NoRepeatCharacterWordValidationRule());
        validationRules.add(new NoEmptyCharacterWordValidationRule());
    }

    @Override
    public boolean isValid(final String word) {

        try {
            for (final WordValidationRule validationRule: validationRules) {
                validationRule.validate(word);
            }
            return true;
        } catch (final InvalidWordValidationRuleException e) {
            return false;
        }

    }

}
