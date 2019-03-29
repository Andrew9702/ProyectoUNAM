package com.cocay.sicecd.repo;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.cocay.sicecd.model.Log_sys;
import com.cocay.sicecd.model.Test;

@Repository
public interface Log_sysRep extends PagingAndSortingRepository<Log_sys, Integer>{
	List<Test> findByName(String name);

}
