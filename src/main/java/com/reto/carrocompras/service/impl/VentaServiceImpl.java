package com.reto.carrocompras.service.impl;

import com.reto.carrocompras.entity.Venta;
import com.reto.carrocompras.exceptions.ResourceNotFoundException;
import com.reto.carrocompras.repository.VentaRepository;
import com.reto.carrocompras.service.VentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VentaServiceImpl implements VentaService {

    @Autowired
    private VentaRepository ventaRepository;

    @Override
    public Venta create(Venta venta) {
        return ventaRepository.save(venta);
    }

    @Override
    public List<Venta> getAll() {
        return ventaRepository.findAll();
    }

    @Override
    public Venta get(Integer id) {
        return ventaRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Venta no encontrada con el ID: " + id));
    }
}
