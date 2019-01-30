package com.onlinebank.core.data.model;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class ElectricityResource {

    private String id;

    private Long debt;

    private String date;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Long getDebt() {
        return debt;
    }

    public void setDebt(Long debt) {
        this.debt = debt;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString(){
        final StringBuffer buffer = new StringBuffer("ElectricityResource{");
        buffer.append("id=").append(id);
        buffer.append(", debt='").append(debt).append('\'');
        buffer.append(", date='").append(date).append('\'');
        buffer.append('}');
        return buffer.toString();
    }
}