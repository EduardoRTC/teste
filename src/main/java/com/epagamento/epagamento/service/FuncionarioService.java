package com.epagamento.epagamento.service;

import com.epagamento.epagamento.entity.Funcionario;
import com.epagamento.epagamento.repo.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FuncionarioService {

    private final FuncionarioRepository funcionarioRepository;

    @Autowired
    public FuncionarioService(FuncionarioRepository funcionarioRepository) {
        this.funcionarioRepository = funcionarioRepository;
    }

    // Salva um funcionário no banco de dados
    public Funcionario salvarFuncionario(Funcionario funcionario) {
        return funcionarioRepository.save(funcionario);
    }

    // Busca um funcionário pelo ID
    public Optional<Funcionario> buscarFuncionarioPorId(Integer id) {
        return funcionarioRepository.findById(id);
    }

    // Lista todos os funcionários cadastrados
    public List<Funcionario> listarFuncionarios() {
        return funcionarioRepository.findAll();
    }

    // Deleta um funcionário pelo ID
    public void deletarFuncionarioPorId(Integer id) {
        funcionarioRepository.deleteById(id);
    }

    // Verifica se um funcionário existe pelo ID
    public boolean existeFuncionario(Integer id) {
        return funcionarioRepository.existsById(id);
    }

    public Funcionario atualizarFuncionario(Funcionario funcionario) {
        return funcionarioRepository.save(funcionario);
    }
}
