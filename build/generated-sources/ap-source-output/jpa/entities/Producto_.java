package jpa.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jpa.entities.Factura;
import jpa.entities.Proveedor;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2022-08-15T00:14:59")
@StaticMetamodel(Producto.class)
public class Producto_ { 

    public static volatile SingularAttribute<Producto, String> marca;
    public static volatile SingularAttribute<Producto, byte[]> foto;
    public static volatile SingularAttribute<Producto, String> serial;
    public static volatile SingularAttribute<Producto, Proveedor> idProveedor;
    public static volatile SingularAttribute<Producto, Integer> idProducto;
    public static volatile SingularAttribute<Producto, String> nombreProd;
    public static volatile SingularAttribute<Producto, Integer> cantidad;
    public static volatile CollectionAttribute<Producto, Factura> facturaCollection;

}