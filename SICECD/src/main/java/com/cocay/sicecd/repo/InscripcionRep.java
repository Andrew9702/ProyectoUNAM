package com.cocay.sicecd.repo;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.cocay.sicecd.model.Inscripcion;
import com.cocay.sicecd.model.Test;

@Repository
public interface InscripcionRep extends PagingAndSortingRepository<Inscripcion, Integer>{
	List<Test> findByName(String name);

}
