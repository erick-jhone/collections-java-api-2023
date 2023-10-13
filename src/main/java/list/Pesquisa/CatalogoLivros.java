package main.java.list.Pesquisa;
import java.util.*;

public class CatalogoLivros {

    //Atributo
    private List<Livro> livroList;

    public CatalogoLivros(){
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        livroList.add(new Livro(titulo, autor, anoPublicacao));

    }

    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livrosPorAutor = new ArrayList<>();
        if(!livroList.isEmpty()){
            for(Livro livro:livroList){
                if(livro.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(livro);
                }
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisaPorIntervaloAnos(int anoInicial, int anoFinal){

        List<Livro> livrosPorAnos = new ArrayList<>();
        if(!livroList.isEmpty()){
            for(Livro livro:livroList){
                if(livro.getAnoPublicacao() >= anoInicial && livro.getAnoPublicacao() <= anoFinal){
                    livrosPorAnos.add(livro);
                }
            }
        }
        return livrosPorAnos;

    }

    public Livro pesquisaPorTitulo(String titulo){
        Livro livroPorTitulo = null;
        if(!livroList.isEmpty()){
            for (Livro livro : livroList) {
                if(livro.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTitulo = livro;
                    break;
                }

            }
        }
        return livroPorTitulo;

    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros= new CatalogoLivros();
        catalogoLivros.adicionarLivro("O Hobbit", "Tolkien", 1937);
        catalogoLivros.adicionarLivro("As Duas Torres", "Tolkien", 1954);
        catalogoLivros.adicionarLivro("O Silmarillion", "Tolkien", 1977);
        catalogoLivros.adicionarLivro("O Caminho para Valinor", "Tolkien", 1978);
        catalogoLivros.adicionarLivro("O Legado dos Anéis", "Tolkien", 2007);
        catalogoLivros.adicionarLivro("As Aventuras de Frodo", "Tolkien", 1966);
        catalogoLivros.adicionarLivro("A Era dos Elfos", "Tolkien", 1984);
        catalogoLivros.adicionarLivro("A Sombra de Mordor", "Tolkien", 2014);
        catalogoLivros.adicionarLivro("Os Anéis do Poder", "Tolkien", 1969);
        catalogoLivros.adicionarLivro("A Jornada de Bilbo", "Tolkien", 1938);
        catalogoLivros.adicionarLivro("Dom Quixote", "Miguel de Cervantes", 1605);
        catalogoLivros.adicionarLivro("A Metamorfose", "Franz Kafka", 1915);
        catalogoLivros.adicionarLivro("1984", "George Orwell", 1949);
        catalogoLivros.adicionarLivro("Crime e Castigo", "Fiódor Dostoiévski", 1866);
        catalogoLivros.adicionarLivro("A Odisséia", "Homero", -800); // Utilizado ano aproximado
        catalogoLivros.adicionarLivro("A Arte da Guerra", "Sun Tzu", -500); // Utilizado ano aproximado
        catalogoLivros.adicionarLivro("Cem Anos de Solidão", "Gabriel García Márquez", 1967);
        catalogoLivros.adicionarLivro("Orgulho e Preconceito", "Jane Austen", 1813);
        catalogoLivros.adicionarLivro("Ulisses", "James Joyce", 1922);

        System.out.println(catalogoLivros.livroList.size());
//        System.out.println(catalogoLivros.pesquisarPorAutor("Homero"));
        System.out.println(catalogoLivros.pesquisaPorTitulo("A arte da guerra"));
        System.out.println(catalogoLivros.pesquisaPorIntervaloAnos(1990, 2023));


    }



}
