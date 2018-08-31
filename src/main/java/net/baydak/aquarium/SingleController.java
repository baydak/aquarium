package net.baydak.aquarium;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SingleController {

    /**
     * Возвращает index.html с пустой формой
     */
    @RequestMapping("/")
    public String index(Model model) {
        model.addAttribute("objectToFill", new Landscape ());
        return "index";
    }

    /**
     * Возвращает result.html с результатом
     */
    @RequestMapping( value = "/sum", method = RequestMethod.POST)
    String sum(@ModelAttribute Landscape insertedObject, Model model) {
        model.addAttribute("result", insertedObject.calculateVolume(Landscape.parseStringToIntArr(insertedObject.getLandscapeLineStr())));
        insertedObject.arr1dTO2d(insertedObject.getLandscapeLineStr());
        return "result";
    }

}