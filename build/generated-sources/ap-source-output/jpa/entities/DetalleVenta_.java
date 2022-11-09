package jpa.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jpa.entities.Factura;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2022-08-15T00:14:59")
@StaticMetamodel(DetalleVenta.class)
public class DetalleVenta_ { 

    public static volatile SingularAttribute<DetalleVenta, Date> fechaIngreso;
    public static volatile SingularAttribute<DetalleVenta, Double> precio;
    public static volatile SingularAttribute<DetalleVenta, Date> fechaEntrega;
    public static volatile SingularAttribute<DetalleVenta, Integer> idDetalleVenta;
    public static volatile SingularAttribute<DetalleVenta, Date> fechaReparacion;
    public static volatile SingularAttribute<DetalleVenta, Integer> idProducto;
    public static volatile SingularAttribute<DetalleVenta, Integer> cantidad;
    public static volatile SingularAttribute<DetalleVenta, Factura> idOrden;

}