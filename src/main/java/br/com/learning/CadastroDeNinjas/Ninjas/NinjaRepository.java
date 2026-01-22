package br.com.learning.CadastroDeNinjas.Ninjas;

import org.springframework.data.jpa.repository.JpaRepository;

public interface NinjaRepository extends JpaRepository<NinjaModel, Long> {
}
