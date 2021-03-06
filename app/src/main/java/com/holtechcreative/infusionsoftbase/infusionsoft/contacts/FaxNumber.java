
package com.holtechcreative.infusionsoftbase.infusionsoft.contacts;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FaxNumber {

    @SerializedName("field")
    @Expose
    private String field;
    @SerializedName("number")
    @Expose
    private String number;
    @SerializedName("type")
    @Expose
    private String type;

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
