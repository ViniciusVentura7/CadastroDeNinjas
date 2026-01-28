package br.com.learning.CadastroDeNinjas.Ninjas;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NinjaService {

    private NinjaRepository ninjaRepository;

    public NinjaService(NinjaRepository ninjaRepository) {
        this.ninjaRepository = ninjaRepository;
    }

    // Adicionar ninja


    // Listar ninja
    public List<NinjaModel> listarNinjas(){
        return ninjaRepository.findAll();
    }

    // Atualizar ninja

    // Deletar ninja

}
