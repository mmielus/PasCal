#include <stdlib.h>
#include <stdio.h>
void fun(int n) {
int result;
int i;
if(n< 0)
{

}
 else 
 if(n== 0 || n == 1)
{

}
 else 
 {
result = 1;
for(i = 2; i < n + 1; i++) 
{
result = result*i;

}


printf("%d",result);

}
 
 

}
int main(int argc, char **argv) {
fun(5);
}
