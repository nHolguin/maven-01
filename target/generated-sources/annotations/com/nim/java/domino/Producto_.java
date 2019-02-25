package com.nim.java.domino;

import java.sql.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Producto.class)
public abstract class Producto_ {

	public static volatile SingularAttribute<Producto, Date> fechaCrear;
	public static volatile SingularAttribute<Producto, Integer> idProducto;
	public static volatile SingularAttribute<Producto, Double> precioProducto;
	public static volatile SingularAttribute<Producto, Double> cantidadProducto;
	public static volatile SingularAttribute<Producto, String> nombreProducto;
	public static volatile SingularAttribute<Producto, Date> fechaActualizar;

}

