package pessoas;

import composicoes.*;
import java.time.LocalDate;
import java.util.List;

public class Cliente extends Pessoa {
    private int codigo;
    private String AreaAtuacao;
    private Profissao profissao;


    public void cadastrarCliente(String nome, LocalDate dataNascimento,
                                 Endereco endereco, List<Telefone> telsContato,
                                 int codigo, String AreaAtuacao, Profissao profissao) {
        super.setNome(nome);
        super.setDataNascimento(dataNascimento);
        super.setEndereco(endereco);
        super.setTelsContato(telsContato);
        this.codigo = codigo;
        this.AreaAtuacao = AreaAtuacao;
        this.profissao = profissao;
    }

}
