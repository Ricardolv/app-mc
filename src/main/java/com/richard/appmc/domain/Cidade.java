package com.richard.appmc.domain;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@EqualsAndHashCode(of = "id")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Cidade implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    private String nome;

    @ManyToOne
    @JoinColumn(name="estado_id")
    private Estado estado;

}
