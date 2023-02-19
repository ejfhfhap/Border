package com.sam.main.border;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.sam.main.util.Pager;

@Controller
@RequestMapping("/border/*")
public class BorderController {
	
	@Autowired
	BorderService borderService;
	
	@RequestMapping(value = "/update", method = RequestMethod.GET)
	public ModelAndView setBorderUpdate(BorderDTO borderDTO) {
		ModelAndView modelAndView = new ModelAndView();
		
		borderDTO = borderService.getBorderDetail(borderDTO);
		
		modelAndView.addObject("borderDTO", borderDTO);
		modelAndView.setViewName("/border/update");
		
		return modelAndView;
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public ModelAndView setBorderUpdate(BorderDTO borderDTO, ModelAndView modelAndView, MultipartFile multipartFile) throws Exception {
		
		int result = borderService.setBorderUpdate(borderDTO,multipartFile);
		
		modelAndView.setViewName("redirect: ./list");
		return modelAndView;
	}
	
	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public ModelAndView setBorderDelete(BorderDTO borderDTO) {
		ModelAndView modelAndView = new ModelAndView();
		
		int result = borderService.setBorderDelete(borderDTO);
		
		modelAndView.setViewName("redirect: ./list");
		return modelAndView;
	}
	
	@RequestMapping(value = "/detail", method = RequestMethod.GET)
	public ModelAndView getBorderDetail(BorderDTO borderDTO) {
		ModelAndView modelAndView = new ModelAndView();

		borderDTO = borderService.getBorderDetail(borderDTO);
		modelAndView.addObject("borderDTO", borderDTO);
		System.out.println("img " + borderDTO.getBorderImgDTO());
		
		modelAndView.setViewName("/border/detail");
		return modelAndView;
	}
	
	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public ModelAndView setBorderAdd() {
		ModelAndView modelAndView = new ModelAndView();
		
		modelAndView.setViewName("/border/add");
		
		return modelAndView;
	}
	
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public ModelAndView setBorderAdd(BorderDTO borderDTO,MultipartFile multipartFile) throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		
		borderDTO.setMemberId("leejuhu"); // 멤버 아이디 로그인 회원으로 바껴야함
		borderService.setBorderAdd(borderDTO,multipartFile);
		
		modelAndView.setViewName("redirect: ./list");
		return modelAndView;
	}
	
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
