package com.uca.capas.segundaTarea.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AlumnoController {
	
	@RequestMapping("/alumno")
	public @ResponseBody String datosAlumno() {
		
		String styles = 
				"<style>\r\n" + 
				"table {\r\n" + 
				"  font-family: arial, sans-serif;\r\n" + 
				"  border-collapse: collapse;\r\n" + 
				"  max-width: 50%;\r\n" + 
				"  margin: 0 auto;" +
				"}\r\n" + 
				"\r\n" + 
				"td, th {\r\n" + 
				"  border: 1px solid #dddddd;\r\n" + 
				"  text-align: left;\r\n" + 
				"  padding: 8px;\r\n" + 
				"}\r\n" + 
				"td.datos{ text-align: center}"+
				"\r\n" + 
				"tr:nth-child(even) {\r\n" + 
				"  background-color: #dddddd;\r\n" + 
				"}\r\n" + 
				"</style>";
		
		String titulo = "<h2 style=\"text-align: center; font-family: sans-serif\">Datos del estudiante</h2>";
		
		String HTMLEmbed = 
				"<table>\r\n" + 
				"  <tr>\r\n" + 
				"    <td>Nombre:</td>\r\n" + 
				"    <td class=\"datos\">Antonio</td>\r\n" + 
				"  </tr>\r\n" + 
				"  <tr>\r\n" + 
				"    <td>Apellido:</td>\r\n" + 
				"    <td class=\"datos\">Pertuz</td>\r\n" + 
				"  </tr>\r\n" + 
				"  <tr>\r\n" + 
				"    <td>Carnet:</td>\r\n" + 
				"    <td class=\"datos\">00267016</td>\r\n" + 
				"  </tr>\r\n" + 
				"  <tr>\r\n" + 
				"    <td>Carrera:</td>\r\n" + 
				"    <td class=\"datos\">Ing. Informática</td>\r\n" + 
				"  </tr>\r\n" + 
				"  <tr>\r\n" + 
				"    <td>Año:</td>\r\n" + 
				"    <td class=\"datos\">5to</td>\r\n" + 
				"  </tr>\r\n" + 
				"</table>";
		
		return styles + titulo + HTMLEmbed;
	}
}
