package br.univille.projetofabricadesoftware23.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.univille.projetofabricadesoftware23.entity.Carro;
import br.univille.projetofabricadesoftware23.service.CarroService;

@Controller
@RequestMapping("/carro")
public class CarroController {

    @Autowired
    private CarroService carroService;

    @GetMapping
    public ModelAndView index() {
        // List<Carro> listaCarros = carroService.getAll();
        var listaCarros = carroService.getAll();
        return new ModelAndView("carro/index",
                "listaCarros", listaCarros);
    }

    @GetMapping("/novo")
    public ModelAndView novo() {
        var carro = new Carro();
        return new ModelAndView("carro/form", "carro", carro);
    }

    @PostMapping(params = "form")
    public ModelAndView save(Carro carro) {

        carroService.save(carro);
        return new ModelAndView("redirect:/carro");

    }

    @GetMapping("/alterar/{id}")
    public ModelAndView alterar(@PathVariable("id") Carro carro) {

        return new ModelAndView("Carro/form",
                "carro", carro);

    }

    @GetMapping("/remover/{id}")
    public ModelAndView remover(@PathVariable("id") long id) {

        carroService.delete(id);
        return new ModelAndView("redirect:/carro");
    }

}
