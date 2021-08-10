package service;

public class OrcamentoService implements Persistivel{

    @Override
    public void save() {
        System.out.println("Salvando - OrcamentoService");
    }

    @Override
    public void uptade() {
        System.out.println("Atualizando - OrcamentoService");
    }

    @Override
    public void remove() {
        System.out.println("Removendo - OrcamentoService");
    }
}
