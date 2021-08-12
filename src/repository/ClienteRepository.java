package repository;

public class ClienteRepository implements Buscavel{

    @Override
    public void findById(Long id) {
        System.out.println("Listando por id - ClienteRepository");
    }

    @Override
    public void findAll() {
        System.out.println("Listando - ClienteRepository");
    }
}
