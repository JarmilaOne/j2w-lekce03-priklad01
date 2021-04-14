package cz.czechitas.java2webapps.lekce3.controller;

import cz.czechitas.java2webapps.lekce3.entity.Address;
import cz.czechitas.java2webapps.lekce3.entity.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDate;

@Controller
public class CardController {

    @GetMapping("/")
    public ModelAndView card(){

        Person person = new Person("Jan", "Palach", LocalDate.of(1958, 8, 11));
        Address address = new Address("Smetanova 337", 27716, "Všetaty");

        ModelAndView card = new ModelAndView("card");
        card.addObject("person", person);
        card.addObject("address", address);

    return card;
    }
}
