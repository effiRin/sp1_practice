package org.zerock.sp1_practice.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.zerock.sp1_practice.dto.BoardDTO;
import org.zerock.sp1_practice.dto.ListDTO;
import org.zerock.sp1_practice.service.BoardService;

import java.util.List;

@Controller
@Log4j2
@RequestMapping("/board/")
@RequiredArgsConstructor
public class BoardController {

    private final BoardService boardService;

    @GetMapping("/")
    public String basic(){
        return "redirect:/board/list";
    }

    @GetMapping("/list")
    public void list(ListDTO listDTO, Model model){
        log.info("board list...");
        log.info("Page : " + listDTO);

        List<BoardDTO> dtoList = boardService.getList(listDTO);
        model.addAttribute("dtoList" ,dtoList);
    }

    @PostMapping("/register")
    public String registerPOST(BoardDTO boardDTO, RedirectAttributes rttr) {

        log.info("---POST----");
        log.info(boardDTO);

        rttr.addFlashAttribute("result", 123);
        rttr.addAttribute("num",321);

        return "redirect:/board/list";}

    @GetMapping("/register")
    public void registerGET(){

    }
}
