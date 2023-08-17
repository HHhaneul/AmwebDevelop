package org.koreait.controllers.board;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.koreait.models.board.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/board")
@RequiredArgsConstructor
public class BoardController {

    private final SaveService saveService;
    private final InfoService infoService;

    @GetMapping("/write")
    public String write(@ModelAttribute BoardDataForm data){

        return "board/write";
    }

    @PostMapping("/save")
    public String save(@Valid BoardDataForm data, Errors errors){
        
        /** 에러가 있을 시 다시 write 이동 */
        if (errors.hasErrors()){
            return "board/write";
        }

        saveService.save(data);

        return "redirect:/board/view/" + data.getId();
    }

    @GetMapping("/view/{id}")
    public String view(@PathVariable long id, Model model){

        BoardData data = infoService.get(id);

        model.addAttribute("data", data);

        return "board/view";
    }

    @ResponseBody
    @GetMapping("/viewapi/{id}")
    public BoardData viewJson(@PathVariable long id){
        BoardData data = infoService.get(id);
        return data;
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable long id, Model model){

        BoardData data = infoService.get(id);

        model.addAttribute("data", data);

        return "/";
    }

    @ExceptionHandler(RuntimeException.class)
    public String errorHandler(RuntimeException e, Model model){

        String script = String.format("alect('%s');History.back();", e.getMessage());
        model.addAttribute("script", script);

        e.printStackTrace();

        return "commons/execute_script";
    }
}
