package com.reto.carrocompras.service;

import com.reto.carrocompras.entity.Producto;

import java.util.List;

public interface ProductoService {

    Producto create(Producto producto);

    List<Producto> getAll();

    Producto get(String id);

}
