package com.cgi.uswest.chimpls.meetings.objects;

import java.math.BigDecimal;
import java.util.Set;
import java.util.UUID;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

public interface MeetingRepository extends PagingAndSortingRepository<Meeting, UUID> {

	Set<Meeting> findAllByIdprsnOrderByDtstartDesc(@Param("idprsn") BigDecimal idprsn);
	
	@Query("select m from Meeting m where m.idprsn = ?1 and m.dtstart > NOW() ORDER BY m.dtstart")
	Set<Meeting> findFirstCurrentMeetings(@Param("idprsn") BigDecimal idprsn);
	
}
