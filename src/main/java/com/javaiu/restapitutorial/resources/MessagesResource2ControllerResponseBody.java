/*package com.javaiu.restapitutorial.resources;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.javaiu.restapitutorial.services.MessagesService;


@Produces(MediaType.TEXT_PLAIN)
@Controller
public class MessagesResource2ControllerResponseBody {

	    @Autowired
	    MessagesService MessagesService;	    
		@RequestMapping("/messages")
		public @ResponseBody String getMessages() {
			return MessagesService.getMessages();
		}	
		
		@RequestMapping("/hi")
		public @ResponseBody String hiThere() {
			return "Hi There!";
		}
}

*/