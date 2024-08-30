package tech.ada.poo.base.servico.biblioteca.service;

import tech.ada.poo.base.servico.biblioteca.model.ItemCatalogo;

public interface BibliotecaServiceFisica extends BibliotecaService {

    void alugar();
    void devolver();
    void cadastrar(ItemCatalogo item);

}
