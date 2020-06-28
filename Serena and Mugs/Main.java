#include<iostream>
using namespace std;
int main()
{
  int n,v,s=0,j=0;
  std::cin>>n>>v;
  int a[n];
  for(int i=0;i<n;i++){
    std::cin>>a[i];
    s=s+a[i];
    if(s>v){
       j=1;
       break;}
  }
    if(j==1)
      std::cout<<"NO";
     else
       std::cout<<"YES";
  
}