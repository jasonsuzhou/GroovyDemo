package com.mh.groovy.demo.closure

class EmailDSL {
	
	String toText;
	String fromText;
	String subject;
	String content;
	
	def static make(Closure closure) {
		EmailDSL emailDSL = new EmailDSL();
		closure.delegate = emailDSL;
		closure();
	}
	
	def to(String toText) {
		this.toText = toText;
	}
	
	def from(String fromText) {
		this.fromText = fromText;
	}
	
	def subject(String subject) {
		this.subject = subject;
	}
	
	def content(String content) {
		this.content = content;
	}

	static void main(String[] args) {
		EmailDSL.make {
			to 'salk'
			from 'jason'
			subject 'Hello'
			content 'Wrold'
		}
	}
}
