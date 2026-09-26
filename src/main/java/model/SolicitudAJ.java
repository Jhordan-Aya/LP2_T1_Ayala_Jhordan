package model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "tbl_solicitud")
public class SolicitudAJ {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "nro_solicitud")
	private int nroSolicitud;

	@ManyToOne
	@JoinColumn(name = "id_actividad")
	private ActividadAJ actividad;

	@Column(name = "estado")
	private String estado;

	@Column(name = "archivo_adjunto")
	private String archivoAdjunto;

	@Column(name = "fecha_reg")
	private LocalDateTime fechaReg;
}