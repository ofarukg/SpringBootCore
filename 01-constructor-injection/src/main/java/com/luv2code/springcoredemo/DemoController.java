package com.luv2code.springcoredemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

    @RestController
    public class DemoController {

    // define a private fileds for the dependency

        private Coach myCoach;


    // define a constructor for dependency injection

        @Autowired  // we have only one contructor, so in this case "autowired" annotation is optinal
        public DemoController (Coach theCoach){

            myCoach = theCoach;

        }

        @GetMapping("/dailyworkout")

        public String getDailyWorkout(){

            return myCoach.getDailyWorkout();

        }

    }
