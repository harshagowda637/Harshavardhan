package com.example.demo.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.Model.Vechicles;

public interface VechicalRepo extends JpaRepository<Vechicles, Integer>{
	
	@Query(value = "select * from Vechicles",nativeQuery=true)
	List<Vechicles>findAllVechicleData();
	
	@Query(value = "select * from Vechicles where vcolor=?1",nativeQuery = true)
	List<Vechicles>findVechicleByVcolor(String vcolor);
	
	@Query(value = "select * from Vechicles order by vprice",nativeQuery = true)
	List<Vechicles> findVechicleBySortVprice();
	
	@Query(value = "select * from Vechicles where vprice>=?1",nativeQuery = true)
	List<Vechicles> findVechicleByVprice(Double vprice);
	
	@Query(value = "select * from Vechicles where vprice=(select vprice from Vechicles group by vprice having count(vprice)>1 )order by vcolor  ",nativeQuery = true)
	List<Vechicles> findVechicleBySortVcolor();

}
