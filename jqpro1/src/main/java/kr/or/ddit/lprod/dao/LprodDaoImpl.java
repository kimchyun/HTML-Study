package kr.or.ddit.lprod.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import kr.or.ddit.lprod.vo.LprodVO;
import kr.or.ddit.mybatis.config.MyBatisSqlSessionFactory;

public class LprodDaoImpl implements ILprodDao {
	
	//자기 자신의 객체를 생성하여 리턴
	private static ILprodDao dao;
	
	public static ILprodDao getDao() {
		if (dao == null) {
			dao = new LprodDaoImpl();
		}
		return dao;
	}

	@Override
	public List<LprodVO> getAlllprod() {
		
		//sqlSession생성
		SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSession();
		
		//리턴 타입 변수 선언
		List<LprodVO> list = null;
		
		try {
			//mapper실행
			list = sqlSession.selectList("lprod.getAlllprod");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sqlSession.commit();
			sqlSession.close();
			
		}
		
		return list;
	}
}