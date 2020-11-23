package org.eli.brito.service;

import java.util.List;
import java.util.Optional;

import org.eli.brito.model.Producto;
import org.eli.brito.repository.ProductosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductosServiceImp implements IntProductosSevice {
	
	@Autowired
	private ProductosRepository repoProductos;

	@Override
	public List<Producto> ObtenerTodos() {
		// TODO Auto-generated method stub
		List<Producto> lista =  repoProductos.findAll();
		return lista;
	}

	@Override
	public void guardar(Producto producto) {
		// TODO Auto-generated method stub
		repoProductos.save(producto);
		
	}

	@Override
	public void eliminar(Integer idProducto) {
		// TODO Auto-generated method stub
		repoProductos.deleteById(idProducto);
		
	}

	@Override
	public Producto buscarPorId(Integer idProducto) {
		// TODO Auto-generated method stub
		 Optional<Producto> optional =  repoProductos.findById(idProducto);
		 if( optional.isPresent()) {
			 return optional.get();
	}
		 return null;
	}
}

