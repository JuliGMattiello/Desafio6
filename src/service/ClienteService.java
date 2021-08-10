package service;

public class ClienteService implements Persistivel{

    @Override
    public void save() {
        System.out.println("Salvando - ClienteService");
    }

    @Override
    public void uptade() {
        System.out.println("Atualizando - ClienteService");
    }

    @Override
    public void remove() {
        System.out.println("Removendo - ClienteService");
    }
}
