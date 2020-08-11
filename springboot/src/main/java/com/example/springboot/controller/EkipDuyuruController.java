package com.example.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot.model.EkipDuyuru;
import com.example.springboot.service.EkipDuyuruService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController


public class EkipDuyuruController {
	@Autowired
	private EkipDuyuruService ekipduyuruService;
	
	@GetMapping("/EkipDuyuru")
	public ResponseEntity<List<EkipDuyuru>>getAllEkipDuyuru(){
		return ResponseEntity.ok().body(ekipduyuruService.getAllEkipDuyuru());
	}
	@GetMapping("/EkipDuyuru/{id}")
	public ResponseEntity<EkipDuyuru>getEkipDuyuruById(@PathVariable long id){
		return ResponseEntity.ok().body(ekipduyuruService.getEkipDuyuruById(id));
	}
	
	@PostMapping("/EkipDuyuru")
	public ResponseEntity<EkipDuyuru>createEkipDuyuru(@RequestBody EkipDuyuru ekipduyuru){
		return ResponseEntity.ok().body(ekipduyuruService.EkipDuyuru(ekipduyuru));
		
	}
	
	@PutMapping("/EkipDuyuru/{id}")
	public ResponseEntity<EkipDuyuru> updateEkipDuyuru(@PathVariable long id,@RequestBody EkipDuyuru ekipduyuru){
		ekipduyuru.setId(id);
		return ResponseEntity.ok().body(ekipduyuruService.updateEkipDuyuru(ekipduyuru));
	}
	
	@DeleteMapping("/EkipDuyuru/{id}")
	public HttpStatus deleteEkipDuyuru(@PathVariable long id) {
	    this.ekipduyuruService.deleteEkipDuyuru(id);
	    return HttpStatus.OK;
	}

}
