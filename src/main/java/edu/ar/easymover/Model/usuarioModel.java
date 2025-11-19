package edu.ar.easymover.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "usuarios")
public class UsuarioModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nombre;
    private String apellido;
    private String email;
    private String telefono;
    private String direccion;

    // ==========================
    //     RELACIÓN 1:N
    // ==========================
    @OneToMany(mappedBy = "usuario")
    private List<Viaje> viajes;

    // ==========================
    //     CONSTRUCTORES
    // ==========================

    public UsuarioModel() {}

    public UsuarioModel(Integer id, String nombre, String apellido, String email,
                        String telefono, String direccion) {

        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    // ==========================
    //          GETTERS
    // ==========================

    public Integer getId() { return id; }
    public String getNombre() { return nombre; }
    public String getApellido() { return apellido; }
    public String getEmail() { return email; }
    public String getTelefono() { return telefono; }
    public String getDireccion() { return direccion; }
    public List<Viaje> getViajes() { return viajes; }

    // ==========================
    //          SETTERS
    // ==========================

    public void setId(Integer id) { this.id = id; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setApellido(String apellido) { this.apellido = apellido; }
    public void setEmail(String email) { this.email = email; }
    public void setTelefono(String telefono) { this.telefono = telefono; }
    public void setDireccion(String direccion) { this.direccion = direccion; }
    public void setViajes(List<Viaje> viajes) { this.viajes = viajes; }
}