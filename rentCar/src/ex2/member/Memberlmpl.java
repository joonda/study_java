package ex2.member;

import ex2.base.Base;
import ex2.common.DataUtil;

public class Memberlmpl extends Base implements Member {
	String memData;
	
	public void regMember(MemberVo vo) {
		memData = "회원 아이디 : "+vo.id+"," + "회원 비번 : " + vo.password+ "," +"회원이름 : " + vo.name + "," + "회원 전화번호 : "+vo.phoneNum;
		
		DataUtil.encodeData(memData);
		System.out.println("회원 등록 시간 : " + showTime());
		System.out.println("회원 가입합니다.");
	}
	
	public String viewMember(MemberVo vo) {
		memData = vo.id+","+vo.name+","+vo.password+","+vo.phoneNum;
		
		DataUtil.decodeData(memData);
		System.out.println("회원 조회시간 : " + showTime());
		return memData;
	}
	
	public void modMember(MemberVo vo) {
		memData = vo.id+","+vo.name+","+vo.password+","+vo.phoneNum;
		DataUtil.encodeData(memData);
		System.out.println("회원 수정 시간 : " + showTime());
		System.out.println("회원 정보를 수정합니다.");
	}
	
	public void delMember(MemberVo vo) {
		memData = vo.id+","+vo.name+","+vo.password+","+vo.phoneNum;
		
		DataUtil.decodeData(memData);
		System.out.println("회원 삭제시간 : " + showTime());
		System.out.println("회원 정보를 삭제합니다.");
	}
	
}
