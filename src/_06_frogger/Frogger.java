package _06_frogger;

import java.lang.reflect.Method;

import processing.core.PApplet;

public class Frogger extends PApplet {
    static final int WIDTH = 600;
    static final int HEIGHT = 400;
    int x = 400;
    int y = 600;
    Car car;
    Car car1;
    Car car2;
    @Override
    public void settings() {
        size(800, 600);
    }

    @Override
    public void setup() {
    	car = new Car(250, 200, 100);
    	car1 = new Car(250, 350, 100);
    	car2 = new Car(250, 500, 100);
    	
    }

    @Override
    public void draw() {
    	background(150, 50, 250);
    	fill(0, 80, 0);
    	ellipse(x,y, 50, 50);
    	notoutofbox();
    	car.display();
    	car.move(10);
    	car1.display();
    	car1.moveleft(10);
    	car2.display();
      	car2.move(5);
      	if (intersects(car) == true) {
      		y=600;
      	}

      	if (intersects(car1) == true) {
      		y=600;
      	}

      	if (intersects(car2) == true) {
      		y=800;
      	}
    }
   
    public void keyPressed()
	{
	    if(key == CODED){
	        if(keyCode == UP)
	        {
	        y-=5;
	        }
	        else if(keyCode == DOWN)
	        {
	        y+=5;
	        }
	        else if(keyCode == RIGHT)
	        {
	       x+=5;
	        }
	        else if(keyCode == LEFT)
	        {
	        x-=5;
	        }
	    }
	}
    public void notoutofbox() {
    	if (x==800) {
    		x-=5;
    	}
    	if (x==0) {
    		x+=5;
    	}
    	if (y==600) {
    		y-=5;
    	}
    	if (y==0) {
    		y+=5;
    	}
    }
    static public void main(String[] args) {
        PApplet.main(Frogger.class.getName());
    }
    boolean intersects(Car car) {
   	 if ((y > car.y && y < car.y+50) &&
   	                (x > car.x && x < car.x+car.size)) {
   	   return true;
   	  }
   	 else  {
   	  return false;
   	 }
}
    class Car {
    	
    	int x;
    	int y;
    	int size = 100;
    	Car(int x, int y, int size) {
    		this.x = x;
    		this.y = y;
    		this.size = size;
    	   }
        public void display() {
        	fill(0,255,0);
            rect(x , y,  size, 50);
          }
        public void move(int speed) {
        	x-=speed;
        	if (x==-100) {
        		x = 900;
        	}
        }
        public void moveleft(int speed) {
        	x+=speed;
        	if (x==900) {
        		x = -100;
        	}
        }
        

  }
}
