package tech.ada.poo.base.servico.biblioteca;

import tech.ada.poo.base.servico.biblioteca.model.Livro;
import tech.ada.poo.base.servico.biblioteca.model.Revista;
import tech.ada.poo.base.servico.biblioteca.repository.BibliotecaRepositorio;
import tech.ada.poo.base.servico.biblioteca.repository.BibliotecaRepositorioListImpl;
import tech.ada.poo.base.servico.biblioteca.service.BibliotecaServiceFisica;
import tech.ada.poo.base.servico.biblioteca.service.BibliotecaServiceFisicaImpl;

public class Main {

    public static void main(String[] args) {
        BibliotecaRepositorio repositorio = new BibliotecaRepositorioListImpl();

        BibliotecaServiceFisica bibliotecaFisica = new BibliotecaServiceFisicaImpl(repositorio);

        Livro livro1 = new Livro("livro do nosso querido professor rocha ");
        Revista revista1 = new Revista();
        revista1.setTitulo("Revista para programar ");

        bibliotecaFisica.cadastrar(livro1);
        bibliotecaFisica.cadastrar(revista1);

        System.out.println("Consultando livro: " + bibliotecaFisica.consultar("livro do nosso querido professor rocha "));
        System.out.println("Consultando revista: " + bibliotecaFisica.consultar("Revista para programar "));

        // Alugando um item
        bibliotecaFisica.alugar();

        // Devolvendo um item
        bibliotecaFisica.devolver();
    }
}
