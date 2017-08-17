package com.gontuseries.studentadmissioncontroller;

import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class DayOfWeekBasedAccessInterceptor extends HandlerInterceptorAdapter{
	
	@Override
	public boolean preHandle(HttpServletRequest httpServletRequest,HttpServletResponse httpServletResponse,Object handler )throws Exception
	{
		Calendar calendar=Calendar.getInstance();
		int dayOfWeek=calendar.get(calendar.DAY_OF_WEEK);
		if(dayOfWeek==1)
		{
			httpServletResponse.getWriter().write("Closed on Sunday");
			return false;
		}
		return true;
		
	}
}
