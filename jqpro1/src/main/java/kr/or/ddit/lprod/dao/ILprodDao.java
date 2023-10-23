package kr.or.ddit.lprod.dao;

import java.util.List;

import kr.or.ddit.lprod.vo.LprodVO;

public interface ILprodDao {
	
	//lprod리스트
	//public 리턴결과형 메소드이름()
	public List<LprodVO> getAlllprod();

}
