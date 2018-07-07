import java.util.Random;
import java.util.Scanner;

public class GerenciadorDeProcessos {
		public static boolean processoFinalizado;
		public Processo pronto;
		public static Processo executando;
		public static Processo esperando;
		public Processo terminando;
		
		public static String atualizarCarga(String cargaDeTrabalho) {
			return cargaDeTrabalho;
		}
		
		public static int ContarQtdeCiclo(int QtdeCiclo) {
			QtdeCiclo += 1;
			return QtdeCiclo;
		}
		
		public static void removerFila(int pid) {
		
		}
		
		public static void enviarFila(int pid) {
			
		}
		
		public static String processarCarga(String cargaDeTrabalho) {
			switch (cargaDeTrabalho.charAt(0)) {
				case 'A':
					//a fazer
					break;
				case 'B':
					cargaDeTrabalho = cargaDeTrabalho.replaceFirst("B", "A");
					break;
				case 'C':
					esperando = executando;
					System.out.println("Tecle ENTER: ");
					try
			        {
			            System.in.read();
			        }  
			        catch(Exception e)
			        {}  
					break;
					
				
					
					
			
			
			}
			return cargaDeTrabalho;
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
			processo.cargaDeTrabalho = scan.next();
			processo.pid = random.nextInt(50);

			System.out.println("Processo " + processo.pid + " criado.");
			System.out.println("Iniciando simulação de execução do processo...");
			
			Impressora.imprimirtemplate();


		}
}
