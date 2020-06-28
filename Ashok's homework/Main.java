#include<iostream>
int main()
{
    int s1,s2;
  std::cin>>s1;
  std::cin>>s2;
  int a1[s1][s2],a2[s1][s2];
  for(int i=0;i<s1;i++){
    for(int j=0;j<s2;j++){
      std::cin>>a1[i][j];
    }
  }
  for(int i=0;i<s1;i++){
    for(int j=0;j<s2;j++){
      std::cin>>a2[i][j];
    }
  }
  for(int i=0;i<s1;i++){
    for(int j=0;j<s2;j++){
      std::cout<<a1[i][j]+a2[i][j]<<" ";
    }
    std::cout<<"\n";
  }  
}
  
