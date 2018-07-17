package com.ipartek.formacion.video;

public class VideoYoutube {
 
	private long id;
	private String codigo;
	private String titulo;
	
	
	public VideoYoutube(long id, String codigo, String titulo) {
		this.id = id;
		this.codigo = codigo;
		this.titulo = titulo;
	}
	
	public VideoYoutube() {
		this(-1, "", "");
	}
	
	public long getId() {
		return id;
		
	}
	
}
