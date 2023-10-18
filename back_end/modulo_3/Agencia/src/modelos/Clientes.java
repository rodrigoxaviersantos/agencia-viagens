package modelos;


	public class Clientes {
	    private String cpf;
	    private String email;
	    private String telefone;
	    private String nome;
	    
	    Usuarios usuarios;
	    
	    // Construtores
		public Clientes(String cpf, String email, String telefone, String nome, Usuarios usuarios) {
			super();
			this.cpf = cpf;
			this.email = email;
			this.telefone = telefone;
			this.nome = nome;
			this.usuarios = usuarios;
		}
		
	    //getters e setters
		public String getCpf() {
			return cpf;
		}

		public void setCpf(String cpf) {
			this.cpf = cpf;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getTelefone() {
			return telefone;
		}

		public void setTelefone(String telefone) {
			this.telefone = telefone;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}
		
		
		public Usuarios getUsuarios() {
			return usuarios;
		}

		public void setUsuarios(Usuarios usuarios) {
			this.usuarios = usuarios;
		}

		@Override
		public String toString() {
			return "Clientes [cpf=" + cpf + ", email=" + email + ", telefone=" + telefone + ", nome=" + nome
					+ ", usuarios=" + usuarios + "]";
		}
		
		
	}
