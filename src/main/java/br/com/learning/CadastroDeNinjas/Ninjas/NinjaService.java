package br.com.learning.CadastroDeNinjas.Ninjas;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NinjaService {

    private NinjaRepository ninjaRepository;

    public NinjaService(NinjaRepository ninjaRepository) {
        this.ninjaRepository = ninjaRepository;
    }

    // Adicionar ninja
    public NinjaModel adicionarNinja(NinjaModel ninja){
        return ninjaRepository.save(ninja);
    }


    // Listar ninja
    public List<NinjaModel> listarNinjas(){
        return ninjaRepository.findAll();
    }

    // Listar por ID
    public NinjaModel listarNinjaId(Long id){
        Optional<NinjaModel> ninjaPorId = ninjaRepository.findById(id);
        return ninjaPorId.orElse(null);
    }

    // Atualizar ninja
    public NinjaModel atualizarNinja(Long id, NinjaModel ninjaAtualizado){
        return ninjaRepository.save(ninjaAtualizado);
    }

    // Deletar ninja
    public void deletarNinja(Long id){
         ninjaRepository.deleteById(id);
    }

}
