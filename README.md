# Search-Algorithms

This is the second part of the course of Algorithms and Data Structures 

of the academic year 2017/2018 of the University of Florence. 

>  I'll try to implemente in a very simple (and dumb) way all the algorithms

>  So even if you are novice i'll get the **Main Idea** quickly.

0. The [RandNumbers](https://github.com/DanerSound/Search-Algorithms/tree/master/randNumbers) :

   This is a very simple Java Class that generate some numbers for make the test using the algorithms.
   
      * ps. If your are asking " why he didnt use the java base ramdon generation ? "... well because it i'll be _too easy_ :D
      
1. The [Selection-Sort](https://github.com/DanerSound/Search-Algorithms/tree/sequential-sort) :

   This Algorithm works in place.
   
   It seeks for the minimum in the vector[0, n-1] and move it to the first position.
   
   repeats the operation in a vector of [0, n-2] elements, finds the second smallest element 
   
   and moves it in v[1] second position. It iterates this procedure until the vector is ordered.
   
         > we focus on find out the **minimum** and we use it as a _pivot_ 
        to make swaps.
   
   
2. The [Insertion-Sort](https://github.com/DanerSound/Search-Algorithms/tree/Insertion-sort/Search-algorithms/src/base)

   The intuitive idea behind this algorithm is to imagine the ordering of playing cards in the hand.
   
   we _assign_ the max value to the "first card on **left**" and compare it to the adjacent one 
   
   and swap values if is necesary.
   
   We repeat the process by combining the elements in pairs until all are ordered.
   
3. The [Bubble-Sort]()

   ![Work_in_progress](http://cliffordgarstang.com/wp-content/uploads/2013/01/Work_in_progress.png)
      
