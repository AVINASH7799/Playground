#include<iostream>
int main()
{
  long  n;
  int i=0;
  std::cin>>n;
  do
  {
    i++ ;
    n=n/10;
  }while (n>0);
  std::cout<<i;
}