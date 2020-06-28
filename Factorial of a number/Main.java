#include<iostream>
int main(){
  int n,i;
  int x;
  std::cin>>n;
  x=1;
  for(i=1;i<=n;i++)
     x=x*i;
  std::cout<<x;
}