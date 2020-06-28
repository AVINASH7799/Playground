#include<iostream>
int main(){
  int o=0,e=0,n;
  std::cin>>n;
  int a[n];
  for(int i=0;i<n;i++){
  std::cin>>a[i];
    if(a[i]%2==0)
      e+=1;
    else
      o+=1;
  
  }
  std::cout<<o<<"\n";
  std::cout<<e;
  
  return 0;
}