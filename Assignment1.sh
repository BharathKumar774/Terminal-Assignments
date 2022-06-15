cd Assignment1

n=100
a=0
b=1
for((i=0;i<=n;i++))
do
echo "$a"
c=$((a+b))
a=$b
b=$c
if(($a%2==0))
then
echo "Even Fibonacci sequence: +$a" >>even.txt
else
echo "Odd Fibonacci sequence: +$a" >>odd.txt
fi
done


