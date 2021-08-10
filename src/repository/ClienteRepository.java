package repository;

public class ClienteRepository implements Buscavel{

    @Override
    public void findById(Long id) {
        System.out.println("Listando por id - ClienteRepository");
    }

    @Override
    public void finfAll() {
        System.out.println("Listando - ClienteRepository");
    }
}
