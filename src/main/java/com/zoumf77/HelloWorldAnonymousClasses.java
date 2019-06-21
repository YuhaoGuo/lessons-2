package com.zoumf77;

public class HelloWorldAnonymousClasses {
	
	public String hi="hi";
	
    interface HelloWorld {
        public void greet();
        public void greetSomeone(String someone);
    }
    
    /*inner class*/
    private class SayChinese implements HelloWorld {

		@Override
		public void greet() {
			System.out.println(hi+"你好，世界");
			
		}

		@Override
		public void greetSomeone(String someone) {
			System.out.println("你好"+someone);
			
		}
    	
    }
    
    /*inner class*/
    private class Japanese {
    }
    
  
    public void sayHello() {
        
    	/*localclass */
        class EnglishGreeting implements HelloWorld {
            String name = "world";
            public void greet() {
                greetSomeone("world");
            }
            public void greetSomeone(String someone) {
                name = someone;
                System.out.println("Hello " + name);
            }
        }
      
        HelloWorld englishGreeting = new EnglishGreeting();
        
        /*使用了匿名类*/
        HelloWorld frenchGreeting = new HelloWorld() {
            String name = "tout le monde";
            public void greet() {
                greetSomeone("tout le monde");
            }
            public void greetSomeone(String someone) {
                name = someone;
                System.out.println("Salut " + name);
            }
        };
        
        HelloWorld spanishGreeting = new HelloWorld() {
            String name = "mundo";
            public void greet() {
                greetSomeone("mundo");
            }
            public void greetSomeone(String someone) {
                name = someone;
                System.out.println("Hola, " + name);
            }
        };
        englishGreeting.greet();
        frenchGreeting.greetSomeone("Fred");
        spanishGreeting.greet();
        
        new SayChinese().greet();
    }

    
   
    public static void main(String... args) {
        HelloWorldAnonymousClasses myApp =
            new HelloWorldAnonymousClasses();
        myApp.sayHello();
    }  
    
    
}