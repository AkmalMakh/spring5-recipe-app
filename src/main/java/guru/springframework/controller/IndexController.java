package guru.springframework.controller;



import guru.springframework.service.RecipesService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class IndexController {
    private final RecipesService recipeService;

    public IndexController(RecipesService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"", "/", "/index"})
    public String getIndexPage(Model model) {

        model.addAttribute("recipes", recipeService.getRecipes());

        return "index";
    }
}