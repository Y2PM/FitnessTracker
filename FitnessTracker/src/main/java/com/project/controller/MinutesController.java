package com.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.project.model.Exercise;

@Controller
public class MinutesController {

	@RequestMapping(value = "/addMinutes")
	public String addMinutes(@ModelAttribute("exercise") Exercise exercise) {

		System.out.println("excercise: " + exercise.getMinutes());

		return "addMinutes";
	}
	
	/*@RequestMapping(value = "/addMinutes")
	public String addMinutes(@ModelAttribute("exercise") Exercise exercise) {

		System.out.println("excercise: " + exercise.getMinutes());

		return "redirect:addMoreMinutes.html";
	}*/
	
	/*@RequestMapping(value = "/addMinutes")
	public String addMinutes(@ModelAttribute("exercise") Exercise exercise) {

		System.out.println("excercise: " + exercise.getMinutes());

		return "forward:addMoreMinutes.html";
	}*/

	/*@RequestMapping(value = "/addMoreMinutes")
	public String addMoreMinutes(@ModelAttribute("exercise") Exercise exercise) {

		System.out.println("excercising: " + exercise.getMinutes());

		return "addMinutes";
	}*/
}
