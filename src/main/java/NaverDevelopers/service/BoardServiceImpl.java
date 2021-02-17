package NaverDevelopers.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import NaverDevelopers.domain.dto.BoardDto;
import NaverDevelopers.domain.entity.BoardRepository;

@Service
public class BoardServiceImpl implements BoardService{

	@Autowired
	private BoardRepository repository;

	//포럼페이지에 DB의 글 목록 가져오기 
	@Override
	public List<BoardDto> getforumlist() {
		return repository.findAll()
							.stream()
							.map(BoardDto::new)
							.collect(Collectors.toList());
	}

	
	


}
