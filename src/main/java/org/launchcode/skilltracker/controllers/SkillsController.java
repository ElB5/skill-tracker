package org.launchcode.skilltracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

//annotations
@Controller
@ResponseBody
public class SkillsController {
    //annotations
    @RequestMapping(method = {RequestMethod.GET}, value="")
    //method
    public String languages(){
        String html = "<html>" +
                "<body>" +
                "<h1>Skills Tracker</h1>" +
                "<h2>We have a few skills we would like you to learn. Here is the list!</h2>" +
                "<ol>JavaScript</ol>" +
                "<ol>Java</ol>" +
                "<ol>C#</ol>" +
                "</body>" +
                "</html>";
            return html;
    }

    @RequestMapping(method = {RequestMethod.GET}, value="form")
    public String nameFavs (@RequestParam String name) {
        String html1 =
                "<html>" +
                        "<body>" +
                        "<form action = '/form' method = 'get'>" +
                        "<input type = 'text' name = 'name' >" +
                        "<label for='favorite-select'>Choose a favorite:</label>" +
                        "<input type = 'submit' value = 'Enter Name' >" +
                        "<h1>" + name + "</h1>" +
                        "<select name='favorite' id='favorite-select'>" +
                        "<option value='JavaScript'>JavaScript</option>" +
                        "<option value='Java'>Java</option>" +
                        "<option value='C#'>C#</option>" +
                        "</select>" +
                        "</form>" +
                        "</body>" +
                        "</html>";
            return html1;
    }

}
