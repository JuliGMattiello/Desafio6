package repository;

public class ProdutoRepository implements Buscavel{

    @Override
    public void findById(Long id) {
        System.out.println("Listando por id - ProdutoRepository");
    }

    @Override
    public void finfAll() {
        System.out.println("Listando - ProdutoRepository");
    }
}
