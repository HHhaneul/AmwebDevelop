package org.koreait.restcontrollers;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.koreait.commons.*;
import org.koreait.controllers.board.BoardDataForm;
import org.koreait.models.board.*;
import org.springframework.http.*;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.*;

@Slf4j
@RestController
@RequestMapping("/api/board")
@RequiredArgsConstructor
public class BoardApiController {

    private final SaveService saveService;
    private final InfoService infoService;

    @GetMapping("/info/{id}")
    public ResponseEntity<JSONData<BoardData>> info(@PathVariable long id){
        BoardData data = infoService.get(id);
        JSONData<BoardData> jsonData = new JSONData();
        jsonData.setSuccess(true);
        jsonData.setStatus(HttpStatus.OK);
        jsonData.setData(data);
        jsonData.setMessage("");

        return ResponseEntity.status(jsonData.getStatus()).body(jsonData);
    }

    @GetMapping("/list")
    public List<BoardData> list(){
        List<BoardData> items = new ArrayList<>();
        for (int i = 1; i <= 10; i++){
            BoardData data = BoardData.builder()
                    .id(i)
                    .poster("작성자" + i)
                    .subject("제목" + i)
                    .content("내용" + i)
                    .regDt(LocalDateTime.now())
                    .build();
            items.add(data);
        }
        return items;
    }

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

    @GetMapping("/process")
    public void process(){
        log.info("내부 처리중!!");
    }

    @PostMapping("/register")
    public ResponseEntity<JSONData<Object>> register(@RequestBody @Valid BoardDataForm form, Errors errors){
        JSONData<Object> jsonData = new JSONData<>();
        saveService.save(form);

        jsonData.setStatus(HttpStatus.CREATED);
        jsonData.setSuccess(true);
        return ResponseEntity.status(jsonData.getStatus()).body(jsonData);
    }
}
