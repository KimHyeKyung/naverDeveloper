package NaverDevelopers.domain.dto;

import java.time.LocalDateTime;

import NaverDevelopers.domain.entity.BoardEntity;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class BoardDto {

	private long bno;
	private String subject;
	private String contents;
	private String creatorId;
	private LocalDateTime createdDate;
	
	
	public BoardEntity toEntity(){
		return BoardEntity.builder()
				.bno(bno).subject(subject)
				.contents(contents)
				.creatorId(creatorId)
				.createdDate(createdDate)
				.build();
	
	}


	public BoardDto(BoardEntity entity) {
		super();
		this.bno = entity.getBno();
		this.subject = entity.getSubject();
		this.contents = entity.getContents();
		this.creatorId = entity.getCreatorId();
		this.createdDate = entity.getCreatedDate();
	}
	
	
}
