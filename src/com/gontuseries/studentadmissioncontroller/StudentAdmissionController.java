package com.gontuseries.studentadmissioncontroller;
import java.sql.Date;
import java.text.SimpleDateFormat;
import javax.validation.Valid;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class StudentAdmissionController{
	
	
	@InitBinder
	public void initBinder(WebDataBinder binder)
	{
		
		SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy****MM****dd");
		binder.registerCustomEditor(Date.class,"studentDOB",new CustomDateEditor(simpleDateFormat, false));
		binder.registerCustomEditor(String.class,"studentName", new StudentNameEditor());
	}
	
	@ModelAttribute
	public void addCommonMsg(Model model)
	{
		model.addAttribute("headerMsg","Gontu College Of Engineering, Amsterdam");
		model.addAttribute("headerMsgg","Prateek College Of Engineering, Pune");
	}
	
	@RequestMapping(value="/admissionform.html", method=RequestMethod.GET)
	public ModelAndView getAdmissionForm(){
		ModelAndView modelAndView=new ModelAndView("AdmissionForm");
		//modelAndView.addObject("headerMsg","Gontu College Of Engineering, Amsterdam");
		return modelAndView;
	}
	@RequestMapping(value="/submitadmissionform.html", method=RequestMethod.POST)
	public ModelAndView submitAdmissionForm(@ModelAttribute("student1") @Valid Student student,BindingResult bindingResult) {
		
		/*for (String p : student.getStudentskills()) {
			System.out.println(p);
		}*/
		if(bindingResult.hasErrors())
		{
			ModelAndView modelAndView=new ModelAndView("AdmissionForm");
			System.out.println(bindingResult.toString());
			return modelAndView;
		}
		ModelAndView modelAndView=new ModelAndView("AdmissionSuccess");
		//modelAndView.addObject("headerMsg","Gontu College Of Engineering, Amsterdam");
		
		return modelAndView;
	}

}