package com.lsy.wordcheck.controller;

import com.lsy.wordcheck.dto.PasswordDto;
import com.lsy.wordcheck.dto.ValidDto;
import com.lsy.wordcheck.service.ValidatePasswordService;
import com.lsy.wordcheck.transformer.ValidTransformer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping(ValidatePasswordController.BASE_ENDPOINT)
public class ValidatePasswordController extends BaseController {

    public static final String BASE_ENDPOINT = "/validate";
    public static final String POST_VALIDATE_PASSWORD = "/password";
    private final ValidatePasswordService service;
    private final ValidTransformer transformer;

    ValidatePasswordController(final ValidatePasswordService service, final ValidTransformer transformer) {
        this.service = service;
        this.transformer = transformer;
    }

    @PostMapping(POST_VALIDATE_PASSWORD)
    public ResponseEntity<ValidDto> validatePassWord(@Valid @RequestBody final PasswordDto request) {

        return buildPostValidateResponse(
                service.isValid(request.getPassword()));

    }

    private ResponseEntity<ValidDto> buildPostValidateResponse(final boolean valid) {

        return buildPostResponse(valid, transformer.toValidDto(valid));

    }

}
