package com.hantsylabs.grails.example.controller

import grails.converters.JSON
import com.hantsylabs.grails.example.security.Person


class StatusController {

	def index() {
		def person = new Person(username:"test", password:"test123")
		render([user: person] as JSON)
	}	
}