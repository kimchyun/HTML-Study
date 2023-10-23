package kr.or.ddit.prod.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import kr.or.ddit.mybatis.config.MyBatisSqlSessionFactory;
import kr.or.ddit.prod.vo.ProdVO;

public class ProdDaoImpl implements IProdDao {
	
	//자기 자신의 객체를 생성하여 리턴
	private static IProdDao dao;
	
	public static IProdDao getDao() {
		if(dao == null) dao = new ProdDaoImpl();
		
		return dao;
	}

	@Override
	public List<ProdVO> selectByGu(String lgu) {
		
		//sqlSession생성
		SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSession();
		
		//리턴 타입 변수 선언
		List<ProdVO> list = null;
		
		try {
			//mapper실행
			list = sqlSession.selectList("prod.selectByGu",lgu);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sqlSession.commit();
			sqlSession.close();
			
		}
		
		return list;
	}

	@Override
	public ProdVO selectById(String id) {

		//sqlSession생성
	    SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSession();
	    
	    //리턴 타입 변수 선언
	    ProdVO vo = null;
	    
	    try {
			//mapper실행
	    	vo =  sqlSession.selectOne("prod.selectById",id);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sqlSession.commit();
			sqlSession.close();
		}
		
		return vo;
	}

}
