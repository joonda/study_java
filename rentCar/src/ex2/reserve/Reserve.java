package ex2.reserve;

public interface Reserve {
	public String reserverCar(ResVo vo);
	public void modReserveInfo(ResVo vo);
	public void cancelReserveInfo(ResVo vo);
}
