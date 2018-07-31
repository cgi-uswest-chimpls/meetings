package com.cgi.uswest.chimpls.meetings.objects;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Meeting {

	@Id
	@GenericGenerator(name = "uuid2", strategy = "uuid2")
	@GeneratedValue(generator = "uuid2")
	@Column(columnDefinition = "BINARY(16)")
	private UUID id;
	
	private BigDecimal idmeeting;
	private BigDecimal idprsn;
	private BigDecimal cdtype;
	private String txtype;
	private Timestamp dtstart;
	private Timestamp dtend;
	private String txlocation;
	
	Meeting() {}
	
	public Meeting(BigDecimal idmeeting, BigDecimal idprsn, BigDecimal cdtype, String txtype,
			Timestamp dtstart, Timestamp dtend, String txlocation) {
		
		super();
		this.idmeeting = idmeeting;
		this.idprsn = idprsn;
		this.cdtype = cdtype;
		this.txtype = txtype;
		this.dtstart = dtstart;
		this.dtend = dtend;
		this.txlocation = txlocation;
		
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public BigDecimal getIdmeeting() {
		return idmeeting;
	}

	public void setIdmeeting(BigDecimal idmeeting) {
		this.idmeeting = idmeeting;
	}

	public BigDecimal getIdprsn() {
		return idprsn;
	}

	public void setIdprsn(BigDecimal idprsn) {
		this.idprsn = idprsn;
	}

	public BigDecimal getCdtype() {
		return cdtype;
	}

	public void setCdtype(BigDecimal cdtype) {
		this.cdtype = cdtype;
	}

	public String getTxtype() {
		return txtype;
	}

	public void setTxtype(String txtype) {
		this.txtype = txtype;
	}

	public Timestamp getDtstart() {
		return dtstart;
	}

	public void setDtstart(Timestamp dtstart) {
		this.dtstart = dtstart;
	}

	public Timestamp getDtend() {
		return dtend;
	}

	public void setDtend(Timestamp dtend) {
		this.dtend = dtend;
	}

	public String getTxlocation() {
		return txlocation;
	}

	public void setTxlocation(String txlocation) {
		this.txlocation = txlocation;
	}
	
}
