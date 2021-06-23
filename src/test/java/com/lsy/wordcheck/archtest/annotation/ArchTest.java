package com.lsy.wordcheck.archtest.annotation;

import com.lsy.wordcheck.archtest.extension.ArchUnitExtension;
import org.junit.jupiter.api.extension.ExtendWith;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target({ ElementType.TYPE, ElementType.METHOD })
@Retention(RUNTIME)
@ExtendWith(ArchUnitExtension.class)
public @interface ArchTest {
}
