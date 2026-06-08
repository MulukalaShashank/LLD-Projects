package Proxy;

public interface Database {
	String getfile(int s);
	void put(int num, String name);
	void remove(int num);
}
