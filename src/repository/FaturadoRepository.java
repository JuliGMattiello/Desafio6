package repository;

public class FaturadoRepository implements Buscavel{

    @Override
    public void findById(Long id) {
        System.out.println("Listando por id - FaturadoRepository");
    }

    @Override
    public void finfAll() {
        System.out.println("Listando - FaturadoRepository");
    }
}
