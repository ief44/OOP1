//Section 7, Lesson 3 Starter for Exercise 1 - Slide 6
package prisiontest;

import prisoner.Prisoner;

public class PrisonTest {

    public static void main(String[] args) {
	Prisoner p01 = new Prisoner();
	
	
    
	p01.name = "Bubba";
	p01.height ="2.08";
	p01.sentence = "4";
	System.out.println(p01.name);
	System.out.println(p01.height);
	System.out.println(p01.sentence);
	p01.speak();
    
	Prisoner p02 = new Prisoner();
	p02.name = "Twitch";
	p02.height ="1.73";
	p02.sentence = "3";
	System.out.println(p02.name);
	System.out.println(p02.height);
	System.out.println(p02.sentence);
	p02.speak();
  }
}