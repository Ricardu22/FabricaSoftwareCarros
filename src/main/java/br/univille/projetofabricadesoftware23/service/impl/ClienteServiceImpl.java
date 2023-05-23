package br.univille.projetofabricadesoftware23.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.univille.projetofabricadesoftware23.entity.Cliente;
import br.univille.projetofabricadesoftware23.repository.ClienteRepository;
import br.univille.projetofabricadesoftware23.service.ClienteService;

@Service
public class ClienteServiceImpl 
    implements ClienteService{
        
    @Autowired
    private ClienteRepository repository;

    @Override
    public List<Cliente> getAll() {
        return repository.findAll();
    }

    @Override
    public void save(Cliente cliente) {
        repository.save(cliente);
    }

    @Override
    public void delete(long id) {
        repository.deleteById(id);
    
    }

}
