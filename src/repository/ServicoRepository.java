package repository;

public class ServicoRepository implements Buscavel{

    @Override
    public void findById(Long id) {
        System.out.println("Listando por id - ServicoRepository");
    }

    @Override
    public void finfAll() {
        System.out.println("Listando - ServicoRepository");
    }
}
