package com.epagamento.epagamento.repo;

import com.epagamento.epagamento.entity.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Integer> {
}
