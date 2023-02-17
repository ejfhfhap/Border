package com.sam.main.border;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sam.main.util.Pager;

@Controller
@RequestMapping("/border/*")
public class BorderController {
	
	@Autowired
	BorderService borderService;
	
	@RequestMapping(value = "/list")
	public ModelAndView getBorderList(Pager pager) {
		ModelAndView modelAndView = new ModelAndView();
		

		List<BorderDTO> borderDTOs = borderService.getBorderList(pager);
		modelAndView.addObject("borderDTOs", borderDTOs);
		modelAndView.addObject("pager", pager);
		
		modelAndView.setViewName("/border/list");
		return modelAndView;
	}
	
}
