package com.reto.carrocompras.service.impl;

import com.reto.carrocompras.entity.Producto;
import com.reto.carrocompras.exceptions.ResourceNotFoundException;
import com.reto.carrocompras.repository.ProductoRepository;
import com.reto.carrocompras.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoServiceImpl implements ProductoService {

    @Autowired
    private ProductoRepository productoRepository;

    @Override
    public Producto create(Producto producto) {
        return productoRepository.save(producto);
    }

    @Override
    public List<Producto> getAll() {
        return productoRepository.findAll();
    }

    @Override
    public Producto get(Integer id) {
        return productoRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Producto no encontrado con el ID: " + id));
    }
}
