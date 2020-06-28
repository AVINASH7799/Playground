#include<iostream>
using namespace std;
int main()
{
  int m,n,i,j;
  std::cin>>m>>n;
  int a[m][n],sum[m];
  for(i=0;i<m;i++){
    sum[i]=0;
    for(j=0;j<n;j++){
      std::cin>>a[i][j];
      sum[i]=sum[i]+a[i][j];
    }
  } 
  for(i=0;i<m;i++)
    std::cout<<sum[i]<<"\n";
}