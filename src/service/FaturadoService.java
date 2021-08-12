package service;

public class FaturadoService implements Persistivel{

    @Override
    public void save() {
        System.out.println("Salvando - FaturadoService");
    }

    @Override
    public void update() {
        System.out.println("Atualizando - FaturadoService");
    }

    @Override
    public void remove() {
        System.out.println("Removendo - FaturadoService");
    }
}
