package service;

public class ServicoService implements Persistivel{

    @Override
    public void save() {
        System.out.println("Salvando - ServicoService");
    }

    @Override
    public void update() {
        System.out.println("Atualizando - ServicoService");
    }

    @Override
    public void remove() {
        System.out.println("Removendo - ServicoService");
    }
}
