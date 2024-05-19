package com.dirproveedor.dirproveedor.entity;

import org.springframework.web.multipart.MultipartFile;

public class EmpresaDTO {
	
	
    private MultipartFile image;

	private String nombre;
	private String email;
	private String telefono;
	private String website;
	private String facebook;
	private String youtube;
	private String tiktok;
	private String descripcion;
	private String urlfoto;
	private boolean publicado;
	private int visitas;
	private Long categoriasID;
	private Long usersID;

	
	public MultipartFile getImage() {
		return image;
	}
	public void setImage(MultipartFile image) {
		this.image = image;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public String getFacebook() {
		return facebook;
	}
	public void setFacebook(String facebook) {
		this.facebook = facebook;
	}
	public String getYoutube() {
		return youtube;
	}
	public void setYoutube(String youtube) {
		this.youtube = youtube;
	}
	public String getTiktok() {
		return tiktok;
	}
	public void setTiktok(String tiktok) {
		this.tiktok = tiktok;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getUrlfoto() {
		return urlfoto;
	}
	public void setUrlfoto(String urlfoto) {
		this.urlfoto = urlfoto;
	}
	public boolean isPublicado() {
		return publicado;
	}
	public void setPublicado(boolean publicado) {
		this.publicado = publicado;
	}
	public int getVisitas() {
		return visitas;
	}
	public void setVisitas(int visitas) {
		this.visitas = visitas;
	}
	public Long getCategoriasID() {
		return categoriasID;
	}
	public void setCategoriasID(Long categoriasID) {
		this.categoriasID = categoriasID;
	}
	public Long getUsersID() {
		return usersID;
	}
	public void setUsersID(Long usersID) {
		this.usersID = usersID;
	}
	

	
}
