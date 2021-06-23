package com.lsy.wordcheck.transformer;

import com.lsy.wordcheck.dto.ValidDto;

public interface ValidTransformer {

    ValidDto toValidDto(boolean valid);

}
