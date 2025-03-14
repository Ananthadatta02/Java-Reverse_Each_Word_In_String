# Reverse Each Word in a String

## Description
This Java program takes a string input from the user and reverses each word in the string while keeping their original positions intact. It achieves this by splitting the string into words, reversing each word separately, and then combining them back into a final result.

## How the Code Works
### 1. **Scanner Input**
```java
Scanner s = new Scanner(System.in);
System.out.println("Enter the String");
String st = s.nextLine();
```
- The `Scanner` class is used to take user input.
- `s.nextLine()` reads the entire input string entered by the user.

### 2. **Splitting the String into Words**
```java
String arr[] = st.split(" ");
```
- The `split(" ")` method is used to break the string into individual words based on spaces.
- The resulting words are stored in the `arr` array.

### 3. **Printing the Words Before Reversing**
```java
System.out.println("Before Reversing " + Arrays.toString(arr));
```
- This statement prints the words before reversing them using `Arrays.toString(arr)`.

### 4. **Loop to Reverse Each Word**
```java
for(int i = 0; i <= arr.length - 1; i++) {
    arr[i] = reverse(arr[i]);
}
```
- The `for` loop iterates over each word in the `arr` array.
- The `reverse` method is called for each word, replacing the original word with its reversed version.

### 5. **Printing the Words After Reversing**
```java
System.out.println("After Reversing " + Arrays.toString(arr));
```
- This statement prints the words after they have been reversed.

### 6. **Combining Reversed Words into a Single String**
```java
String result = "";
for(int i = 0; i <= arr.length - 1; i++) {
    if(i == arr.length)
        result = result + arr[i];
    else
        result = result + arr[i] + " ";
}
```
- A new empty string `result` is created.
- The loop iterates through the reversed words, appending them to `result` with spaces in between.
- The condition `if(i == arr.length)` is incorrect and will never execute since `i` never equals `arr.length`. The correct condition should be `if(i == arr.length - 1)` to avoid an extra space at the end.

### 7. **Printing the Final Result**
```java
System.out.println(result);
```
- The final reversed string is printed to the console.

## Reverse Method Explanation
```java
public static String reverse(String a) {
    String rev = "";
    for(int i = a.length() - 1; i >= 0; i--) {
        rev = rev + a.charAt(i);
    }
    return rev;
}
```
- This method takes a string `a` as input and returns its reversed version.
- It initializes an empty string `rev`.
- A `for` loop iterates from the last character of `a` to the first, appending each character to `rev`.
- Finally, the reversed word is returned.

## Example Execution
### **Input:**
```
Enter the String: Hello World
```
### **Output:**
```
Before Reversing [Hello, World]
After Reversing [olleH, dlroW]
olleH dlroW
```

## Clone
```
git clone https://github.com/Ananthadatta02/Java-Reverse_Each_Word_In_String.git
```
