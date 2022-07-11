Video for this [Data](https://www.youtube.com/watch?v=qaYfVIFik9Y)

```java
import java.io.File;

public class problem0010 {
    public static void main(String[]args){
        try{
            File myFile=new File("read.txt");
            if(myFile.createNewFile()){
                System.out.println("File is Created,File name is  "+myFile.getName());

            }
            else{
                System.out.println("File is already exists");
            }
        }catch(Exception e) {
            System.out.println(e.getMessage());
        }

    }

}
```

### Access File Data

- To Access File Name

```java
    myFile.getName(); 
```

- To Acces File path
  ```java
  myFile.getAbsolutePath();
  ```
- To know Do You Can write or not?
  ```java
  myFile.canWrite();
  ```
- To Know Do You Can Read or not?

```java
    myFile.canRead();
```

- To Acces File length

```java
    myFile.length();
```

----

## To Write & Append in File

```java
import java.io.File;
import java.io.FileWriter;

public class problem0010 {
    public static void main(String[]args){
        try{
            FileWriter file=new FileWriter("read.txt");
            file.write("hello man");
            file.write("hello man");
            file.write("hello man");
            file.close();

        }catch(Exception e) {
            System.out.println(e.getMessage());
        }

    }

}

```

- This Code close File and it's Important to make Write in a file
- Without This line the Write code doen't excuted

```java
file.close();
```

- Main Code To Write

```java
FileWriter file=new FileWriter("read.txt");
file.write("hello man");
```

## `or`

```java
 FileWriter file=new FileWriter("read.txt");
file.append("hello man ");
```

------

## To Read in File

```java
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class problem0010 {
    public static void main(String[]args){
        try{
            File file=new File("read.txt");
            Scanner scan=new Scanner(file);
            while(scan.hasNext()){
                String str=scan.nextLine();
                System.out.println(str);
            }
            scan.close();


        }catch(Exception e) {
            System.out.println(e.getMessage());
        }

    }

}

```

### Main Code To Write

```java
    File file=new File("read.txt");
    Scanner scan=new Scanner(file);
    while(scan.hasNext()){
        String str=scan.nextLine();
        System.out.println(str);
    }
    scan.close();
```

----