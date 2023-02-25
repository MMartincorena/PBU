package com.example.prueba_Ensolvers.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "Notas")
public class NotaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_Nota")
    private Long idNota;

    @Column(name = "Título", nullable = false, length = 100)
    private String titulo;

    @Column(name = "Descripción", nullable = false, length = 250)
    private String descripcion;

    @Column(name = "Estado", nullable = false)
    private Boolean estado;

   @ManyToOne
    private UsuarioEntity usuario;

    @OneToMany(mappedBy = "nota")
    List<CategoriaEntity> categoria;

    public NotaEntity() {
    }

    public NotaEntity(Long idNota, String titulo, String descripcion, Boolean estado, UsuarioEntity usuario, List<CategoriaEntity> categoria) {
        this.idNota = idNota;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.estado = estado;
        this.usuario = usuario;
        this.categoria = categoria;
    }

    public Long getIdNota() {
        return idNota;
    }

    public void setIdNota(Long idNota) {
        this.idNota = idNota;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public UsuarioEntity getUsuario() {
        return usuario;
    }

    public void setUsuario(UsuarioEntity usuario) {
        this.usuario = usuario;
    }

    public List<CategoriaEntity> getCategoria() {
        return categoria;
    }

    public void setCategoria(List<CategoriaEntity> categoria) {
        this.categoria = categoria;
    }
}
