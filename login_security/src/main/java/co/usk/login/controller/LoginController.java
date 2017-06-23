package co.usk.login.controller;

import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String executeSecurity(ModelMap model, Principal principal) {

		String name = principal.getName();
		model.addAttribute("author", name);
		return "welcome";
	}
	
	@RequestMapping(value="/error", method = RequestMethod.POST)
	public String showError(ModelMap model)
	{
		return "login";
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(ModelMap model) {
		return "login";

	}

	@RequestMapping(value = "/fail2login", method = RequestMethod.GET)
	public String loginerror(ModelMap model) {
		model.addAttribute("error", "true");
		return "login";

	}

	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout(ModelMap model) {

		return "login";

	}
}
