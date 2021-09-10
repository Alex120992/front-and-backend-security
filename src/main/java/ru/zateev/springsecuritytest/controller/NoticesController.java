package ru.zateev.springsecuritytest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import ru.zateev.springsecuritytest.model.Notice;
import ru.zateev.springsecuritytest.repository.NoticeRepository;

@RestController
public class NoticesController {
	
	@Autowired
	private NoticeRepository noticeRepository;
	
	@GetMapping("/notices")
	public List<Notice> getNotices() {
		List<Notice> notices = noticeRepository.findAllActiveNotices();
		System.out.println("1YES********");
		if (notices != null ) {
			System.out.println("2YES********");
			return notices;
		}else {
			return null;
		}
	}

}
