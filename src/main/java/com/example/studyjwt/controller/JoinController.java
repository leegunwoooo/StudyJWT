package com.example.studyjwt.controller;

import com.example.studyjwt.dto.JoinDTO;
import com.example.studyjwt.service.JoinService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
@RequiredArgsConstructor
public class JoinController {

    private final JoinService joinService;

    @PostMapping("/join")
    public String joinProcess(JoinDTO dto){

        joinService.joinprocess(dto);

        return "ok";
    }
}
