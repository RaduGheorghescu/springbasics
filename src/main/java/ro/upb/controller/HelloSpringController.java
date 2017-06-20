package ro.upb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller //clasa devina una de tip controller si spring o gaseste in lista de componente
public class HelloSpringController {

    @GetMapping("/") //cere o mapare pe  "/" de tip GET
    public String index(@RequestParam(value="name", required=false, defaultValue="Spring") String name, Model model) {
        //cere un parametru "nume" care implicit contine valoarea Spring si este salvat in variabila name
        model.addAttribute("name", name); //variabila name este pasata catre model
        return "index"; //returneaza index.html (resources/templates/index.html)
    }

}
