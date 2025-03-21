#To Perform Addition and Subtraction the  two matrix Must be with same row and
#column and it is also recommended for Multiplication
r1=as.integer(readline(prompt="Enter the Row1:"))
c1=as.integer(readline(prompt="Enter the Column1:"))
r2=as.integer(readline(prompt="Enter the Row2:"))
c2=as.integer(readline(prompt="Enter the Column2:"))
v<-c()
cat("Enter Matrix1 Elements:")
for(i in 1:(r1*c1))
{
  x=as.integer(readline())
  v[i]<-c(x)   #v<-c(v,x)
}
y<-matrix(v,nrow=r1,ncol=c1,byrow = TRUE)
v1<-c()
cat("Enter Matrix2 Elements:")
for(i in 1:(r2*c2))
{
  x=as.integer(readline())
  v1[i]<-c(x)   #v1<-c(v1,x)
}
y1<-matrix(v1,nrow=r2,ncol=c2,byrow = TRUE)
cat("Matrix 1:\n")
print(y)
cat("Matrix 2:\n")
print(y1)
if(r1==r2 && c1==c2)
{
cat("\nAddition of Matrices:\n")
print(y+y1)
cat("\nSubtraction of Matrices:\n")
print(y-y1)
}else
{
  cat("Sorry Can't Perform Addition and Subtraction with unequal Matrix")
}
if(r2==c1)
{
cat("\nMultiplication of Matrices:\n")
print(y%*%y1)
}else
{
  cat("\nSorry Can't Perform Multiplication\nNote:Row of Matrix and Column of Second Matrix must be Equal")
}