package com.mybatis.generator.util;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.exception.InvalidConfigurationException;
import org.mybatis.generator.exception.XMLParserException;
import org.mybatis.generator.internal.DefaultShellCallback;

public class MyBatisGeneratorTool {
	
	public static void main(String[] args) {
		
		
		System.out.println(">>>>------------------MyBatisGeneratorTool start....");
		
		List<String> warnings = new ArrayList<String>();
		boolean overwrite = true;
		String genCfg = "/generatorConfig.xml"; // 
		File configFile = new File(MyBatisGeneratorTool.class.getResource(genCfg).getFile());
		
		//File configFile = new File("D:/ylink/myeclipse/MBG/src/com/yuan/mybatis/mbg/util/generatorConfig.xml");
		ConfigurationParser cp = new ConfigurationParser(warnings);
		Configuration config = null;
		try {
			config = cp.parseConfiguration(configFile);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (XMLParserException e) {
			e.printStackTrace();
		}
		DefaultShellCallback callback = new DefaultShellCallback(overwrite);
		MyBatisGenerator myBatisGenerator = null;
		try {
			myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
		} catch (InvalidConfigurationException e) {
			e.printStackTrace();
		}
		try {
			myBatisGenerator.generate(null);
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(">>>>------------------MyBatisGeneratorTool end....");
		
		
	}
}
