package br.univille.projetofabricadesoftware23.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.univille.projetofabricadesoftware23.entity.Carro;
import br.univille.projetofabricadesoftware23.repository.CarroRepository;
import br.univille.projetofabricadesoftware23.service.CarroService;

@Service
public class CarroServiceImpl
        implements CarroService {

    @Autowired
    private CarroRepository repository;

    @Override
    public List<Carro> getAll() {
        return repository.findAll();
    }

    @Override
    public void save(Carro carro) {
        repository.save(carro);
    }

    @Override
    public void delete(long id) {
        repository.deleteById(id);

    }

}
