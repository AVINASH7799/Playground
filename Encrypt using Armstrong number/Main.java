#include<iostream>
int power(int m,int n)
{
    int j,i;
    for(i=1,j=1;i<=n;i++)
        j=j*m;
    return j;
}
int arm(int n)
{
  int sum=0,r,d=n,f=0,s=n;
  do{
    d=d/10;
    f++;
  }while(d>0);
  do{
      r=n%10;
      sum=sum+power(r,f);
      n=n/10;
    }while(n>0);
  if(sum==s)
    return 1;
  else
    return 0;
}
int main()
{
    int n;
    std::cin>>n;
    if(arm(n)==1)
        std::cout<<"Kindly proceed with encrypting";
    else
        std::cout<<"It is not an Armstrong number";
    
}