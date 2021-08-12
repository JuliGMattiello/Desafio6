package repository;

public class VendedorRepository implements Buscavel{

    @Override
    public void findById(Long id) {
        System.out.println("Listando por id - VendedorRepository");
    }

    @Override
    public void findAll() {
        System.out.println("Listando - VendedorRepository");
    }
}
