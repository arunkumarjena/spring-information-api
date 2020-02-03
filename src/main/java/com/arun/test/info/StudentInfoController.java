package com.arun.test.info;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentInfoController {
	@Autowired
	private InfoService infoService;
	@RequestMapping("/info")
	public List<Information> getAllInfo() {
		return infoService.getAllInfo();
	}
	@RequestMapping("/info/{id}")
	public Optional<Information> getInfo(@PathVariable String id) {
		return infoService.getInfo(id);
	}
	@RequestMapping(method = RequestMethod.POST, value="/info")
	public void addStudent(@RequestBody Information infos) {
		infoService.addStudent(infos);
		
	}
	@RequestMapping(method = RequestMethod.PUT, value="/info/{id}")
	public void updateStudent(@RequestBody Information infos, @PathVariable String id) {
		infoService.updateStudent(id, infos);
		
	}
	@RequestMapping(method = RequestMethod.DELETE, value="/info/{id}")
	public void deleteStudent(@PathVariable String id) {
		infoService.deleteStudent(id);
		
	}
	
}
