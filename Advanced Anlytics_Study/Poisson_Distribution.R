#Poisson Distribution using R
#Q1. If  5% of electric bulbs manufactured by a company are defective ,
#Use Poisson Distribution to find the probability that in a box of 100 bulbs.
#i) None is defective ii) 3 bulbs are defective iii) More than 3 bulbs are defective.
#(given= e -5 = 0.007)
#lambda = p*n = 0.05*100

#1)
dpois(x = 0,lambda = 5)
#2)
dpois(x = 3,lambda = 5)
#3)
k = dpois(x = 4:100,lambda = 5)
sum(k)

ppois(q = 3, lambda = 5,lower.tail = F)