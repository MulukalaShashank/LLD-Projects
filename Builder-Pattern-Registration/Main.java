package PBuilder;

public class Main {
	public static void main(String[] args) {
  Builder b = new Builder();
  Real_Server ref = b.name("Shashank")
  .password("Java").
  email("shashank1").
  phone(994994L).address("Jubilee hills")
  .build();
  ref.start();
	}
}
