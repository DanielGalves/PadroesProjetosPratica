package one.digitalinovation.gof.service;

import one.digitalinovation.gof.model.Cliente;

public interface ClienteService {
	Iterable<Cliente> buscarTodos();
	
	Cliente buscarPorId(long id);
	
	void inserir(Cliente cliente);
	
	void atualizar(Long id, Cliente cliente);
	
	void deletar(Long id);

}
