package com.richard.appmc.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.richard.appmc.domain.enums.Perfil;
import com.richard.appmc.domain.enums.TipoCliente;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@EqualsAndHashCode(of = "id")
@Entity
public class Cliente implements Serializable {
    private static final long serialVersionUID = 1L;

    @Getter @Setter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Getter @Setter
    private String nome;

    @Getter @Setter
    @Column(unique=true)
    private String email;

    @Getter @Setter
    private String cpfOuCnpj;

    private Integer tipo;

    @Getter @Setter
    @JsonIgnore
    private String senha;

    @Getter @Setter
    @OneToMany(mappedBy="cliente", cascade=CascadeType.ALL)
    private List<Endereco> enderecos = new ArrayList<>();

    @Getter @Setter
    @ElementCollection
    @CollectionTable(name="TELEFONE")
    private Set<String> telefones = new HashSet<>();

    @ElementCollection(fetch=FetchType.EAGER)
    @CollectionTable(name="PERFIS")
    private Set<Integer> perfis = new HashSet<>();

    @Getter @Setter
    @JsonIgnore
    @OneToMany(mappedBy="cliente")
    private List<Pedido> pedidos = new ArrayList<>();

    public Cliente() {
        addPerfil(Perfil.CLIENTE);
    }

    public Cliente(Integer id, String nome, String email, String cpfOuCnpj, TipoCliente tipo, String senha) {
        super();
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.cpfOuCnpj = cpfOuCnpj;
        this.tipo = (null == tipo) ? null : tipo.getCod();
        this.senha = senha;
        addPerfil(Perfil.CLIENTE);
    }

    public TipoCliente getTipo() {
        return TipoCliente.toEnum(tipo);
    }

    public void setTipo(TipoCliente tipo) {
        this.tipo = tipo.getCod();
    }

    public Set<Perfil> getPerfis() {
        return perfis.stream().map(x -> Perfil.toEnum(x)).collect(Collectors.toSet());
    }

    public void addPerfil(Perfil perfil) {
        perfis.add(perfil.getCod());
    }
}
