package com.reto.carrocompras.service;

import com.reto.carrocompras.entity.Cliente;

import java.util.List;

public interface ClienteService {

    Cliente create(Cliente cliente);

    List<Cliente> getAll();

    Cliente get(Integer id);

}
