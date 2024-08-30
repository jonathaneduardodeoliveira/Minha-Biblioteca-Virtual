package tech.ada.poo.base.servico.biblioteca.service;

import tech.ada.poo.base.servico.biblioteca.repository.BibliotecaRepositorio;
import tech.ada.poo.base.servico.biblioteca.model.ItemCatalogo;

public class BibliotecaServiceFisicaImpl extends BibliotecaServiceImpl implements BibliotecaServiceFisica {

    public BibliotecaServiceFisicaImpl(BibliotecaRepositorio repositorio) {
        super.setRepositorio(repositorio);
    }

    @Override
    public void alugar() {
        System.out.println("alugar");
    }

    @Override
    public void devolver() {
        System.out.println("devolver");
    }

    @Override
    public void cadastrar(ItemCatalogo item) {
        
        super.repositorio.cadastrar(item);
        System.out.println("item " + item + " cadastrado!");
    }
}
