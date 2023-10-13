package main.java.list.Ordenacao;
import java.util.*;

public class OrdenacaoPessoa {
    private List<Pessoa> pessoaList;

    public OrdenacaoPessoa() {
        this.pessoaList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura){
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordernarPorIdade(){
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
        return pessoasPorAltura;
    }


    public static void main(String[] args) {

        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();
        ordenacaoPessoa.adicionarPessoa("Erick", 20, 1.76);
        ordenacaoPessoa.adicionarPessoa("Alice", 25, 1.68);
        ordenacaoPessoa.adicionarPessoa("Bob", 17, 1.70);
        ordenacaoPessoa.adicionarPessoa("Carla", 22, 1.55);
        ordenacaoPessoa.adicionarPessoa("David", 18, 1.65);
        ordenacaoPessoa.adicionarPessoa("Elena", 35, 1.70);

        System.out.println(ordenacaoPessoa.ordernarPorIdade());
        System.out.println(ordenacaoPessoa.ordenarPorAltura());




    }



}
