#include<iostream>
using namespace std;
int main()
{
  int n,i,o=0,e=0;
  std::cin>>n;
  int a[n];
  for(i=0;i<n;i++){
    std::cin>>a[i];
    if(a[i]%2==0)
      e=e+a[i];
    else
      o=o+a[i];
  }
  std::cout<<"The sum of the even numbers in the array is "<<e<<"\n";
  std::cout<<"The sum of the odd numbers in the array is "<<o;
  
}