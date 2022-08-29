package entities;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import util.Comentario;

public class Post {
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

	private String titulo;
	private String conteudo;
	private Integer vistos;
	private List<Comentario> comentarios = new ArrayList<>();

	public Post() {}

	public Post(String titulo, String conteudo, Integer vistos) {
		this.titulo = titulo;
		this.conteudo = conteudo;
		this.vistos = vistos;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getConteudo() {
		return conteudo;
	}
	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}
	public Integer getVistos() {
		return vistos;
	}
	public void setVistos(Integer vistos) {
		this.vistos = vistos;
	}
	public List<Comentario> getComentarios() {
		return comentarios;
	}
	public void addComment(Comentario comentario) {
		comentarios.add(comentario);
	}
	public void removeComment(Comentario comentario) {
		comentarios.remove(comentario);
	}
	@Override
	public String toString() {
		StringBuilder resultadoComentarios = new StringBuilder();
		for(Comentario comentario : comentarios) {
			resultadoComentarios.append(comentario.getTexto()+"\n");
		}
		return titulo+"\nLikes: "+vistos+"\n"+conteudo+"\nComentários:\n"+resultadoComentarios.toString();
	}	
}