package br.com.learning.CadastroDeNinjas.Missoes;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class MissoesController {

    @GetMapping("/tela_missoes_controller")
    public String telaMissoesController(){
        return "Tela de controller de missoes.";
    }
}
