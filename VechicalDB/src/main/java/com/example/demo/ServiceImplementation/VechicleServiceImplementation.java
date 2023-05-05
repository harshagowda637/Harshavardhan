package com.example.demo.ServiceImplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Exception.DataNotFoundException;
import com.example.demo.Model.Vechicles;
import com.example.demo.Repo.VechicalRepo;
import com.example.demo.Service.VechicalService;
@Service
public class VechicleServiceImplementation implements VechicalService {
@Autowired
VechicalRepo repo;
	@Override
	public Vechicles addVechicaldetails(Vechicles v) {
		return repo.save(v);
	}

	@Override
	public Vechicles deleteVechicleById(Integer vid) {
		Vechicles v= repo.findById(vid).orElse(null);
		if(v!=null)
		{
			repo.deleteById(vid);
			return v;
		}
		else {
			throw new DataNotFoundException("Vechicles","id", vid);
		}
	}

	@Override
	public List<Vechicles> getAllVechicleData() {
		
		
		return repo.findAll();
	}

	@Override
	public Vechicles getVechicleByVid(Integer vid) {
		
		
			return repo.findById(vid).orElseThrow( ()-> new DataNotFoundException("Vechicles", "id", vid));
		}
		

	@Override
	public List<Vechicles> getVechicleByVcolor(String vcolor) {
		return repo.findVechicleByVcolor(vcolor);
	}

	@Override
	public List<Vechicles> getVechicleBySortVprice() {

		return repo.findVechicleBySortVprice();
	}

	@Override
	public Vechicles updateVechicleById(Vechicles v) 
	{
		Vechicles v1= repo.findById(v.getVid()).orElse(null);
		if(v1!=null)
		{
			v1.setVname(v.getVname());
			v1.setVprice(v.getVprice());
			v1.setVmodel(v.getVmodel());
			v1.setVcolor(v.getVcolor());
			return repo.save(v1);
		}
		else
		{
			throw new DataNotFoundException("Vechicles", "id", v.getVid());
		}
	}

	@Override
	public List<Vechicles> getVechicleByVprice(Double vprice) {
		
		return repo.findVechicleByVprice(vprice);
	}

	@Override
	public List<Vechicles> getVechicleBySortVcolor() {
		
		return repo.findVechicleBySortVcolor();
	}
}


