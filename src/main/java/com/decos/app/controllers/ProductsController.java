package com.decos.app.controllers;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.decos.app.AppApplication;
import com.decos.app.data.ProductoRepository;
import com.decos.app.dto.Producto;


@Controller
public class ProductsController {
	
	private static final Logger log = LoggerFactory.getLogger(AppApplication.class);
	
	@Autowired
	private ProductoRepository productoData;
	
	@RequestMapping(value = "/addNewProduct.html", method = RequestMethod.POST)
	public String nuevoProducto(Producto producto) {

		productoData.save(producto);
		return ("redirect:/listProducts.html");

	}

	@RequestMapping(value = "/addNewProduct.html", method = RequestMethod.GET)
	public ModelAndView addNewEmployee() {

		Producto pro = new Producto();
		return new ModelAndView("newProduct", "form", pro);

	}

	@RequestMapping(value = "/listProducts.html", method = RequestMethod.GET)
	public ModelAndView products() {
		List<Producto> allProducts = productoData.findAll();
		return new ModelAndView("allProducts", "products", allProducts);

	}
	
	@RequestMapping(value = "/deleteProduct/{id}", method = RequestMethod.GET)
	public void deleteProduct(@PathVariable String id) {
		log.info("Id: " + id);
		/*
		productoData.delete(productId);
		return ("redirect:/listProducts.html");
		*/
	}
	
	@RequestMapping("/welcome.html")
	public ModelAndView firstPage() {
		return new ModelAndView("welcome");
	}
	
}
