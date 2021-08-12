package repository;

public class OrcamentoRepository implements Buscavel{

    @Override
    public void findById(Long id) {
        System.out.println("Listando por id - OrcamentoRepository");
    }

    @Override
    public void findAll() {
        System.out.println("Listando - OrcamentoRepository");
    }
}
