
public class Impressora {
	public static void imprimirtemplate() {
		System.out.println("==============================================================\n" +
				"| Gerenciador de Processos\n" +
				"==============================================================\n" +
				"| Contador de ciclo de execução:"+ Processo.getQtdeCiclo() + "\n" +
				"| Processos na fila de pronto:" + Processo.pid + "\n" +
				"| Processo em execução: " + Processo.pid + "\n" +
				"| Tempo restante: " + Processo.quantum + "\n" +
				"| Carga de trabalho: " + Processo.cargaDeTrabalho + "\n" +
				"| Processos esperando: \n" +
				"| Carga de trabalho: \n" +
				"| Processos finalizados: \n" +
				"==============================================================\n"+
				"Processo " + Processo.getPid() + " " + Processo.nomeProcesso  + "\n" +
				"Carga de trabalho: " + Processo.cargaDeTrabalho);
		
	}

}
