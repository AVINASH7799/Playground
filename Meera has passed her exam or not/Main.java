#include<iostream>
int main()
{
  int n,m;
  std::cin>>n;
  int a[n];
  for(int i=0;i<n;i++){
    std::cin>>a[i];
    }
  std::cin>>m;
  for(int i=0;i<n;i++)
  {
    if(a[i]==m){
      std::cout<<"She passed her exam";
      goto end; 
    }
  }
  std::cout<<"She failed";
  end:{}
}