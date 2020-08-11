package com.example.springboot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.springboot.exception.ResourceNotFoundException;
import com.example.springboot.model.EkipDuyuru;
import com.example.springboot.repository.EkipDuyuruRepository;

@Service
@Transactional

public class EkipDuyuruServicelmpl implements EkipDuyuruService {

	@Autowired
	private EkipDuyuruRepository ekipduyuruRepository;
	
	@Override
	public EkipDuyuru createEkipDuyuru(EkipDuyuru ekipduyuru) {
		
		return ekipduyuruRepository.save(ekipduyuru);
	}

	@Override
	public EkipDuyuru updateEkipDuyuru(EkipDuyuru ekipduyuru) {
		
	Optional<EkipDuyuru> ekipduyuruDb = this.ekipduyuruRepository.findById(ekipduyuru.getId());
	if(ekipduyuruDb.isPresent()) {
		EkipDuyuru ekipduyuruUpdate = ekipduyuruDb.get();
		ekipduyuruUpdate.setId(ekipduyuru.getId());
		ekipduyuruUpdate.setSalon(ekipduyuru.getSalon());	
		ekipduyuruUpdate.setKonu(ekipduyuru.getKonu());
		ekipduyuruUpdate.setTarih(ekipduyuru.getTarih());
		ekipduyuruRepository.save(ekipduyuruUpdate);
		return ekipduyuruUpdate;
			
	}
	else{
		throw new ResourceNotFoundException("Kayıt bulunamadı: " + ekipduyuru.getId());
	}
	}

	@Override
	public List<EkipDuyuru> getAllEkipDuyuru() {
		
		return this.ekipduyuruRepository.findAll();
	}

	@Override
	public EkipDuyuru getEkipDuyuruById(long ekipduyuruId) {
		Optional<EkipDuyuru> ekipduyuruDb = this.ekipduyuruRepository.findById(ekipduyuruId);
		
		if(ekipduyuruDb.isPresent()) {
		return ekipduyuruDb.get();
		}
		else{
			throw new ResourceNotFoundException("Kayıt bulunamadı: " + ekipduyuruId);
		}
	}

	@Override
	public void deleteEkipDuyuru(long ekipduyuruId) {
		Optional<EkipDuyuru> ekipduyuruDb = this.ekipduyuruRepository.findById(ekipduyuruId);
		if(ekipduyuruDb.isPresent()) {
			this.ekipduyuruRepository.delete(ekipduyuruDb.get());	
			
		}
		else{
			throw new ResourceNotFoundException("Kayıt bulunamadı: " + ekipduyuruId);
		}
			
	}

}
