package modelos;
import java.util.Date;

public class Pedidos {

	    private int numPedido;
	    private java.sql.Date dataPedido;
	    private String formaPagamento;
	    private float precoTotal;
	    
	    Usuarios usuarios;
	    
	    // Construtores
		public Pedidos(int numPedido, java.sql.Date dataPedido, String formaPagamento, float precoTotal) {
			super();
			this.numPedido = numPedido;
			this.dataPedido = dataPedido;
			this.formaPagamento = formaPagamento;
			this.precoTotal = precoTotal;
			this.usuarios = getUsuario();
		}
	    
	
		
		 public Pedidos() {
			// TODO Auto-generated constructor stub
		}



		//getters e setters...
		public int getNumPedido() {
			return numPedido;
		}

		public void setNumPedido(int numPedido) {
			this.numPedido = numPedido;
		}

		public java.sql.Date getDataPedido() {
			return dataPedido;
		}

		public void setDataPedido(java.sql.Date dataPedido) {
			this.dataPedido = dataPedido;
		}

		public String getFormaPagamento() {
			return formaPagamento;
		}

		public void setFormaPagamento(String formaPagamento) {
			this.formaPagamento = formaPagamento;
		}

		public float getPrecoTotal() {
			return precoTotal;
		}

		public void setPrecoTotal(float string) {
			this.precoTotal = string;
		}
		
		public Usuarios getUsuario() {
			return usuarios;
		}

		public void setUsuario(Usuarios usuario) {
			this.usuarios = usuario;
		}

		@Override
		public String toString() {
			return "Pedidos [numPedido=" + numPedido + ", dataPedido=" + dataPedido + ", formaPagamento="
					+ formaPagamento + ", precoTotal=" + precoTotal + ", usuario=" + usuarios + "]";
		}



		public void setInt(int int1) {
			// TODO Auto-generated method stub
			
		}



		public void setDate(String string) {
			// TODO Auto-generated method stub
			
		}



		public float getPrecoTotal1() {
			// TODO Auto-generated method stub
			return 0;
		}



	
    
		
}
