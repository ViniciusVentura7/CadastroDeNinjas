package br.com.learning.CadastroDeNinjas.Missoes;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MissoesService {

    private MissoesRepository missoesRepository;

    public MissoesService(MissoesRepository missoesRepository) {
        this.missoesRepository = missoesRepository;
    }

    // Adicionar missão


    // Listar missões
    public List<MissoesModel> listarMissoes(){
        return missoesRepository.findAll();
    }

    // Atualizar missão


    // Deletar missão
}
