package ex2;

import ex2.member.Member;
import ex2.member.Memberlmpl;
import ex2.member.MemberVo;
import ex2.reserve.ResVo;
import ex2.reserve.Reserve;
import ex2.reserve.ReserveImpl;
import ex2.base.Base;
import ex2.car.Car;
import ex2.car.CarImpl;
import ex2.car.CarVo;


public class RentTest {
	public static void main(String[] args) {
		String memInfo;
		String carInfo;
		String resInfo;
		
		CarVo carVo = new CarVo("1가 1111", "아반테", "은색", 2000, "현대");
		Car car = new CarImpl();
		car.regCarInfo(carVo);
		
		carInfo=car.checkCarInfo(carVo);
		((Base) car).displayData(carInfo);
		
		ResVo resVo = new ResVo("1가 1111", "2015-09-09", "2015-09-22", "2015-09-39");
		Reserve reserve = new ReserveImpl();
		resInfo = reserve.reserverCar(resVo);
		((Base) reserve).displayData(resInfo);
	}

}
