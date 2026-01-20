package br.com.learning.CadastroDeNinjas.Ninjas;

import br.com.learning.CadastroDeNinjas.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "tb_cadastro")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private int idade;

    //@ManyToOne Um ninja só pode ter uma missão
    @ManyToOne
    @JoinColumn(name = "missoes_id") //Foreign key (Chave estrangeira)
    private MissoesModel missoes;

}
