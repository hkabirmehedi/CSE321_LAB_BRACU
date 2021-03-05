#!/bin/bash
echo "Enter a number a number :"
read n
result=0
while [ 0 -lt $n ]
do
  result=$(($result+$(($(($n%10))**2))))
  n=$(($n/10))
  if [ $n -lt 1 -a $result -gt 9 ];
    then n=$result
    result=0
  fi
done
if [ $result -eq 1 ];
  then echo "Happy Number"
else
    echo "Unhappy Number"
fi

