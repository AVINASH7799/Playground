#include<iostream>
using namespace std;
int main()
{
  int m,n,max;
  std::cin>>m>>n;
  int a[m][n];
  for(int i=0;i<m;i++)
  {
    for(int j=0;j<n;j++)
      std::cin>>a[i][j];
    
  }
  for(int i=0;i<n;i++)
  {max=0;
    for(int j=0;j<m;j++){
      if(max<a[j][i])
         max=a[j][i];}
   std::cout<<max<<"\n";
      
  }
}