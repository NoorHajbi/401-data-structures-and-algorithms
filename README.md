# 401-data-structures-and-algorithms

## Table of contents

  

| title       | Link to The challenge       | Link to The Code                 |         
| ------------|-----------------------------|----------------------------------|
|array-reverse|[Directory](challenges/reverse)|[Reverse](challenges/reverse/reverse.png)|
|insert-shift|[Directory](challenges/insert)|[Insert](challenges/insert/insert.png)|
|binary-search|[Directory](challenges/binarySearch)|[layout](challenges/binarySearch/binarySearch.jpg) And [binaryVisual](challenges/binarySearch/binaryVisual.jpg)|
|linked-list|[Directory](challenges/linked)| [LL](challenges/linked/app/src/main/java)|
|stack&queue|[Directory](challenges/stack&queue)| [LL](challenges/)|




# 1. Reverse an Array
<!-- Description of the challenge -->
We need to reverse array

Input - > Array

OutPut -> Reversed Array

# 2. Insert
We need to Insert value in the middle of the array

Input - > Array

OutPut -> Array new Value in the middle

# 3. Binary Search
We need to create a function that implements binary search:

Input - > a sorted array, and the search key.

OutPut -> The index of the array’s element that is equal to the value of the search key,
or -1 if the element is not in the array.


# 5.Singly Linked List
Singly linked lists contain nodes which have a data field as well as 'next' field, which points to the next node in line of nodes.

## Challenge
1. A Node class that has properties for the value stored in the Node, and a pointer to the next Node.
2. LinkedLink Class, that contains:
- A head property.
- Insert method -> Adds a new node In the beginning of the LinkedList.
- Includes method -> Indicates whether that value exists as a Node’s value somewhere within the list.
- to string -> Returns: a string representing all the values in the Linked List, formatted as:
"{ a } -> { b } -> { c } -> NULL"

# 6.Singly Linked List Insertions
To LinkedLink Class, Thses methods are added:
1. Append -> adds a new node with the given value to the end of the list
2. Insert before -> adds a new node with the given new value immediately before the first node that has the value specified
3. Insert after -> adds a new node with the given new value immediately after the first node that has the value specified.

## Solution
<!-- Show how to run your code, and examples of it in action -->
To run this code, type App.java the method with the arguments needed, then print.
list.insertAtEnd(value)
list.insertAfter(value, newvalue);
list.insertBefore(value, newvalue);

# 7.Singly Linked List ->kth from end function
Using this method you can insert the index, and it will return the value within that index or error messege of the index is out of the range.

# 7.Singly Linked List ->zip lists function
This function take 2 linked lists and return them as a one link list(zipped).

----

## Whiteboard Process
<!-- Embedded whiteboard image -->


### (1)
![Reverse](challenges/reverse/reverse.png)

### (2)
![Insert](challenges/insert/insert.png)

### (3)
![binarySearch](challenges/binarySearch/binarySearch.jpg)
![binaryVisual](challenges/binarySearch/binaryVisual.jpg) 

## (5)
[linkedList](challenges/linked/app/src/main/resources) 

## Approach & Efficiency
<!-- What approach did you take? Discuss Why. What is the Big O space/time for this approach? -->
