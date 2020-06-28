 #include<iostream>
using namespace std;
int main()
{
  float mile;
  int p,km;
  std::cin>>mile;
  std::cin>>p;
  std::cin>>km;
  if(mile<=km/p)
    std::cout<<"Cannot reach";
  else
    std::cout<<"Can reach";
}