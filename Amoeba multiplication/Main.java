#include<iostream>
using namespace std;
int main()
{
  int n,a=0,b=1,t=0,i=0;
  std::cin>>n;
  do{
     t=a+b;
     a=b;
     b=t;
     i++;
  }while(i<n-2) ;
   std::cout<<t; 
}