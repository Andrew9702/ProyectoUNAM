package com.cocay.sicecd;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.cocay.sicecd.model.Profesor;
import com.cocay.sicecd.repo.ProfesorRep;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SicecdApplicationProfesorTests {

	@Autowired
	ProfesorRep profesor;

	@Test
	public void contextLoads() {
		Profesor prof = new Profesor();
		prof.setApellido_paterno("Barbosa");
		prof.setId_genero(1);
		prof.setFk_id_estado(1);
		prof.setFk_id_grado_profesor(2);
		prof.setFk_id_turno(2);

		profesor.save(prof);
	}

}
