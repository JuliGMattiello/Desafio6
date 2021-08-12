package service;

public class ProdutoService implements Persistivel{

    @Override
    public void save() {
        System.out.println("Salvando - ProdutoService");
    }

    @Override
    public void update() {
        System.out.println("Atualizando - ProdutoService");
    }

    @Override
    public void remove() {
        System.out.println("Removendo - ProdutoService");
    }
}
