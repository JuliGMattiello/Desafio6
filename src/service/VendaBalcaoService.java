package service;

public class VendaBalcaoService implements Persistivel{

    @Override
    public void save() {
        System.out.println("Salvando - VendaBalcaoService");
    }

    @Override
    public void update() {
        System.out.println("Atualizando - VendaBalcaoService");
    }

    @Override
    public void remove() {
        System.out.println("Removendo - VendaBalcaoService");
    }
}
