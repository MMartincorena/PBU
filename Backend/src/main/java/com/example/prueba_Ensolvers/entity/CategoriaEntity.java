package com.example.prueba_Ensolvers.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Categorias")
public class CategoriaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_Categoria")
    private Long idCategoria;

    @Column(name = "Nombre")
    private String nombre;

    /*----------------------------------------------------------*/
    @ManyToOne
    private NotaEntity nota;

    /*----------------------------------------------------------*/

    public CategoriaEntity() {
    }

    public CategoriaEntity(Long idCategoria, String nombre, NotaEntity nota) {
        this.idCategoria = idCategoria;
        this.nombre = nombre;
        this.nota = nota;
    }

    public Long getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Long idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public NotaEntity getNota() {
        return nota;
    }

    public void setNota(NotaEntity nota) {
        this.nota = nota;
    }
}
