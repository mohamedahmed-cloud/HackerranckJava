# Java Method Notes

- #### To Convert Number to String 
**Use Mehtod called `String.valueOf()`* 
```java
    String myString=String.valueOf(number);
```
------------
- #### Find Date with [`class Calendar`](https://docs.oracle.com/javase/7/docs/api/java/util/Calendar.html)
- `Type Date In Your laptop`
```java
        Date dt=new Date();
        System.out.println(dt);
```
- `This Code Manage you to get day name from date[year,month,day]`

```java 
        String[] Week_Day={"SUNDAY","MONDAY","TUESDAY","WEDNESDAY","THURSDAY" ,"FRIDAY","SATURDAY"  };
        Calendar cal=Calendar.getInstance();
        cal.set(year,month-1,day);
        int num=cal.get(Calendar.DAY_OF_WEEK);
        System.out.println(Week_Day[num-1]);
```
---------

- #### Currancy Formatting
  - **We First Use `NumberFormat ` and Make an object from it** 
  - **Second We Use `The Method in Number Format Object called "Format"` to make a format `us.format(input)`**
  ```java
        Scanner scanner=new Scanner(System.in);
        double input=scanner.nextDouble();
        NumberFormat us=NumberFormat.getCurrencyInstance(Locale.US);
        System.out.println("US: " +us.format(input));
  ```

**`Another Way`**

```java
        Scanner scanner=new Scanner(System.in);
        double input=scanner.nextDouble();
        Locale IndiaLocal=new Locale("in", "in");
        NumberFormat in=NumberFormat.getCurrencyInstance(IndiaLocal);
        System.out.println("India: " +in.format(input));
```
----
- #### Assign value 
-  **We use `==` when comparing with number**
-  **We use .equals()`When comparing with String or reference type**
-  **we use `.equalsIgnoreCase()` when comparing with String and ignoring case sensitive**
  
```java
        // In String
        
        if(str.equalsIgnoreCase(str2){
                //
        }
        if(str.equals(reverseStr)){
                ///
        }
        //  IN Number
        if(num==num1){
                //
        }

```
--------
- #### ***String Notes***
- `To Split String to Array`
- `To convert String into Array`
```java
        String a=scanner.next();
        String [] arr1=a.split("");
````
- `Convert uppercase,lowercase to lowercase`
```java
        arr2[i].toLowerCase();
```
- #### Check a number in a string or Not
  ```java
  if(str.contains("s")){
          //
  }
  ```
  ---
- #### ***To Compare string alphetic order in java***

  ```java
        /*
        Let str="a" and str2="b"
        The result will be:-1
        Let str="b" and str2="a" 
        The result will be:1
        */
  if(str.compareTo(str2)>0){
          //
  }
  ```
  ---
- #### ***To Check If the element in array is empty or not***
  ```java
  <!--Note this is So Important -->
        if(arr[i].isEmpty()){
                //
        }
  ```
---
- #### ***To Check The Pattern is Valid or not Using `Pattern Class`***
```java
try{
        Pattern p=Pattern.compile(pattern);
        Sytem.out.println("Valid");
}catch(PatternSyntaxException e){
        System.out.println("Invalid");
        //
}
```
 ---
 - #### ***To Take Very Huge Number From User***
  ```java 
        Scanner scanner=new Scanner(System.in);
        BigInteger n = scanner.nextBigInteger();
        <!-- To check if this is prime of not -->
        <!-- The Number inside isProbablePrime can be any integer -->
        System.out.println(n.isProbablePrime(10) ? "prime" : "not prime");

  ```
---
- #### ***Big Integer Notes***
```java
        BigInteger big1=scanner.nextBigInteger();
        BigInteger big2=scanner.nextBigInteger();
        // To add two Big Integer
        BigInteger out1=big1.add(big2);
        // To Multiple two Big Integer
        BigInteger out2=big1.multiply(big2);
```

