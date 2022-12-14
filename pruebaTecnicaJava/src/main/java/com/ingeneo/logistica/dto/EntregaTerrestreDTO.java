package com.ingeneo.logistica.dto;

public class EntregaTerrestreDTO {
	//DTO que será utilizado para consultar los pedido de logistica terrestre
	private String tipoProducto;
	private Integer cantProducto;
	private String fRegistro;
	private String fEntrega;
	private String bodega;
	private String precio;
	private String placa;
	private String nGuia;
	public String getTipoProducto() {
		return tipoProducto;
	}
	public void setTipoProducto(String tipoProducto) {
		this.tipoProducto = tipoProducto;
	}
	public Integer getCantProducto() {
		return cantProducto;
	}
	public void setCantProducto(Integer cantProducto) {
		this.cantProducto = cantProducto;
	}
	public String getfRegistro() {
		return fRegistro;
	}
	public void setfRegistro(String fRegistro) {
		this.fRegistro = fRegistro;
	}
	public String getfEntrega() {
		return fEntrega;
	}
	public void setfEntrega(String fEntrega) {
		this.fEntrega = fEntrega;
	}
	public String getPrecio() {
		return precio;
	}
	public void setPrecio(String precio) {
		this.precio = precio;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getnGuia() {
		return nGuia;
	}
	public void setnGuia(String nGuia) {
		this.nGuia = nGuia;
	}
	public String getBodega() {
		return bodega;
	}
	public void setBodega(String bodega) {
		this.bodega = bodega;
	}
	
	
}
