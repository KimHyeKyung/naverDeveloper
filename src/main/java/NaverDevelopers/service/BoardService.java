package NaverDevelopers.service;

import java.util.List;

import NaverDevelopers.domain.dto.BoardDto;

public interface BoardService {

	//포럼페이지에 DB의 글 목록 가져오기 
	List<BoardDto> getforumlist();

	



}
