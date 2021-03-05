#!/bin/bash
echo "Enter a number"
read n
flag=1;

for (( c=2; c<$n; c++ ))
do  
   a=$(($n%$c))
   if [ $a -eq 0 ];
    then flag=0
  fi
done
if [ $n -eq 1 -o $n -eq 0 ];
  then echo "Not Prime Number"
else 
if [ $flag -eq 1 ];
  then echo "Prime Number"
else
  echo "Not Prime Number"
fi
fi
 
