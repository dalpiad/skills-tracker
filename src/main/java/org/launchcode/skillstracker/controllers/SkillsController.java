package org.launchcode.skillstracker.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class SkillsController {

    @GetMapping()
    @ResponseBody
    public String skillTracker() {
        return "<h1 >Skills Tracker</h1>" +
                "<h2>We have a few skills we would like to learn.  Here is a list</h2>" +
                "<ol>" +
                    "<li>Java</li>" +
                    "<li>More Java</li>" +
                    "<li>Even more Java</li>" +
                "</ol>";
    }

    @RequestMapping(value="form", method = {RequestMethod.GET})
    @ResponseBody
    public String skillTrackerForm() {

        return "<form method='post' action='form/result'>" +
                "<h2>Name: " +
                "<input type = 'text' name = 'name' /> </h2>" +
                "<h2>My favorite language: <h2>" +
                "<select name = 'language1'>" +
                "<option value = 'Java'>Java</option>" +
                "<option value = 'Python'>Python</option>" +
                "<option value = 'Rust'>Rust</option>" +
                "</select>" +
                "<h2>My second favorite language: <h2>" +
                "<select name = 'language2'>" +
                "<option value = 'Java'>Java</option>" +
                "<option value = 'Python'>Python</option>" +
                "<option value = 'Rust'>Rust</option>" +
                "</select>" +
                "<h2>My third favorite language: <h2>" +
                "<select name = 'language3'>" +
                "<option value = 'Java'>Java</option>" +
                "<option value = 'Python'>Python</option>" +
                "<option value = 'Rust'>Rust</option>" +
                "</select>\n" +
                "<input type = 'submit' value = 'Submit' />" +
                "</form>";
    }

//    @RequestMapping(value="form", method = RequestMethod.POST)
//    @ResponseBody
//    public String skillTrackerResult(@RequestParam String name, @RequestParam String language1,@RequestParam String language2, @RequestParam String language3) {
//        if (name == null) {
//            name = "No one";
//        }
//
//        return "<h1> " + name + "</h1>" +
//                "<h2><ol>" +
//                "<ol>" +
//                "<li>" + language1 + "</li>" +
//                "<li>" + language2 + "</li>" +
//                "<li>" + language3 + "</li>" +
//                "</ol></h2>";
//    }

    @RequestMapping(value="form/result", method = RequestMethod.POST)
    @ResponseBody
    public String skillTrackerResult(@RequestParam String name, @RequestParam String language1,@RequestParam String language2, @RequestParam String language3) {
        if (name == null) {
            name = "No one";
        }
        return "<table>" +
                "<tr> " +
                "<th> " + name + "</th>" +
                "</tr>" +
                "<tr>" +
                "<td> My favorite language: </td> " +
                "<td>" + language1 + "</td> " +
                "</tr>" +
                "</tr>" +
                "<td> My second favorite language: </td> " +
                "<td>" + language2 + "</td>" +
                "</tr>" +
                "<tr>" +
                "<td> My third favorite language: </td> " +
                "<td>" + language3 + "</td>" +
                "</tr>" +
                "</table>";
    }


}
