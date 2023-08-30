package com.carritodecompras.servicieimplementations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carritodecompras.model.ProductoCarrito;
import com.carritodecompras.model.Usuario;
import com.carritodecompras.repositories.ProductoCarritoRepository;
import com.carritodecompras.repositories.UsuarioRepository;
import com.carritodecompras.servicies.ClienteServices;

@Service
public class ClienteServicesImpl implements ClienteServices {

	@Override
	public void crearCuenta(Usuario cliente) {
	
		usuarioRepository.save(cliente);
	}


	@Override
	public Boolean existsByEmail(String email) {
		
		return usuarioRepository.existsByCorreoElectronico(email);

	}
	

	@Override
	public List<ProductoCarrito> getProductosByCliente(Long id) {
		
		cliente.setId(id);
		return productoCarritoRepository.findByCliente(cliente);
	}
	
	
	@Autowired
	private Usuario cliente;

	@Autowired
	private UsuarioRepository usuarioRepository;

	@Autowired
	private ProductoCarritoRepository productoCarritoRepository;

}
