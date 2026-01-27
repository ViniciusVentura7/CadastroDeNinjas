package br.com.learning.CadastroDeNinjas.Missoes;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("missoes")
public class MissoesController {

    @GetMapping("/tela_missoes_controller")
    public String telaMissoesController(){
        return "Tela de controller de missoes.";
    }

    // Create
    @PostMapping("/adicionar")
    public String adicionarMissao(){
        return "Missão adicionada";
    }

    // Read
    @GetMapping("/listar")
    public String mostrarMissoes(){
        return "Mostrar missoes";
    }

    @GetMapping("/listarId")
    public String mostrarMissoesId(){
        return "Mostrar missoes por Id: XX...";
    }


    // Update
    @PutMapping("/alterarId")
    public String alterarMissoesId(){
        return "Missão de Id: XXX, alterada!";
    }

    // Delete
    @DeleteMapping("/deletarId")
    public String deletarMissaoId(){
        return "Missão de ID: XXX, deletada com sucesso!";
    }

}
