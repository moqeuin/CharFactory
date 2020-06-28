package item;

public class Potion implements Item {

	@Override
	public void excuteItem() {
		System.out.println("포션을 사용했습니다.");
	}
}