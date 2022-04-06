package br.com.conexao.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "ESTADO")
public class Estado {

    @Column(name = "ID_ESTADO")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer id;

    @Column(name = "NOME")
    private String nome;

}
