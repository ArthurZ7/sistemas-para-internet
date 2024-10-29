package tspi.pmvc.sistema_clientes.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import tspi.pmvc.sistema_clientes.domain.Cliente;

@Component
public class ClienteRepository {

    private List<Cliente> clientes;

    public ClienteRepository() {
        clientes = new ArrayList<>();
        clientes.add(new Cliente(1,"Carlos","rua das couves"));
        clientes.add(new Cliente(1,"Marco","rua da silva"));
    }

    public List<Cliente> getClientes() {
        return clientes;
    }
    
    public void addCliente(Cliente cliente) {
        this.clientes.add(cliente);
    }
}
