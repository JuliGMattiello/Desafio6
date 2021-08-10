package service;

public class VendedorService implements Persistivel{

    @Override
    public void save() {
        System.out.println("Salvando - VendedorService");
    }

    @Override
    public void uptade() {
        System.out.println("Atualizando - VendedorService");
    }

    @Override
    public void remove() {
        System.out.println("Removendo - VendedorService");
    }
}
