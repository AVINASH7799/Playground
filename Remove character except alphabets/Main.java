#include<iostream>
#include<string>
using namespace std;
int main()
{
  string s;
  int i=0,c=0;
  std::cin>>s;
  
  
  for (int i = 0; i < s.size(); i++) { 
          
        if (s[i] < 'A' || s[i] > 'Z' && 
            s[i] < 'a' || s[i] > 'z'){
        s.erase(i,1);
          i--;
    } 
  } 
  std::cout<<s;
}