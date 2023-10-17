package com.loja.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.loja.model.Porta;



@RestController
@RequestMapping("/Porta")
public class PortaController {
	
	public List<Porta> ListPorta = new ArrayList<Porta>();
	
	@GetMapping
	public ResponseEntity<List<Porta>> getAll() {
		return ResponseEntity.ok(ListPorta);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Porta> getByid(@PathVariable int id, @RequestBody Porta porta) {
		return ResponseEntity.ok(ListPorta.get(id));
	}
	
	@PostMapping
	public ResponseEntity<Porta> post(@RequestBody Porta porta) {
		ListPorta.add(porta);
		return ResponseEntity.status(HttpStatus.CREATED).body(porta);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Porta> put(@PathVariable int id, @RequestBody Porta PortaAtualzado) {
		ListPorta.remove(id);
		ListPorta.add(PortaAtualzado);
		return ResponseEntity.status(HttpStatus.CREATED).body(PortaAtualzado);
	}
	
	@DeleteMapping("/{id}")	
	public ResponseEntity<?> delete(@PathVariable int id) {
		ListPorta.remove(id);
		return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
	}	

}