package tech.ada.poo.base.servico.biblioteca.repository;

import tech.ada.poo.base.servico.biblioteca.model.ItemCatalogo;

import java.util.ArrayList;
import java.util.List;

public class BibliotecaRepositorioListImpl implements BibliotecaRepositorio {

    static int CODIGO = 1;
    private List<ItemCatalogo> itens = new ArrayList<>();

    @Override
    public ItemCatalogo cadastrar(ItemCatalogo item) {
        item.setCodigo(CODIGO++);
        itens.add(item);
        return item;
    }

    @Override
    public ItemCatalogo consultar(String titulo) {
        if (this.itens == null || itens.isEmpty()) return null;
        for (ItemCatalogo item : this.itens) {
            if (item.getTitulo().equalsIgnoreCase(titulo))
                return item;
        }
        return null;
    }

    @Override
    public ItemCatalogo atualizar(ItemCatalogo item) {
        return item;     }
}
