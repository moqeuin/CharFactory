package item;

public class Scroll implements Item {

	@Override
	public void excuteItem() {
		System.out.println("스크롤을 사용했습니다.");
	}
}