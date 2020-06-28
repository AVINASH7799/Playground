#include <iostream>
using namespace std;
int main()
{
 int i,n,x=1;
 std::cin>>n;
  for(i=1;i<=n;i++)
  {
    for( int j=1;j<=n;j++)
    {
      if(j==n&&i%2!=0)
        std::cout<<x+1;
      else if(j==1&&i%2==0)
        std::cout<<x+1;
      else
        std::cout<<x;
    }
    std::cout<<"\n";
    x++;
  }  
}