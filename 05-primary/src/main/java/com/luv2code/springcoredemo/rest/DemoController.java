package com.luv2code.springcoredemo.rest;

import com.luv2code.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

    @RestController
    public class DemoController {

    // define a private fileds for the dependency

        private Coach myCoach;


        @Autowired
        public void DemoController(Coach theCoach){
            myCoach=theCoach;
        }

        //we have marked the trackcoach as primary, so no need to use @Qualifier

        @GetMapping("/dailyworkout")

        public String getDailyWorkout(){

            return myCoach.getDailyWorkout();

        }

    }
