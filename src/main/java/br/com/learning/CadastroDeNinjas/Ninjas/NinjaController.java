package br.com.learning.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class NinjaController {

    @GetMapping("/boasvindas")
    public String boasVindas(){
        return "Essa é minha primeira mensagem nessa rota.";
    }

    // Adicionar Ninja (CREATE)
    @PostMapping("/adicionar")
    public String adicionarNinja(){
        return "Ninja adicionado";
    }

    // Mostrar todos os ninjas (READ)
    @GetMapping("/todos")
    public String mostrarNinjas(){
        return "Mostrar ninjas";
    }

    // Mostrar ninja por id (READ)
    @GetMapping("/todosID")
    public String mostrarNinjasId(){
        return "Mostrar ninjas por ID";
    }

    // ALterar dados de ninjas (UPDATE)
    @PutMapping("/alterarId")
    public String alterarNinjaId(){
        return "Alterar ninja de ID...";
    }

    // Deletar Ninja (DELETE)
    @DeleteMapping("/deletarNinjaId")
    public String deletarNinjaId(){
        return "Ninja ID XX deletado!";
    }

}
