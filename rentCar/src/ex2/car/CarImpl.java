package ex2.car;

import ex2.base.Base;
import ex2.common.DataUtil;

public class CarImpl extends Base implements Car{
   String carData;
	
   //차의 정보를 조회하는 메서드
   public String checkCarInfo(CarVo vo){
      carData="차번호:"+vo.carNumber+","+
	  "차이름:"+vo.carName+","+
	  "차크기"+vo.carSize+","+
	  "차색상:"+vo.carColor+","+
	  "제조사:"+vo.carMaker;
		
      DataUtil.decodeData(carData);		
      System.out.println("렌터카 정보 조회시간:"+showTime());
      System.out.println("렌터카 정보를 조회합니다.");
		
      return carData;
   }	
	
   //새 차의 정보를 등록하는 메서드
   public void regCarInfo(CarVo vo){
      carData=vo.carNumber+","+
	  vo.carName+","+
	  vo.carSize+","+
	  vo.carColor+","+
	  vo.carMaker;DataUtil.encodeData(carData);
      System.out.println("렌터카 정보 등록 시간:"+showTime());
      System.out.println("렌터카를 등록합니다.");
   }

   //차 정보를 수정하는 메서드
   public void modCarInfo(CarVo vo){
      carData=vo.carNumber+","+
	  vo.carName+","+
	  vo.carSize+","+
	  vo.carColor+","+
	  vo.carMaker;
		
      DataUtil.encodeData(carData);		
      System.out.println("렌터카 정보 수정 시간:"+showTime());
      System.out.println("렌터카 정보를 수정합니다.");
   }
	
   //차 정보 삭제하는 메서드
   public void delCarInfo(CarVo vo){
      carData=vo.carNumber+","+
	   vo.carName+","+
	   vo.carSize+","+
	   vo.carColor+","+
	   vo.carMaker;
		
      DataUtil.decodeData(carData);		
      System.out.println("렌터카 정보 삭제 시간:"+showTime());
      System.out.println("렌터카 정보를 삭제합니다.");
   }
}