import java.util.Random;
import java.util.Scanner;

public class GerenciadorDeProcessos {
	
	public Processo pronto;
	public Processo executando;
	public Processo esperando;
	public Processo terminando;

	
	public void atualizarProcessoTer() {
		while (terminando == null) {
		if (esperando == null) {
		}
		else {terminando = esperando;
		esperando = null;
		}
		
		if (pronto == null) {
		}
		else {terminando = pronto;
		pronto = null;
		}
		
		if (executando == null) {
			
		}
		else {terminando = executando;
		executando = null;
		}
	}
	}
	public void atualizarProcessoEsp() {
		while (esperando == null) {
		if (executando == null) {
		}
		else {esperando = executando;
		executando = null;
		}
		
		if (pronto == null) {
		}
		else {esperando = pronto;
		pronto = null;
		}
		
		if (terminando == null) {
			
		}
		else {esperando = terminando;
		terminando = null;
		}
	}
	}
	public void atualizarProcessoPro() {
		while (pronto == null) {
		if (esperando == null) {
		}
		else {pronto = esperando;
		esperando = null;
		}
		
		if (executando == null) {
		}
		else {pronto = executando;
		executando = null;
		}
		
		if (terminando == null) {
			
		}
		else {pronto = terminando;
		terminando = null;
		}
	}
	}
	public void atualizarProcessoExe() {
		while (executando == null) {
		if (esperando == null) {
		}
		else {executando = esperando;
		esperando = null;
		}
		
		if (pronto == null) {
		}
		else {executando = pronto;
		pronto = null;
		}
		
		if (terminando == null) {
			
		}
		else {executando = terminando;
		terminando = null;
		}
	}
	}
	





	public void programa(){
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		Processo processo = new Processo();
		processo.pronto = processo;
		System.out.println("Informe o Quantum:");

		processo.quantum = scan.nextInt();


		System.out.println("Informe o nome do novo Processo:");
		Processo.nomeProcesso = scan.next();
		System.out.println("Informe a carga de trabalho:");
		processo.cargaDeTrabalho = scan.next();
		processo.setPid(random.nextInt(50));

		System.out.println("Processo " + processo.getPid() + " criado.");

		System.out.println("Iniciando simulação de execução do processo...");
		
		processo.setProcessoFinalizado(false);
		
		while (!processo.isProcessoFinalizado()) {
		
		for (int i = processo.quantum; i > 0; i--) {
			if (!processo.cargaDeTrabalho.isEmpty()) {


				if (processo.cargaDeTrabalho.charAt(0) == 'A') {
					processo.cargaDeTrabalho = processo.cargaDeTrabalho.replaceFirst("A", "");
					processo.atualizarProcessoExe();
					processo.executando = processo;
					System.out.println("Estado Atual: Executando");
					System.out.println("Proxíma ação: executar um ciclo de CPU");
				}

				else if (processo.cargaDeTrabalho.charAt(0)== 'B') {
					processo.cargaDeTrabalho = processo.cargaDeTrabalho.replaceFirst("B", "A");
					processo.contarCiclo();
					processo.atualizarProcessoExe();
					System.out.println("Estado Atual: Executando");
					System.out.println("Proxíma ação: executar um ciclo de CPU");
				}
				else if(processo.cargaDeTrabalho.charAt(0)== 'C') {
					processo.cargaDeTrabalho = processo.cargaDeTrabalho.replaceFirst("C", "");
					processo.contarCiclo();
					processo.atualizarProcessoEsp();
					processo.esperando = processo;
					System.out.println("Estado Atual: Esperado");
					System.out.println("Aguardando E/S");
					System.out.println("Tecle ENTER: ");
					try
					{
						System.in.read();
					}  
					catch(Exception e)
					{}  

				}
				else if(processo.cargaDeTrabalho.charAt(0)== 'D') {
					processo.cargaDeTrabalho = processo.cargaDeTrabalho.replaceFirst("D", "C");
					esperando = executando;
					processo.contarCiclo();
					processo.atualizarProcessoEsp();
					processo.esperando = processo;
					System.out.println("Estado Atual: Esperado");
					System.out.println("Aguardando E/S");
					System.out.println("Tecle ENTER: ");
					try
					{
						System.in.read();
					}  
					catch(Exception e)
					{}  
					
				}
			
				Impressora.imprimirtemplate();
			}
			else {
				processo.setProcessoFinalizado(true);
			
			}
		
		}
		}
		processo.atualizarProcessoTer();
		processo.terminando = processo;
		System.out.println("Estado Atual: Termimando");
		System.out.println("O processo será excluido");




	}

}
