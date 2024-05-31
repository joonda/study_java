package ex2.reserve;

import ex2.base.Base;
import ex2.common.DataUtil;

public class ReserveImpl extends Base implements Reserve {
	String resData;
	
	public String reserveCar(ResVo vo) {
		resData = "예약 차 번호 : " + vo.resCarNumber + "," + 
				"예약 날짜 : " + vo.resDate + "," +
				"이용 시작 일자 : " + vo.useBeginDate + "," +
				"차 반납 일자 : " + vo.returnDate;
		
		DataUtil.encodeData(resData);
		System.out.println("렌터카 예약시간 : " + showTime());
		System.out.println("차를 예약합니다.");
		
		DataUtil.decodeData(resData);
		
		return resData;
	}
	
	public void modReserveInfo(ResVo vo) {
		resData = "예약 차 번호 : " + vo.resCarNumber + "," + 
				"예약 날짜 : " + vo.resDate + "," +
				"이용 시작 일자 : " + vo.useBeginDate + "," +
				"차 반납 일자 : " + vo.returnDate;
		DataUtil.encodeData(resData);
		System.out.println("렌터카 예약 정보 수정 시간 : " + showTime());
		System.out.println("차를 예약합니다.");
	}
	
	public void cancelReserveInfo(ResVo vo) {
		resData = "예약 차 번호 : " + vo.resCarNumber + "," + 
				"예약 날짜 : " + vo.resDate + "," +
				"이용 시작 일자 : " + vo.useBeginDate + "," +
				"차 반납 일자 : " + vo.returnDate;
		DataUtil.decodeData(resData);
		System.out.println("렌터카 예약 정보 삭제 시간 : " + showTime());
		System.out.println("차 예약 정보를 삭제합니다.");
	}

	@Override
	public String reserverCar(ResVo vo) {
		// TODO Auto-generated method stub
		return null;
	}
}
