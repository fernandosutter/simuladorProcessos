import java.util.Random;
import java.util.Scanner;

public class GerenciadorDeProcessos {
		private boolean processoFinalizado;
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

		
		public String processarCarga(String cargaDeTrabalho) {
			System.out.println("VEIO ATE AQUI2");
			switch (cargaDeTrabalho.charAt(0)) {
				case 'A':
					cargaDeTrabalho = cargaDeTrabalho.replaceFirst("A", "");
					System.out.println("VEIO ATE AQUI2");
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
				case 'D':
					esperando = executando;
					System.out.println("Tecle ENTER: ");
					try
			        {
			            System.in.read();
			        }  
			        catch(Exception e)
			        {}  
					cargaDeTrabalho = cargaDeTrabalho.replaceFirst("D", "C");
					break;
				default:
					System.out.println("D:");
					System.out.println("VEIO ATE AQUI TAMBEM");
					
					break;
					
			}
			return cargaDeTrabalho;
		}
	

		public void programa(){
			Scanner scan = new Scanner(System.in);
			Random random = new Random();
			Processo processo = new Processo();
			System.out.println("Informe o Quantum:");

			processo.quantum = scan.nextInt();


			System.out.println("Informe o nome do novo Processo:");
			Processo.nomeProcesso = scan.next();
			System.out.println("Informe a carga de trabalho:");
			processo.cargaDeTrabalho = scan.next();
			processo.setPid(random.nextInt(50));

			System.out.println("Processo " + processo.getPid() + " criado.");

			System.out.println("Iniciando simulação de execução do processo...");
			
			for (int i = processo.quantum; i > 0; i--) {
				if (processo.cargaDeTrabalho.charAt(0)== 'A') {
					processo.cargaDeTrabalho = processo.cargaDeTrabalho.replaceFirst("A", "");
					System.out.println(processo.cargaDeTrabalho);
				}
				
				else if (processo.cargaDeTrabalho.charAt(0)== 'B') {
					processo.cargaDeTrabalho = processo.cargaDeTrabalho.replaceFirst("B", "A");
					System.out.println(processo.cargaDeTrabalho);
				}
				else if(processo.cargaDeTrabalho.charAt(0)== 'C') {
					esperando = executando;
					System.out.println("Tecle ENTER: ");
					try
			        {
			            System.in.read();
			        }  
			        catch(Exception e)
			        {}  
					
				
				}
				else if(processo.cargaDeTrabalho.charAt(0)== 'D') {
					esperando = executando;
					System.out.println("Tecle ENTER: ");
					try
			        {
			            System.in.read();
			        }  
			        catch(Exception e)
			        {}  
					processo.cargaDeTrabalho = processo.cargaDeTrabalho.replaceFirst("C", "D");
				}
				
				/*	switch (processo.cargaDeTrabalho.charAt(0)) {
				case 'A':
					processo.cargaDeTrabalho = processo.cargaDeTrabalho.replaceFirst("A", "");
					System.out.println("VEIO ATE AQUI2");
					System.out.println(processo.cargaDeTrabalho);
					break;
				case 'B':
					processo.cargaDeTrabalho = processo.cargaDeTrabalho.replaceFirst("B", "A");
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
				case 'D':
					esperando = executando;
					System.out.println("Tecle ENTER: ");
					try
			        {
			            System.in.read();
			        }  
			        catch(Exception e)
			        {}  
					processo.cargaDeTrabalho = processo.cargaDeTrabalho.replaceFirst("D", "C");
					break;
				default:
					System.out.println("D:");
				}		
		*/
			}
			Impressora.imprimirtemplate();
			


		}

		public boolean isProcessoFinalizado() {

			return processoFinalizado;
		}


		public void setProcessoFinalizado(boolean processoFinalizado) {

			this.processoFinalizado = processoFinalizado;
		}
}
