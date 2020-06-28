#include<iostream>
using namespace std;
int main()
{
  int n,m,add,i,j;
  std::cout<<"Enter the number of elements in the array\n";
  std::cin>>n;
  int  a[n];
  std::cout<<"Enter the elements in the array\n";
  for(int i=0;i<n;i++)
    std::cin>>a[i];
  std::cout<<"Enter the location where you wish to insert an element\n";
  std::cin>>m;
  
  if(m>n)
    std::cout<<"Invalid Input";
  else{
  std::cout<<"Enter the value to insert\n";
  std::cin>>add;
  n++;
    for(j=n-1;j>=m;j--)
    {
      a[j]=a[j-1];
    }
    a[m-1]=add;
   std::cout<<"Array after insertion is\n";
  for(i=0;i<n;i++)
    std::cout<<a[i]<<"\n";
  }
  }
        
   
   
