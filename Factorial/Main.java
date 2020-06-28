#include<iostream>
long fact(int n)
{
  if(n==1)
    return 1;
  else 
    return n*fact(n-1);
}  
int main()
{
  int n;
  std::cin>>n;
  long fa=fact(n);
  std::cout<<"The factorial of "<<n<<" is "<<fa;
}