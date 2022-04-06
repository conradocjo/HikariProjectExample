package br.com.conexao.controller;

import br.com.conexao.config.DataSourceConfig;
import br.com.conexao.model.Estado;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.conexao.service.EstadoService;

import java.sql.SQLException;
import java.util.List;


@RestController
@RequestMapping("/estado")
public class EstadoController {

    private EstadoService service;

    EstadoController(EstadoService service) {
        this.service = service;
    }

    @GetMapping(value = "/todos", produces = {"application/json"})
    public ResponseEntity<List<Estado>> getEstados() {
        System.out.println("It's over!");
        return ResponseEntity.ok(service.getEstados());
    }

    @GetMapping(value = "/teste", produces = {"application/json"})
    public ResponseEntity<String> teste() throws SQLException {
        new DataSourceConfig().teste();
        return ResponseEntity.ok("Ok!");
    }

}
