package com.company.billing.utils;

import java.util.ResourceBundle;

public interface ConfigReader {
	String USERID = "userid";
	String PWD = "password";
	String DBURL = "dburl";
	String DRIVER = "driver";
	String BROWSE_PATH = "upload_path";
	ResourceBundle rb = ResourceBundle.getBundle("config");
}
