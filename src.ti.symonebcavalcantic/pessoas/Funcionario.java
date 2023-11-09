package pessoas;

import composicoes.*;
import java.time.LocalDate;
import java.util.List;


public class Funcionario extends Pessoa {
    private int matricula;
    private Cargo cargo;
    private Double salario;
    private LocalDate dataAdmissao;

    public void cadastrarFunci(String nome, LocalDate dataNascimento,
                               Endereco endereco, List<Telefone> telsContato,
                               int matricula, Cargo cargo, Double salario, LocalDate dataAdmissao){
        super.setNome(nome);
        super.setDataNascimento(dataNascimento);
        super.setEndereco(endereco);
        super.setTelsContato(telsContato);
        this.matricula = matricula;
        this.cargo = cargo;
        this.salario = salario;
        this.dataAdmissao = dataAdmissao;
    }

    public void reajustarSalario(double percentual) {
        double acrescimo = (percentual/100) + 1;
        this.salario = this.salario * acrescimo;
    }

    public void promover(Cargo novoCargo) {
        this.cargo = novoCargo;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
