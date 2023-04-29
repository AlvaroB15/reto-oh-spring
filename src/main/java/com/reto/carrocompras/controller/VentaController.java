package com.reto.carrocompras.controller;

import com.reto.carrocompras.entity.Venta;
import com.reto.carrocompras.service.VentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/ventas")
public class VentaController {

    @Autowired
    private VentaService ventaService;

    @PostMapping
    public ResponseEntity<Venta> guardarVenta(@RequestBody Venta venta) {
        return ResponseEntity.status(HttpStatus.CREATED).body(ventaService.create(venta));
    }

    @GetMapping
    public ResponseEntity<List<Venta>> listarVentas() {
        return ResponseEntity.status(HttpStatus.CREATED).body(ventaService.getAll());
    }

    @GetMapping("/{ventaId}")
    public ResponseEntity<Venta> obtenerVenta(@PathVariable Integer ventaId) {
        return ResponseEntity.status(HttpStatus.CREATED).body(ventaService.get(ventaId));
    }

}
