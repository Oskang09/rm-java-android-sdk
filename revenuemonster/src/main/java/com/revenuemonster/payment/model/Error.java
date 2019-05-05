package com.revenuemonster.payment.model;

import org.json.JSONObject;

/**
 * Created by yussuf on 4/30/19.
 */

public class Error {
    private String code;
    private String message;

    public Error(JSONObject error) {

    }

    // Getter Methods

    public String getCode() {
        return code;
    }
    public String getMessage() {
        return message;
    }

    // Setter methods

    public void setCode(String code) {
        this.code = code;
    }
    public void setMessage(String message) {
        this.message = message;
    }
}
