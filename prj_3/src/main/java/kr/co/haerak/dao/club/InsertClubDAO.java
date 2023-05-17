package kr.co.haerak.dao.club;

import kr.co.haerak.domain.club.ClubInsertDomain;
import kr.co.haerak.vo.club.ClubInsertVO;

/**
 * 모임관련 DAO
 * @author user
 */
public class InsertClubDAO {

	/**
	 * 모임 등록 method
	 * @param cVO
	 */
	public void insertClubInfo(ClubInsertVO cVO) {
		
	}//insertClubInfo
	
	
	/**
	 * 모임 수정 method
	 * @param cVO
	 */
	public void updateClubInfo(ClubInsertVO cVO) {
		
	}//updateClubInfo
	
	
	/**
	 * 수정할 정보를 수정할 페이지에 세팅
	 * @param clubNum
	 * @return
	 */
	public ClubInsertDomain setSelectClub(int clubNum) {
		
		ClubInsertDomain result=new ClubInsertDomain();
		
		return result;
	}//setSelectClub
	
}//InsertClubDAO
