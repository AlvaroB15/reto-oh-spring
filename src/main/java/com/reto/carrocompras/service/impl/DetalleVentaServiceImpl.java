package com.reto.carrocompras.service.impl;

import com.reto.carrocompras.entity.DetalleVenta;
import com.reto.carrocompras.exceptions.ResourceNotFoundException;
import com.reto.carrocompras.repository.DetalleVentaRepository;
import com.reto.carrocompras.service.DetalleVentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DetalleVentaServiceImpl implements DetalleVentaService {

    @Autowired
    private DetalleVentaRepository detalleVentaRepository;

    @Override
    public DetalleVenta create(DetalleVenta detalleVenta) {
        return detalleVentaRepository.save(detalleVenta);
    }

    @Override
    public List<DetalleVenta> getAll() {
        return detalleVentaRepository.findAll();
    }

    @Override
    public DetalleVenta get(Integer id) {
        return detalleVentaRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Detalle de Venta no encontrada con el ID: " + id));
    }
}
