package com.example.fridayproject.controller;

import com.example.fridayproject.dto.MessageDto;
import com.example.fridayproject.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/number")
public class NumberController {
    MessageService messageService;
@Autowired
    public NumberController(MessageService messageService) {
        this.messageService = messageService;
    }

    @GetMapping("/getCalculatedValues")
public ResponseEntity<MessageDto> getCalculatedValues(){
        return ResponseEntity.ok()
                .header("Successful","true")
                .body(messageService.getValues());
    }
}
