package ex2.member;

public interface Member {
	public void regMember(MemberVo vo); // 등록
	public String viewMember(MemberVo vo); // 조회
	public void modMember(MemberVo vo); // 수정
	public void delMember(MemberVo vo); // 삭제
}