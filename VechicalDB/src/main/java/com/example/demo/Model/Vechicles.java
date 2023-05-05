package com.example.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Vechicles {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int vid;
	private String vname;
	private double vprice;
	private int vmodel;
	private String vcolor;
	public int getVid() {
		return vid;
	}
	public void setVid(int vid) {
		this.vid = vid;
	}
	public String getVname() {
		return vname;
	}
	public void setVname(String vname) {
		this.vname = vname;
	}
	public double getVprice() {
		return vprice;
	}
	public void setVprice(double vprice) {
		this.vprice = vprice;
	}
	public int getVmodel() {
		return vmodel;
	}
	public void setVmodel(int vmodel) {
		this.vmodel = vmodel;
	}
	public String getVcolor() {
		return vcolor;
	}
	public void setVcolor(String vcolor) {
		this.vcolor = vcolor;
	}
	@Override
	public String toString() {
		return "Vechicles [vid=" + vid + ", vname=" + vname + ", vprice=" + vprice + ", vmodel=" + vmodel + ", vcolor="
				+ vcolor + "]";
	}
	

}
