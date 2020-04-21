package com.uca.capas.segundaTarea.controller;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class fechaController {
	@RequestMapping("/fecha")
	public @ResponseBody String fecha(HttpServletRequest request) {
		
		Calendar cal = Calendar.getInstance();
		DayOfWeek[] dayOfWeeks = DayOfWeek.values();
		
		Integer day = Integer.parseInt(request.getParameter("dia"));
		Integer month = Integer.parseInt(request.getParameter("mes"));
		Integer year = Integer.parseInt(request.getParameter("anio"));
		
		try {
			LocalDate localDate 
	        = LocalDate.of(year, 
	                       month, day);
			
			DayOfWeek dayOfWeek = DayOfWeek.from(localDate);
			
			return dayOfWeek.name();
			
		}catch(Exception e) {
			return "Hubo un problema con los parametros, revise que "
					+ "estén en el formato: fecha?dia=20&mes=04&anio=2020 y que "
					+ "tengan la cantidad de digitos permitidos en una fecha";
		}
		
	}
}
