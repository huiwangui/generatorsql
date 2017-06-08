package com.boco.test;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

public class GeneratorSql {
	 private static final Logger LOG = Logger.getLogger(GeneratorSql.class);  
	 public void generator() throws Exception{  
        List<String> warnings = new ArrayList<String>();  
        boolean overwrite = true;  
        //加载配置文件  
        File configFile = new File("generatorConfig.xml");   
        ConfigurationParser cp = new ConfigurationParser(warnings);  
        Configuration config = cp.parseConfiguration(configFile);  
        DefaultShellCallback callback = new DefaultShellCallback(overwrite);  
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config,  
                callback, warnings);  
        myBatisGenerator.generate(null);  
      }   
	    public static void main(String[] args) throws Exception {  
	    	/*LOG.debug("This is debug message."); 
	    	 // 记录info级别的信息 
	    	LOG.info("This is info message."); 
	    	 // 记录error级别的信息 
	    	LOG.error("This is error message."); */
	        try {  
	        	GeneratorSql generatorSqlmap = new GeneratorSql();  
	            generatorSqlmap.generator();  
	        } catch (Exception e) {  
	            e.printStackTrace();  
	        }   
	    	 
	    }  
}
