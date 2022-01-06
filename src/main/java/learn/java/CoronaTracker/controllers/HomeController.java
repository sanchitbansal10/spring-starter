package learn.java.CoronaTracker.controllers;

import learn.java.CoronaTracker.services.CoronaVirusDataService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;

@Controller
public class HomeController {

    @Autowired
    CoronaVirusDataService coronaVirusDataService;

    @GetMapping("/home")
    public String home(Model model) {
        model.addAttribute("allStats", coronaVirusDataService.getAllStats());
        return "home";
    }
}
