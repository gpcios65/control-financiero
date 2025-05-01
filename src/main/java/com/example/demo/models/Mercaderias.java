package com.example.demo.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.Data;

@Entity
@Table(name = "mercaderias")
@Data
public class Mercaderias {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_mercaderia")
	private Integer id;

	@ManyToOne
	@JoinColumn(name = "id_marca")
	@NotNull
	private Marcas marca;

	@ManyToOne
	@JoinColumn(name = "id_impuesto") // aqui es el cambio
	@NotNull
	private TipoImpuesto impuesto;

	@Size(max = 100)
	@NotNull
	@Column(name = "descripcion")
	private String descripcion;

	@NotNull
	@DecimalMin(value = "0.0", inclusive = false)
	@Column(name = "precio_unitario")
	private Double precioUnitario;

	@NotNull
	@Min(0)
	@Column(name = "stock")
	private Integer stock;
}