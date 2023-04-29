package com.reto.carrocompras.service;

import com.reto.carrocompras.entity.Venta;

import java.util.List;

public interface VentaService {

    Venta create(Venta venta);

    List<Venta> getAll();

    Venta get(Integer id);

}
