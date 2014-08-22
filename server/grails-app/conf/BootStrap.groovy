import org.junit.Before;

import com.hantsylabs.grails.example.domain.Book
import com.hantsylabs.grails.example.security.Authority
import com.hantsylabs.grails.example.security.Person
import com.hantsylabs.grails.example.security.PersonAuthority

class BootStrap {

    def init = { servletContext ->
		new Book(title:"Java Persistence with Hibernate", author:"Gavin King", price:99.00).save()
		new Book(title:"Spring Live", author:"Matt Raible", price:29.00).save()	
		
		log.info "Total Books loaded: ${Book.count()}"
		Book.list().each { Book aBook -> 
		    log.info "Book -> ${aBook}"
		}
    }
    def destroy = {
    }
}
