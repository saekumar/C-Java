#include <stdio.h>

char to_digit(int nbr) {
  
  if (nbr >= 0 && nbr <= 9) {
   
  } else {
   
    return '\0';
  }
}

int main() {
    int n;
    scanf("%d",&n);
  printf("%c\n", to_digit(n)); 
  

  return 0;
}
