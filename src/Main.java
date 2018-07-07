public class Main {

    public static void main(String args[]) {
        GerenciadorDeProcessos principal = new GerenciadorDeProcessos();
        principal.programa();
        principal.processarCarga("BC");
        System.out.println(Processo.cargaDeTrabalho);
    }
}