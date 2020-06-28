#include<iostream>
int main()
{
  int n;
  std::cin>>n;
  int a[n];
  int max=0;
  for(int i=0;i<n;i++){
    std::cin>>a[i];
    if(a[i]>max)
      max=a[i];
  } 
   std::cout<<max; 
  
}