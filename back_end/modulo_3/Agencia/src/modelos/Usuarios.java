package modelos;

import java.util.Date;

public class Usuarios {
	
	public class Usuario {
	    private int id_usuario;
	    private String email_usuario;
	    private String senha_usuario;
	    private Date dataCadastro_usuario;

	    // Construtor
	    public Usuario(int idUsuario, String emailUsuario, String senhaUsuario, Date dataCadastroUsuario, int id_usuario, String email_usuario, String senha_usuario, Date dataCadastro_usuario) {
	        this.id_usuario = id_usuario;
	        this.email_usuario = email_usuario;
	        this.senha_usuario = senha_usuario;
	        this.dataCadastro_usuario = dataCadastro_usuario;
	    }
	    
	    

		public Usuario() {
			super();
			// TODO Auto-generated constructor stub
		}



		public int getIdUsuario() {
			return id_usuario;
		}

		public void setIdUsuario(int idUsuario) {
			this.id_usuario = idUsuario;
		}

		public String getEmailUsuario() {
			return email_usuario;
		}

		public void setEmailUsuario(String emailUsuario) {
			this.email_usuario = emailUsuario;
		}

		public String getSenhaUsuario() {
			return senha_usuario;
		}

		public void setSenhaUsuario(String senhaUsuario) {
			this.senha_usuario = senhaUsuario;
		}

		public Date getDataCadastroUsuario() {
			return dataCadastro_usuario;
		}

		public void setDataCadastroUsuario(Date dataCadastroUsuario) {
			this.dataCadastro_usuario = dataCadastroUsuario;
		}

		@Override
		public String toString() {
			return "Usuario [idUsuario=" + id_usuario + ", emailUsuario=" + email_usuario + ", senhaUsuario="
					+ senha_usuario + ", dataCadastroUsuario=" + dataCadastro_usuario + "]";
		}
		
		
	    
	}

	public Usuarios(String emailUsuario, String senhaUsuario, String dataCadastroUsuario) {
		// TODO Auto-generated constructor stub
	}

	public Usuarios() {
		// TODO Auto-generated constructor stub
	}

	public String getEmailUsuario() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getSenhaUsuario() {
		// TODO Auto-generated method stub
		return null;
	}

	public java.sql.Date getDataCadastroUsuario() {
		// TODO Auto-generated method stub
		return null;
	}

	public int getId() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void setInt(int int1) {
		// TODO Auto-generated method stub
		
	}

	public void setEmail(String string) {
		// TODO Auto-generated method stub
		
	}

	public void setSenha(String string) {
		// TODO Auto-generated method stub
		
	}

	public void setDate(String string) {
		// TODO Auto-generated method stub
		
	}
}


