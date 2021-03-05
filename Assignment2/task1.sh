#!/bin/bash
echo "Enter your annual income"
read income
tax=0
if [ $income -lt 240000 ];
  then echo $tax
elif [ $income -lt 540000 ];
  then sub=$(($income-240000))
  tax=$(($sub*10/100))
  echo $tax
  elif [ $income -lt 720000 ];
  then sub=$(($income-540000))
  a=$(($sub*20/100))
  tax=$((a+30000))
  echo $tax
  else
    sub=$(($income-720000))
    a=$((sub*30/100))
    tax=$((a+30000+36000))
    echo $tax
  fi
  
