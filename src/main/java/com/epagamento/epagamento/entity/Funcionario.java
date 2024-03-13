package com.epagamento.epagamento.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "funcionario")
public class Funcionario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "sexo")
    @Enumerated(EnumType.STRING)
    private Sexo sexo;

    @Column(name = "salarioMaternidade")
    private boolean salarioMaternidade;

    @Column(name = "cpf")
    private String cpf;

    @Column(name = "cargo")
    private String cargo;

    @Column(name = "salario")
    private double salario;

    @Column(name = "comissionado")
    private boolean comissionado;

    @Enumerated(EnumType.STRING)
    @Column(name = "tipoContrato")
    private TipoContratoEnum tipoContrato;

    @Column(name = "salarioFamilia")
    private boolean salarioFamilia;

    @Column(name = "numeroQuotas")
    private int numeroQuotas;

    @Column(name = "valeTransporte")
    private boolean valeTransporte;

    @Column(name = "contribuicaoSindical")
    private boolean contribuicaoSindical;

    @Enumerated(EnumType.STRING)
    @Column(name = "jornadaTrabalho")
    private JornadaTrabalhoEnum jornadaTrabalho;

    @Enumerated(EnumType.STRING)
    @Column(name = "insalubridade")
    private InsalubridadeEnum insalubridade;

    @Column(name = "adicionalPericulosidade")
    private boolean adicionalPericulosidade;

    @Column(name = "auxilioCreche")
    private boolean auxilioCreche;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isSalarioMaternidade() {
        return salarioMaternidade;
    }

    public void setSalarioMaternidade(boolean salarioMaternidade) {
        this.salarioMaternidade = salarioMaternidade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public boolean isComissionado() {
        return comissionado;
    }

    public void setComissionado(boolean comissionado) {
        this.comissionado = comissionado;
    }

    public TipoContratoEnum getTipoContrato() {
        return tipoContrato;
    }

    public void setTipoContrato(TipoContratoEnum tipoContrato) {
        this.tipoContrato = tipoContrato;
    }

    public boolean isSalarioFamilia() {
        return salarioFamilia;
    }

    public void setSalarioFamilia(boolean salarioFamilia) {
        this.salarioFamilia = salarioFamilia;
    }

    public int getNumeroQuotas() {
        return numeroQuotas;
    }

    public void setNumeroQuotas(int numeroQuotas) {
        this.numeroQuotas = numeroQuotas;
    }

    public boolean isValeTransporte() {
        return valeTransporte;
    }

    public void setValeTransporte(boolean valeTransporte) {
        this.valeTransporte = valeTransporte;
    }

    public boolean isContribuicaoSindical() {
        return contribuicaoSindical;
    }

    public void setContribuicaoSindical(boolean contribuicaoSindical) {
        this.contribuicaoSindical = contribuicaoSindical;
    }

    public JornadaTrabalhoEnum getJornadaTrabalho() {
        return jornadaTrabalho;
    }

    public void setJornadaTrabalho(JornadaTrabalhoEnum jornadaTrabalho) {
        this.jornadaTrabalho = jornadaTrabalho;
    }

    public InsalubridadeEnum getInsalubridade() {
        return insalubridade;
    }

    public void setInsalubridade(InsalubridadeEnum insalubridade) {
        this.insalubridade = insalubridade;
    }

    public boolean isAdicionalPericulosidade() {
        return adicionalPericulosidade;
    }

    public void setAdicionalPericulosidade(boolean adicionalPericulosidade) {
        this.adicionalPericulosidade = adicionalPericulosidade;
    }

    public boolean isAuxilioCreche() {
        return auxilioCreche;
    }

    public void setAuxilioCreche(boolean auxilioCreche) {
        this.auxilioCreche = auxilioCreche;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }
    public enum Sexo {
        M,
        F
    }
    public enum TipoContratoEnum {
        // Defina os tipos de contrato aqui, por exemplo:
        CLT,
        PJ,
        ESTAGIO
    }
    public enum JornadaTrabalhoEnum {
        // Defina as jornadas de trabalho aqui, por exemplo:
        TEMPO_INTEGRAL,
        MEIO_PERIODO
    }
    public enum InsalubridadeEnum {
        // Defina os níveis de insalubridade aqui, por exemplo:
        MINIMO,
        MEDIO,
        MAXIMO
    }
}

