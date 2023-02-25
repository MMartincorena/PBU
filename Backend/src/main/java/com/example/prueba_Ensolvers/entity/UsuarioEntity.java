package com.example.prueba_Ensolvers.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "Usuarios")
public class UsuarioEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_Usuario")
    private Long idUsuario;

    @Column(name = "Nombre")
    private String nombre;

    @Column(name = "email", nullable = false, length = 200)
    private String email;

    @Column(name = "contrasenia", nullable = false, length = 200)
    private String contrasenia;

    @OneToMany(mappedBy = "usuario")
    List<NotaEntity> nota;

    public UsuarioEntity() {
    }

    public UsuarioEntity(Long idUsuario, String nombre, String email, String contrasenia, List<NotaEntity> nota) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.email = email;
        this.contrasenia = contrasenia;
        this.nota = nota;
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
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

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public List<NotaEntity> getNota() {
        return nota;
    }

    public void setNota(List<NotaEntity> nota) {
        this.nota = nota;
    }
}
