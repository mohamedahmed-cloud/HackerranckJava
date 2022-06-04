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

