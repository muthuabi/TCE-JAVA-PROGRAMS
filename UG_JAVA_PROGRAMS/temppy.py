class Student:
    def __init__(self):
        self.jav1=0;self.jav2=0; self.pyt1=0;  self.pyt2=0; self.dat1=0;self.dat2=0;self.cpp1=0;self.cpp2=0;self.evs1=0;self.evs2=0;
    def getmark(self):
        x=input("Enter Name:")
        self.name=x
        x=input("Enter Dno :")
        self.no=x
        x=int(input("Enter the Java 1(/50):"))
        self.jav1=x
        x=int(input("Enter the Java 2(/50):"))
        self.jav2=x
        x=int(input("Enter the Python 1(/50):"))
        self.pyt1=x
        x=int(input("Enter the Python 2(/50):"))
        self.pyt2=x
        x=int(input("Enter the Data Structure 1(/50):"))
        self.dat1=x
        x=int(input("Enter the Data Structure 2(/50):"))
        self.dat2=x
        x=int(input("Enter the Cpp 1(/50):"))
        self.cpp1=x
        x=int(input("Enter the Cpp 2(/50):"))
        self.cpp2=x
        x=int(input("Enter the Python 1(/50):"))
        self.evs1=x
        x=int(input("Enter the Python 2(/50):"))
        self.evs2=x
    def add(self):
        self.jav=self.jav1+self.jav2;self.pyt=self.pyt1+self.pyt2;
        self.dat=self.dat1+self.dat2;self.cpp=self.cpp1+self.cpp2;
        self.evs=self.evs1+self.evs2;
        self.per=(self.pyt+self.jav+self.dat+self.cpp+self.evs)/5
    def printmark(self):
        print("-----------------------------------------------------------");
        print("       \t\t\tMARK SHEET")
        print("-----------------------------------------------------------");
        print("  STUDENT NAME:{}\n  STUDENT DNO :21UCS{}".format(self.name,self.no))
        print("-----------------------------------------------------------");
        print("  SUBJECT      |  CIA   |   SEMESTER  |    TOTAL        ");
        print("-----------------------------------------------------------");
        print("  Java        | ",self.jav1,"   |    ",self.jav2,"     |   ",self.jav);
        print("  Python      | ",self.pyt1,"   |    ",self.pyt2,"     |   ",self.pyt);
        print("  DStruct     | ",self.dat1,"   |    ",self.dat2,"     |   ",self.dat);
        print("  CplusPlus   | ",self.cpp1,"   |    ",self.cpp2,"     |   ",self.cpp);
        print("  Evs         | ",self.evs1,"   |    ",self.evs2,"     |   ",self.evs);
        print("-----------------------------------------------------------");
        print("                     TOTAL PERCENTAGE:  ",self.per)
        print("-----------------------------------------------------------");
s=Student()
s.getmark()
s.add()
s.printmark()
        
        
