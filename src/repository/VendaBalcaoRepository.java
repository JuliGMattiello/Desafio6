package repository;

public class VendaBalcaoRepository implements Buscavel{

    @Override
    public void findById(Long id) {
        System.out.println("Listando por id - VendaBalcaoRepository");
    }

    @Override
    public void finfAll() {
        System.out.println("Listando - VendaBalcaoRepository");
    }
}
