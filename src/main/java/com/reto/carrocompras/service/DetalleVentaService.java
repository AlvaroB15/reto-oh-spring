package com.reto.carrocompras.service;

import com.reto.carrocompras.entity.DetalleVenta;

import java.util.List;

public interface DetalleVentaService {

    DetalleVenta create(DetalleVenta detalleVenta);

    List<DetalleVenta> getAll();

    DetalleVenta get(Integer id);

}
