package com.harsh.utility;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {
	private static final Log LOG=LogFactory.getLog(LoggingAspect.class);
	public void logExceptionFromRepository(Exception exception) {
			LOG.error(exception.getMessage());
	}
	public void logExceptionFromService(Exception exception) {
		LOG.error(exception.getMessage());
	}

}
