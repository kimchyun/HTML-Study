package kr.or.ddit.prod.service;

import java.util.List;

import kr.or.ddit.prod.vo.ProdVO;

public interface IProdService {
	
	//prod_id, prod_name을 출력
	public List<ProdVO> selectByGu(String lgu);
	
	public ProdVO selectById(String id);

}
