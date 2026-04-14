package com.example.demo.designePattern;

public class BuilderEx {
	
	public long id;
	public String name;
	public String addr;
	public int salary;
	
	private BuilderEx(Builder builder) {
		this.id=builder.id;
		this.name=builder.name;
		this.addr=builder.addr;
		this.salary=builder.salary;
	}
	
	
	
	@Override
	public String toString() {
		return "BuilderEx [id=" + id + ", name=" + name + ", addr=" + addr + ", salary=" + salary + "]";
	}



	static class Builder{
		public long id;
		public String name;
		public String addr;
		public int salary;
		
		public Builder Id(long id) {
			this.id=id;
			return this;
		}
		public Builder Name(String name) {
			this.name=name;
			return this;
		}
		public Builder Addr(String addr) {
			this.addr=addr;
			return this;
		}
		public Builder Salary(int salary) {
			this.salary=salary;
			return this;
		}
		
		public BuilderEx build() {
			return new BuilderEx(this);
		}
	}
	
	public static void main(String[] args) {
		BuilderEx obj = new BuilderEx.Builder().Name("abc").Id(2).build();
		System.out.println(obj);
	}

}


