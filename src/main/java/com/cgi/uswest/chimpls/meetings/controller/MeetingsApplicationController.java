package com.cgi.uswest.chimpls.meetings.controller;

import java.math.BigDecimal;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cgi.uswest.chimpls.meetings.objects.Meeting;
import com.cgi.uswest.chimpls.meetings.objects.MeetingRepository;

@RefreshScope
@RestController
public class MeetingsApplicationController {

	  @Autowired
	  private MeetingRepository repository;
	  
	  @RequestMapping("/meetingsByPerson/{idprsn}")
	  public Set<Meeting> findMeetingsByPerson(@PathVariable("idprsn") String idprsn) {
		  return repository.findAllByIdprsnOrderByDtstartDesc(new BigDecimal(idprsn));
	  }
	  
	  @RequestMapping("/currentMeetingsByPerson/{idprsn}")
	  public Set<Meeting> findFirstCurrentMeetings(@PathVariable("idprsn") String idprsn) {
		  return repository.findFirstCurrentMeetings(new BigDecimal(idprsn));
	  }
	
}
