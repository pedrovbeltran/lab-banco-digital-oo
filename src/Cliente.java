
public class Cliente {

	private String nome;
	private String CPF;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String CPF) {
		boolean result = CPF.matches("[0-9]{11}+");
		if (result) {
			this.CPF = CPF;
		} else {
			System.out.println("CPF Inválido");
			//throw new Exception("CPF inválido");
		}
	}

}
