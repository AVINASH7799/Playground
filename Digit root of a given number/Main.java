#include<iostream>
int sum(int n)
{
  int rem,s=0;
  do{
    rem=n%10;
    s=s+rem;
    n=n/10;
  }while(n>0);
  if(s/10!=0)
    return sum(s);
  else
    return s;
}
    
    int main()
{
  int n;
  std::cin>>n;
  std::cout<<sum(n);
}  