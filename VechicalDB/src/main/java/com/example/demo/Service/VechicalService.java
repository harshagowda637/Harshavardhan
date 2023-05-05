package com.example.demo.Service;

import java.util.List;

import com.example.demo.Model.Vechicles;

public interface VechicalService {
 Vechicles addVechicaldetails(Vechicles v);
 Vechicles deleteVechicleById(Integer vid);
 List<Vechicles> getAllVechicleData();
 Vechicles getVechicleByVid(Integer vid);
 List<Vechicles>getVechicleByVcolor( String vcolor);
 List<Vechicles>getVechicleBySortVprice();
 Vechicles updateVechicleById(Vechicles v);
 List<Vechicles>getVechicleByVprice( Double vprice);
 List<Vechicles>getVechicleBySortVcolor();
}
