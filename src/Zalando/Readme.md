## Coding Question 1

Write a function for given a String S of length N, returns any palindrome which can be obtained by replacing all of the question marks in S by lowercase letters ('a'-'z'). If no palindromes can be obtained, the function returns the string "NO".

Palindrome examples : mom, nayan, radar etc

Example : 
1. S = "?ab??a", the function returns "aabbaa"
2. S = "bab??a", the function returns "NO"
3. S = "?a?", the function returns "aaa" or "zaz", among probable answers

Assumption:
N has length between 0 and 1000
S contains lowercase letters from ['a'-'z'] and '?'

## Coding Question 2

An array consisting N integers given. We are looking for pairs of elements of the array that are equal but that occupy different positions in the array. More formally, a pair of indices (P,Q) is called identical if 0 <= P < Q < N and A[P] = A[Q]. The goal is to calculate the number of pairs of indices.

For example:

A[0] = 3
A[1] = 5
A[2] = 6
A[3] = 3
A[4] = 3
A[5] = 5

the function will return (0,3), (0,4), (1,5), (3,4)

Assumption:

N has size between 0 and 100,000
each element of Array is between [-1,000,000,000...1,000,000,000]