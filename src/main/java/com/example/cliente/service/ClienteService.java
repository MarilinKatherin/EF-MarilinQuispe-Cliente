package com.example.cliente.service;

import java.util.List;

import com.example.cliente.modelo.Cliente;

public interface ClienteService {
	List<Cliente> listar();
	Cliente obtenerId(Integer id);
	void guardar(Cliente cliente);
	void eliminar(Integer id);
	void actualizar(Cliente cliente);
}
