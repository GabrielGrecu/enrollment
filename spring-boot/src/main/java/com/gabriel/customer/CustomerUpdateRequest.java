package com.gabriel.customer;

public record CustomerUpdateRequest(
        String name,
        String email,
        Integer age
) {
}
