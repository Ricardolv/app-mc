package com.richard.appmc.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@EqualsAndHashCode(of = "id")
@RequiredArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Estado implements Serializable {
    private static final long serialVersionUID = 1L;

    @NonNull
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NonNull
    private String nome;

    @JsonIgnore
    @OneToMany(mappedBy = "estado")
    private List<Cidade> cidades = new ArrayList<>();
}
