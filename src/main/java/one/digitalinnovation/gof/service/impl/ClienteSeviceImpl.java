package one.digitalinnovation.gof.service.impl;

import one.digitalinnovation.gof.model.Cliente;
import one.digitalinnovation.gof.service.ClienteService1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteSeviceImpl implements ClienteService1 {


    @Override
    public Iterable<Cliente> buscarTodos() {

        return null;
    }
    @Override
    public Cliente buscarPorId(Long id) {
        return null;
    }
    @Override
    public void inserir(Cliente cliente) {

    }
    @Override
    public void atualizar(Long id, Cliente cliente) {

    }
    @Override
    public void deletar(Long id) {

    }
}
