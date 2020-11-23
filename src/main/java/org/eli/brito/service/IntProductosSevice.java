package org.eli.brito.service;

import java.util.List;

import org.eli.brito.model.Producto;

public interface IntProductosSevice {
	
	public List<Producto> ObtenerTodos();
	public void guardar(Producto producto);
	public void eliminar(Integer idProducto);
	public Producto buscarPorId(Integer idProducto);
	
}
