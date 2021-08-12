package repository;

public class PedidoRepository implements Buscavel{

    @Override
    public void findById(Long id) {
        System.out.println("Listando por id - PedidoRepository");
    }

    @Override
    public void findAll() {
        System.out.println("Listando - PedidoRepository");
    }
}
