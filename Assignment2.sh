
read FirstName

if [[ "${FirstName}" =~ [^a-zA-Z] ]]; then
   echo INVALID
   break
else
   echo VALID
fi


read LastName

if [[ "${LastName}" =~ [^a-zA-Z] ]]; then
   echo INVALID
   break
else
 echo Valid
fi
 
   echo "$FirstName.$LastName"
echo "$FirstName.$LastName"|sha1sum
