package org.opusdavei;

import java.io.IOException;
import java.util.Properties;

import org.jbpm.task.service.DefaultUserInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Extends DefaultUserInfo to load user.properties from the classpath automatically
 * 
 * @author David Murphy
 *
 */
public class DemoUserInfo extends DefaultUserInfo {
	
	/** Logger */
	private static Logger LOG = LoggerFactory.getLogger(DemoUserInfo.class);
	
	/**
	 * Get the user.properties file from the application classpath
	 * @return
	 */
	private static final Properties getProperties(){
		Properties properties = new Properties();
		try {
			properties.load(DemoUserInfo.class.getResourceAsStream("/userinfo.properties"));
		} catch (IOException e) {
			LOG.warn("Could not load user properties", e);
			// clean up
			properties = new Properties();
		}
		return properties;
	}

	/**
	 * Instantiate with user properties loaded from the classpath
	 */
	public DemoUserInfo() {
		super(getProperties());
	}
	
	
}
