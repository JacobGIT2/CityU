## Interface

- Interface variable 连接的是**实现该接口的实例**
  说明什么呢，接口实现的是功能上的填补

  *比如在一个自定义类中我们声明一个接口变量，表明我们只需一个能做这些事的实例而不关心这些实例是什么类的*

  ```java
  class Report {
      void generateReport() {
          // 生成报告逻辑
      }
  }
  
  class ReportPrinter {
      void printReport(Report report) {
          // 打印报告逻辑
      }
  }
  ```

  

## oo design

- 好的oo design在对象方法编写时只处理（检查/修改）**当前对象**的属性

In code

```java
Money m2 = another.new Money("JPY", 123);
```

Does the new created Money object have **any relationship** with the Object another? Or the new created Money object is totally seperated.

## Exception handling

- using **exception** 

  + avoid using **if-else** that mix exception handling with regular code
    ```java
    readFile {
        try {
            operation1;
            operation2;
            operation3;
            operation4;
            operation5;
        } catch (operation1Exception) {
            do something;
        } catch (operation2Exception) {
            do something;
        } ......
    }
    ```

    

  + have built-in exception/error-type that's already **categorized**

  + no need to sacrifice return value of function to propagate error message
    ```java
    method1 {
    	try {
    		call method2;
    	} catch (exception e) {
            doErrorProcessing;
        }
    }
    
    method2 throws exception {
        call readFile;
    }
    ```

    

## Inner Object

- Inner Object 实例化需要一个 Outer Object 实例来进行
  随后，这个 inner object 会被绑定在 Outer Object 上，即使 Outer Object 没有相应的属性变量来记忆这个 inner object，这个inner object 仍然能在其生命周期内获取 outer object 的信息，就和寄生虫一样

  ```java
  class BankAccount {
  	private class Money {
  		private String currency;
  		private double value;
  
  		public Money(String c, double b) {
  			currency = c;
  			value = b;
  		}
  
  		public String getOwner() {
  			return owner;
  		}
  	}
  
  	private Money balance;
  	private String owner;
  
  	public BankAccount(String currency, String ow) {
  		owner = ow;
  		balance = new Money(currency, 0.00);
  	}
  
  	public void methodX() {
  		BankAccount another = new BankAccount("RMB", "Tom");
  		Money m1 = new Money("HKD", 88);
  		Money m2 = another.new Money("JPY", 123);
  
  		System.out.printf("%.2f(%s) %.2f(%s) %.2f(%s) %.2f(%s)", 
  			this.balance.value, this.balance.getOwner(),
  			another.balance.value, another.balance.getOwner(), 
  			m1.value, m1.getOwner(), m2.value, m2.getOwner());
  	}
  
  	// public static void methodY() {
  	// 	new Money("JPY", 0.00); // Compilation error
  	// }
  }
  
  public class Main {
  	public static void main(String[] args) {
  		BankAccount account = new BankAccount("HKD", "Helena");
  		account.methodX();
  	}
  }
  ```

  

