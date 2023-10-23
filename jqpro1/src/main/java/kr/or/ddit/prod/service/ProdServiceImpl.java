package kr.or.ddit.prod.service;

import java.util.List;

import kr.or.ddit.prod.dao.IProdDao;
import kr.or.ddit.prod.dao.ProdDaoImpl;
import kr.or.ddit.prod.vo.ProdVO;

public class ProdServiceImpl implements IProdService{
	
	//dao객체가 필요
	private IProdDao dao;
	private static IProdService service;
	
	private ProdServiceImpl() {
		dao = ProdDaoImpl.getDao();
	}
	
	//자기자신의 객체를 생성하여 리턴
	public static IProdService getService() {
		if (service == null) {
			service = new ProdServiceImpl();
		}
		return service;
	}

	@Override
	public List<ProdVO> selectByGu(String lgu) {
		/*//리턴타입 변수 선언
		List<ProdVO> list = null;
		
		//dao메소드 실행
		list = dao.selectByGu(lgu);
		
		//리턴 결과
		return list; */
		
		return dao.selectByGu(lgu);
	}

	@Override
	public ProdVO selectById(String id) {
		
		/*//리턴타입 변수 선언
		ProdVO vo = null;
		
		//dao메소드 실행
		vo = dao.selectById(id);

		return vo; */
		
		return dao.selectById(id);
	}
}
