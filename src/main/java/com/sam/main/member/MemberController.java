package com.sam.main.member;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.sam.main.util.Pager;

@Controller
@RequestMapping(value = "/member/*")
public class MemberController {

	@Autowired
	MemberService memberService;
	@Autowired
	HttpSession httpSession;
	
	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public ModelAndView setMemberDelete(MemberDTO memberDTO) {
		ModelAndView modelAndView = new ModelAndView();
		
		int result = memberService.setMemberDelete(memberDTO);
		
		modelAndView.setViewName("redirect: ./list");
		return modelAndView;
	}
	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public ModelAndView setMemberLogout() {
		ModelAndView modelAndView = new ModelAndView();
		
		httpSession.invalidate();
		
		modelAndView.setViewName("redirect: ./list");
		return modelAndView;
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView setMemberLogin() {
		ModelAndView modelAndView = new ModelAndView();
		
		modelAndView.setViewName("/member/login");
		return modelAndView;
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ModelAndView setMemberLogin(MemberDTO memberDTO) {
		ModelAndView modelAndView = new ModelAndView();
		
		memberDTO = memberService.setMemberLogin(memberDTO);

		if(memberDTO != null) {
			httpSession.setAttribute("login", memberDTO);
		}
		
		modelAndView.setViewName("redirect: ./list");
		return modelAndView;
	}
	
	@RequestMapping(value = "/list")
	public ModelAndView getMemberList(Pager pager) {
		ModelAndView modelAndView = new ModelAndView();
		
		List<MemberDTO> memberDTOs = memberService.getMemberList(pager);
		modelAndView.addObject("memberDTOs", memberDTOs);
		modelAndView.addObject("pager", pager);
		
		modelAndView.setViewName("/member/list");
		return modelAndView;
	}
	
	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public ModelAndView setMemberAdd() {
		ModelAndView modelAndView = new ModelAndView();
		
		modelAndView.setViewName("/member/add");
		return modelAndView;
	}
	
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public ModelAndView setMemberAdd(MemberDTO memberDTO) {
		ModelAndView modelAndView = new ModelAndView();
		
		int result = memberService.setMemberAdd(memberDTO);
		
		modelAndView.setViewName("redirect: ./list");
		return modelAndView;
	}
	
	@RequestMapping(value = "/detail", method = RequestMethod.GET)
	public ModelAndView getMemberDetail(MemberDTO memberDTO) {
		ModelAndView modelAndView = new ModelAndView();
		
		memberDTO = memberService.getMemberDetail(memberDTO);
		modelAndView.addObject("memberDTO", memberDTO);
		
		modelAndView.setViewName("/member/detail");
		return modelAndView;
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.GET)
	public ModelAndView setMemberUpdate(MemberDTO memberDTO) {
		ModelAndView modelAndView = new ModelAndView();
		
		memberDTO = memberService.getMemberDetail(memberDTO);
		
		//System.out.println(memberDTO);
		modelAndView.addObject("memberDTO", memberDTO);
		modelAndView.setViewName("/member/update");
		
		return modelAndView;
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public ModelAndView setMemberUpdate(MemberDTO memberDTO, ModelAndView modelAndView) {
		
		int result = memberService.setMemberUpdate(memberDTO);
		
		modelAndView.setViewName("redirect: ./list");
		return modelAndView;
	}
}
