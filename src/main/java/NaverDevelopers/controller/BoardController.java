package NaverDevelopers.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import NaverDevelopers.domain.dto.BoardDto;
import NaverDevelopers.service.BoardService;

@Controller
public class BoardController {

	@Autowired
	private BoardService service;
	
	//index페이지 보여주기
	@GetMapping("/index")
	public String boardList() {
		return "redirect:/";
	}
	
	/*
	 * //포럼페이지로 넘어가기
	 * 
	 * @GetMapping("/board/forum") public String goforum() { return "/board/forum";
	 * }
	 */
	
	//포럼페이지에 DB의 글 목록 가져오기 -> ModelAndView, list, addObject
	@GetMapping("/board/forum")
	public ModelAndView getforumlist() {
		ModelAndView mv = new ModelAndView();
		List<BoardDto> list = service.getforumlist();
		mv.addObject("list",list);
		return mv;
	}
	
	
}
