package com.service;

import java.sql.SQLException;
import java.sql.Statement;

import com.db.DB;
import com.model.Doctor;

public class doctorServiceImpl implements doctorService{

	@Override
	public void doctorInformation(Doctor d) {
		String sql = "insert into doctor (name,emailid,specialization,address,mobile,gender,note) vaues ('"+d.getName()+"','"+d.getEmailId()+"','"+d.getSpecialization()+"','"+d.getAddress()+"','"+d.getMobile()+"','"+d.getGender()+"','"+d.getNote()+"')";
				
		try {
			Statement st = DB.getConnection().createStatement();
			st.execute(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	}
			
	

