package com.reto.carrocompras.service.impl;

import com.reto.carrocompras.entity.Cliente;
import com.reto.carrocompras.exceptions.ResourceNotFoundException;
import com.reto.carrocompras.repository.ClienteRepository;
import com.reto.carrocompras.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public Cliente create(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    @Override
    public List<Cliente> getAll() {
        return clienteRepository.findAll();
    }

    @Override
    public Cliente get(Integer id) {
        return clienteRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Cliente no encontrado con el ID: " + id));
    }
}
