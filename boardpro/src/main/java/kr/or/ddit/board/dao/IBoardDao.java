package kr.or.ddit.board.dao;

import java.util.List;
import java.util.Map;

import kr.or.ddit.board.vo.BoardVO;
import kr.or.ddit.board.vo.ReplyVO;

public interface IBoardDao {
	
	//public 리턴결과형 메소드이름(파라미터 타입 변수명);
	
	//페이지별 리스트 가져오기
	public List<BoardVO> listPerPage(Map<String, Object> map);
	
	//전체 글 갯수 구하기
	public int totalCount(Map<String, Object> map);
	
	//글쓰기 - 저장하기
	public int insertBoard(BoardVO vo);
	
	//글 수정하기
	public int updateBoard(BoardVO vo);
	
	//글 삭제하기
	public int deleteBoard(int num);
	
	//조회수 증가하기
	public int updateHit(int num);
	
	//댓글 쓰기 - 저장
	public int insertReply(ReplyVO vo);
	
	//댓글 수정
	public int updateReply(ReplyVO vo);
	
	//댓글 삭제
	public int deleteReply(int renum);
	
	//댓글리스트
	public List<ReplyVO> listReply(int num);

}
