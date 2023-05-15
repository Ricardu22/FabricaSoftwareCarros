package br.univille.projetofabricadesoftware23.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.univille.projetofabricadesoftware23.entity.Cliente;

@Repository
public interface ClienteRepository 
    extends JpaRepository<Cliente,Long> {
    
}
