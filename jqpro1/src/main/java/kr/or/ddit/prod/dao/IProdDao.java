package kr.or.ddit.prod.dao;

import java.util.List;

import kr.or.ddit.prod.vo.ProdVO;

public interface IProdDao {
	
	//prod_id, prod_name을 출력
	public List<ProdVO> selectByGu(String lgu);
	
	public ProdVO selectById(String id);

}
