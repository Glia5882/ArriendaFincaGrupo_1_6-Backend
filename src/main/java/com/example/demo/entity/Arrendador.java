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
    private String NombreUsuario;
    private String CorreoElectronico;
    private String FincasArrendadas;
    private int UbicacionBusqueda;
    private String EstadoSolicitudArrendamiento;
    private String PagoArriendo;
    private int CalificacionFinca; 
    private int CalificacionArrendatario;
}
