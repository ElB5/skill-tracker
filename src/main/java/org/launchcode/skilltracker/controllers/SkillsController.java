package org.launchcode.skilltracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

//annotations
@Controller
public class SkillsController {
    //annotations
    @ResponseBody
    @GetMapping("")
    //method for initial form
    public String index(){
        String content = "<html>" +
                "<p>" +
                "<h1>" +
                "Skills Tracker" +
                "</h1>" +
                "<h2>" +
                "We have a few skills we would like you to learn. Here is the list!" +
                "</h2>" +
                "<ol>" +
                    "<li>" +
                    "JavaScript" +
                    "</li>" +
                    "<li>" +
                    "Java" +
                    "</li>" +
                    "<li>" +
                    "C#" +
                    "</li>" +
                "</ol>" +
                "</p>" +
                "<form action = 'form'>" +
                "<input type='submit' value='GoTo Form'>" +
                "</form>" +
                "</html>";
            return content;
    }
//formhandler
    @ResponseBody
    @GetMapping(value="form")
    public String skillsForm(){
        String content = "<form method ='post'>" +
                "Name:<br>" +
                "<input type= 'text' name= 'name' />" +
                "<br>My Favorite language:<br>" +
                "<select name = 'firstChoice'>" +
                    "<option value = 'JavaScript'>JavaScript</option>" +
                    "<option value = 'Java'>Java</option>" +
                    "<option value = 'C#'>C#</option>" +
                "</select>" +
                "<br>My second favorite language:<br>" +
                "<select name = 'secondChoice'>" +
                    "<option value = 'JavaScript'>JavaScript</option>" +
                    "<option value = 'Java'>Java</option>" +
                    "<option value = 'C#'>C#</option>" +
                "</select>" +
                "<br>My third favorite language:<br>" +
                "<select name = 'thirdChoice'>" +
                    "<option value = 'JavaScript'>JavaScript</option>" +
                    "<option value = 'Java'>Java</option>" +
                    "<option value = 'C#'>C#</option>" +
                "</select><br>" +
                "<input type= 'submit' value = 'Submit' />" +
                "</form>";
        return content;

    }

//routehandler to get info from form
    @ResponseBody
    @PostMapping(value="form")
    public String formHandler (@RequestParam String name, @RequestParam String firstChoice,
                            @RequestParam String secondChoice, @RequestParam String thirdChoice) {
        String html = "<h1>" + name + "</h1>" + "<ol>" + "<li>" + firstChoice + "</li>"
                + "<li>" + secondChoice + "</li>" + "<li>" + thirdChoice + "</li>" + "</ol>";
            return html;
    }

}
