package com.reto.carrocompras.controller;

import com.reto.carrocompras.entity.DetalleVenta;
import com.reto.carrocompras.service.DetalleVentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/detalle-ventas")
public class DetalleVentasController {

    @Autowired
    private DetalleVentaService detalleVentaService;

    @PostMapping
    public ResponseEntity<DetalleVenta> guardarVenta(@RequestBody DetalleVenta detalleVenta) {
        return ResponseEntity.status(HttpStatus.CREATED).body(detalleVentaService.create(detalleVenta));
    }

    @GetMapping
    public ResponseEntity<List<DetalleVenta>> listarVentas() {
        return ResponseEntity.status(HttpStatus.CREATED).body(detalleVentaService.getAll());
    }

    @GetMapping("/{ventaId}")
    public ResponseEntity<DetalleVenta> obtenerVenta(@PathVariable Integer ventaId) {
        return ResponseEntity.status(HttpStatus.CREATED).body(detalleVentaService.get(ventaId));
    }

}
