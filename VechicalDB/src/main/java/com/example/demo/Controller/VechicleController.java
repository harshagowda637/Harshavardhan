package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Vechicles;
import com.example.demo.Service.VechicalService;

@RestController
public class VechicleController {
	@Autowired
	VechicalService service;
	@PostMapping("/addVechicaldetails")
	ResponseEntity<Vechicles>addVechical(@RequestBody Vechicles v)
	{
		return new ResponseEntity<Vechicles>(service.addVechicaldetails(v),HttpStatus.CREATED);
	}
	
	@DeleteMapping("/deleteVechicleById")
	ResponseEntity<Vechicles> deleteById(@RequestHeader Integer vid)
	{
		return new ResponseEntity<Vechicles>(service.deleteVechicleById(vid),HttpStatus.OK);
	}
	
  @GetMapping("/getAllVechicleData")
  ResponseEntity<List<Vechicles>>getAllData()
  {
	  return new ResponseEntity<List<Vechicles>>(service.getAllVechicleData(),HttpStatus.FOUND);
  }
  @GetMapping("/getVechicleByVid")
  ResponseEntity<Vechicles>getByVid(@RequestHeader Integer vid)
  {
  return new ResponseEntity<Vechicles>(service.getVechicleByVid(vid),HttpStatus.FOUND);
  }
  
  @GetMapping("/getVechicleByVcolor")
 ResponseEntity<List<Vechicles>>getByVcolor(@RequestHeader String vcolor)
  {
	  return new ResponseEntity<List<Vechicles>>(service.getVechicleByVcolor(vcolor),HttpStatus.FOUND);
	  
 }
  
 @GetMapping("/getVechicleBySortVprice")
  ResponseEntity<List<Vechicles>>getBySortVprice()
  {
	  return new  ResponseEntity<List<Vechicles>>(service.getVechicleBySortVprice(),HttpStatus.FOUND);
  }
 @PutMapping("/updateVechicleById")
 ResponseEntity<Vechicles>updateById(@RequestBody Vechicles v)
 {
	 
	 return new ResponseEntity<Vechicles>(service.updateVechicleById(v),HttpStatus.OK);
 }
 @GetMapping("/getVechicleByVprice")
 ResponseEntity<List<Vechicles>>getByVprice(@RequestBody Double vprice)
 {
	 return new ResponseEntity<List<Vechicles>>(service.getVechicleByVprice(vprice),HttpStatus.FOUND);
 }
 
 @GetMapping("/getVechicleBySortVcolor")
 ResponseEntity<List<Vechicles>>getBySortVcolor()
 {
	  return new  ResponseEntity<List<Vechicles>>(service.getVechicleBySortVcolor(),HttpStatus.FOUND);
 }
}
