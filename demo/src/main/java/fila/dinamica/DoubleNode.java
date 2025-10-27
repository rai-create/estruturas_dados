package fila.dinamica;

public class DoubleNode<T> {
	private T data;
	private DoubleNode<T> previous;
	private DoubleNode<T> next;

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public DoubleNode<T> getPrevious() {
		return previous;
	}

	public void setPrevious(DoubleNode<T> previous) {
		this.previous = previous;
	}

	public DoubleNode<T> getNext() {
		return next;
	}

	public void setNext(DoubleNode<T> next) {
		this.next = next;
	}
}