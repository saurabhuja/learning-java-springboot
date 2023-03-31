package training.oracle.springbootlogging;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
public class LoggingController {

	Logger logger = LoggerFactory.getLogger(LoggingController.class);
	
	@RequestMapping("/")
	public String index() {
		logger.trace("A Trace Message");
		logger.debug("A Debug Message");
		logger.info(" An Infor Message");
		logger.warn("A Warning Message");
		logger.error("An Error Message");
		
		return "Hello Friends, ! Check the Logs ... ";
	}
}