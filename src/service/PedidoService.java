package service;

public class PedidoService implements Persistivel{

    @Override
    public void save() {
        System.out.println("Salvando - PedidoService");
    }

    @Override
    public void uptade() {
        System.out.println("Atualizando - PedidoService");
    }

    @Override
    public void remove() {
        System.out.println("Removendo - PedidoService");
    }
}
