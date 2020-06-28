#include<iostream>
int fib(int n) 
{ 
  int a = 0, b = 1, c, i; 
  if( n == 0) 
    return a; 
  for (i = 2; i <n; i++) 
  { 
     c = a + b; 
     a = b; 
     b = c; 
  } 
  return b; 
} 
  
int main () 
{ 
  int n ; 
  std::cin>>n;
  std::cout<<"The term "<<n<<" in the fibonacci series is "<<fib(n);
  return 0; 
}  