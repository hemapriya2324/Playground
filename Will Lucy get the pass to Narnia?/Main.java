#include<iostream>
using namespace std;
int main()
{
  int a,b,x,c;
 cin>>a>>b>>x;
cout<<"Enter first number : Enter second number : Menu"<<"\n";
cout<<"1.Addition"<<"\n";
cout<<"2.Subtraction"<<"\n";
cout<<"3.Multiplication"<<"\n";
cout<<"4.Division"<<"\n";"\n";
cout<<"5.Remainder"<<"\n";
  if(x==6)
  {
    cout<<"Invalid operation"<<"\n";
  }
switch(x)
  {
 case 1:
      c=a+b;
      cout<<c<<"\n";
      break;
 case 2:
      c=a-b;
      cout<<c<<"\n";
      break;
 case 3:
      c=a*b;
      cout<<c<<"\n";
      break;
case 4:
      c=a/b;
      cout<<c<<"\n";
      break;
 case 5:
      c=a%b;
      cout<<c<<"\n";
      break;
  default:
      cout<"Invalid operation";
   break;
  }
}