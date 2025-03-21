e1<-c()
e2<-c()
e3<-c()
#n<-as.integer(readline(prompt = "Enter the Limit:"))
n=4
cat("Enter the names of Employees:")
for(i in 1:n)
{
  x=as.character(readline())
  e1[i]<-c(x)
}
#print(e1)
cat("Enter the Numbers of Employees:")
for(i in 1:n)
{
  x=as.integer(readline())
  e2[i]<-c(x)
}
#print(e2)
cat("Enter the salary of Employees:")
for(i in 1:n)
{
  x=as.double(readline())
  e3[i]<-c(x)
}
#print(e3)
dframe=data.frame(eno=e2,ename=e1,esalary=e3,stringsAsFactors = FALSE)
cat("Data Frame\n")
print(dframe)
cat("Accesing ename\n")
print(dframe$ename)
cat("Second Row of Data Frame\n")
print(dframe[2,])
c<-c("Manager","AsstManager","Fresher","Worker")#It will work only n=4
dframe<-cbind(dframe,Post=c)
r<-list(108,"Krish",32000.21,"SeniorStaff")
dframe<-rbind(dframe,r)
cat("After rbind and Cbind\n")
print(dframe)
dframe<-dframe[-1,]
cat("After deletion of first row\n")
print(dframe)
cat("After Deletion of esalary\n")
dframe<-dframe[,-3]
print(dframe)

