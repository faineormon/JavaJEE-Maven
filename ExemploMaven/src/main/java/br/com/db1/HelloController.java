package br.com.db1;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class HelloController {
	
	private String texto1;
	private String texto2;
	
	
	public String getTexto1() {
		return texto1;
	}
	public void setTexto1(String texto1) {
		this.texto1 = texto1;
	}
	public String getTexto2() {
		return texto2;
	}
	public void setTexto2(String texto2) {
		this.texto2 = texto2;
	}

	public void trocarMensagem() {
		texto2 = texto1;
	}
}
