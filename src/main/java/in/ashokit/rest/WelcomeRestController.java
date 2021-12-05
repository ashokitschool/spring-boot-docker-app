package in.ashokit.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {

	private Logger logger = LoggerFactory.getLogger(WelcomeRestController.class);

	public WelcomeRestController() {
		logger.info("***** WelcomeRestController::Constructor *****");
	}

	@GetMapping(value = "/welcome/{name}")
	public String welcomeMsg(@PathVariable("name") String name) {
		logger.info("***** welcomeMsg() execution start *****");
		String msg = name + ", Welcome to Ashok IT..!!";
		logger.info("***** welcomeMsg() execution end *****");
		return msg;
	}
}
