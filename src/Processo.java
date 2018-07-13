public class Processo {
	public static String nomeProcesso;
	public static int pid;
	public static String cargaDeTrabalho;
	public static int quantum;
	private int tempoRestante;
	private int qtdeCiclo;
	public static String estado;

	
	public String getEstado() {

		return estado;
	}
	public void setEstado(String estado) {

		this.estado = estado;
	}
	public int getQtdeCiclo() {
		return
				qtdeCiclo;
	}
	public void setQtdeCiclo(int qtdeCiclo) {

		this.qtdeCiclo = qtdeCiclo;
	}
	public int getTempoRestante() {

		return tempoRestante;
	}
	public void setTempoRestante(int tempoRestante) {

		this.tempoRestante = tempoRestante;
	}
	
	public String getCargaDeTrabalho() {

		return cargaDeTrabalho;
	}
	public void setCargaDeTrabalho(String cargaDeTrabalho) {

		this.cargaDeTrabalho = cargaDeTrabalho;
	}
	public static int getPid() {

		return pid;
	}
	public void setPid(int pid) {

		this.pid = pid;
	}

	public static String removerPrimeiraLetra(String x){
		return x.substring(1);

	}

}
