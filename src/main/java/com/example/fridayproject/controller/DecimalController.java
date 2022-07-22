package com.example.fridayproject.controller;

import com.example.fridayproject.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/decimal")
public class DecimalController {
    MessageService messageService;

@Autowired
    public DecimalController(MessageService messageService) {
        this.messageService = messageService;
    }

    @PostMapping("/setDecimal")
    public void setDecimal(@RequestParam("decimal") int decimal){
    messageService.setDecimalPlaces(decimal);
    }

    @GetMapping("/getDecimal")
    public ResponseEntity<Integer> getDecimal(){
    return ResponseEntity
            .ok()
            .header("Successful","True")
            .body(messageService.getDecimalPlaces());
    }
}
