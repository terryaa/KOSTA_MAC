package sec02.exam02_generic_type;

public class Box<T> {
	private T t;
	public T get() { return t; }
	public void set(T t) { this.t = t; }
}
