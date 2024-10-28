package pkg;

public class Movimiento {

	public enum Signo {
		D,
		H;
	}
	private Signo signo;
	private String detalle;
	private double cantidad;
	
	
	public Movimiento(double cantidad, String detalle, Signo signo) {
		super();
		this.cantidad = cantidad;
		this.detalle = detalle;
		this.signo = signo;
	}
	
	public double getCantidad() {
		return cantidad;
	}
	
	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}
	
	public String getDetalle() {
		return detalle;
	}
	
	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}
	
	public Signo getSigno() {
		return signo;
	}
	
	public void setSigno(Signo signo) {
		this.signo = signo;
	}
	
	@Override
	public String toString() {
		String s = "\n" + this.detalle + " de " + this.cantidad + "€";
		return s;
	}	
	
}
