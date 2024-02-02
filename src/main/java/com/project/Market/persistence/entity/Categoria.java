package com.project.Market.persistence.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "categorias")
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_categoria")
    private Integer idCtaegoria;
    private String descripcion;
    private Boolean estado;

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    @OneToMany(mappedBy = "categoria")
    private List<Producto> productos;

    public Integer getIdCtaegoria() {
        return idCtaegoria;
    }

    public void setIdCtaegoria(Integer idCtaegoria) {
        this.idCtaegoria = idCtaegoria;
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
}
