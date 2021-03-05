#!/bin/bash
echo "Enter a number"
read n
r=$((n%5))
m=$((n%2))
if [ $r -eq 0 -a $m -eq 0 ];
  then echo "NO"
elif [ $r -eq 0 -o $m -eq 0 ];
  then echo "YES"
else
  echo "IGNORE"
fi
  
