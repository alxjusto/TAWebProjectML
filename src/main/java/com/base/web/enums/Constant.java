package com.base.web.enums;

public enum Constant {

    PERU_RAIL_URL("https://www.mercadolibre.com.pe"),
    DRIVER_WAIT_TIMEOUT("driver.wait.timeout");

    private String value;

    Constant(String value) {
        this.value = value;
    }

    public String get() {
        return value;
    }
}
