package modelos;

public class Passagens {

	public class Passagem {
	    private int idPassagem;
	    private int quantidade;
	    
	    Pedidos pedidos;

	    // Construtores, 
		public Passagem(int idPassagem, int quantidade, Pedidos pedidos) {
			super();
			this.idPassagem = idPassagem;
			this.quantidade = quantidade;
			this.pedidos = pedidos;
		}

		 public Passagem() {
			// TODO Auto-generated constructor stub
		}

		//getters e setters...
		public int getIdPassagem() {
			return idPassagem;
		}

		public void setIdPassagem(int idPassagem) {
			this.idPassagem = idPassagem;
		}

		public int getQuantidade() {
			return quantidade;
		}

		public void setQuantidade(int quantidade) {
			this.quantidade = quantidade;
		}

		public Pedidos getPedidos() {
			return pedidos;
		}

		public void setPedidos(Pedidos pedidos) {
			this.pedidos = pedidos;
		}

		@Override
		public String toString() {
			return "Passagem [idPassagem=" + idPassagem + ", quantidade=" + quantidade + ", pedidos=" + pedidos + "]";
		}

		public void setInt(int int1) {
			// TODO Auto-generated method stub
			
		}

		public static int getidPassagem() {
			// TODO Auto-generated method stub
			return 0;
		}

		public static String getquantidade() {
			// TODO Auto-generated method stub
			return null;
		}

		public static String getQtdePassagem() {
			// TODO Auto-generated method stub
			return null;
		}
	    
	   
		
		
	}

}
