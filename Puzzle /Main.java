#include<iostream>
int main()
{
    int m,n,t;
  std::cin>>m>>n;
  int a[m][n];
  for(int i=0;i<m;i++){
    for(int j=0;j<n;j++){
      std::cin>>a[i][j];
    }
  }
 
  for(int i=0;i<n;i++){
    for(int j=0;j<m;j++){
      std::cout<<a[j][i]<<" ";
    }
    std::cout<<"\n";
  }
  
}