package com.example.demo.entity;

import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Where(clause = "status = 0")
@SQLDelete(sql = "UPDATE application SET  status = 1 WHERE id=?")
public class Arrendador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String tipoUsuario;
    private String nombreUsuario;
    private String contraseña;
    private String correoElectronico;
    private String fincasArrendadas;
    private int ubicacionBusqueda;
    private String estadoSolicitudArrendamiento;
    private String pagoArriendo;
    private int calificacionFinca; 
    private int calificacionArrendatario;
}
