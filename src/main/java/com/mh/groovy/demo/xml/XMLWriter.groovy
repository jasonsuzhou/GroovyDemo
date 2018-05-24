package com.mh.groovy.demo.xml

import groovy.xml.MarkupBuilder
import groovy.xml.StreamingMarkupBuilder

class XMLWriter {
	
	static void main(String[] args) {
		StringWriter sw = new StringWriter();
		MarkupBuilder mb = new MarkupBuilder(sw);
		mb.persons {
			person(gender:'1') {
				name('aine')
				age(30)
			}
			person(gender:'0') {
				name('jeff')
				age(31)
			}
		}
		println sw;
	}
	
}
