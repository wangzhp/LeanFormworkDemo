package com.wangzhp.demo;

public class person {
     public person() {
		// TODO Auto-generated constructor stub
    	 System.out.println("constructor");
	}
	
	    private String memo;
	    
	    private Student student;
	    
	  public void setStudent(Student student) {
			this.student = student;
		}
	  public Student getStudent() {
		  
		  return this.student;
		  
	  }
	  
	public String getMemo() {
		  System.out.println("getMemo");
			return memo;
			
		}
		public void setMemo(String memo) {
			 System.out.println("setMemo");
			this.memo = memo;
		}
	public void Say(){
		  
		  
		   System.out.println(memo);
	  }
	
}
