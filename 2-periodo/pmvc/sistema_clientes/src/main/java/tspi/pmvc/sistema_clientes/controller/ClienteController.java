package tspi.pmvc.sistema_clientes.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import tspi.pmvc.sistema_clientes.domain.Cliente;
import tspi.pmvc.sistema_clientes.repository.ClienteRepository;

@Controller
public class ClienteController {

    private ClienteRepository repository;

    public ClienteController(ClienteRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/clientes")
    public String getClientes(Model model) {
        model.addAttribute("clientes",repository.getClientes());
        return "clientesView";
    }
    
    @GetMapping("/add")
    public String exibirFormularioAdd(Model model) {
        model.addAttribute("cliente", new Cliente());
        return "clientesAdd";
    }

    @PostMapping("/add")
    public String add(Model model, @ModelAttribute Cliente cliente) {
        repository.addCliente(cliente);
        return getClientes(model);
    }
}
