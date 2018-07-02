import java.util.Scanner;
import java.util.Random;
public class Main {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        Processo processo = new Processo();
        System.out.println("Informe o Quantum:");
        processo.quantum = scan.nextInt();
        System.out.println("Informe o nome do novo Processo:");
        processo.nomeProcesso = scan.next();
        System.out.println("Informe a carga de trabalho:");
        processo.cargadeTrabalho = scan.next();
        processo.pid = random.nextInt(50);

        System.out.println("Processo " + processo.pid + " criado.");
        System.out.println("Iniciando simulação de execução do processo...");

        Impressora.imprimirtemplate();

        //System.out.println(processo.nomeProcesso);
        //System.out.println(processo.quantum);
        //System.out.println(processo.cargadeTrabalho);
        //System.out.println(processo.pid);
    }
}
