#Normal Distribution using R
#Q1. The weekly wages of 1000 workers are normally distributed around a mean of Rs 70. 
#and standard deviation of Rs 5. Estimate the number of workers whose weekly wages will be ; 
#i) between Rs 70 and 72. ii) between Rs 69 and 72. iii) More than Rs. 75.
#iv) Less than Rs 63 v) Also estimate the lowest weekly wages of the 100 highest paid workers

#1)
x1 = pnorm(q= 70,mean = 70,sd = 5,lower.tail = TRUE)
x2 = pnorm(q = 72,mean = 70,sd = 5,lower.tail = TRUE)
x2-x1
 
#2)
x1 = pnorm(q= 69,mean = 70,sd = 5,lower.tail = TRUE)
x2 = pnorm(q = 72,mean = 70,sd = 5,lower.tail = TRUE)
x2-x1

#3)
x1 = pnorm(q= 75,mean = 70,sd = 5,lower.tail = TRUE)
1-x1

#4)
x1 = pnorm(q= 63,mean = 70,sd = 5,lower.tail = TRUE)
x1



