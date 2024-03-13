package com.epagamento.epagamento.controller;
import com.epagamento.epagamento.entity.Funcionario;
import com.epagamento.epagamento.service.FuncionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/funcionarios")
public class FuncionarioController {

    private final FuncionarioService funcionarioService;

    @Autowired
    public FuncionarioController(FuncionarioService funcionarioService) {
        this.funcionarioService = funcionarioService;
    }

    // Endpoint para criar um novo funcionário
    @PostMapping
    public ResponseEntity<Funcionario> criarFuncionario(@RequestBody Funcionario funcionario) {
        Funcionario novoFuncionario = funcionarioService.salvarFuncionario(funcionario);
        return new ResponseEntity<>(novoFuncionario, HttpStatus.CREATED);
    }

    // Endpoint para atualizar um funcionário existente
    @PutMapping("/{id}")
    public ResponseEntity<Funcionario> atualizarFuncionario(@PathVariable("id") int id, @RequestBody Funcionario funcionario) {
        funcionario.setId(id);
        Funcionario funcionarioAtualizado = funcionarioService.atualizarFuncionario(funcionario);
        return new ResponseEntity<>(funcionarioAtualizado, HttpStatus.OK);
    }

    // Endpoint para buscar um funcionário pelo ID
    @GetMapping("/{id}")
    public ResponseEntity<Funcionario> buscarFuncionarioPorId(@PathVariable("id") int id) {
        return funcionarioService.buscarFuncionarioPorId(id)
                .map(funcionario -> new ResponseEntity<>(funcionario, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    // Endpoint para buscar todos os funcionários
    @GetMapping
    public ResponseEntity<List<Funcionario>> buscarTodosFuncionarios() {
        List<Funcionario> funcionarios = funcionarioService.listarFuncionarios();
        return new ResponseEntity<>(funcionarios, HttpStatus.OK);
    }

    // Endpoint para excluir um funcionário pelo ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluirFuncionario(@PathVariable("id") int id) {
        funcionarioService.deletarFuncionarioPorId(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}

