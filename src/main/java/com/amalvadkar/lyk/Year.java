package com.amalvadkar.lyk;

import static java.lang.String.valueOf;

public record Year(int value) {
    public static Year of(int value) {
        return new Year(value);
    }

    public boolean isLeap() {
        if (isCentury()) return value % 400 == 0;
        return value % 4 == 0;
    }

    private boolean isCentury() {
        return valueOf(value).endsWith("00");
    }
}
