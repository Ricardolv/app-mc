package com.richard.appmc.domain;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@EqualsAndHashCode(of = "id")
@RequiredArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Cidade implements Serializable {
    private static final long serialVersionUID = 1L;

    @NonNull
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;

    @NonNull
    private String nome;

    @NonNull
    @ManyToOne
    @JoinColumn(name="estado_id")
    private Estado estado;
}
