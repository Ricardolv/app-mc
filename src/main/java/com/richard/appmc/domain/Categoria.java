package com.richard.appmc.domain;

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
public class Categoria implements Serializable {
    private static final long serialVersionUID = 1L;

    @NonNull
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;

    @NonNull
    private String nome;

    @ManyToMany(mappedBy="categorias")
    private List<Produto> produtos = new ArrayList<>();
}
