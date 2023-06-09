package br.univille.projetofabricadesoftware23.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.univille.projetofabricadesoftware23.entity.Cliente;
import br.univille.projetofabricadesoftware23.service.ClienteService;

@Controller
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping
    public ModelAndView index() {
        // List<Cliente> listaClientes = clienteService.getAll();
        var listaClientes = clienteService.getAll();
        return new ModelAndView("cliente/index",
                "listaClientes", listaClientes);
    }

    @GetMapping("/novo")
    public ModelAndView novo() {
        var cliente = new Cliente();
        return new ModelAndView("cliente/form", "cliente", cliente);
    }

    @PostMapping(params = "form")
    public ModelAndView save(Cliente cliente) {

        clienteService.save(cliente);
        return new ModelAndView("redirect:/cliente");

    }

    @GetMapping("/alterar/{id}")
    public ModelAndView alterar(@PathVariable("id") Cliente cliente) {

        return new ModelAndView("Cliente/form",
                "cliente", cliente);

    }

    @GetMapping ("/remover/{id}")
    public ModelAndView remover(@PathVariable("id") long id){

        clienteService.delete(id);
        return new ModelAndView("redirect:/cliente");
    }

}
