#Binomial_Distribution using R
#Q1.10 unbiased coins are tossed simultaneously ,find the probability that there will be
#i) exactly 5 heads ii) At least 8 heads iii) not more than 3 heads iv) At least one head.
#V) If this exercise is carried out 50 times ,how many times we can get exactly 5 heads?
#1)
dbinom(x=5,size = 10,prob = 0.5)
#2)
k = dbinom(x=8:10,size= 10,prob = 0.5)
sum(k)
#3)
k = dbinom(x=0:3,size= 10,prob = 0.5)
sum(k)
#4)
k = dbinom(x=1:10,size= 10,prob = 0.5)
sum(k)
