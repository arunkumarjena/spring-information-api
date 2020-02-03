package com.arun.test.info;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InfoService {
	@Autowired
	private InfoRepository infoRepository;
//	private List<Information> info = new ArrayList<>(Arrays.asList(
//			new Information("0071", "Arun Kumar Jena", "b.tech","cse"),
//			new Information("0072", "Mrutyunjaya", "b.tech","cse"),
//			new Information("0087", "Sudeep", "b.tech","cse"),
//			new Information("0069", "Sandeep", "b.tech","cse"),
//			new Information("0074", "Sidhant", "b.tech","cse")
//			));

	public List<Information> getAllInfo(){
//		return info;
		List<Information> sutdentinfo = new ArrayList<>(); 
		infoRepository.findAll()
		.forEach(sutdentinfo::add);
		return sutdentinfo;
	}
	public Optional<Information> getInfo(String id) {
//		return info.stream().filter(student_info -> student_info.getId().equals(id)).findFirst().get();
		return infoRepository.findById(id);
	}
	public void addStudent(Information infos) {
		infoRepository.save(infos);
		
	}
	public void updateStudent(String id, Information infos) {
//		for (int i = 0; i < info.size(); i++) {
//			Information inf = info.get(i);
//			if (inf.getId().equals(id)) {
//				info.set(i, infos);
//				return;
//			}
//		}
		infoRepository.save(infos);
		
	}
	public void deleteStudent(String id) {
//		info.removeIf(t -> t.getId().equals(id));
		infoRepository.deleteById(id);
		
	}
}
