package com.example.springboot.service;

import java.util.List;

import com.example.springboot.model.EkipDuyuru;

public interface EkipDuyuruService {
	EkipDuyuru createEkipDuyuru(EkipDuyuru ekipduyuru);
	
	EkipDuyuru updateEkipDuyuru(EkipDuyuru ekipduyuru);
	
	List<EkipDuyuru> getAllEkipDuyuru();
	
	EkipDuyuru getEkipDuyuruById(long ekipduyuruId);
	
	void deleteEkipDuyuru(long id);
	
}
