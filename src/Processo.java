public class Processo {
	public static String nomeProcesso;
	private static int pid;
	public String cargaDeTrabalho;
	public int quantum;
	private int tempoRestante;
	private int qtdeCiclo;
	private String estado;
	
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public int getQtdeCiclo() {
		return qtdeCiclo;
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

}
