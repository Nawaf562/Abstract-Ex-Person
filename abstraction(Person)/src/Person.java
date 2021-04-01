public abstract class Person {

    private String name ;
    private String address;
    
    Person (){
    	
    } 
    Person(String newname , String newadd ){                   
		
		   name = newname;
		   address = newadd;
}
    public void setname(String newname){  

		  this.name = newname;
		}
  	public String getname(){             
			 
			 return name;
		}
    abstract void printinfo() ;
  
}
