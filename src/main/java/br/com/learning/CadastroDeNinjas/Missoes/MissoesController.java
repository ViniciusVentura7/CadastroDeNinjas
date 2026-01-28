package br.com.learning.CadastroDeNinjas.Missoes;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("missoes")
public class MissoesController {

    private MissoesService missoesService;

    public MissoesController(MissoesService missoesService) {
        this.missoesService = missoesService;
    }

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
    public List<MissoesModel> listarMissoes(){
        return missoesService.listarMissoes();
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
