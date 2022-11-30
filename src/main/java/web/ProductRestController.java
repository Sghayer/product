package web;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import entities.product;
import repositories.product_repository;

@RestController
public class ProductRestController {
	private product_repository productRepository;

	public ProductRestController(product_repository productRepository) {
		super();
		this.productRepository = productRepository;
	}
	
	@GetMapping (path = "/products")
	public List<product> listproducts(){
		return productRepository.findAll();
	}
	
	@GetMapping (path = "/products/{id}")
	public product getProduct(@PathVariable(name="id")Long id){
		return productRepository.findById(id).get();
	}
	
	@PostMapping (path = "/products")
	public product save(@RequestBody product product){
		return productRepository.save(product);
	}
	
	@PutMapping (path = "/products/{id}")
	public product update(@PathVariable String Name,@RequestBody product product){
		product.setName(Name);
		return productRepository.save(product);
	}
	
	@DeleteMapping (path = "/products/{id}")
	public  void delete(@PathVariable Long id){
		 productRepository.deleteById(id);
	}


}
