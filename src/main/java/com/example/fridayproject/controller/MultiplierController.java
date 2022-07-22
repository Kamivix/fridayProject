package com.example.fridayproject.controller;

import com.example.fridayproject.service.MessageService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "api/multiplier")
public class MultiplierController {

    MessageService messageService;

    public MultiplierController(MessageService messageService) {
        this.messageService = messageService;
    }

    @PostMapping("/setMultiplier")
    public void setMultiplier(@RequestParam("multiplier") int multiplier){
        messageService.setMultiplier(multiplier);
    }

    @GetMapping("/getMultiplier")
    public ResponseEntity<Integer> getMultiplier(){
        return ResponseEntity
                .ok()
                .header("successful","true")
                .body(messageService.getMultiplier());
    }

}
