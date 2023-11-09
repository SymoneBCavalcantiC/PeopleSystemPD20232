package app;

import composicoes.*;
import pessoas.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        Endereco endClient1 = new Endereco();
        endClient1.setRua("Calle Priscila de Aragón");
        endClient1.setNumero("1108");
        endClient1.setCep(75085000);
        endClient1.setCidade("Madrid");
        endClient1.setEstado("Madrid");
        endClient1.setPais("Espana");

        List<Telefone> telefonesClient1 = new ArrayList<>();
        Telefone tels1Client1 = new Telefone();
        tels1Client1.setNumeroTel(993028688);
        tels1Client1.setTipoTel("Celular");
        telefonesClient1.add(tels1Client1);

        Telefone tels2Client1 = new Telefone();
        tels2Client1.setNumeroTel(32392004);
        tels2Client1.setTipoTel("Residencial");
        telefonesClient1.add(tels2Client1);

        Telefone tels3Client1 = new Telefone();
        tels3Client1.setNumeroTel(983028688);
        tels3Client1.setTipoTel("Celular");
        telefonesClient1.add(tels3Client1);

        Cliente cliente01 = new Cliente();
        cliente01.cadastrarCliente("Pilar San Juan Batista", LocalDate.of(2000,8,12), endClient1, telefonesClient1, 1, "Marketing", Profissao.GERENTE);

        Endereco endClient2 = new Endereco();
        endClient2.setRua("Calle Miguel Cervantes");
        endClient2.setNumero("1211");
        endClient2.setCep(75056000);
        endClient2.setCidade("Las Fuentes");
        endClient2.setEstado("Zaragoza");
        endClient2.setPais("Espana");

        List<Telefone> telefonesClient2 = new ArrayList<>();
        Telefone tels1Client2 = new Telefone();
        tels1Client2.setNumeroTel(993080822);
        tels1Client2.setTipoTel("Celular");
        telefonesClient2.add(tels1Client2);

        Telefone tels2Client2 = new Telefone();
        tels2Client2.setNumeroTel(32475511);
        tels2Client2.setTipoTel("Residencial");
        telefonesClient2.add(tels2Client2);

        Telefone tels3Client2 = new Telefone();
        tels3Client2.setNumeroTel(983051771);
        tels3Client2.setTipoTel("Celular");
        telefonesClient2.add(tels3Client2);

        Cliente cliente02 = new Cliente();
        cliente02.cadastrarCliente("Fábio San Juan Batista", LocalDate.of(2002,3,24), endClient2, telefonesClient2, 2, "Cinema", Profissao.DIRETOR);

        Endereco endFunci01 = new Endereco();
        endFunci01.setRua("Rua Adalgisa Luna");
        endFunci01.setNumero("681");
        endFunci01.setCep(58050010);
        endFunci01.setCidade("João Pessoa");
        endFunci01.setEstado("Paraíba");
        endFunci01.setPais("Brasil");

        List<Telefone> telefonesFunci1 = new ArrayList<>();
        Telefone tels1Funci1 = new Telefone();
        tels1Funci1.setNumeroTel(981222588);
        tels1Funci1.setTipoTel("Celular");
        telefonesFunci1.add(tels1Funci1);

        Telefone tels2Funci1 = new Telefone();
        tels2Funci1.setNumeroTel(32265356);
        tels2Funci1.setTipoTel("Residencial");
        telefonesFunci1.add(tels2Funci1);

        Funcionario funci01 = new Funcionario();
        funci01.cadastrarFunci("Eduardo Flávio Santos Costa", LocalDate.of(1977,6,25), endFunci01, telefonesFunci1, 2731869, Cargo.GERENTE, 5000.00, LocalDate.of(2011, 3, 21));

        Endereco endFunci02 = new Endereco();
        endFunci02.setRua("Rua José João de Deus");
        endFunci02.setNumero("106");
        endFunci02.setCep(58055110);
        endFunci02.setCidade("João Pessoa");
        endFunci02.setEstado("Paraíba");
        endFunci02.setPais("Brasil");

        List<Telefone> telefonesFunci2 = new ArrayList<>();
        Telefone tels1Funci2 = new Telefone();
        tels1Funci2.setNumeroTel(988232249);
        tels1Funci2.setTipoTel("Celular");
        telefonesFunci2.add(tels1Funci2);

        Telefone tels2Funci2 = new Telefone();
        tels2Funci2.setNumeroTel(35664980);
        tels2Funci2.setTipoTel("Comercial");
        telefonesFunci2.add(tels2Funci2);

        Funcionario funci02 = new Funcionario();
        funci02.cadastrarFunci("Leda Batista Cavalcanti", LocalDate.of(1960,12,18), endFunci02, telefonesFunci2, 9252435, Cargo.DIRETOR, 8000.00, LocalDate.of(1990, 1, 10));


        //Reajustando salários dos funcionários
        funci01.reajustarSalario(10); // Reajuste de 10%
        funci02.reajustarSalario(10); // Reajuste de 10%

        //Promovendo o funcionário
        funci01.promover(Cargo.DIRETOR); // Promoção para Diretor



        // Imprimir informações para demonstração
        System.out.println("-CLIENTES CADASTRADOS-------------------------------------------------------------------------");
        System.out.println(" ");
        System.out.println("Cliente 01: " + cliente01.getNome());
        System.out.println("Telefones: " + cliente01.getTelsContato());
        System.out.println("Endereço: " + cliente01.getEndereco());
        System.out.println("----------------------------------------------------------------------------------------------");
        System.out.println("Cliente 02: " + cliente02.getNome());
        System.out.println("Telefones: " + cliente02.getTelsContato());
        System.out.println("Endereço: " + cliente02.getEndereco());
        System.out.println(" ");
        System.out.println("-INFORMAÇÕES DOS FUNCIONÁRIOS-----------------------------------------------------------------");
        System.out.println("Funcionário 01: " + funci01.getNome() + " - Salário reajustado: " + funci01.getSalario());
        System.out.println("Funcionário 02: " + funci02.getNome() + " - Salário reajustado: " + funci02.getSalario());
        System.out.println("Funcionário 01: " + funci01.getNome() + " - Promovido ao cargo de: " + funci01.getCargo());









    }
}
