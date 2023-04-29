package com.reto.carrocompras.controller;

import com.reto.carrocompras.entity.Producto;
import com.reto.carrocompras.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/productos")
public class ProductoController {

    @Autowired
    private ProductoService productoService;

    @PostMapping
    public ResponseEntity<Producto> guardarProducto(@RequestBody Producto producto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(productoService.create(producto));
    }

    @GetMapping
    public ResponseEntity<List<Producto>> listarProductos() {
        return ResponseEntity.status(HttpStatus.CREATED).body(productoService.getAll());
    }

    @GetMapping("/{productId}")
    public ResponseEntity<Producto> obtenerProducto(@PathVariable Integer productId) {
        return ResponseEntity.status(HttpStatus.CREATED).body(productoService.get(productId));
    }

}
