package com.example.jordyshop.domain;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.NoArgsConstructor;

@Embeddable
@NoArgsConstructor
public class Name {
    public static final int NAME_MAX_LENGTH = 5;

    @Column(name = "name")
    private String value;

    public Name(String value) {
        validate(value);
        this.value = value;
    }

    private void validate(String value) {
        if (value.length() > NAME_MAX_LENGTH) {
            throw new IllegalArgumentException();
        }
    }
}
