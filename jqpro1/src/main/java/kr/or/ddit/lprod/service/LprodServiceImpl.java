package kr.or.ddit.lprod.service;

import java.util.List;

import kr.or.ddit.lprod.dao.ILprodDao;
import kr.or.ddit.lprod.dao.LprodDaoImpl;
import kr.or.ddit.lprod.vo.LprodVO;

public class LprodServiceImpl implements ILprodService{
	
	//dao객체가 필요
	private ILprodDao dao;
	private static ILprodService service;
	
	private LprodServiceImpl() {
		dao = LprodDaoImpl.getDao();
	}
	
	//자기자신의 객체를 생성하여 리턴
	public static ILprodService getService() {
		if (service == null) {
			service = new LprodServiceImpl();
		}
		return service;
	}

	@Override
	public List<LprodVO> getAlllprod() {
		
		return dao.getAlllprod();
	}

}
