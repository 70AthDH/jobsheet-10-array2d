# JOBSHEET ARRAY 2D

Name: Athaaullah Dhiyaaul Haq

class: 1I TI

NIM: 264107020187

---

## Experiment list

- [Cinema (2D Array)](#experiment-1)
- [Cinema with Scanner(user input to a 2D array)](#experiment-2)
- [Number (figuring array row)](#experiment-3)
- [siakad (using array to store data)](#experiment-4)
- [Assignment](#assignment)

---

## Objective

- Declare, instantiate, and initialize 2-dimensional arrays in Java.
- Access and fill elements of a 2-dimensional array using row and column indices.
- Process 2-dimensional arrays with nested loops, using both for and foreach.
- Create 2-dimensional arrays whose rows have different lengths (*jagged arrays*).
- Compute row averages and column averages in a real case study.

## practicum

### Experiment 1

Question

1. Must the elements of an array be filled in order, starting from index 0? Explain!
2. Temporarily comment out the line audience[3][1] = "Hana";, then compile and run again.
What is printed for row 4 now? Explain using the default values of arrays.
3. Restore the line you commented out in Question 2. Why is it important to fill every element
before the array is displayed?
4. Add the following code after Step 4. Explain the purpose of audience.length and
audience[0].length!

>```java
> System.out.println(audience.length);
> System.out.println(audience[0].length);
> System.out.println(audience[1].length);
> System.out.println(audience[2].length);
> System.out.println(audience[3].length);
>```

5. Do audience[0].length, audience[1].length, audience[2].length, and audience[3].length
have the same value? Why?
6. Modify the code in Question 4 to display the length of every row using a for loop. Compile,
run, and observe the result.
>```java
> System.out.println(audience.length);
>
> for (int i = 0; i < audience.length; i++) {
> System.out.println("Length of row " + (i + 1) + ": " + audience[i].length);
> }
>```

7. Modify the code in Question 5 to display the length of every row using a foreach loop.
Compile, run, and observe the result.

>```java
> System.out.println(audience.length);
>
> for (String[] rowAudience : audience) {
> System.out.println("Row length: " + rowAudience.length);
> }
>```

8. Add code to display the names in row 3 (index 2) using a for loop. Compile, run, and
observe the result.

>```java
> System.out.println("Audience in row 3: ");
>
> for (int i = 0; i < audience[2].length; i++) {
> System.out.println(audience[2][i]);
> }
>```

Dasar Pemrograman 2026
4 Team Teaching Dasar Pemrograman 2026
Politeknik Negeri Malang
9. Modify the code in Question 8 to use a foreach loop. Compile, run, and observe the result.

>```java
> System.out.println("Audience in row 3: ");
>
> for (String name : audience[2]) {
> System.out.println(name);
> }
>```

10. Modify the code in Question 9 to display the audience of every row. Use String.join(),
compile, run, and observe the result.

>```java
> for (int i = 0; i < audience.length; i++) {
> System.out.println("Audience in row " + (i + 1) + ": " + String.join(", ", audience[i]));
> }
>```

11. In your opinion, what are the advantages and disadvantages of a foreach loop compared to
a for loop?
12. What is the maximum row index of the array audience? Where does this value come from?
13. What is the maximum column index of the array audience? Is it the same for every row?
14. What does String.join() do? Explain the parameters it receives.

Answer

final code:

```java
public class cinema02 {
    public static void main(String[] args) {
        String[][] audience = new String[4][2];

        audience[0][0] = "Amin";
        audience[0][1] = "Bena";
        audience[1][0] = "Candra";
        audience[1][1] = "Dela";
        audience[2][0] = "Eka";
        audience[2][1] = "Farhan";
        audience[3][0] = "Gisel";
        audience[3][1] = "Hana";

        System.out.printf("%s \t %s\n", audience[0][0], audience[0][1]);
        System.out.printf("%s \t %s\n", audience[1][0], audience[1][1]);
        System.out.printf("%s \t %s\n", audience[2][0], audience[2][1]);
        System.out.printf("%s \t %s\n", audience[3][0], audience[3][1]);

        System.out.println(audience.length);
        for (String[] rowAudience : audience) {
            System.out.println("Row length: " + rowAudience.length);
        }

        for (int i = 0; i < audience.length; i++) {
            System.out.println("Audience in row " + (i + 1) + ": " + String.join(", ", audience[i]));
        }
    }
}
```

1. No. Array elements can be assigned in any order within valid row and column bounds (0 to length - 1) because each element is addressed directly by its index.
2. Row 4 prints Gisel and null. Unassigned elements in a String array default to null because String is a reference type.
3. Filling every element prevents unintended null output and avoids NullPointerExceptions when operations or methods are later called on array elements.
4. audience.length gives the number of rows (4), while audience[0].length gives the number of columns in row 0 (2).
5. Yes, all four equal 2 because audience was created with fixed dimensions new String[4][2].
6. Modified with a for loop to print each row's length using audience[i].length.

>```java
>System.out.println(audience.length);
>for (int i = 0; i < audience.length; i++) {
>    System.out.println("Length of row " + (i + 1) + ": " + audience[i].length);
>}
>```

7. Modified with a foreach loop iterating over String[] rowAudience : audience to print rowAudience.length.

>```java
>System.out.println(audience.length);
>for (String[] rowAudience : audience) {
>    System.out.println("Row length: " + rowAudience.length);
>}
>```

8. Prints every element in row index 2 (row 3) using a standard for loop up to audience[2].length.

>```java
>System.out.println("Audience in row 3: ");
>for (String name : audience[2]) {
>    System.out.println(name);
>}
>```

9. Modified (mod) to iterate over audience[2] using for (String name : audience[2]).

>```java
>for (int i = 0; i < audience.length; i++) {
>    System.out.println("Audience in row " + (i + 1) + ": " + String.join(", ", audience[i]));
>}
>```

10. Modified (mod) to print each row's elements joined by ", " using String.join(", ", audience[i]).
11. Better to see inb output
12. The maximum row index is 3 (audience.length - 1), since indexing starts at 0 for 4 rows.
13. The maximum column index is 1 (audience[i].length - 1), and it is the same (1) for every row in this 4x2 array.
14. String.join(delimiter, elements) joins elements into a single string separated by delimiter (first argument), accepting either varargs of CharSequence or an Iterable (second argument).

### Experiment 2

Question

1. Must the elements of an array be filled from Scanner in order, starting from index 0?
Explain!
2. Modify the program so that it shows the following menu:

>| Menu | Function |
>|-|-|
>| 1 | Enter audience data |
>| 2 | Show the audience list |
>| 3 | Exit |

3. Modify the program to handle a row or column number that does not exist (for example
row 7 or column 0).
4. In menu 1, display a warning if the chosen seat is already taken by another audience
member, then ask for the row and column again.
Hint: A seat is taken when audience[row - 1][col - 1] != null. The range must also be
checked against audience.length for rows, and audience[row - 1].length for columns.
5. In menu 2, if a seat is empty (null), display *** instead of null.

Answer

final code:

```java
import java.util.Scanner;

public class cinemawithscanner02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row, col;
        String name, choice;
        String[][] audience = new String[4][2];

        while (true) {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Enter audience data");
            System.out.println("2. Show the audience list");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int menu = sc.nextInt();
            sc.nextLine();

            if (menu == 1) {
                while (true) {
                    System.out.print("Enter name: ");
                    name = sc.nextLine();

                    while (true) {
                        System.out.print("Enter row (1-" + audience.length + "): ");
                        row = sc.nextInt();
                        System.out.print("Enter column (1-" + audience[0].length + "): ");
                        col = sc.nextInt();
                        sc.nextLine();

                        if (row < 1 || row > audience.length || col < 1 || col > audience[row - 1].length) {
                            System.out.println("Invalid row or column number. Please try again.");
                        } else if (audience[row - 1][col - 1] != null) {
                            System.out.println("Warning: Seat (" + row + ", " + col + ") is already taken by " + audience[row - 1][col - 1] + ". Please choose another seat.");
                        } else {
                            break;
                        }
                    }

                    audience[row - 1][col - 1] = name;

                    System.out.print("Add another audience member? (y/n): ");
                    choice = sc.nextLine();

                    if (choice.equalsIgnoreCase("n")) {
                        break;
                    }
                }
            } else if (menu == 2) {
                for (int i = 0; i < audience.length; i++) {
                    for (int j = 0; j < audience[i].length; j++) {
                        String seat = (audience[i][j] == null) ? "***" : audience[i][j];
                        System.out.print(seat + "\t");
                    }
                    System.out.println();
                }
            } else if (menu == 3) {
                break;
            }
        }
        sc.close();
    }
}
```

1. No. Because the user enters row and column positions at runtime, seats can be filled in any order within valid bounds.
2. Added a 1–3 menu loop supporting entering audience data, showing the audience list, and exiting.

```java
import java.util.Scanner;

public class cinemawithscanner02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] audience = new String[4][2];

        while (true) {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Enter audience data");
            System.out.println("2. Show the audience list");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int menu = sc.nextInt();
            sc.nextLine();

            if (menu == 1) {
                while (true) {
                    System.out.print("Enter name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter row: ");
                    int row = sc.nextInt();
                    System.out.print("Enter column: ");
                    int col = sc.nextInt();
                    sc.nextLine();

                    audience[row - 1][col - 1] = name;

                    System.out.print("Add another audience member? (y/n): ");
                    String choice = sc.nextLine();
                    if (choice.equalsIgnoreCase("n")) {
                        break;
                    }
                }
            } else if (menu == 2) {
                for (int i = 0; i < audience.length; i++) {
                    for (int j = 0; j < audience[i].length; j++) {
                        System.out.print(audience[i][j] + "\t");
                    }
                    System.out.println();
                }
            } else if (menu == 3) {
                break;
            }
        }
        sc.close();
    }
}
```

3. Added row and column range checks (mod) against 1 through audience.length and audience[row - 1].length to reject out-of-range inputs.

```java
import java.util.Scanner;

public class cinemawithscanner02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] audience = new String[4][2];

        while (true) {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Enter audience data");
            System.out.println("2. Show the audience list");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int menu = sc.nextInt();
            sc.nextLine();

            if (menu == 1) {
                while (true) {
                    System.out.print("Enter name: ");
                    String name = sc.nextLine();

                    int row, col;
                    while (true) {
                        System.out.print("Enter row (1-" + audience.length + "): ");
                        row = sc.nextInt();
                        System.out.print("Enter column (1-" + audience[0].length + "): ");
                        col = sc.nextInt();
                        sc.nextLine();

                        if (row < 1 || row > audience.length || col < 1 || col > audience[row - 1].length) {
                            System.out.println("Invalid row or column number. Please try again.");
                        } else {
                            break;
                        }
                    }

                    audience[row - 1][col - 1] = name;

                    System.out.print("Add another audience member? (y/n): ");
                    String choice = sc.nextLine();
                    if (choice.equalsIgnoreCase("n")) {
                        break;
                    }
                }
            } else if (menu == 2) {
                for (int i = 0; i < audience.length; i++) {
                    for (int j = 0; j < audience[i].length; j++) {
                        System.out.print(audience[i][j] + "\t");
                    }
                    System.out.println();
                }
            } else if (menu == 3) {
                break;
            }
        }
        sc.close();
    }
}
```

4. Added a check (mod) for audience[row - 1][col - 1] != null to warn when a seat is already occupied and re-prompt for row and column.

```java
import java.util.Scanner;

public class cinemawithscanner02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] audience = new String[4][2];

        while (true) {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Enter audience data");
            System.out.println("2. Show the audience list");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int menu = sc.nextInt();
            sc.nextLine();

            if (menu == 1) {
                while (true) {
                    System.out.print("Enter name: ");
                    String name = sc.nextLine();

                    int row, col;
                    while (true) {
                        System.out.print("Enter row (1-" + audience.length + "): ");
                        row = sc.nextInt();
                        System.out.print("Enter column (1-" + audience[0].length + "): ");
                        col = sc.nextInt();
                        sc.nextLine();

                        if (row < 1 || row > audience.length || col < 1 || col > audience[row - 1].length) {
                            System.out.println("Invalid row or column number. Please try again.");
                        } else if (audience[row - 1][col - 1] != null) {
                            System.out.println("Warning: Seat (" + row + ", " + col + ") is already taken by " + audience[row - 1][col - 1] + ". Please choose another seat.");
                        } else {
                            break;
                        }
                    }

                    audience[row - 1][col - 1] = name;

                    System.out.print("Add another audience member? (y/n): ");
                    String choice = sc.nextLine();
                    if (choice.equalsIgnoreCase("n")) {
                        break;
                    }
                }
            } else if (menu == 2) {
                for (int i = 0; i < audience.length; i++) {
                    for (int j = 0; j < audience[i].length; j++) {
                        System.out.print(audience[i][j] + "\t");
                    }
                    System.out.println();
                }
            } else if (menu == 3) {
                break;
            }
        }
        sc.close();
    }
}
```

5. Replaced null seats in menu 2 (mod) with *** (matching the blank prompt in the jobsheet).

```java
import java.util.Scanner;

public class cinemawithscanner02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] audience = new String[4][2];

        while (true) {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Enter audience data");
            System.out.println("2. Show the audience list");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int menu = sc.nextInt();
            sc.nextLine();

            if (menu == 1) {
                while (true) {
                    System.out.print("Enter name: ");
                    String name = sc.nextLine();

                    int row, col;
                    while (true) {
                        System.out.print("Enter row (1-" + audience.length + "): ");
                        row = sc.nextInt();
                        System.out.print("Enter column (1-" + audience[0].length + "): ");
                        col = sc.nextInt();
                        sc.nextLine();

                        if (row < 1 || row > audience.length || col < 1 || col > audience[row - 1].length) {
                            System.out.println("Invalid row or column number. Please try again.");
                        } else if (audience[row - 1][col - 1] != null) {
                            System.out.println("Warning: Seat (" + row + ", " + col + ") is already taken by " + audience[row - 1][col - 1] + ". Please choose another seat.");
                        } else {
                            break;
                        }
                    }

                    audience[row - 1][col - 1] = name;

                    System.out.print("Add another audience member? (y/n): ");
                    String choice = sc.nextLine();
                    if (choice.equalsIgnoreCase("n")) {
                        break;
                    }
                }
            } else if (menu == 2) {
                for (int i = 0; i < audience.length; i++) {
                    for (int j = 0; j < audience[i].length; j++) {
                        String seat = (audience[i][j] == null) ? "***" : audience[i][j];
                        System.out.print(seat + "\t");
                    }
                    System.out.println();
                }
            } else if (menu == 3) {
                break;
            }
        }
        sc.close();
    }
}
```


### Experiment 3

Question

1. What does Arrays.toString() do?
2. In Code 16, Arrays.toString() is called on myNumbers[i]. Change the call to
Arrays.toString(myNumbers), then compile and run the program. What is displayed?
Explain.
3. Also run System.out.println(Arrays.deepToString(myNumbers));. Compare the result with
Code 16. Why is deepToString() needed for a 2-dimensional array?
4. What is the default value of an array element of type int?
5. Add the following code to display the length of each row. Compile and run it, then observe
the result.

>```java
> for (int i = 0; i < myNumbers.length; i++) {
> System.out.println("Length of row " + (i + 1) + ": " + myNumbers[i].length);
> }
>```


6. The array myNumbers has a different length for each row. Can the length of an array be
changed after it has been instantiated? Explain.
7. After instantiation, run myNumbers[0] = new int[7];, then print myNumbers.length and
myNumbers[0].length. Which value changes? Why?

Answer

final code:

```java
import java.util.Arrays;

public class numbersarray02 {
    public static void main(String[] args) {
        int[][] myNumbers = new int[3][];
        myNumbers[0] = new int[5];
        myNumbers[1] = new int[3];
        myNumbers[2] = new int[1];

        for (int i = 0; i < myNumbers.length; i++) {
            System.out.println(Arrays.toString(myNumbers[i]));
        }

        for (int i = 0; i < myNumbers.length; i++) {
            System.out.println("Length of row " + (i + 1) + ": " + myNumbers[i].length);
        }
    }
}
```

1.
2.

### Experiment 4

Question

1. What if the number of students and the number of courses change? Modify the SIAKAD
program so that both numbers can be decided while the program runs.

Answer

1.

## Assignment

Task:

1.
2.
