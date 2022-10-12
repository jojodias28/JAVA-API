package br.com.ibm.Algacrmapi.controller;

import br.com.ibm.Algacrmapi.model.Cliente;
import br.com.ibm.Algacrmapi.repository.ClenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClenteRepository clenteRepository;

    @GetMapping
    public List<Cliente> listar() {
        return clenteRepository.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Cliente adicionar(@RequestBody Cliente cliente){
        return clenteRepository.save(cliente);
    }


}
