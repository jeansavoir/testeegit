package br.com.locadora.config;

import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

public class Main {

	public static void main(String[] args) {
		
		Configuration cfg = new AnnotationConfiguration().configure("br\\com\\locadora\\config\\mysql_hibernate.cfg.xml");
		
		
		new SchemaExport(cfg).create(true, true);
		
		
	}
	
	
	
}
