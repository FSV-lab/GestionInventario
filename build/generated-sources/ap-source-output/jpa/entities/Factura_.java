package jpa.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jpa.entities.Cliente;
import jpa.entities.DetalleVenta;
import jpa.entities.Producto;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2022-08-15T00:14:59")
@StaticMetamodel(Factura.class)
public class Factura_ { 

    public static volatile SingularAttribute<Factura, Double> totalFactura;
    public static volatile SingularAttribute<Factura, Cliente> idCliente;
    public static volatile SingularAttribute<Factura, Producto> idProducto;
    public static volatile SingularAttribute<Factura, Integer> idOrden;
    public static volatile CollectionAttribute<Factura, DetalleVenta> detalleVentaCollection;

}