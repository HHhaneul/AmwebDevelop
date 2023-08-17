package org.koreait.restcontrollers;

import org.koreait.commons.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

@RestControllerAdvice
public class CommonRestController {
    @ExceptionHandler(Exception.class)
    public ResponseEntity<JSONData<Object>> errorHandler(Exception e){
        JSONData<Object> jsonData = new JSONData<>();
        jsonData.setMessage(e.getMessage());

        HttpStatus status = HttpStatus.INTERNAL_SERVER_ERROR;
        if (e instanceof CommonException){
            CommonException e2 = (CommonException) e;
            status = e2.getStatus();
        }

        jsonData.setStatus(status);

        return ResponseEntity.status(status).body(jsonData);
    }
}
