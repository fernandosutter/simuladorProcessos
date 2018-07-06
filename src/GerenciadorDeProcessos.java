import java.util.Random;
import java.util.Scanner;

public class GerenciadorDeProcessos {
		public static String filaProntos;
		public static boolean processoFinalizado;
		public static int qtdeFinalizados;
		public static int qtdeNaEspera;
		
		
		public static String atualizarCarga(String cargaDeTrabalho) {
			return cargaDeTrabalho;
		}
		
		public static int ContarQtdeCiclo(int QtdeCiclo) {
			return QtdeCiclo;
		}
		
		public static void removerFila(int pid) {
		
		}
		
		public static void enviarFila(int pid) {
			
		}
		
		public static void simulaProcessos() {
			
		}

		public void programa(){
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


		}
}
