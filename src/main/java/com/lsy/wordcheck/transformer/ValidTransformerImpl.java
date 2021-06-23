package com.lsy.wordcheck.transformer;

import com.lsy.wordcheck.dto.ValidDto;
import org.springframework.stereotype.Component;

@Component
public class ValidTransformerImpl implements ValidTransformer {

    @Override
    public ValidDto toValidDto(final boolean valid) {

        return new ValidDto(valid);

    }

}
