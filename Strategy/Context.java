package Strategy;

public class Context 
{
	DFly Fly;
	DRun Run;
	Dswim Swim;
	Dwalk walk;
	
   void set_walk(Dwalk obj)
   {
	   this.walk = obj;
   }
   void set_swim(Dswim obj)
   {
	   this.Swim = obj;
   }
   void set_fly(DFly obj)	
   {
	   this.Fly = obj;
   }
   void set_run(DRun obj)
   {
	   this.Run = obj;
   }
   
   void run()
   {
	   Run.Run();
   }
   void walk()
   {
	   walk.walk();
   }
   void fly()
   {
	   Fly.fly();
   }
    void swim()
   {
	 Swim.swim();  
   }
}
