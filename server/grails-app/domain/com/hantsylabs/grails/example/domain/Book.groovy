package com.hantsylabs.grails.example.domain

import grails.rest.Resource;
import groovy.transform.ToString

@Resource()
@ToString
class Book {
	
    String title
    String author
    Double price

    static constraints = {
        id()
        version()
        title(blank: false)
        author(blank: false)
    }
}
