# Search-Algorithms

This is the second part of the course of Algorithms and Data Structures 

of the academic year 2017/2018 of the University of Florence. 

>  I'll try to implement in a very simple (and dumb) way all the algorithms

>  So even if you are novice i'll get the **Main Idea** quickly.

0. The [RandNumbers](https://github.com/DanerSound/Search-Algorithms/blob/master/randNumbers/scr/randomizer/Randomizer.java) :

   This is a very simple Java Class that generate some numbers for make the test using the algorithms.
   
      * ps. If your are asking " why he didnt use the java base ramdon generation ? "... well because it i'll be _too easy_ :D
      
1. The [Selection-Sort](https://github.com/DanerSound/Search-Algorithms/blob/master/Search-algorithms/src/base/SelectionSort.java) :

   This Algorithm works in place.
   
   It seeks for the minimum in the vector[0, n-1] and move it to the first position.
   
   repeats the operation in a vector of [0, n-2] elements, finds the second smallest element 
   
   and moves it in v[1] second position. It iterates this procedure until the vector is ordered.
   
         > we focus on find out the **minimum** and we use it as a _pivot_ 
        to make swaps.
   
   
2. The [Insertion-Sort](https://github.com/DanerSound/Search-Algorithms/blob/master/Search-algorithms/src/base/InsertionSort.java)

   The intuitive idea behind this algorithm is to imagine the ordering of playing cards in the hand.
   
   we _assign_ the max value to the "first card on **left**" and compare it to the adjacent one 
   
   and swap values if is necesary.
   
   We repeat the process by combining the elements in pairs until all are ordered.
   
3. The [Bubble-Sort](https://github.com/DanerSound/Search-Algorithms/blob/master/Search-algorithms/src/base/Bubblesort.java)

   Like the name, try to imagine a "group" of objects that float in the water.
   
   The _heaviest_ go **down** while the _lighter_ ones stay afloat.

   The algorithm must be executed **several times** to order the considered structure.
   
   At the end of every passage we are sure that the **greatest element has reached its final position**. 
   
   >the procedure is repeated with n-1 elements.
   
   The algorithm works by **comparing adjacent** elements and exchanging them 
   
   if the relative order between the two is not respected.
   
3.1 The [FlagedBubbleSort](https://github.com/DanerSound/Search-Algorithms/blob/master/Search-algorithms/src/base/BubblesortFlaged.java)

   This algorithm has a small variant compared to the 
   [original version](https://github.com/DanerSound/Search-Algorithms/tree/bubbler-sort) 
   with the objective of improving performance.
   
   Use a check flag to _avoid continuing_ to iterate when no exchanges are performed after some iteration.

4. The [Counting-Sort](https://github.com/DanerSound/Search-Algorithms/blob/master/Search-algorithms/src/base/CountingSort.java)

   This algorithm bases its operation in the hypothesis that the set of n elements 

   to be sortered is compressed between a number 0 and k (n dimension of the vector and k€N)

   >let x be a number, the most important step is the calculation of the predecessors 
   of x because x will be positioned in the position (x + 1)
   
5. The [QuicksortV1](hhttps://github.com/DanerSound/Search-Algorithms/blob/master/Search-algorithms/src/base/QuickSort.java)

   V1 is versione one, this is the most common implementation of the Quicksort that you can find in a text book.
   
   the core of this implementation is the method PARTITION that take the arrayToBeOrdered , choose the pivot la LAST element of              
   
   the array, so it swap to the leftside all the elements less than (pivot) or equal.
      
      >if the Element is on the right part of the array it will be swaped with with himself
      
   just at the end pivot will be swaped to his _final position_ 

   ![Work_in_progress](http://cliffordgarstang.com/wp-content/uploads/2013/01/Work_in_progress.png)

