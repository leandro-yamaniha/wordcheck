package com.lsy.wordcheck.utils.rule.character;

public final class SequenceCharacterValidation {

    private SequenceCharacterValidation() {

    }

    public static boolean isValid(final char first, final char last, final char compare) {

        final int ascii = compare;
        return ascii >= (int)first && ascii <= (int)last;

    }
}
