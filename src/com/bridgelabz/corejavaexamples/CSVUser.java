package com.bridgelabz.corejavaexamples;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CSVUser {

import com.opencsv.bean.CsvBindByName;
	
	
import com.opencsv.bean.CsvBindByName;

public class CSVUser {

    @CsvBindByName
    private String name;

    @CsvBindByName(column = "EMAIL", required = true)
    private String email;

    @CsvBindByName
    private String phone;

    @CsvBindByName
    private String country;

    @Override
    public String toString() {
        return "CSVUser{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", country='" + country + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}
	    @CsvBindByName
	    private String name;

	    @CsvBindByName(column = "EMAIL", required = true)
	    private String email;

	    @CsvBindByName
	    private String phone;

	    @CsvBindByName
	    private String country;

	    @Override
	    public String toString() {
	        return "CSVUser{" +
	                "name='" + name + '\'' +
	                ", email='" + email + '\'' +
	                ", phone='" + phone + '\'' +
	                ", country='" + country + '\'' +
	                '}';
	    }

	    public String getName() {
	        return name;
	    }

	    public String getEmail() {
	        return email;
	    }
	}