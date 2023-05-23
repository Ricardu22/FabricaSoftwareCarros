package br.univille.projetofabricadesoftware23.service;

import java.util.List;
import br.univille.projetofabricadesoftware23.entity.Cliente;

public interface ClienteService {
    List<Cliente> getAll();

    void save(Cliente cliente);

    void delete(long id);
}
