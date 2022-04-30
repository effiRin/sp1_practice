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
import org.zerock.sp1_practice.dto.ListResponseDTO;
import org.zerock.sp1_practice.dto.PageMaker;
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

        ListResponseDTO<BoardDTO> responseDTO = boardService.getList(listDTO);
        model.addAttribute("dtoList", responseDTO.getDtoList());

        int total = responseDTO.getTotal();
        model.addAttribute("pageMaker", new PageMaker(listDTO.getPage(), total));

//        model.addAttribute("ListDTO", listDTO); -> 이거 안해줘도 나옴

        // model.addAttribute("dtoList" , total);  -> PageMaker 안에 total이 있기 떄문에 없어도 될듯

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
