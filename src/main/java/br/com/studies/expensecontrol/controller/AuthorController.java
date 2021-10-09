package br.com.studies.expensecontrol.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/authors")
public class AuthorController {

    @GetMapping("/")
    public String getAuthor(@RequestParam(defaultValue = "silva") String lastName){
        String fullName = "Delano " + lastName;
        return fullName;
    }

    @PostMapping("/tax/{salary}")
    public long calculateTax(@PathVariable long salary){
        if (salary > 1000){
            salary = salary - 100;
        }
        else {
            salary = salary -50;
        }
        return salary;
    }
}
