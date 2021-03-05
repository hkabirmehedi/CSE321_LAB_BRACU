#!/bin/bash
echo "Which operation would you like to do?"
read n
echo "Enter Oprand 1:"
read a
echo "Enter Oprand 2:"
read b
if [ $n = "+" ];
  then echo "Result :$(($a+$b))" 
elif [ $n = "-" ];
  then echo "Result :$(($a-$b))" 
elif [ $n = "x" ];
  then echo "Result :$(($a*$b))" 
elif [ $n = "/" ];
  then echo "Result :$(($a/$b))" 
fi

