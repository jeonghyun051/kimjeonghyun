package ch05;

public abstract class Factory {
	protected abstract void ��ĥ();
	
	void ����() {
		System.out.println("�����Ϸ�");
	}
	
	public void ����() {
		��ĥ();
		����();
	}
	
}
