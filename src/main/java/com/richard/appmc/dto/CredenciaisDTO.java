package com.richard.appmc.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
@Data
public class CredenciaisDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private String email;
    private String senha;
}
