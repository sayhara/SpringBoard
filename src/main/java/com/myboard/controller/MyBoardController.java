package com.myboard.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.myboard.service.MyBoardService;
import com.myboard.vo.MyBoardVo;

@Controller
@RequestMapping("/board/*")
public class MyBoardController {
	
	// 기능 URL Method Form
	// 글 목록 /board/list Get X
	// 글 등록 /board/register Post O
	// 글 등록 폼 이동 /board/register Get X
	// 글 읽기 /board/get Get X
	// 글 수정삭제로 이동 /board/modify Get X
	// 글 수정처리 /board/modify Post O
	// 글 삭제 /board/remove Post modify와 같음
	
	@Autowired
	private MyBoardService service;
	
	private Logger log=Logger.getLogger(MyBoardController.class);
	
	
	@GetMapping("/list")
	public void list(Model model) {//model은 request.setAttribute와 동일
		model.addAttribute("list",service.getList());
	}
	
	@PostMapping("/register")
	public String register(MyBoardVo board) {
		log.info("register :"+board);
		service.register(board);
		return "redirect:/board/list";
	}
	
	@GetMapping("/register")
	public void register() {

	}
	
	@PostMapping("/remove")
	public String remove(@RequestParam("id") String id, RedirectAttributes rttr) {
		if(service.remove(id)) {
			rttr.addFlashAttribute("result","Delete Success");
		}
		return "redirect:/board/list";
	}
	
	// 같은 작업을 하는 요청의 경우 하나의 컨트롤러에서 함께 처리할 수 있다.
	@GetMapping({"/get","/modify"})
	public void get(@RequestParam("id") String id, Model model) {	
		model.addAttribute("board",service.get(id));
	}
	
	@PostMapping("/modify")
	public String modify(MyBoardVo board,RedirectAttributes rttr) {
		log.info(board);
		
		if(service.modify(board)) {
			rttr.addFlashAttribute("result","Modify Success");
		}
		return "redirect:/board/list";
	}


}
