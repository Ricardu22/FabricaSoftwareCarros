package br.univille.projetofabricadesoftware23.service;

import java.util.List;
import br.univille.projetofabricadesoftware23.entity.Carro;

public interface CarroService {
    List<Carro> getAll();

    void save(Carro carro);

    void delete(long id);
}
